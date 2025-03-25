import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class showHeaders extends HttpServlet {

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
    throws IOException, ServletException {
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      
      out.println("<p>HTTP headers sent by your client:</p>");
      out.println("<table border='1' cellpadding='5' cellspacing='0'>");
       out.println("<tr> <th>Header Name</th> <th>Header Value</th> </tr>");
      
	Enumeration e = request.getHeaderNames();
        while (e.hasMoreElements()) {
        String headerName =(String) e.nextElement();
        String headerValue = request.getHeader(headerName);
        out.println("<tr>");

        out.println("<td> "+headerName +" </td> ");
        out.println("<td> "+headerValue +" </td>");
        out.println("</tr>");
        }
        out.println("</table>");
        
      }
}
