<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri ="http://java.sun.com/jsp/jstl/core" prefix = "c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Player successfully Created</h2>
success: FirstName: ${superPlayer.firstName}
<br/>
success: LastName: ${superPlayer.lastName}
<br/>
success: Age: ${superPlayer.age}
<br/>
success: country: ${superPlayer.country}
<br/>
success: Character:
<c:forEach items="${superPlayer.playerCharacter}" var="character">
	<c:out value = "${character}"/>
</c:forEach>
<br/>
</body>
</html>