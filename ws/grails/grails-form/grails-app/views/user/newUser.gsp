<%--
  Created by IntelliJ IDEA.
  User: praveen
  Date: 31/03/23
  Time: 9:57 am
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>

<g:form controller="user" action="saveUser">
    <div>
    <label>First Name</label>
      <g:textField name="firstName" required="true"  value="${user.firstName}"/>
    </div>

    <div>
        <label>Last Name</label>
        <g:textField name="lastName" required="true"/>
    </div>

    <div>
        <label>Email Address</label>
        <g:textField name="email" required="true"/>
    </div>

    <div>
        <g:submitButton name="submit" value="Save"/>
    </div>

</g:form>


</body>
</html>