<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="s" class="textusebean.student"></jsp:useBean>

<jsp:setProperty property="*" name="s"/>

<jsp:getProperty property="id" name="s"/>
<jsp:getProperty property="fname" name="s"/>
<jsp:getProperty property="l" name="s"/>

</body>
</html>