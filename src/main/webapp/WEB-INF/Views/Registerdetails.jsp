<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.io.*, java.net.*, Controllers.LoginController,chat.DBConn" %>
    <%@ page import="java.sql.*"%>  

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
div1 {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 10px;
}
#container{
width:40%;
background-color: #f2f2f2;
  margin:0 auto;
  padding;20px;
}
h3 {
	text-align: center;
}
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Group Chat</title>
<%
DBConn sh = new DBConn();
 Statement stmt;
try {
	 Connection connt = sh.getConnection();
	stmt=connt.createStatement();
	PreparedStatement ps=connt.prepareStatement("select * from cht_hst;");  
	ResultSet rs=ps.executeQuery();  
	
		while(rs.next()){  
	out.println(rs.getString(1));  
		out.println("\n");  
	}
} catch (SQLException e) {
	
	e.printStackTrace();
}

%>


<script>
function ajax(){
	var req = new XMLHttpRequest();
	req.onreadystatechange=function(){
		if(req.readyState== 4  && req.status==200)
			{
			document.getElementById('chat').innerHTML=  req.responseText;
			}
	}
	
    req.open('GET',"chat",true);
	req.send();
}
</script>
</head>
<body  onload="ajax();">

<div id="container">
<h1>Hello ${name} </h1>
<div id="chat_box">
</div>

<form name="TextMessage"  method  ="post" action="/login.do" >
<label for="TextBox">Enter your Text</label>
   <textarea  name ="message">
   </textarea>
   <input  type ="submit" name="submit"  value="send  it"/>
</form>
<form name="TextMessage"  method  ="get" action="/show.do" >
<div id ="chat_data">

<span>How ate </span>
<span>Thanks</span>
</div>
</form>


</div>
</body>
</html>