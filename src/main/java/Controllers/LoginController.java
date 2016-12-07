package Controllers;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Component
public class LoginController {
	 public static BufferedReader in;
     public static String serverReply;	
    public static Socket clientSocket;
    public static String inputString;
   public static PrintWriter out;
	@RequestMapping(value="/login")

	public  String SayHEllo()
	{
		return "login";
	}
}
