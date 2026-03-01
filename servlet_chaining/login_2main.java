package servlet_chaining;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login_2_main")
public class login_2main extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd=req.getRequestDispatcher("/header.html");
		rd.include(req, resp);
		RequestDispatcher rd2=req.getRequestDispatcher("/login2.html");
		rd2.include(req, resp);
		RequestDispatcher rd3=req.getRequestDispatcher("/footer.html");
		rd3.include(req, resp);
	}

}
