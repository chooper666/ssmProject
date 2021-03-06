# Spring部署的ssmProject
使用Springboot部署的，基于ssm架构的民宿管理系统。集订单预定与博客功能为一体。


1.	简介
享宿，即民宿出租预定平台主要为需要房屋租住的用户提供高效便捷、轻松贴心的移动式房源查找及租住平台。结合博客分享功能意在丰富房源的同时带动订单销售，为用户带来更多人性化的体验。享宿为不同用户群体在定制化基础上整合使用，实现用户多重身份的切换。通过平台，用户既可以出租个人房屋也可以租住他人房屋，实现房源管理与订单查看一体化。用户在使用过程中可以在平台的博客分享系统中发布文章，浏览评论等，房源管理系统可供用户搜索并查看心意房源，进行订购，付费等，也可查看个人房源的出租情况。享宿覆盖了订房系统以及博客系统的基本功能，并在此基础上进行了优化，为用户提供更丰富的使用体验。
1.1	目的
该文档收集、分析、定义了高层用户需要和产品特性，分析了该平台的目标，为了改善当今互联网上房东与租客对接房屋信息的不及时，不便利这一现象，结合房主的真正意愿以及租客对于房源的不同需求，针对目前民俗租住信息缺少平台发布，租客很难高效又便利的找到心仪房源这一问题，我们决定开发享宿平台，希望能改善以上现象带来的问题，为每一个用户提供更好的使用体验。
1.2	范围
	享宿——民宿出租预定平台这一项目
1.3	参考资料
	面向对象分析和设计  清华大学出版社 侯爱民编著
1.4	概述
民宿预定出租平台的用户包括买家和商家。民宿预定出租平台支持想要出租房源的商家发布房源、管理房源等功能，同时支持想要预定房源的买家查看房源、预定房源、评价订单、投诉、发布、查看博客等功能。它也支持管理员审核商家发布的房源，对用户进行管理，整理、统计系统数据等功能。它主要包括了查询管理商品信息模块、订单处理模块、博客管理模块、审核信息模块、用户管理模块等功能模块。
1.4.1	查询商品信息模块
用户能够进行查询商品信息，包括：
筛选商品信息
查看商品信息
1.4.2	管理商品信息
商家能够进行管理商品信息，包括：
发布商品信息
修改商品信息
删除商品信息
1.4.3	处理订单信息模块
用户能够进行订单处理，包括：
查看订单信息
预定房源
    投诉商家
	评价订单
	商家能够进行订单管理，包括：
	查看出租订单
1.4.4	博客管理模块
用户能够进行博客管理，包括：
发布博客
查看博客
评价博客
1.4.5	审核信息模块
管理员能够进行审核信息，包括
查看所有用户信息
查看房源信息
审核房源信息
查看投诉信息
1.4.6	用户管理模块
	管理员能够进行用户管理，包括
	对异常账号进行封禁处理

2.	定位
2.1	商机
	如今，互联网上房东与租客对接房屋信息的不及时，不便利这一现象，结合房主的真正意愿以及租客对于房源的不同需求，针对目前民俗租住信息缺少平台发布，租客很难高效又便利的找到心仪房源这一问题，因此我们决定开发享宿平台，希望能改善以上现象带来的问题，为每一个用户提供更好的使用体验。
2.2	问题说明

问题是	用户与商家之间如何建立联系
影响	用户和商家
问题的后果	导致双方获取各自信息不方便
成功的解决方案	通过后台推送双方的信息，可以避免造成不便。
2.3	产品定位说明
2.3.1	出售
商家可以在平台上发布自己的房源供用户浏览、预定。商家需要发布的房源信息诸如房源名称、房源价格、房源描述、房源图片等。商家会在订单结束后，账户中收到增益。
2.3.2	预定
用户可以根据自己的需求在平台上浏览、筛选、查看房源，购买自己想要的房源，当系统提示下单成功后。用户可以查看订单。
2.3.3	评价
用户可以对已完成的订单进行评价，评价将显示在这款房源的详细信息页上供其他用户查看。评价可以评论并且打上分数，评价反馈机制可以有效地评估买卖双方的交易体验，促进线上交易的和谐发展。
2.3.4	审核
管理员可以对平台上的用户信息进行审核，可以对用户投诉的信息进行受理，对商家申请发布的房源进行审核。 
2.3.5	共享
用户可以发布博客，并查看博客，分享咨询给他人，评价他人博客，收获快乐。

3.	业务工程
3.1	业务流程
3.1.1	商家出售房源业务流程
商家可以登录民宿出租预定平台，点击发布房源功能，填写完需要发布的商品信息后，系统会将商品信息保存到数据库，等待管理员审核。待管理员审核通过后，才算发布成功。在商家发布的房源被订后，商家可以进入查看出租订单页面。此外，商家也可以查看自己的房源，可以对自己的房源进行修改或者删除操作，在数据库更改房源信息。
3.1.2	用户预定房源业务流程
用户可以登录民宿出租预定平台，除了修改个人信息，还有筛选/搜索房源信息功能，设置筛选条件后，系统会显示符合要求的房源，用户可以查看信息，下单购买，系统生成相应的订单。下单完成后，系统更新订单状态，用户可以查看自己的订单。用户还可以点击评价，对已完成的订单进行评价并打分，系统会将评论信息保存入数据库。用户也可对此订单对应的商家发起投诉，数据库中添加用户投诉信息。
3.1.3	管理员业务流程
管理员会拥有特定的管理员账号，登录后可以管理用户，查看用户部分信息，对异常用户进行删除。还可以审核房源，并予以批准。也可以进行投诉信息的管理，并进行受理，对用户进行反馈。
3.2	核心业务场景描述
3.2.1	发布房源信息场景描述
商家用户登录后进入主页面，可点击发布房源，系统跳转到房源信息填写页面，商家必须根据房源的真实情况填写相应的有关信息，确认无误后点击提交，将房源发布出去，等待管理员审核信息，审核通过则发布成功。
3.2.2	筛选房源信息场景描述
用户进入房源页面，设置筛选条件，如地址、入住时间、离开时间等，点击搜索按钮，跳转到筛选后的商品页面，将符合要求的房源呈现给用户。
3.2.3	预定房源场景描述
买家用户点击进入房源的详情页面，可以浏览到详细信息，以及模糊的定位，用户评价，和打分。点击购买按钮，跳转到支付页面，确认信息无误后，进行支付后即可下单。
3.2.4	投诉场景描述
用户在订单界面中，可以对相应订单进行投诉，投诉会反馈给管理员进行受理，待之后管理员会联系用户和商家商讨解决方案。
3.2.5	评价场景描述
用户可在系统主页面点击查看订单，进入个人订单页面，若有订单未评价，点击相应订单旁边的评价按钮转入评价页面，在此页面，用户可对已经完成交易的订单进行评价，并进行打分，填写完评价信息后，评价将反馈给卖家。
3.2.6	修改商品信息场景描述
用户可在个人商品界面编辑个人商品的有关信息，可点击编辑进行商品信息的修改，删除商品。保存后系统自动对商品信息进行更新。
3.2.7	发布博客场景描述
    用户可以点击发布博客，填写博客内容，然后进行发布。
3.2.8	评论博客场景描述
    用户可以点击查看博客，评论自己或他人的博客。
3.2.9	管理投诉信息场景描述
    管理员可进入管理界面受理用户的投诉信息，可以通过联系响应的被投诉者，与投诉者进行协商，或者对相应违规用户进行封禁，设置封禁时间，使其无法使用系统进行出售业务。
3.2.10	审核卖家发布房源场景描述
管理员可进入管理界面对卖家申请发布的房源进行审核，若审核通过，则点击批准，卖家的房源就会发布成功。
3.2.11	管理用户场景描述
    管理员可进入管理界面管理用户，查看用户的部分信息，并对异常账户进行封号处理


