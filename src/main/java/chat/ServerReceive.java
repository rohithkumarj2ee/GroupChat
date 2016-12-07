package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import Controllers.LoginController;

//@WebServlet(urlPatterns = "/show.do")
public class ServerReceive extends HttpServlet{
	
	
	
	public static BufferedReader in;
	public static String serverReply;
	/*
	@Autowired
	LoginController Listen;

	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		 try{
   	      
 	        in=  new BufferedReader(new InputStreamReader(Listen.clientSocket.getInputStream()));
 	        while(true)
 	        {
 	        
 	         serverReply=in.readLine();
 	                  
 	        if(serverReply!= null)
 	        {	
 	        	System.out.println(serverReply);
 	         }
 	        }
 	        }
 	       
 	        catch(Exception e)
 	        {
 	                System.out.println("Server Shutdown \t please re connect");
 	                       }
	 }*/

	 }


