
<div>
    <table>
        <tr>
            <td>学号</td>
            <td>姓名</td>
            <td>性别</td>
            <td>操作</td>
        </tr>
    <#list students as adv>
    <tr>
        <td>${adv.sid}</td>
        <td>${adv.sname!}</td>
        <td>${adv.sex}</td>
        <td><a href="/toupdate?id=${adv.sid}">修改</a>&nbsp;<a href="/delete?id=${adv.sid}">删除</a></td>
    </tr>
    </#list>
    </table>
</div>



