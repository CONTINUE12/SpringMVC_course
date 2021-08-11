<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>第一个springmvc项目</p>
    <form action="test/some.do" method="get">
        <input type="submit" value="GET请求some.do">
    </form>
    <form action="test/other.do" method="post">
        <input type="submit" value="POST请求other.do">
    </form>
    <p><a href="test/first.do">first.do请求</a></p>

</body>
</html>
