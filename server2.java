/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 1msc
 */
@WebServlet(urlPatterns = {"/server2"})
public class server2 extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String  itemsname,itemstype,quanity,price,total,name,address,city,email,phone,order,delivery="";
        try {
            /* TODO output your page here. You may use following sample code. */
            itemsname=request.getParameter("itemsname");
            itemstype=request.getParameter("itemstype");
             quanity=request.getParameter("quanity");
              price=request.getParameter("price");
               total=request.getParameter("total");
                name=request.getParameter("name");
                 address=request.getParameter("address");
                  city=request.getParameter("city");
                  email=request.getParameter("email");
                   phone=request.getParameter("phone");
                   order=request.getParameter("order");
                   delivery=request.getParameter("delivery");
                   
                    
                   
               
            quanity=request.getParameter("quanity");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet server2</title>");            
            out.println("</head>");
            out.println("<style>body{"
            +"background-image: url('image.jpg');"
            +"background-attachment:fixed;"
            +"background-repeat: no-repeat;"
            +"background-size: cover;}"
            + "</style>");
            out.println("<body>");
                        //out.println("<h1>Servlet server2 at " + request.getContextPath() + "</h1>");
            out.println("<h1>Product Details</h1>");
            out.println("<ol>"
                    + "<li>Item name:"+itemsname+"</li>"
                    + "<li>Item type:"+itemstype+"</li>"
                    + "<li>Quanity:"+quanity+"</li>"
                    + "<li>Price:"+price+"</li>"
                    + "<li>Total:"+total+"</li>"
                    +"</ol>");
             out.println("<h1>Customer Details</h1>");
            out.println("<ol>"
                    +"<li>Name:"+name+"</li>"
                    +"<li>Address:"+address+"</li>"
                    +"<li>City:"+city+"</li>"
                    +"<li>Email Id:"+email+"</li>"
                    +"<li>Phone NO:"+phone+"</li>"
                    + "</ol>");
            out.println("<h1>Customer Details</h1>");
            out.println("<ol>"
                    +"<li>Order Date:"+order+"</li>"
                    +"<li>Delivery Date:"+delivery+"</li>"
                    + "</ol>");        
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
