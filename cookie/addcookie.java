package cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addcookie")
public class addcookie extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException
	{
		Cookie c1=new Cookie("email","tom@gmail.com");
		Cookie c2=new Cookie("password","1234");
		c1.setMaxAge(60*5);
		res.addCookie(c1);
		res.addCookie(c2);
		PrintWriter out=res.getWriter();
		out.print("<h1>Cookie added</h1>");
	}

}
