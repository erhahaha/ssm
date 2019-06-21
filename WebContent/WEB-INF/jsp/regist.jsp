<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>用户注册</title>
</head>
<body>	
		<form action="${pageContext.request.contextPath }/user/regist">		
			<table border="1">			
				<tr>				
					<td>name</td>				
					<td><input type="text" name="name"></td>			
				</tr>			
				<tr>				
					<td>password </td>				
					<td><input type="text" name="password"></td>
				</tr>
				<tr>				
					<td>gander</td>				
					<td><input type="text" name="gander"></td>			
				</tr>			
				<tr>				
					<td>telephone </td>				
					<td><input type="text" name="telephone"></td>
				</tr>	
				<tr>				
					<td>address</td>				
					<td><input type="text" name="address"></td>			
				</tr>			
				<tr>				
					<td>notes </td>				
					<td><input type="text" name="notes"></td>
				</tr>	

				<tr>				
					<td><input type="submit" value="注册"></td>
				</tr>		
			</table>	
		</form>
</body>
</html>
