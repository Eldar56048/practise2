<%@ page import="com.company.Tovar" %><%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 10.09.2020
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
Tovar tovar = (Tovar) request.getAttribute("Tovar");
Tovar tovar1 = (Tovar) request.getAttribute("Tovar1");

%>
<form action="<%=request.getContextPath()%>/practise2" method="post">
    <br>
    <%=tovar.getName()%><input type="radio" name="aboutTovar" value="<%=tovar.getName()%>"><br>
    <%=tovar1.getName()%><input type="radio" name="aboutTovar" value="<%=tovar1.getName()%>"><br>
    <input type="submit">
</form>
</body>
</html>
