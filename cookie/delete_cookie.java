package cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete_cookie")
public class delete_cookie  extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException
	{
		Cookie arr[]=req.getCookies();
		for(Cookie c:arr)
		{
			if(c.getName().equals("password"))
			{
				c.setMaxAge(0);
				res.addCookie(c);
			}
		}
		PrintWriter out=res.getWriter();
		out.print("<h1>Cookie removed</h1>");
	}

}
