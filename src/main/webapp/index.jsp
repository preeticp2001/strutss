<%--
  Created by IntelliJ IDEA.
  User: admins
  Date: 28/04/22
  Time: 10:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<h1>Registration form</h1>
<s:form action="Register">
    <s:textfield name="fname" label="First-Name" />
    <s:textfield name="lname" label="Last-Name" />
    <s:textfield name="email" label="Email" />
    <s:textfield name="password" label="Pasword" />
    <s:submit value="Submit" />
</s:form>
</body>
</html>
