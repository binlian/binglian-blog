<html>
<#include "../comm/header.ftl">
<body>
<div id="wrapper" class="toggled">
    <#include "../comm/nav.ftl">

    <div class="row">
        <div class="col-sm-12">
            <h4 class="page-title">


                发布文章

            </h4>
        </div>
        <div class="col-md-12">
            <form id="articleForm" role="form" novalidate="novalidate">
                <input type="hidden" name="categories" id="categories" />
                <input type="hidden" name="cid" id="cid" value="" />
                <input type="hidden" name="status" id="status" value="publish" />
                <input type="hidden" name="allowComment" id="allowComment" value="true" />
                <input type="hidden" name="allowPing" id="allowPing" value="true" />
                <input type="hidden" name="allowFeed" id="allowFeed" value="true" />
                <input type="hidden" name="content" id="content-editor" />

                <div class="form-group col-md-6" style="padding: 0 10px 0 0;">
                    <input id="title" type="text" class="form-control" placeholder="请输入文章标题（必须）" name="title" required="required" aria-required="true" value="" />
                </div>


                <div class="form-group col-md-6" style="padding: 0 10px 0 0;">
                    <input id="summary" name="tags" id="tags" type="text" class="form-control" placeholder="请填写文章描述" value="" />
                </div>

                <div class="form-group col-md-6" style="padding: 0 10px 0 0;">
                    <input id="categor" name="tags" id="tags" type="text" class="form-control" placeholder="请填写分类名称" value="" />
                </div>
                
                
            </form>
        </div>
    </div>
    <div id="editor">
        <p>欢迎使用 冰怜博客</p>
    </div>
	<button id="submit" class="btn btn-primary btn-lg pull-right">发布文章</button>

</div>
<script type="text/javascript" src="../../js/comm.js"></script>
<script type="text/javascript" src="../../wangEditor/release/wangEditor.min.js"></script>
<script type="text/javascript">
    var E = window.wangEditor
    var editor = new E('#editor')
    // 或者 var editor = new E( document.getElementById('editor') )
    editor.create()
    
    $(function(){
    	$('#submit').bind("click",function(){
    		var article={};
    		article.articleName=document.getElementById('title').value;
    		article.articleSummary=document.getElementById('summary').value;
    		article.articleContent=editor.txt.html();
    		article.articleCategory=document.getElementById('categor').value;
    		
    		$.ajax({
    			url:comm.ServerUrl+'article/add',
    			type:'POST',
    			data:JSON.stringify(article),
		 		contentType:'application/json',
		 		dataType : 'json',
				success:function(data){
					console.log(data);
					
				}
    		})
    	})
    })
</script>
</body>
</html>
