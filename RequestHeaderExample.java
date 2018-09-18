

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestHeaderExample
 */
@WebServlet("/RequestHeaderExample")
public class RequestHeaderExample extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	    public void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws IOException, ServletException
	    {
	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        Enumeration<String> e = request.getHeaderNames();
	        while (e.hasMoreElements()) {
	            String name = (String)e.nextElement();
	            out.println("<br>");
	            String value = request.getHeader(name);
	            out.println("<br>");
	            out.println(name + " = " + value);
	        }
	    }
	}
