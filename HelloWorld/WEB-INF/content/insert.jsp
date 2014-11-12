<%@ page language="java" contentType="text/html; charset=Windows-31J"
    pageEncoding="Windows-31J"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Windows-31J">
<title>Hello World</title>
</head>
 <s:form action="insert" method="post">
	 <table border="0"width="300">
	 	<tr>
	 	<td>社員ID</td>
	  	<td><s:textfield name="id" id="id" maxLength="12" disabled="true" value="自動設定"/></td>
	  	</tr>
	 	<tr>
	 	<td>名前</td>
	  	<td><s:textfield name="name" id="name" maxLength="12" /></td>
	  	</tr>
	  	<tr>
	  	<td>部門番号</td>
	  	<td><s:textfield name="departmentId" id="departmentId" maxLength="12" /></td>
	  	</tr>
	  	<tr>
	  	<s:submit name="insert" value="登録"/>
	  	</tr>
	  </table>

</s:form>
<s:if test="em!=null">
	以下の情報を登録しました。
	<table border="1"width="500">
		<tr>
			<th>社員ID</th>
			<th>名前</th>
			<th>部門ID</th>
		</tr>
		<tr>
			<td><s:property value="id"default="null"/>	</td>
			<td><s:property value="name"default="null"/></td>
			<td><s:property value="departmentId"default="null"/></td>
		</tr>
	</table>
</s:if>
 <s:form action="index" method="get">
   	<s:submit name="query" value="戻る"/>
 </s:form>
