<%@ page import="com.company.Tovar" %><%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 10.09.2020
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%Tovar tovar = (Tovar) request.getAttribute("Tovar");%>
<%=tovar.toString()%>

</body>
</html>
