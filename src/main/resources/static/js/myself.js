
function getYesterdayDate() {
	var today = new Date();
	today.setTime(today.getTime()-24*60*60*1000);
    var year = today.getFullYear();
    var month = today.getMonth() + 1;
    var day = today.getDate();
    if (month < 10) {
    	month = "0" + month;
    }
    if (day < 10) {
    	day = "0" + day;
    }
    var date = year + "-" + month + "-" + day;
    return date;
}
function getFutureDate(day) {
	var today = new Date();
	today.setTime(today.getTime()+(day-1)*24*60*60*1000);
    var year = today.getFullYear();
    var month = today.getMonth() + 1;
    var day = today.getDate();
    if (month < 10) {
    	month = "0" + month;
    }
    if (day < 10) {
    	day = "0" + day;
    }
    var date = year + "-" + month + "-" + day;
    return date;
}
/**
* 使用时候直接调用方法
* Format(date,"yyyy-MM-dd HH:mm");输出格式为 "2015-10-14 16:50"；
* 第一个参数为时间，
* 第二个参数为输出格式。
*
*
* @param now
* @param mask
* @returns {*}
* @constructor
*/
function formatTime(now, mask) {
   var d = now;
   var zeroize = function (value, length) {
       if (!length) length = 2;
       value = String(value);
       for (var i = 0, zeros = ''; i < (length - value.length); i++) {
           zeros += '0';
       }
       return zeros + value;
   };

   if (!mask) {
	   mask = 'yyyy-MM-dd';
   }

   return mask.replace(/"[^"]*"|'[^']*'|\b(?:d{1,4}|m{1,4}|yy(?:yy)?|([hHMstT])\1?|[lLZ])\b/g, function ($0) {
       switch ($0) {
           case 'd':
               return d.getDate();
           case 'dd':
               return zeroize(d.getDate());
           case 'ddd':
               return ['Sun', 'Mon', 'Tue', 'Wed', 'Thr', 'Fri', 'Sat'][d.getDay()];
           case 'dddd':
               return ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'][d.getDay()];
           case 'M':
               return d.getMonth() + 1;
           case 'MM':
               return zeroize(d.getMonth() + 1);
           case 'MMM':
               return ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec'][d.getMonth()];
           case 'MMMM':
               return ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'][d.getMonth()];
           case 'yy':
               return String(d.getFullYear()).substr(2);
           case 'yyyy':
               return d.getFullYear();
           case 'h':
               return d.getHours() % 12 || 12;
           case 'hh':
               return zeroize(d.getHours() % 12 || 12);
           case 'H':
               return d.getHours();
           case 'HH':
               return zeroize(d.getHours());
           case 'm':
               return d.getMinutes();
           case 'mm':
               return zeroize(d.getMinutes());
           case 's':
               return d.getSeconds();
           case 'ss':
               return zeroize(d.getSeconds());
           case 'l':
               return zeroize(d.getMilliseconds(), 3);
           case 'L':
               var m = d.getMilliseconds();
               if (m > 99) m = Math.round(m / 10);
               return zeroize(m);
           case 'tt':
               return d.getHours() < 12 ? 'am' : 'pm';
           case 'TT':
               return d.getHours() < 12 ? 'AM' : 'PM';
           case 'Z':
               return d.toUTCString().match(/[A-Z]+$/);
           // Return quoted strings with the surrounding quotes removed
           default:
               return $0.substr(1, $0.length - 2);
       }
   });
}
function getTodayDate() {
	var today = new Date();
    var year = today.getFullYear();
    var month = today.getMonth() + 1;
    var day = today.getDate();
    if (month < 10) {
    	month = "0" + month;
    }
    if (day < 10) {
    	day = "0" + day;
    }
    var date = year + "-" + month + "-" + day;
    return date;
}

//校验手机号
function isPoneAvailable(num) {
    var myreg = /^[1][3,4,5,6,7,8,9][0-9]{9}$/;
    if (!myreg.test(num)) {
        return false;
    } else {
        return true;
    }
}
// 获取url参数
function getQueryVariable(variable) {
   var query = window.location.search.substring(1);
   var vars = query.split("&");
   for (var i=0;i<vars.length;i++) {
           var pair = vars[i].split("=");
           if(pair[0] == variable){return pair[1];}
   }
   return(false);
}

/**  
 * ajax post提交  
 * @param url  
 * @param param  
 * @param datat 为html,json,text  
 * @param callback回调函数  
 * @return  
 */
function post(url, param, datat, callback) {
    $.ajax({
        type: "post",
        url: url,
        async: true,
        data: param,
        dataType: datat,
        beforeSend: function (XMLHttpRequest) {
        },
        success: callback,
        error: function(XMLHttpRequest, status, errorThrown) {
        	console.error("Error occurred while posting " + url);
        	console.error(errorThrown);
        },
        complete:function (XMLHttpRequest, status) {
        }
    });
}
/**  
 * ajax get提交  
 * @param url  
 * @param datat 为html,json,text  
 * @param callback回调函数  
 * @return  
 */
function get(url, datat, callback) {
    $.ajax({
    	type: "get",
    	url: url, 
    	async: true,
    	dataType: datat,
    	beforeSend: function (XMLHttpRequest) {
        },
    	success: callback,
    	error: function(XMLHttpRequest, status, errorThrown) {
        	console.error("Error occurred while getting " + url);
        	console.error(errorThrown);
        },
        complete:function (XMLHttpRequest, status) {
        }
    });
}
/**
 * h5通知提醒
 * @param fromId 消息来源人的id
 * @param msg 接收到的消息文本
 */
function notifyNewMsg(fromId, msg) {
	var fromUser = window["userArr"].filter(function(u) {
		if (u.id == fromId) {
			return true;
		}
	})[0];
	var notifyStr = "收到来自【" + fromUser["username"] + "】的新消息！\n" + msg;
	Notification.requestPermission(function (permission) {  
        if (permission == "granted") {
            var notification = new Notification("WeChat新消息", {  
                dir: "auto",
                lang: "zh-CN",
                tag: fromId,
                icon:'favicon.ico',
                renotify: false,
                body: notifyStr
            });
            // 事件庀点击事件监听
            notification.onclick = function () {
                console.log('onclick');
                // window.location.href = "http://www.baidu.com";
            };
            // 监听显示事件
            notification.onshow = function () {
                console.log('onshow');
            };
            // 监听错误事件
            notification.onerror = function () {
                console.log('onerror');
            };
            // 监听关闭事件
            notification.onclose = function () {
                console.log('onclose');
            };   
        }
    });
}
