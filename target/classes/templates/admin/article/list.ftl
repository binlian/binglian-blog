<html>
<#include "../comm/header.ftl">

<body>
<div id="wrapper" class="toggled">


    <#include "../comm/nav.ftl">

	<div class="input-group col-md-3" style="margin-top:0px positon:relative">
	       <input type="text" id="search"class="form-control"placeholder="请输入字段名" / >
	            <span class="input-group-btn">
	               <button id="lookup" class="btn btn-info btn-search">查找</button>
	               <button class="btn btn-info btn-search" style="margin-left:3px">添加文章</button>
	            </span>
	 </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-bordered">
                <thead>
                <tr>
                    <th>
                        ID
                    </th>
                    <th>
                        文章标题
                    </th>
                    <th>
                        文章分类
                    </th>
                    <th>
                        创建
                    </th>
                    <th>
                        操作
                    </th>
                </tr>
                </thead>
                <tbody>
					<#if ArticlePageVO ??>
						<#list ArticlePageVO.rows as article>
						<tr>
                            <td>${article.id}</td>
                            <td>${article.articleName}</td>
                            <td>${article.articleCategory}</td>
                            <td>${article.articleTime?string('yyyy-MM-dd hh:mm:ss')}</td>
                            <td>
                            	<a href="/article/edit?id=${article.id}">编辑</a>
                                <a href="/article/delete?id=${article.id}">删除</a>
                            </td>
                        </tr>
                        </#list>
                    <#else>
							<td>为空</td>
							<td>为空</td>
							<td>为空</td>
							<td>为空</td>
                    </#if>


                </tbody>
            </table>
        </div>
        
        <button class="btn btn-primary btn-lg pull-right">发布文章</button>

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

    </div>
</div>

<script src="../../js/jquery.min.js"></script>

<script>

$(function(){
	$('#lookup').bind('click',function(){
		var articleName=document.getElementById('search').value;
		
		
	})
})
</script>
</body>