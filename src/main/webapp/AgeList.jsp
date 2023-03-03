<%@ page import="bean.Age" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: xbhee
  Date: 2023-03-03
  Time: 1:57 a.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Age List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.datatables.net/1.13.3/css/jquery.dataTables.css">
    <script
            src="https://code.jquery.com/jquery-3.6.3.slim.js"
            integrity="sha256-DKU1CmJ8kBuEwumaLuh9Tl/6ZB6jzGOBV/5YpNE2BWc="
            crossorigin="anonymous"></script>


    <script src="https://cdn.datatables.net/1.13.3/js/jquery.dataTables.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</head>
<body>

<h1 class="m-5" style="text-align: center">Age List of ${year}</h1>
<a href="GACList" class="m-2">Back to GAC List</a>

<table class="table" id="myTable">
    <thead>
    <tr>
        <th scope="col">Age Group</th>
        <th scope="col">Male</th>
        <th scope="col">Female</th>
    </tr>
    </thead>
    <tbody>
    <%
        HashMap<Age, String> list = (HashMap<Age, String>) request.getAttribute("list");
        for (Map.Entry<Age, String> i : list.entrySet()) {
    %>
    <tr>
        <th scope="row"><%= i.getValue() %>
        </th>
        <td><%= i.getKey().getMale() %>
        </td>
        <td><%= i.getKey().getFemale() %>
        </td>
    </tr>
    <% } %>
    </tbody>
</table>

<script>
    $(document).ready( function () {
        $('#myTable').DataTable({
            order: [[0, 'asc']],
        });
    } );
</script>

</body>
</html>
