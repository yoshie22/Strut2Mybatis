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
     �폜����Ј�ID�̓���
	<s:textfield name="id" id="id" maxLength="12"/>
  	<s:hidden name="buttonId" value="1"/>
  	<s:submit name="query" value="����"/>
</s:form>
<s:if test="em!=null">
	 <s:form action="delete" method="post">
	 	�ȉ��̏����폜���ėǂ���΍폜�{�^���������Ă��������B
		 <table border="0"width="300">
		 	<tr>
		 	<td>�Ј�ID</td>
		  	<td><s:property value="id" default="null" /></td>
		  	</tr>
		 	<tr>
		 	<td>���O</td>
		  	<td><s:property value="name" default="null" /></td>
		  	</tr>
		  	<tr>
		  	<td>����ԍ�</td>
		  	<td><s:property value="departmentId" default="null" /></td>
		  	</tr>
		  	<tr>
		  	<s:hidden name="id" id="id"/>
		  	<s:hidden name="buttonId" value="2"/>
		  	<s:submit name="update" value="�폜"/>
		  	</tr>
		  </table>
	</s:form>
</s:if>
<s:elseif test="buttonId==1">
����������v����Ј��f�[�^�͌�����܂���ł����B
</s:elseif>
<s:if test="buttonId==2">
	�ȉ��̏����폜���܂����B
	<table border="1"width="500">
		<tr>
			<th>�Ј�ID</th>
			<th>���O</th>
			<th>����ID</th>
		</tr>
		<tr>
			<td><s:property value="id"default="null"/>	</td>
			<td><s:property value="name"default="null"/></td>
			<td><s:property value="departmentId"default="null"/></td>
		</tr>
	</table>
</s:if>
 <s:form action="index" method="get">
   	<s:submit name="query" value="�߂�"/>
 </s:form>
