<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main search of Employees</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container-fluid">
<br>
		<div class="row">
			<div class="col-lg-offset-2 col-lg-1">
				<img border="0" src="images/search.png" width="350" height="130"
					alt="search Logo">
			</div></div>
<h1>Search an Employee</h1>
<form action="search" method="post" name="employeeform" theme="simple">

<div class="panel-body">
<div class="row">
								<div class="col-lg-offset-1 col-lg-4">
									<div class="form-group">
<div id="fname">

<label for="fname">First Name:</label>
<span style="position:relative; left:40 px;" class="shiftRight">
 <input type="text" name="fname" value="" id="fname" class="form-control" placeholder="First Name"/>
</span></div></div></div>
<BR>
<div class="row"> <div class="col-lg-offset-1 col-lg-4">
									<div class="form-group">
<div id="lname">
<label for="lname">Last Name:</label>
<span style="position:relative; left:40 px;" class="shiftRight">
 <input type="text" name="lname" value="" id="lname" class="form-control"
 placeholder="Last Name"/>
</span></div></div></div></div>
<br>
							<div class="row">
								<div class="col-lg-offset-1 col-lg-4">
									<div class="form-group">
<div id="deptname">
<label for="deptname">Department Name:</label>
<s:select name="deptname" list="{'Education','Health','Labor'}"
headerKey="" headerValue="Select" class="form-control"/>
</div></div></div></div>
<br>

<div class="row">
<div class="col-lg-offset-1 col-lg-4">
<div class="form-group">
<div id="lanid">
<label for="lanid">Lan ID:</label>
<span style="position:relative; left:40 px;" class="shiftRight">
<input type="text" name="lanid" value="" id="lanid"
class="form-control" placeholder="Lan-id"/>
</span></div></div></div></div>
<br>
<div class="container">
<div id="button">
<p align="center">
<s:submit action="search" class="btn btn-success" value="Search"/>
<s:reset type="button" class="btn btn-danger" value="Reset" tabindex="11"/>
</div></div></div></div>
</form>
</div>
</body>
</html>