package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
/**
 * Servlet implementation class servlet
 */
@WebServlet("/servlet")
public class servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public  ArrayList<String> A=new ArrayList<String>();
    
   
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out=response.getWriter();
		
		
		String val=request.getParameter("command");
		
		switch(val)
		{
		case "signup":
		{
			
			try
			{
				DButil a=new DButil();
				DButil.getconnect();
				
				String name=request.getParameter("name");
				
				String pass=request.getParameter("pass");
				
				String cont=request.getParameter("cont");
				
				String city=request.getParameter("city");
				
				String addr=request.getParameter("addr");
				
				a.insert(name,pass,cont,addr,city);
				
			}
			
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
		
		
			
	case "login":
	{
		out.println("worrier");
		try
		{
		
		DButil a=new DButil();
		
		 String name=request.getParameter("name");
			
			String pass1=request.getParameter("pass1");
			
			
		out.println(pass1);
			
			a.getdata(name);
			
			out.println(A.get(2));
			int i;
			for(i=0;i<A.size();i++)
			{ 
				
				out.print(A.get(i));
				/*if((A.get(i)).equals(pass1))
				{
					RequestDispatcher req=request.getRequestDispatcher("signup.html");
					req.forward(request, response);
				}*/
			}
			
		
		}
		
		
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

		}
}
}