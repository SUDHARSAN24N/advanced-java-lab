import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/server1"})
public class server1 extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet server1</title>");            
            out.println("</head>");
            out.println("<body style='text-align:center'>");
             //out.println("<h1>Servlet server1 at " + request.getContextPath() + "</h1>");
            out.println("<form>");
            out.println("<label>User Id:</lable>");
            out.println("<input type='text' placehoder='Enter the user name'><br><br>");
            out.println("<label>Password:</lable>");
            out.println("<input type='password' placehoder='Enter the password'><br><br>");
            out.println("<button><a href='#'>login</a></button>");
            out.println("<button>");
            out.println("<a href='index.html'>back to home page</a>");
             out.println("</button>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }

  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
