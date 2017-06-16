<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main Update records page for Employees </title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
 <div class="panel panel-default">
    <div class="panel-heading">A page for Employees to Update their records</div>
    <div class="panel-body">
<form  action="update" method="post" theme="simple">
<s:hidden name="id" />

<div class="panel-body">
<div class="row">
<div class="col-lg-offset-1 col-lg-4">
<div class="form-group">
<div id="fname">
<label for="fname">First Name:</label>
<s:textfield name="fname" class="form-control">
</s:textfield>
</div></div></div></div><br>
<div class="row">
<div class="col-lg-offset-1 col-lg-4">
<div class="form-group">
<div id="lname">
<span style="position:relative; left:40 px;" class="shiftRight">
<label for="lname">Last Name:</label>
<s:textfield name="lname" class="form-control"></s:textfield>
</span>
</div></div></div></div>
<br>

<div class="row">
<div class="col-lg-offset-1 col-lg-4">
<div class="form-group">
<div id="deptid">
<label for="deptname">Department Name:</label>
<s:select name="deptname" list="{'Education','Health','Labor'}"
headerKey="" headerValue="Select" class="form-control"/>
</div></div></div></div>

<br>

<div class="row">
<div class="col-lg-offset-1 col-lg-4">
<div class="form-group">
<div id="lanid">
<label for="lanid">Lan Id:</label>
<s:textfield name="lanid" class="form-control">
</s:textfield></div></div></div>
</div><br>
<div class="row">
<div class="col-lg-offset-1 col-lg-4">
<div class="form-group">
<div id="createdby">
<label for="createdby">Created By:</label>
<s:textfield name="createdby" class="form-control"></s:textfield>
</div></div></div></div>
<br>
<div class="row">
<div class="col-lg-offset-1 col-lg-4">
<div class="form-group">
<div id="modifiedby">
<label for="modifiedby">Modified By:</label>
<s:textfield name="modifiedby" class="form-control"></s:textfield>
</div></div></div></div>
<br>
<div class="row">
<div class="col-lg-offset-1 col-lg-4">
<div class="form-group">
<div id="emailid">
<label for="email">Email ID:</label>
<s:textfield name="email" class="form-control"></s:textfield>
</div></div></div></div>
<br>
           <div id="button">
           <span style="position:relative; left:40 px;" class="shiftRight">
           <s:submit action="update" class="btn btn-success" align=""value="Update" tabindex="10"/></span>
        <s:reset type="button" class="btn btn-danger" value="Reset" tabindex="10"/>
          </div>
     </div>     
</form>
</div>
</div></div>
</body>
</html>