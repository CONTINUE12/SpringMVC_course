<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>提交参数给contorller</p>
    <form action="receivepropertity.do" method="post">
        姓名:<input type="text" name="name"> <br/>
        年龄:<input type="text" name="age"> <br/>
        <input type="submit" value="提交参数">
    </form>

    <br/>

    <p>提交参数名与形参名不一致</p>
    <form action="receiveparam.do" method="post">
        姓名:<input type="text" name="rname"> <br/>
        年龄:<input type="text" name="rage"> <br/>
        <input type="submit" value="提交参数">
    </form>

    <br/>

    <p>提交对象参数</p>
    <form action="receiveobject.do" method="post">
        姓名:<input type="text" name="name"> <br/>
        年龄:<input type="text" name="age"> <br/>
        <input type="submit" value="提交参数">
    </form>

</body>
</html>
