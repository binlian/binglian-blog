<!DOCTYPE html>
<html lang="zh">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>冰怜博客</title>
	<link rel="stylesheet" type="text/css" href="http://www.jq22.com/jquery/bootstrap-3.3.4.css">

    <link rel="stylesheet" href="../../css/style.css">
    <link rel="stylesheet" href="../../css/index.css">
    <style>
    .articleList{
    	margin-right: auto;
    	margin-left: auto;
    	width:885px;
    	height:200px;
    	
    	background:url("../../image/png.png");
    },
   .article-erji{
   		width:710px;
    	height:250px;
   }
   a{
   		color:rgb(192,192,192);
   }
    </style>
</head>
<body>

<#include "public/nav.ftl">

 
    <div id="index" role="main">
    <!-- 顶置文章 -->
    	<article class="articleList">
    			<a href="/about">
    			<h2 class="post-card-title" itemprop="headline"><span style="color:red;color: #e2e2b8;float: right;padding: 4px 13px 6px;background: #b88544;border-radius: 0 0 8px 8px;">[置顶] </span></h2>
				<div class="post-card-info">
					<span itemprop="author" itemscope="" itemtype="http://schema.org/Person"><b>公告—2018.10.25 更新-冰怜 •<b> </span>
					<span itemprop="datePublished" content="2018-10-25T10:32:00+08:00">2018 年 10 月 25 日 • </span>
					<span>公告</span>
				</div>
				</a>
		</article>
		
		<#if ArticlePageVO ??>
		<#list ArticlePageVO.rows as article>
		<article class="articleList">
				<a href="/blog?id=${article.id}">
				<h2 style="text-align:center;"><b>冰怜博客—  ${article.articleName} •冰怜 </b></h2>
				<div class="article-erji">
					<span style="text-align:center;">${article.articleTime?string('yyyy-MM-dd hh:mm:ss')}</span><br>
					<span style="text-align:center;">${article.articleCategory}</span><br>
				</div>
				</a>
		</article> 
		</#list>
			<#else>
					<td>为空</td>
			</#if>
    </div>
    <!-- 分页 -->
		<div class="col-md-12 column">
			<ul class="pagination pull-right">
				<li>
					 <a href="?page=${ArticlePageVO.prePage}&size=10">上一页</a>
				</li>
				
				<li>
					 <a href="">${ArticlePageVO.page}</a>
				</li>
				
				<li>
					 <a href="?page=${ArticlePageVO.nextPage}&size=10">下一页</a>
				</li>
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