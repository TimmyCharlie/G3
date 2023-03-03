<%--
  Created by IntelliJ IDEA.
  User: xbhee
  Date: 2023-03-01
  Time: 11:48 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Geographic Area Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</head>
<body>
<h1 class="m-5" style="text-align: center">Geographic Area Details</h1>

<ul class="list-group m-5 col-md-4">
    <li class="list-group-item">Name: ${gac.name}</li>
    <li class="list-group-item">Code: ${gac.code}</li>
    <li class="list-group-item">Level: ${gac.level}</li>
    <li class="list-group-item">Population in Area: ${population}</li>
    <a href="GACList" class="list-group-item list-group-item-action active" aria-current="true">
        Back to List
    </a>
</ul>



</body>
</html>
