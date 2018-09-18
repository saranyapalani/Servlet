

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieExample
 */
@WebServlet("/CookieExample")
public class CookieExample extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				    {
				        response.setContentType("text/html");
				        PrintWriter out = response.getWriter();

				        // print out cookies

				        Cookie[] cookies = request.getCookies();
				        for (int i = 0; i < cookies.length; i++) {
				            Cookie c = cookies[i];
				            String name = c.getName();
				            String value = c.getValue();
				            out.println(name + " = " + value);
				        }

				        // set a cookie

				        String name = request.getParameter("cookieName");
				        if (name != null && name.length() > 0) {
				            String value = request.getParameter("cookieValue");
				            Cookie c = new Cookie(name, value);
				            response.addCookie(c);
				        }
				    }
	}
}