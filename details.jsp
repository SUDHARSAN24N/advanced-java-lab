 <% 
     int mining=Integer.parseInt(request.getParameter("mining"));
     int pcd=Integer.parseInt(request.getParameter("pcd"));
     int aj=Integer.parseInt(request.getParameter("aj"));
     int ai=Integer.parseInt(request.getParameter("ai"));
     int web=Integer.parseInt(request.getParameter("web"));
     int ajl=Integer.parseInt(request.getParameter("ajl"));
     int total=mining+pcd+aj+ai+web+ajl;
     int avg=total/6;
 %>
        
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
 
        <%=request.getParameter("name")%><br><br>
        <%=request.getParameter("regi")%><br><br>
        <%=mining%><br><br>
        <%=pcd%><br><br>
        <%=aj%><br><br>
        <%=ai %><br><br>
        <%=web%><br><br>
        <%=ajl %><br>
        <%= total %><br>
        <%= avg %><br>
       
    </center>            
    </body>
   
</html>
