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
    <link rel="stylesheet" href="https://cdn.datatables.net/1.13.3/css/jquery.dataTables.css">
    <script
            src="https://code.jquery.com/jquery-3.6.3.slim.js"
            integrity="sha256-DKU1CmJ8kBuEwumaLuh9Tl/6ZB6jzGOBV/5YpNE2BWc="
            crossorigin="anonymous"></script>


    <script src="https://cdn.datatables.net/1.13.3/js/jquery.dataTables.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</head>
<body>
<h1 class="m-5" style="text-align: center">Geographic Area Classification List</h1>
<a href="AgeList?year=1" class="m-2" style="text-align: center">Age List of 2021</a>
<a href="AgeList?year=2" class="m-2" style="text-align: center">Age List of 2016</a>

<table class="table" id="myTable">
    <thead>
    <tr>
        <th scope="col">Classification</th>
        <th scope="col">Geographic Area Names</th>
        <th scope="col">Details</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="i" items="${List0}">
        <tr>
            <td>Level 0</td>
            <td>
                    ${i.name}
            </td>
            <td><a href="${request.contextPath}GACDetail?id=${i.geographicAreaID}">Details</a></td>
        </tr>
    </c:forEach>
    <c:forEach var="i" items="${List1}">
        <tr>
            <td>Level 1</td>
            <td>
                    ${i.name}
            </td>
            <td><a href="${request.contextPath}GACDetail?id=${i.geographicAreaID}">Details</a></td>
        </tr>
    </c:forEach>
    <c:forEach var="i" items="${List2}">
        <tr>
            <td>Level 2</td>
            <td>
                    ${i.name}
            </td>
            <td><a href="${request.contextPath}GACDetail?id=${i.geographicAreaID}">Details</a></td>
        </tr>
    </c:forEach>
    <c:forEach var="i" items="${List3}">
        <tr>
            <td>Level 3</td>
            <td>
                    ${i.name}
            </td>
            <td><a href="${request.contextPath}GACDetail?id=${i.geographicAreaID}">Details</a></td>
        </tr>
    </c:forEach>

    </tbody>
</table>
<script>
    $(document).ready( function () {
        $('#myTable').DataTable();
    } );
</script>

</body>
</html>
