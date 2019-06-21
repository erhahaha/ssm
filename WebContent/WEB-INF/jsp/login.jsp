<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

	<title>用户登录</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath }/webapp/css/login.css">
	<!--<script src="${pageContext.request.contextPath }/webapp/js/login.js"></script>  -->

	</head>
<style>body{text-align:center} </style>
<body >

<div id="login_frame">

    <p id="image_logo"><img src="${pageContext.request.contextPath }/webapp/images/fly.png"></p>

  	<form action="${pageContext.request.contextPath }/user/login", method="post">
        <p><label class="label_input">用户名</label><input type="text" name="name" class="text_field"  /></p>

        <p><label class="label_input">密码</label><input type="password" name="password" class="text_field"/></p>

        <div id="login_control">

            <input type="submit" id="btn_login" value="登录" />

            <input type="button"  onclick="window.location.href('${pageContext.request.contextPath }/regist.jsp')" id="btn_login" value="注册" />
			
        </div>

    </form>

</div>

</body>
</html>
