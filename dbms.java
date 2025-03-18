import java.io.*;
import java.sql.*;

class dbms
{
public static void  main(String args[])throws IOException
{
DataInputStream x=new DataInputStream(System.in);
int ch,Quantity,Rate;?
String Code,Name;
do
{
System.out.println("1.Insert");
System.out.println("2.Select all");
System.out.println("3.Select any name");
System.out.println("4.Delete");
System.out.println("5.Update");
System.out.println("6.Exit");
System.out.println("Enter your choice");
ch=Integer.parseInt(x.readLine());

switch(ch)
{
case 1:

try                                      
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:Nithya");
Statement st=con.createStatement();
System.out.println("Enter the item Code and Name");
Code=x.readLine();
Name=x.readLine();
System.out.println("Enter the item Quantity and Rate");
Quantity=Integer.parseInt(x.readLine());
Rate=Integer.parseInt(x.readLine());
st.execute("Insert into Sales values('"+Code+"','"+Name+"','"+Quantity+"','"+Rate+"')");
System.out.println("_____________________");
}

catch(Exception e)
{
System.out.println(e);
}
break;

case 2:
try                                      
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:Nithya");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("Select * from Sales");
while(rs.next())
{
System.out.println("Code:"+rs.getString(1));
System.out.println("Name:"+rs.getString(2));
System.out.println("Quantity:"+rs.getString(3));
System.out.println("Rate:"+rs.getString(4));
System.out.println("\n");
}
System.out.println("_____________________");
}

catch(Exception e)
{
System.out.println(e);
}
break;

case 3:

try                                      
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:Nithya");
Statement st=con.createStatement();
System.out.println("Enter the item Code");
String op=x.readLine();
ResultSet rs=st.executeQuery("Select * from Sales where Code='"+op+"'");
while(rs.next())
{
System.out.println("Code:"+rs.getString(1));
System.out.println("Name:"+rs.getString(2));
System.out.println("Quantity:"+rs.getString(3));
System.out.println("Rate:"+rs.getString(4));
}
System.out.println("_____________________");
}

catch(Exception e)
{
System.out.println(e);
}
break;

case 4:

try                                      
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:Nithya");
Statement st=con.createStatement();
System.out.println("Enter the item Code");
String op1=x.readLine();
st.execute("Delete from Sales where Code='"+op1+"'");
System.out.println("_____________________");
}

catch(Exception e)
{
System.out.println(e);
}
break;
case 5:

try                                      
{
Code="";
Name="";
Quantity=0;
Rate=0;
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:Nithya");
Statement st=con.createStatement();
System.out.println("Enter the item Code");
String op2=x.readLine();
ResultSet rs1=st.executeQuery("Select * from Sales where Code='"+op2+"'");
while(rs1.next())
{
Code=rs1.getString(1);
Name=rs1.getString(2);
Quantity=Integer.parseInt(rs1.getString(3));
Rate=Integer.parseInt(rs1.getString(4));
System.out.println("Name:"+Name);
System.out.println("Quantity:"+Quantity);
System.out.println("Rate:"+Rate);
}
System.out.println("11.Name:");
System.out.println("12.Quantity:");
System.out.println("13.Rate:");
System.out.println("Enter your changes option 11/12/13");
int t=Integer.parseInt(x.readLine());

switch(t)
{
case 11:
System.out.println("Enter the changes Name");
Name=x.readLine();
break;

case 12:
System.out.println("Enter the changes Quantity");
Quantity=Integer.parseInt(x.readLine());
break;

case 13:
System.out.println("Enter the changes Rate");
Rate=Integer.parseInt(x.readLine());
break;
}
st.execute("Update Sales set Name='"+Name+"',Quantity='"+Quantity+"',Rate='"+Rate+"' where Code='"+op2+"'");
System.out.println("_____________________");
}
catch(Exception e)
{
System.out.println(e);
}
break;

case 6:
break;
}
}
while(ch!=6);
}
}