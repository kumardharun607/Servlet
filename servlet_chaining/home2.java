
package servlet_chaining;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home2")
public class home2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		RequestDispatcher rd=req.getRequestDispatcher("/header.html");
		rd.include(req, resp);
		PrintWriter out=resp.getWriter();
		
		String name=(String)req.getAttribute("name");
	    out.print("<h1>Welcome to "+name+"</h1>");
	    
	    RequestDispatcher rd1=req.getRequestDispatcher("/footer.html");
		rd1.include(req, resp);
				
	}

}

