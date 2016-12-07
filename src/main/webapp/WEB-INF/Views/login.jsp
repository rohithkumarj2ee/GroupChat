<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<style>
input[type=text], select {
    width: 30%;
    padding: 10px 10px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

input[type=submit] {
    width: 10%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}
input[type=submit]:hover {
    background-color:red;
}
div {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
}
h3 {
	text-align: center;
}
</style>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<title> Register </title>
<body>
<h1> Hello Welcome to Group Chat </h1>


<p>
Please  provide your details to login  to chat  room.</p>
 
  <form  action="/login.do" method="post">
    <label for="first_name">First Name</label>
    <input type="text"  name="first_name"></br>

    <label for="last_name">Last Name</label>
    <input type="text"  name="last_name"></br>
    
   <input type="submit" value="Submit">
  </form>
</body>
</html>