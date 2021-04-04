<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
String message1 = (String)request.getAttribute("message1");
String message2 = (String)request.getAttribute("message2");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>結果</title>
</head>
<body>
<%if(message1 != null){ %>
<p><%=message1 %></p>
<%} %>
<%if(message2 != null){ %>
<p><%=message2 %></p>
<%} %>
</body>
</html>