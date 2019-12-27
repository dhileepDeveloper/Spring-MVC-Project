<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.cssError{
	color:red;
}
</style>
</head>
<body>
<form:form action="processFootballPlayer" method="post" modelAttribute="footballTennis">
FirstName: <form:input  path="firstName"/>
<form:errors class="cssError" path="firstName"/>
<br/><br/>
LastName:  <form:input path="lastName"/>
<br/><br/>
Age: <form:input path="age"/>
<form:errors class="cssError" path="age"/>
<br/><br/>
<!-- 
<form:select path="country">
<form:option value="India">INDIA</form:option>
<form:option value="Brazil">Brazil</form:option>
<form:option value="USA">USA</form:option>
<form:option value="UK">UK</form:option>
</form:select>
-->
Country:
<form:select path="country">
<form:options items="${footballTennis.countryMap}"/>
</form:select>
<br/><br/>
Player Characteristics:
<form:checkboxes items="${character}" path="playerCharacter"/> 
<form:errors path="playerCharacter" class="cssError"/>
<br/><br/>
Email: <form:input path="email"/>
<form:errors path="email" class="cssError"/>
<br/><br/>
<input type="submit" value="submit" />
</form:form>
</body>
</html>