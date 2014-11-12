<%@ page language="java" contentType="text/html; charset=Windows-31J"
    pageEncoding="Windows-31J"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Windows-31J">
<title>Hello World</title>
</head>
 <s:form action="delete" method="get">
     削除する社員IDの入力
	<s:textfield name="id" id="id" maxLength="12"/>
  	<s:hidden name="buttonId" value="1"/>
  	<s:submit name="query" value="検索"/>
</s:form>
<s:if test="em!=null">
	 <s:form action="delete" method="post">
	 	以下の情報を削除して良ければ削除ボタンを押してください。
		 <table border="0"width="300">
		 	<tr>
		 	<td>社員ID</td>
		  	<td><s:property value="id" default="null" /></td>
		  	</tr>
		 	<tr>
		 	<td>名前</td>
		  	<td><s:property value="name" default="null" /></td>
		  	</tr>
		  	<tr>
		  	<td>部門番号</td>
		  	<td><s:property value="departmentId" default="null" /></td>
		  	</tr>
		  	<tr>
		  	<s:hidden name="id" id="id"/>
		  	<s:hidden name="buttonId" value="2"/>
		  	<s:submit name="update" value="削除"/>
		  	</tr>
		  </table>
	</s:form>
</s:if>
<s:elseif test="buttonId==1">
検索条件一致する社員データは見つかりませんでした。
</s:elseif>
<s:if test="buttonId==2">
	以下の情報を削除しました。
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
