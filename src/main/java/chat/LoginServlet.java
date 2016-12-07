package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import Controllers.LoginController;



@WebServlet(urlPatterns = "/login.do")
//@Controller

public class LoginServlet extends HttpServlet {
		
	
	static Connection conn;
	static Statement st;
   String s;
	
	@Autowired
	LoginController Service;
	
	
	DBConn db = new DBConn();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		request.setAttribute("name", request.getParameter("first_name"));
		
		
		 request.getRequestDispatcher("/WEB-INF/Views/Registerdetails.jsp").forward(request,response);
		 s=request.getParameter("message");
		 if(s != null && s!=""){
			 
		
		 try {
			 Connection conn = db.getConnection();
			st=conn.createStatement();
			st.execute("Insert into cht_hst (idcht_hst) values ('"+s+"');");
		} catch (SQLException | ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		 }
			
			
	            }
	            }
    
    	
    	
    
    
    
    
