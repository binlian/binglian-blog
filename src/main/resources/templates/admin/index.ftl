<html>
<#include "comm/header.ftl">

<body>
<div id="wrapper" class="toggled">

    
    <#include "comm/nav.ftl">
	
    <div class="row clearfix">
		<div class="col-md-12 column">
			<table class="table table-hover table-bordered">
				<thead>
					<tr>
						<th>
							ID
						</th>
						<th>
							名称
						</th>
						<th>
							创建时间
						</th>
						<th>
							修改时间
						</th>
						<th>
							操作
						</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>1</td>
						<td>Java</td>
						<td>2018/11/5</td>
						<td>2018/11/5</td>
						<td>
							<a href="#">修改</a>
							<a href="#">删除</a>
						</td>
					</tr>
                </tbody>
			</table>
		</div>
		<!-- 按钮触发模态框 -->
		<button class="btn btn-primary btn-lg pull-right" data-toggle="modal" data-target="#myModal">
			添加分类
		</button>
		<!-- 模态框（Modal） -->
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<form>
				<label for="inputUserName" class="sr-only">分类</label>
	        	<input type="text" id="CategoryName" class="form-control s-margin-2" placeholder="名称" required="required" autofocus>
				<button id="sumbit">提交</button>
			</form>
		</div>
		
		<div class="col-md-12 column">
			<ul class="pagination pull-right">
				<li>
					 <a href="#">上一页</a>
				</li>
				<li>
					 <a href="#">1</a>
				</li>
				<li>
					 <a href="#">2</a>
				</li>
				<li>
					 <a href="#">3</a>
				</li>
				<li>
					 <a href="#">4</a>
				</li>
				<li>
					 <a href="#">5</a>
				</li>
				<li>
					 <a href="#">下一页</a>
				</li>
			</ul>
		</div>
	</div>
</div>

</body>