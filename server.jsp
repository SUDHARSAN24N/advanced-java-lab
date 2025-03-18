<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
       <% 
           String name,ps;
             name=request.getParameter("name");
             ps=request.getParameter("ps");
           
           if(name.equals("sudhar")&&ps.equals("Susa"))  
           {
               session.setAttribute("name",name);
              response.sendRedirect("response.jsp");
           }
           else{
              out.print("<script>alert('user id(or)password')</script>");
           }
                     %>
    </body>
</html>
