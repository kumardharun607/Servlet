package servlet_chaining;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
@WebServlet("/s1")
public class servlet1 extends GenericServlet {


@Override
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	// TODO Auto-generated method stub
	RequestDispatcher dispatcher=req.getRequestDispatcher("s2");
	dispatcher.forward(req,res);
	
}}
