package servlet_chaining;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/log")
public class log extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		PrintWriter out=res.getWriter();
		if(email.equals("kumardharun607@gmail.com"))
		{
			if(password.equals("12345678"))
			{
				RequestDispatcher dispatcher=req.getRequestDispatcher("Home.html");
				dispatcher.forward(req, res);
			}
			else {
				out.print("<h1 style='color:red'>Invalid password</h1>");
//				RequestDispatcher dispatcher=req.getRequestDispatcher("log.html");
//				dispatcher.include(req, res);
			}
		}
		else {
			out.print("<h1 style='color:red'>Invalid Email</h1>");
			RequestDispatcher dispatcher=req.getRequestDispatcher("log.html");
			dispatcher.include(req, res);
			
		}
		
	}
	

}
