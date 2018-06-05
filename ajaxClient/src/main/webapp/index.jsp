<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>增删改查</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript" src="jquery-3.2.1.js"></script>
<script type="text/javascript">
	$(function() {
		$("#btn").click(function() {
			getDate();
		});
	});
	function getDate() {
		$.ajax({
			type : 'post',
			url : 'http://127.0.0.1:8081/ajaxServer/get',
			dataType : 'text',
			success : function(json) {
				$("#text").val(json);
			},
			error : function(event) {

			}
		});
	}
</script>
</head>

<body>
	<div>
		<input type="button" id="btn" value="查询" />.
		<input type="text" id="text"/>
	</div>
</body>
</html>
