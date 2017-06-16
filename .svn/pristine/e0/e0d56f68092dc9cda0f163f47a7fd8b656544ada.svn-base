<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee Update Page</h1>
<s:form  action="update" method="post" name="updateform" theme="simple">
<s:hidden name="id" />

<div id="fname">First Name:
<span style="position:relative; left:40 px;" class="shiftRight">
<s:textfield name="contacts.fname" value="fname" size="22" tabindex="1"></s:textfield>
</span>
</div>
<div id="lname">Last Name:
<s:textfield name="contacts.lname" key="lname"></s:textfield>
</div>
<div id="deptid">Department Id:
<s:select  name="contacts.deptid" list="{'1','2','3'}"
headerKey="" headerValue="Select" 
            label="Select Dept Id"/>
</div>
<div id="lanid">Lan Id:
<s:textfield name="contacts.lanid"></s:textfield>
</div>
<div id="createdby">Created By:
<s:textfield name="contacts.createdby"></s:textfield>
</div>
<div id="modifiedby">Modified By:
<s:textfield name="contacts.modifiedby"></s:textfield>
</div>
<div id="emailid">Email Id:
<s:textfield name="contacts.email"></s:textfield>
</div>

           <div id="button">
           <s:submit action="update" value="Update" tabindex="10"/>
        <s:reset type="button" value="Reset" tabindex="10"/>
          </div>
</s:form>
</body>
</html>