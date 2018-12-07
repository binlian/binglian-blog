<!doctype html>
<html lang="zh">
<head>
	<title>冰怜博客</title>
	<link rel="stylesheet" href="../../css/index.css">
	<link rel="stylesheet" href="../../css/blog.css">
	<link rel="stylesheet" href="../../css/style.css">
	<style>
   
    </style>
</head>
<body>
	<#include "public/nav.ftl">
	
		<div id="index" role="main">
			<div>
				<article id="post-1202" >
					<style>
						.container {
							padding: 10px 0px;
						}
						
						.post {
							margin: 0 auto
						}
					</style>
					<section class="post_content">
						<header class="post_header">
							<h1 class="post_title">给大家介绍一下</h1>
						</header>
						<div class="post-body js-gallery">
						<!-- 内容 -->
						
									${Article.articleContent}
							
						</div>
					</section>
				</article>
			</div>
			
			<div id="respond" class="comment-respond">
					<h6 id="replytitle" class="comment-reply-title"><a rel="nofollow" id="cancel-comment-reply-link" href="" style="display:none;">取消</a></h6>
						<form action="#" method="post" id="commentform" class="clearfix">
							<div class="clearfix"></div>
								<div class="author-info">
									<input type="text" name="author" id="author" placeholder="昵  称 : " value="" tabindex="1" title="Name (required)" />
									<input type="text" name="email" id="email" placeholder="邮  箱 : " value="" tabindex="2" title="E-mail(will not be published) required" />
									<input type="text" name="url" id="url" placeholder="网  址 : " value="" tabindex="3" title="Website" />
								</div>
								<div class="clearfix"></div>
									<input type='hidden' name='comment_post_ID' value='1202' id='comment_post_ID' />
									<input type='hidden' name='comment_parent' id='comment_parent' value='0' />
									<p style="display: none;"><input type="hidden" id="akismet_comment_nonce" name="akismet_comment_nonce" value="632104fca1" /></p>
									<p style="display: none;"><input type="hidden" id="ak_js" name="ak_js" value="87" /></p>
								<div class="comment-form-info">
									<div class="real-time-gravatar"> <img id="real-time-gravatar" src="statics/images/d41d8cd98f00b204e9800998ecf8427e.png"  />
									</div>
									<p class="input-row">
									<i class="row-icon"></i>
									<textarea class="text_area" rows="3" cols="80" name="comment" id="comment" tabindex="4" placeholder="你不说两句吗？(°∀°)ﾉ……"></textarea>
									<input type="submit" name="submit" class="button" id="submit" tabindex="5" value="发送" />
									</p>
								</div>
						</form>
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