<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 4/27/2023
  Time: 9:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/ctrl/ok" method="post">
        <button>OK 1</button>
     <button formmethod="get">OK 2</button>
     <button formaction="/ctrl/ok?x">OK 3</button>
    </form>
</body>
</html>
