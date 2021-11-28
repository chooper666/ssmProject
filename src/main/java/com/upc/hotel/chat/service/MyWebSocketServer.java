package com.upc.hotel.chat.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@ServerEndpoint("/test")
@Component
@Slf4j
public class MyWebSocketServer {
    /**
     * 存放所有在线的客户端userId->session
     */
    private static Map<String, Session> clients = new ConcurrentHashMap<>();

    @OnOpen
    public void onOpen(Session session) {
        log.info("onOpen前存活: {}", clients.keySet());
        Map<String, List<String>> requestParameterMap = session.getRequestParameterMap();
        String userId = requestParameterMap.get("fromId").get(0);
        log.info("用户上线了, userId为:{}, sessionId为:{}", userId, session.getId());
        //将新用户存入在线的组
        clients.put(userId, session);
        log.info("onOpen后存活: {}", clients.keySet());
    }

    /**
     * 客户端关闭
     * @param session session
     */
    @OnClose
    public void onClose(Session session) {
        log.info("onClose前存活: {}", clients.keySet());
        Map<String, List<String>> requestParameterMap = session.getRequestParameterMap();
        String userId = requestParameterMap.get("fromId").get(0);
        log.info("有用户断开了, userId为:{}, sessionId为:{}", userId, session.getId());
        //将掉线的用户移除在线的组里
        clients.remove(userId);
        log.info("onClose后存活: {}", clients.keySet());
    }

    /**
     * 发生错误
     * @param throwable e
     */
    @OnError
    public void onError(Throwable throwable) {
        log.error("onError: {}, 当前存活：{}", throwable.getMessage(), clients.keySet());
    }

    /**
     * 收到客户端发来消息
     */
    @OnMessage
    public void onMessage(Session session, String dataStr) {
        log.info("服务端收到消息体: {}", dataStr);
        JSONObject data = JSON.parseObject(dataStr);
        // type不为空且等于heartbeat代表心跳消息，必须转发到目标自身以避免客户端断线
        String type = data.getString("type");
        if (!StringUtils.isEmpty(type) && "heartbeat".equals(type)) {
            log.info("心跳消息: {}", dataStr);
            session.getAsyncRemote().sendText(dataStr);
        } else {
            String toId = data.getString("toId");
            Session toSession = clients.get(toId);
            // 目标对象是否已下线,若ignore此元素，会造成自身session被关闭
            if (toSession != null) {
                toSession.getAsyncRemote().sendText(dataStr);
            } else {
                log.warn("对方{}已下线", toId);
                data.put("fromId", toId);
                data.put("state", "fail");
                data.put("message", String.format("<发送失败>: 对方%s已下线", toId));
                session.getAsyncRemote().sendText(data.toJSONString());
            }
        }
    }

}
