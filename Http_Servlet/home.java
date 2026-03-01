package Http_Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/home11")
public class home extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=req.getSession(false);
		PrintWriter out=resp.getWriter();
		if(session!=null)
		{
			String email=(String)session.getAttribute("email");
			if(email!=null)
			{
				out.print("<h1>Welcome to home page</h1>");
			}
			else
			{
				out.print("<h1>Login first!!!..</h1>");
			}
		}
		else {
			out.print("<h1>session not found!!!..</h1>");
			
		}
	}

}
