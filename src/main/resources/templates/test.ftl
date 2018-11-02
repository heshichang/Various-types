<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

   <table border="1">
       <tr id="${msg}">
           <#list (5-1)..0 as t>
              <td>1,${t}</td>
           </#list>
       </tr>

   </table>

<input value="${((pagenum-5) gt 0)?then(5,pagenum)}">

<div class="job-ranking"></div>



</body>
<script src="/jquery-3.3.1.min.js"></script>
<script>
    $(function(){
        $.ajax({
            type: 'get',
            cache: false,
            url: "/joint",
            async: false,
            dataType:'html',
            success: function (res) {
                debugger;
                if(res != ''){
                    $('.job-ranking').html(res);
                }else {
                    return false;
                }
            }
        });
    });
</script>

</html>