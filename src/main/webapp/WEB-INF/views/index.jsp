<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Focus</title>
</head>
<body>
<div>
<form action="add" method="post">
<input type="text" name="task">
<input type="submit">
</form>
</div>

<div>
<c:forEach items="${tasks }" var="task">
<div>${task.name }</div>
</c:forEach>
</div>
</body>
</html>