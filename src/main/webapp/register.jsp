<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="zh_cn">
<head>
	<meta charset="utf-8" />
	<title>校园助手</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="http://code.jquery.com/mobile/1.3.1/jquery.mobile-1.3.1.min.css" />
	<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
	<script src="http://code.jquery.com/mobile/1.3.1/jquery.mobile-1.3.1.min.js"></script>
	<script src="./resources/js/libs/jquery-1.9.1.min.js" type="text/javascript"></script>
	<script src="./resources/js/libs/jquery.mobile-1.3.1.min.js" type="text/javascript"></script>
	<link rel="stylesheet" href="/resources/css/jquery.mobile-1.3.1.min.css" />
	<script type="text/javascript">
		!window.jQuery && document.write('<script src="/resources/js/libs/jquery-1.9.1.min.js" type="text/javascript"><\/script><script src="/resources/js/libs/jquery.mobile-1.3.1.min.js" type="text/javascript"><\/script>
			<link rel="stylesheet" href="/resources/css/jquery.mobile-1.3.1.min.css" \/>');
	</script>
</head>
<body>
	<div data-role="page" id="page1">

		<div data-role="header">
			<h1>校园助手--注册</h1>
			<a class="ui-btn-right" href="#page2" data-role="button">
            登陆
        	</a>
		</div>

		<div data-role="content">
			<form action="/user/register" method="POST">
     			<label for="name">注册账号：</label>
     			<input name="user.name" id="name" type="text" value="">
     			 <label for="password">密码：</label>
     			<input name="user.password" id="password" type="password" value="" autocomplete="off" data-clear-btn="true">
     			<label for="password">确认密码：</label>
     			<input name="passwordcheck" id="passwordcheck" type="password" value="" autocomplete="off" data-clear-btn="true">
     			<input type="submit" value="注册">
			</form>
		</div>

		<div data-role="footer">
			<h4>Copyright 2013 CrazyTeam</h4>
		</div>
	</div>
</body>
</html>
