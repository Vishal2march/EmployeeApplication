<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Employee</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<h1>Add a new Employee</h1>
<s:form method="post" action="insert">
<div class="panel-body">
<table>
<div class="row">
<div class="col-lg-offset-1 col-lg-4">
<div class="form-group">
<tr>
<td>
<label for="fname">First Name:</label>
<s:textfield name="fname" label="First Name" class="form-control" placeholder="First Name">
</s:textfield></td>
</tr>
</div></div></div></div>

<div class="row">
<div class="col-lg-offset-1 col-lg-4">
<div class="form-group">
<tr>
<td>
<label for="lname">Last Name:</label>
<s:textfield name="lname" label="Last Name" class="form-control" placeholder="Last Name">
</s:textfield>
</td>
</tr>
</div></div></div>
<div class="row">
<div class="col-lg-offset-1 col-lg-4">
<div class="form-group">
<tr>
<td>
<label for="deptid">Dept Name:</label>
<select name="deptid" id="deptid" class="form-control">
    <option value="0">Select Dept Name</option>
    <option value="1">Education</option>
    <option value="2">Health</option>
    <option value="3">Labor</option>  
    </select>
</td>
</tr>
<tr>
<td>
<label for="lanid">Lan-Id:</label>
<s:textfield name="lanid" label="Lan Id" class="form-control" placeholder="Lan Id"></s:textfield></td></tr>
<tr>
<td>
<label for="createdby">Created By:</label>
<s:textfield name="createdby" label="Created By" class="form-control" placeholder="Created By">
</s:textfield></td></tr>
<tr>
<td>
<label for="modifiedby">Modified By:</label>
<s:textfield name="modifiedby" label="Modified By" class="form-control" placeholder="Modified By">
</s:textfield>
</td>
</tr>
<tr>
<td>
<label for="email">Email Id:</label>
<s:textfield name="email" label="Email Id" class="form-control" placeholder="Email Id">
</s:textfield></td></tr>
 <tr>         
          <td> 
          <input type="submit" class="btn btn-success" value="Save" />
          </td>        
         </tr> 
</table>
</div>
</s:form>
<div class="row">
				<div class=" col-lg-offset-5 col-lg-2">
<p style="font-size: 20px">
<a href="index.jsp">Back to Home Page</a></p></div>
</div></div>
</body>
</html>