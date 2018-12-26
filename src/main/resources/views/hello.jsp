<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%@taglib prefix="s" uri="/struts-tags"%>

<%
	String path = request.getContextPath();//
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>标题</title>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
<meta name="keywords" content="关键字">
<meta name="description" content="内容描述">

<!-- css文件引入 -->
<link href="<%=path%>/css/xxx.css" rel="stylesheet" type="text/css">
<!-- js文件引入 -->
<script src="<%=path%>/js/xxx.js" type="text/javascript"></script>

<style>
</style>

</head>


<body>



</body>
</html>