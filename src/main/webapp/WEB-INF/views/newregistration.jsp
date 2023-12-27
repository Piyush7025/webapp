<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>REgister here.....</h2>
  <form action="saveReg" method = "post">
     
    <pre>
     First Name <input type = "text" name="firstName"/>
     Last Name <input type = "text" name="lastName"/>
     email <input type = "text" name="email"/>
     Mobile <input type = "text" name="mobile"/>
    <input type = "submit" value="save"/>
     
    
    </pre>
  
  </form>
   ${msg}
   
</body>
</html>