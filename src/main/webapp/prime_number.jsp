<%--
  Created by IntelliJ IDEA.
  User: soraw
  Date: 10/30/2023
  Time: 10:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Sarawit Kraukham 65130500083</h1>
<div class="header">
    <h2>
        Welcome ${sessionScope.name} ${sessionScope.email}
    </h2>
</div>
<div class="prime-number">
    <h2>Prime number check</h2>
    <form action="is-prime" method="post">
        <label for="input-num">
            Enter number to check:
        </label>
        <input type="text" name="number" id="input-num">
        <c:if test="${requestScope.errMsg != null}">
            <div class="err" style="color: red">
                    ${requestScope.errMsg}
            </div>
        </c:if>
        <br>
        <input type="submit" name="submit" value="Submit">
    </form>
    <c:if test="${requestScope.result != null}">
        <div>
            <c:if test="${requestScope.result == false}">
                ${requestScope.number} is not prime Number
            </c:if>
            <c:if test="${requestScope.result == true}">
                ${requestScope.number} is prime Number
            </c:if>
        </div>
    </c:if>
</div>
</body>
</html>
