<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 4/27/2023
  Time: 9:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
</head>
<body>
    <form action="/sinh-vien/search" method="get">
        <input placeholder="nhập " id="ten" name="ten1">
        <button type="submit">tìm kiếm</button>
    </form>
    <button><a href="/sinh-vien/view-add">Add Sinh Vien</a></button>
    <thead>
    <tr>
        <th>Mã</th>
        <th>Họ và tên</th>
        <th>Tuổi</th>
        <th colspan="2">Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${sinhViens}" var="acc">
        <tr>
            <td>${acc.ma}</td>
            <td>${acc.ten}</td>
            <td>${acc.tuoi}</td>
            <td>
                <button><a href="/sinh-vien/detail/${acc.ma}">Detail</a></button>
            </td>
            <td>
                <button><a href="/sinh-vien/delete/${acc.ma}">Delete</a></button>
            </td>
        </tr>
    </c:forEach>
</tbody>
</body>
</html>