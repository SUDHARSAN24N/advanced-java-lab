 <html>
    <head>
        <title>data insert to display in jsp Page</title>
        <style>
            b{
                font-size: x-large;
            }
            
            
            </style>
    </head>
    <body bgcolor="powderblue">
        <h1 align="center"> STUDENT DATA:</h1>
        <b>Name:<%= request.getParameter("name") %></b><br><br>
        <b>Register No:<%=request.getParameter("id")%></b><br><br>
        <b>Class:<%=request.getParameter("class")%></b><br><br>
        <b>Department:<%=request.getParameter("department")%></b><br><br>
        <b>College Name:<%=request.getParameter("clgname")%></b><br><br>
        <b>Father Name:<%=request.getParameter("father")%></b><br><br>
        <b>Mother Name:<%=request.getParameter("mother")%></b><br><br>
        <b>D.O.B:<%=request.getParameter("dob")%></b><br><br>
        <b>Address:<%=request.getParameter("address")%></b><br><br>
        <b>City:<%=request.getParameter("city")%></b><br><br>
        <b>District<%=request.getParameter("dist")%></b><br><br>
        <b>Pin-code:<%=request.getParameter("pin")%></b><br><br>
        <b>Phone No:<%=request.getParameter("no")%></b><br><br>
        <b>E-mail Id:<%=request.getParameter("mail")%></b><br><br>
        <b>Blood Group:<%=request.getParameter("bgroup")%></b><br><br>
    </body>
</html>
