<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String name=(String)session.getAttribute("name");
            if(name!=null){
                out.println("<h3>username:"+name+"</h3>");
            }
            else{
                out.println("<h3>No session data found.</h3>");
            }
       %>
    </body>
</html>
