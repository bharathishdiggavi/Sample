<html>
<head>
</head>
<body>
<jsp:useBean  id="std1"  class="dto.Student"  scope="application"/>
<jsp:setProperty property="reg" name="std1" value="23"/>
<jsp:getProperty property="reg" name="std1"/>
</body>
</html>