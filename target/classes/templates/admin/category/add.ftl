<html>
<#include "../comm/header.ftl">

<body>
<div id="wrapper" class="toggled">

    
    <#include "../comm/nav.ftl">
	
    <div id="page-content-wrapper">
        <div class="container-fluid">
            <div class="row clearfix">
                <div class="col-md-12 column">
                    <form>
                        <div class="form-group">
                            <label>名字</label>
                            <input id="CategoryName" type="text" class="form-control"  required="required" autofocus/>
                        </div>
                        <button id="submit" class="btn btn-default">提交</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="../../js/comm.js"></script>
<script type="application/javascript">
  	$(function(){
		$("#submit").bind("click",function(){
			var CategoryName=document.getElementById("CategoryName").value;
		
			$.ajax({
				type:'POST',
				url:comm.ServerUrl+"category/add",
				data:{
					CategoryName:CategoryName
				},
		 		dataType : 'json',
				success:function(data){
					console.log(data);
					if(data.status == 200){
						alert(data.msg);
					}else{
						alert(data.msg);
					}
				}
			});
			
		});
	});
</script>
</body>
</html>