<!DOCTYPE html>
<html lang="zh">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>冰怜博客</title>
	<link rel="stylesheet" type="text/css" href="http://www.jq22.com/jquery/bootstrap-3.3.4.css">

    <link rel="stylesheet" href="../../css/style.css">
    <style>
    
	.divcss5{
		margin:0 auto;
		width:800px;
		height:1660px;
		border:1px solid #000
	} 
	
   
    </style>
</head>
<body>

<#include "public/nav.ftl">

 
    <div class="divcss5">
    	<h3 style="text-align:center"><b>个人简历</b></h3>
    	<hr/>
    	<ul >
    		<h6>姓名：贾益新 、性别：男  年龄：20</h6>
    		<h6>核心竞争力：逻辑分析型+强悍沟通能力+强大的自学能力</h6>
    	<h6>Email：1016910233@qq.com   手机号：15928521648</h6>
    	</ul>
    	<hr/>
    	<ul>
    		<h4><b>掌握技能 </h4>
    		<h6>
	    		1、常用设计模式、UML<br/>
				2、J2EE<br/>
				3、操作系统原理<br/>
				4、常用算法<br/>
				5、计算机网络原理<br/>
				6、前端：JQUERY,HTML5，JS,LayUI,ESAYUI,Bootstrap,AngularJS,Vue.js<br/>
				7、Spring,Spring MVC,Mybatis,Shiro,Spring JPA，Redis,Mongodb<br/>
				8、Mysql优化<br/>
				9、JVM调优<br/>
				10、Linux内核调度原理以及常用Linux命令<br/>
				11、Spark<br/>
    		</h6>
    	</ul>
    	<hr/>
    	<ul>
    		<h4><b>项目经验</h4>
    		<h6>
	    		<div class="row clearfix">
					<div class="col-md-12 column">
						<table class="table table-hover table-bordered">
							<thead>
								<tr class="success">
									<th>
										工作时间
									</th>
									<th>
										工作公司
									</th>
									<th>
										项目描述
									</th>
									
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>
										2018.01.21-2018.12.05
									</td>
									<td>
										酒优购有限公司
									</td>
									<td>
										Vue+java+mpvue点餐系统
									</td>
									
								</tr>
							</tbody>
						</table>
					</div>
				</div>
    		</h6>
    		
    		<h6>
    		<b>2017.10-2017.12       参加Java设计大赛</b><br>
				&nbsp;&nbsp;&nbsp;当时看到学校举行java设计比赛，但是又不会 然后熬夜苦学java，当时真的过得好充实，每天都扑在电脑面前和书面前学习，想要获奖<br>
			<b>学习技术：</b><br>
				JAVA SE 所有内容<br>
			<b>项目成果：</b><br>
				在比赛中以唯一一个大一获得三等奖<br>
				获得奖金200元
    		</h6>
    	</ul>
    	
    </div>
	<script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
	<script src="http://www.jq22.com/jquery/bootstrap-3.3.4.js"></script>
	<script type="text/javascript">
		$(document).ready(function () {
		  var trigger = $('.hamburger'),
		      overlay = $('.overlay'),
		     isClosed = false;

		    trigger.click(function () {
		      hamburger_cross();
		    });

		    function hamburger_cross() {

		      if (isClosed == true) {
		        overlay.hide();
		        trigger.removeClass('is-open');
		        trigger.addClass('is-closed');
		        isClosed = false;
		      } else {
		        overlay.show();
		        trigger.removeClass('is-closed');
		        trigger.addClass('is-open');
		        isClosed = true;
		      }
		  }

		  $('[data-toggle="offcanvas"]').click(function () {
		        $('#wrapper').toggleClass('toggled');
		  });
		});
	</script>
</body>
</html>