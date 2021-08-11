<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>

<html>
<head>
    <title>Title</title>
    <!--标签作用：index.jsp页面中所有没加"/"的地址，全部以basepath作为参考路径-->
    <base href="<=%basePath%>" />
</head>
<body>

    <p>一个拦截器</p>
    <form action="some.do" method="post">
        姓名：<input type="text" name="name"> <br/>
        年龄：<input type="text" name="age"> <br/>
        <input type="submit" value="提交请求">
    </form>


</body>
</html>
