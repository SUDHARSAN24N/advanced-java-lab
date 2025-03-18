import java.rmi.*;
import java.io.*;
public class cclient{
    public static void main(String arg[])throws IOException
    {
        int a,b;
        DataInputStream x=new DataInputStream(System.in);
        System.out.println("Enter two value");
        a=Integer.parseInt(x.readLine());
        b=Integer.parseInt(x.readLine());
        try{
            String o="ci";
            inter c=(inter)Naming.lookup(o);
            int i,j,k,l;
            i=c.add(a,b);
            j=c.sub(a,b);
            k=c.mul(a,b);
            l=c.div(a,b);
            System.out.println("Addition:"+i);
            System.out.println("Subtraction:"+j);
            System.out.println("Multiplication:"+k);
            System.out.println("Division:"+l);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
