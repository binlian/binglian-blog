<html>
<#include "../comm/header.ftl">

<body>
<div id="wrapper" class="toggled">


    <#include "../comm/nav.ftl">

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
					<#if CategoryList ??>
						<#list CategoryList as category>
						<tr>
                            <td>${category.id}</td>
                            <td>${category.name}</td>
                            <td>${category.createTime?string('yyyy-MM-dd hh:mm:ss')}</td>
                            <td>${(category.updateTime?string('yyyy-MM-dd hh:mm:ss'))}</td>
                            <td>

                                <a href="/category/delete?id=${category.id}">删除</a>
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
        <button onClick="window.open('/admin/category/add')" class="btn btn-primary btn-lg pull-right">
            添加分类
        </button>


    </div>
</div>

<script src="../../js/jquery.min.js"></script>

</body>