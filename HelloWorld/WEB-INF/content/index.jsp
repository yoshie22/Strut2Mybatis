<%@ page language="java" contentType="text/html; charset=Windows-31J"
    pageEncoding="Windows-31J"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Windows-31J">
<title>Hello World</title>
</head>

 <s:form action="select" method="get">
   	<s:submit name="select" value="������ʂ�"/>
</s:form>
 <s:form action="insert" method="get">
   	<s:submit name="insert" value="�o�^��ʂ�"/>
</s:form>
 <s:form action="update" method="get">
   	<s:submit name="update" value="�X�V��ʂ�"/>
</s:form>
 <s:form action="delete" method="get">
   	<s:submit name="delete" value="�폜��ʂ�"/>
</s:form>
