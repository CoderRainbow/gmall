# gmall商城项目
gmall-parent[pom]
	|——gmall-common（通用模块）【工具类，通用依赖】（jar）
	|——gmall-api（dubbo分包建议，接口层&Model层抽取）（jar）
  |——gmall-cms（Content Manage System：内容管理系统[文章、评论等]）[service]
	|——gmall-pms（Product Manage System：商品管理系统）[service]
	|——gmall-oms（Order Manage System：订单管理系统）[service]
	|——gmall-ums（User Manage System：用户管理系统[会员/管理员、登陆、注销等]）[service]
	|——gmall-sms（Sale Manage System：营销管理系统[优惠券、活动等]）[service]
	|——gmall-admin-web（后台管理web-restapi层，对接前端的Vue项目）[boot-web]
