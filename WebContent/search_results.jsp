<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<link type="text/css" rel="stylesheet" href="stylesheet.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Results</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
 <table id="results" cellpadding="5px" cellspacing="1px" class="table table-bordered">
 <thead>
 <tr>
 <th>ID</th>
 <th>First Name</th>
 <th>Last Name</th>
 <th>Lan ID</th>
 <th>Created By</th>
 <th>Modified By</th>
 <th>Email ID</th>
 <th>Dept Name</th>
 <th>Edit</th>
 <th>Delete</th>
 </tr>
 </thead>
 <tbody>
 <s:iterator value="employeelist" var="contacts">
 <tr>
 <td><s:property value="id"/>
 </td>
 <td>
 <s:url var="fname_url" action="details">
 <s:param name="id"><s:property value="id"/>
 </s:param>
 </s:url>
 <s:a href="%{fname_url}"><s:property value="fname"/></s:a>
 </td>
 
 <td><s:url var="lname_url" action="details">
 <s:param name="id"><s:property value="id"/></s:param>
 </s:url>
 <s:a href="%{lname_url}"><s:property value="lname"/></s:a></td>
 <td><s:property value="lanid"/></td>
 <td><s:property value="createdby"/></td>
 <td><s:property value="modifiedby"/></td>
 <td><s:property value="email"/></td>
  <td><s:property value="deptname"/></td>
 <td>
 <s:url var="edit_url" action="update_page">
 <s:param name="id"><s:property value="id"/></s:param>
 </s:url>
 <s:a href="%{edit_url}">Edit</s:a>
 </td>
 <td>
 <s:url var="delete_url" action="delete">
 <s:param name="id"><s:property value="%{id}"/></s:param>
 </s:url>
 <s:a href="%{delete_url}">Delete</s:a>
 </td>
 </tr>
 </s:iterator>
 </tbody>
 </table>
 </div>
<br/>
<a href="insert.jsp">Add new Employee</a>
</body>
</html>