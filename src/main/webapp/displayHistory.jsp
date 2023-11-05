<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: soraw
  Date: 10/30/2023
  Time: 11:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>History</title>
</head>
<body>
<h1>Sarawit Kraukham 65130500083</h1>
<c:forEach items="${number}" var="i" varStatus="ct">
    <tr>
        <td>${i.getNumber()}</td>
        <td>${i.isPrime()}</td>
    </tr>
</c:forEach>
</body>
</html>
