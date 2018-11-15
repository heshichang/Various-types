<#setting number_format="#"><#-- 防止数字超过1000会出现逗号 -->

<form id="page_search" action="/page_examples/city" method="get">
    <input type="text" value="${query!}" id="query" name="query"/><br/>
    <button type="submit">查询</button>
    <br/>
</form>
<div>
    总条数：${pageInfo.total}<br/>
    当前页码：${pageInfo.pageNum}<br/>
    总页数：${pageInfo.pages}<br/>
    每页展示条数：${pageInfo.size}<br/>
    起始下标：${pageInfo.startRow}<br/>
    结束下标：${pageInfo.endRow}<br/>
<#list pageInfo.list as city>
    [${city.id}],[${city.area}]<br/>
</#list>
</div>
<#import "/page/macros.ftl" as macro/>
<@macro.page pageInfo=pageInfo url="/page_examples/city" parameter="query=${query!}"/>