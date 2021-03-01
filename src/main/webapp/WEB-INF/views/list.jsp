<%--
  Created by IntelliJ IDEA.
  User: ngominhhieu
  Date: 01/03/2021
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" cellspacing="1" cellpadding="10">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
    </tr>
    <c:forEach items="${name}" var="hieu">
        <tr>
            <td>${hieu.getId()}</td>
            <td>${hieu.getName()}</td>
            <td>${hieu.getEmail()}</td>
            <td>${hieu.getAddress()}</td>

        </tr>
    </c:forEach>

</table>
</body>
</html>
