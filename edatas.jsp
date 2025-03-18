<% 
    int id=Integer.parseInt(request.getParameter("id"));
    int salary=Integer.parseInt(request.getParameter("sal"));
    double lic=(salary*5/100);
    double pf=(salary*10/100);
    double ma=(salary*1/100);
    double hr=(salary*2/100);
    double da=(salary*2/100);
    double gs=(salary-ma-hr-da);
    double ns=(gs-lic-pf);
%>
<html>
    <head>
        <title>calculate page</title>
    </head>
    <body bgcolor="beige">
    <center>
        <h1>Solve to analysis the salary reference</h1>
        <b>Name: <%=request.getParameter("user")%></b><br><br>
        <b>id:<%=id%></b><br><br>
        <b>salary:<%=salary%></b><br><br>
        <b>job:<%=request.getParameter("job")%></b><br><br>
        <b>LIC:<%=lic%></b><br><br>
        <b>PF:<%=pf%></b><br><br>
        <b>Medical aloownance:<%=ma%></b><br><br>
        <b>House rent:<%=hr%></b><br><br>
        <b>Daily allowance:<%=da%></b><br><br>
        <b>Gross salary:<%=gs%></b><br><br>
        <b>Net salary:<%=ns%></b><br><br>
    </center>
    </body>
</html>