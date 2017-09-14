<%@page import="dto.Student"%>
<html>
<head>
</head>
<body>
<%-- <jsp:useBean  id="std1"  class="dto.Student"  scope="application"/>
<jsp:getProperty property="reg" name="std1"/> --%>
<%Student s1 = (Student)application.getAttribute("std1"); %>
</body>
</html>