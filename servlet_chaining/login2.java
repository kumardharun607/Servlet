package servlet_chaining;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login_2")
public class login2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		PrintWriter out=resp.getWriter();
		
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		if(email.equals("tom@gmail.com"))
		{
			if(password.equals("1234"))
			{
				Cookie c1=new Cookie("email",email);
				Cookie c2=new Cookie("password",password);
				c1.setMaxAge(60*5);
				resp.addCookie(c1);
				resp.addCookie(c2);
				
				out.print("<h1>Cookie added</h1>");
				
				req.setAttribute("name", "Dharunkumar");
				RequestDispatcher rd1=req.getRequestDispatcher("/home2");
				rd1.forward(req, resp);
			}
			else {
				out.print("<h1>Invalid password</h1>");
				RequestDispatcher rd2=req.getRequestDispatcher("/login_2_main");
				rd2.include(req, resp);
				
			}
		}
		else
		{
			out.print("<h1>Invalid Email</h1>");
			RequestDispatcher rd3=req.getRequestDispatcher("/login_2_main");
			rd3.include(req, resp);
		}
		
		
	}

}
