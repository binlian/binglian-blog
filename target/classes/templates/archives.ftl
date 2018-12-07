<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>冰怜博客</title>
<link rel="stylesheet" href="../../css/index.css">
 <link rel="stylesheet" href="../../css/style.css">
</head>
<body>
<div>
<#include "public/nav.ftl">
		<div id="index" role="main">
			<div>
				<section class="post_content" >
					<header class="post_header">
						<h1 class="post_title">归档</h1>
					</header>
					<div class="post-Archive">
						<div id="archives">
							
							<div class='archive-title' id='arti-2017-12'>
								<h3>2018-12</h3>
								<div class='archives archives-12'>
									<div class="brick">
										<a href=""><span class="time">12-30</span>我才不会写年终总结之瞎说篇<span>(31)</span></a>
									</div>
									<div class="brick">
										<a href=""><span class="time">12-25</span>状态<span>(12)</span></a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</section>
			</div>
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
</div>
</body>
</html>