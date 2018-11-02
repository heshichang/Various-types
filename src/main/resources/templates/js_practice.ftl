<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        .intro{
            font-size:150%;
            color:red;
        }
    </style>
</head>
<script src="/jquery-3.3.1.min.js"></script>
<body>
<#if msg=='消息'>
    <input type="text" value="${msg}">
</#if>

<p>测试变化</p>
<div id="first">
    点我
</div>

<script>
    $('#button').click(function () {
       $('p:first').addClass("intro");
    });
</script>
</body>
