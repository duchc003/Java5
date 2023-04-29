<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">
</head>
<body>
<table class="table">
    <tr>
        <th scope="col">Họ Và Tên</th>
        <th scope="col">Chuyên Ngành</th>
        <th scope="col">Tuổi</th>
        <th scope="col">Trạng Thái</th>
        <th colspan="2">Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listSinhVien}" var="c">
        <tr>
            <td>${c.name}</td>
            <td>${c.specialization}</td>
            <td>${c.age}</td>
            <td>${c.status}</td>
        </tr>
    </c:forEach>
</table>
<script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
</body>
</html>