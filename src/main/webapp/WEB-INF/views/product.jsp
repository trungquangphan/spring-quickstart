<%--
  Created by IntelliJ IDEA.
  User: phanquangtrung
  Date: 25/03/2019
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <p>Name of the products</p>
  <c:forEach items='${products}' var="hs">
    <tr>
      <p>${hs}</p>
    </tr>
  </c:forEach>

  </body>
</html>
