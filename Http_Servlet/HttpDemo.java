package Http_Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/http_demo")
public class HttpDemo extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	{
		try {
			PrintWriter out=res.getWriter();
			out.print("<h1>Hi this is get method</h1>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	{
		try {
			PrintWriter out=res.getWriter();
			out.print("<h1>Hi this is Post method</h1>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
