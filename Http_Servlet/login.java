package Http_Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login_1")
public class login extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		PrintWriter out=resp.getWriter();
		if(email.equals("tom@gmail.com"))
		{
			if(password.equals("1234"))
			{
				HttpSession session=req.getSession(true);
				session.setAttribute("email", email);
				resp.sendRedirect(req.getContextPath() + "/home11");
				//out.print("<h1>Login successfull</h1>");
				
				
			}
			else
			{
				out.print("<h1>Invalid password</h1>");
			}
			
		}
		else
		{
			out.print("<h1>Invalid email</h1>");
		}
	}

}
