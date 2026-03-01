package Http_Servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/send")
public class Send_redirect extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	{
		try {
			res.sendRedirect("https://github.com/dashboard");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
