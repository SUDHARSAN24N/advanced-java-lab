<html>
    <head>
        <title>purchase order details page in jsp</title>
    </head>
    <style>
        tr,td,th{
            border:1px solid black;
            text-align: center;
        }
        tr{
            height: 50px;
        }
    </style>    
    <body bgcolor="lightgrey">
        <table width="100%">
            <tr >
                <th>Details</th>
                <th>value</th>
            </tr>
            <tr>
            <th colspan="2">PRODUCTION DETAILS</th>
            </tr>
            <tr>
                <th>Items Name</th>
                <td> <%= request.getParameter("itemsname") %> </td>
            </tr>
             <tr>
                <th>Items Type</th>
                <td> <%= request.getParameter("itemstype") %> </td>
            </tr>
             <tr>
                <th>Quanity</th>
                <td> <%= request.getParameter("quanity") %> </td>
            </tr>
             <tr>
                <th>Pricee</th>
                <td> <%= request.getParameter("price") %> </td>
            </tr>
             <tr>
                <th>Total</th>
                <td> <%= request.getParameter("total") %> </td>
            </tr>
              <tr>
            <th colspan="2">CUSTOMER DETAILS</th>
            </tr>
             <tr>
                <th>NAME</th>
                <td> <%= request.getParameter("name") %> </td>
            </tr>
             <tr>
                <th>ADDRESS</th>
                <td> <%= request.getParameter("address") %> </td>
            </tr>
             <tr>
                <th>CITY</th>
                <td> <%= request.getParameter("city") %> </td>
            </tr>
             <tr>
                <th>EMAIL ID</th>
                <td> <%= request.getParameter("email") %> </td>
            </tr>
             <tr>
                <th>PHONE NUMBER</th>
                <td> <%= request.getParameter("phone") %> </td>
            </tr>
            <tr>
            <th colspan="2">DELIVERY DETAILS</th>
            </tr>
             <tr>
                <th>ORDERED DATE</th>
                <td> <%= request.getParameter("order") %> </td>
            </tr>
             <tr>
                <th>DELIVERY DATE</th>
                <td> <%= request.getParameter("delivery") %> </td>
            </tr>
        </table>
    </body>