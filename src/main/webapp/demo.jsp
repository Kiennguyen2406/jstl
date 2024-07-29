<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 7/29/2024
  Time: 7:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
  <table border="1">
    <thead>
    <tr>
      <th>name</th>
      <th>date</th>
      <th>address</th>
      <th>image</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="student" items="${students}">
      <tr>
        <td>${student.name}</td>
        <td>${student.date}</td>
        <td>${student.address}</td>
        <td><img src="${student.image}"style="width: 100px; height: 100px;" ></td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
  </body>
</html>
