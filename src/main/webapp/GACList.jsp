<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<%--
  Created by IntelliJ IDEA.
  User: xbhee
  Date: 2023-03-01
  Time: 12:44 a.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <title>Geographic Area Classification List</title>
</head>
<body>
<h1 class="m-5" style="text-align: center">Geographic Area Classification List</h1>

<table class="table" style="text-align: center">
    <thead>
    <tr>
        <th scope="col">Classification</th>
        <th scope="col">Geographic Area Names</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="i" items="${List0}">
        <tr>
            <td>Level 0</td>
            <td>
                    ${i.name}
            </td>
        </tr>
    </c:forEach>
    <c:forEach var="i" items="${List1}">
        <tr>
            <td>Level 1</td>
            <td>
                    ${i.name}
            </td>
        </tr>
    </c:forEach>
    <c:forEach var="i" items="${List2}">
        <tr>
            <td>Level 2</td>
            <td>
                    ${i.name}
            </td>
        </tr>
    </c:forEach>
    <c:forEach var="i" items="${List3}">
        <tr>
            <td>Level 3</td>
            <td>
                    ${i.name}
            </td>
        </tr>
    </c:forEach>

    </tbody>
</table>

</body>
</html>
