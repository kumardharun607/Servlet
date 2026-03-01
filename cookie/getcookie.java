package cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getcookie")
public class getcookie extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException, ServletException
	{
		
		PrintWriter out=res.getWriter();
		
		
		Cookie arr[]=req.getCookies();
		for(Cookie c:arr)
		{
			out.print("<h1>"+c.getName()+":"+c.getValue());
		}
	
	}

}
