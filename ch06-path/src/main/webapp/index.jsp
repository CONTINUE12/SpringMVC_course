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
    <base href="<%=basePath%>" />
</head>
<body>
    <p>第一个springmvc项目</p>
    <%--<p><a href="/ch06_path/test/some.do">first.do请求</a></p>--%>
    <p><a href="${pageContext.request.contextPath}/test/some.do">first.do请求</a></p>
    <%--
        当href中的地址前面不加“/”时，访问的地址是当前页面的地址 + 链接的地址 http://localhost:8080/ch06_path/ + test/some.do
        当href中的地址前面加上“/”时，访问的地址是服务器地址 + 链接的路径 http://localhost:8080/ + test/some.do，此时需要手动加入
            前缀/ch06_path/，也可以通过在地址前加 ${pageContext.request.contextPath}
    --%>

</body>
</html>
