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
            社員ID入力
 	 <td>
  	<s:textfield name="id" id="id" maxLength="12" />
  	<s:hidden name="buttonId" value="1"/>
  	<s:submit name="query" value="検索"/>
	 </td>
</s:form>
 <s:form action="select" method="get">
	<s:hidden name="buttonId" value="2"/>
	<s:submit name="query" value="全件検索"/>
</s:form>

<s:if test="employeeList!=null && employeeList.size()!=0">
	検索結果
	<table border="1"width="500">
		<tr>
			<th>社員ID</th>
			<th>名前</th>
			<th>部門ID</th>
		</tr>
		<s:iterator value="employeeList"var="emp">
			<tr>
			<td><s:property value="#emp.getEmployee_Id()"default="null"/></td>
			<td><s:property value="#emp.getEmployee_Name()"default="null"/></td>
			<td><s:property value="#emp.getDepartment_Id()"default="null"/></td>
			</tr>
		</s:iterator>
	</table>
</s:if>
<s:elseif test="buttonId==1">
検索条件一致する社員データは見つかりませんでした。
</s:elseif>
 <s:form action="index" method="get">
   	<s:submit name="query" value="戻る"/>
 </s:form>
