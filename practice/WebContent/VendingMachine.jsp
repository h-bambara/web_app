<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>販売支援システム</title>
</head>
<body>
	<div>
		<h2 align="center">メインメニュー</h2>
	</div>
	<br>
	<form action="/src" method="POST" name="inform">
		<!-- ボタンID用フィールド -->
		<input type="hidden" name="BUTTON_ID" value="">
		<div align="center">
		<table >
		<tr>
		<td>
		    <input type="button" value="得意先管理"
		    onclick="document.inform.BUTTON_ID.value='buy'; document.inform.submit();">
		</td>
		</tr>
		</table>
		</div>
	</form>
</body>
</html>