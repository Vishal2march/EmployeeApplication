<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   <%@ taglib prefix="s" uri="/struts-tags"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Details</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
 <table id="results" cellpadding="5px" cellspacing="1px" class="table table-bordered">
<div  class="table-responsive" align="center">
<h3><font color="#8B0000"><strong>Employee Directory Details Page</strong></font></h3>
</div>
<table class="table table-hover" border="1" cellpadding="3" align="center">
<tr>
<td class="Name"> FullName</td>
<td><s:property value="fname"/>
<s:property value="lname"/>
</td>
</tr>
<tr>
<td  class="Name"> Department Id</td>
<td><s:property value="deptid"/>
</td></tr>
<tr>
<td class="Name"> Lan Id </td>
<td><s:property value="lanid"/></td></tr>
<tr>
<td class="Name"> Created By</td>
<td><s:property value="createdby"/></td></tr>
<tr>
<td class="Name"> Modified By</td>
<td><s:property value="modifiedby"/></td></tr>
<tr>
<td class="Name"> Email Id</td>
<td><s:a href="mailto:%{email}"><s:property value="email"/></s:a></td>
</tr>
<tr>
<td class="Name"> Department Name</td>
<td><s:property value="deptname"/></td></tr>

</table>
</table></div>
</body>
</html>