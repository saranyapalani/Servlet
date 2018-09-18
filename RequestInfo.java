

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestInfo
 */
@WebServlet("/RequestInfo")
	public class RequestInfo extends HttpServlet {

	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws IOException, ServletException
	    {
	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        out.println("<html>");
	        out.println("<body>");
	        out.println("<head>");
	        out.println("<title>Request Information Example</title>");
	        out.println("</head>");
	        out.println("<body>");
	        out.println("<h3>Request Information Example</h3>");
	        out.println("Method: " + request.getMethod());
	        out.println("<br>");
	        out.println("Request URI: " + request.getRequestURI());
	        out.println("<br>");
	        out.println("Protocol: " + request.getProtocol());
	        out.println("<br>");
	        out.println("PathInfo: " + request.getPathInfo());
	        out.println("<br>");
	        out.println("Remote Address: " + request.getRemoteAddr());
	        out.println("</br>");
	        out.println("</body>");
	        out.println("</html>");
	    }

	    /**
	     * We are going to perform the same operations for POST requests
	     * as for GET methods, so this method just sends the request to
	     * the doGet method.
	     */

	    public void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws IOException, ServletException
	    {
	        doGet(request, response);
	    }
	}