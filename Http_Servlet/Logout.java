package Http_Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout1")
public class Logout extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session =req.getSession(false);
		PrintWriter out=resp.getWriter();
		if(session!=null)
		{
			session.invalidate();
			 // 🔥 delete JSESSIONID cookie from browser
	        Cookie cookie = new Cookie("JSESSIONID", "");
	        cookie.setMaxAge(0);
	        cookie.setPath(req.getContextPath()); 
	        resp.addCookie(cookie);
			out.print("<h1>logout successfull</h1>");
		}
	}

}
