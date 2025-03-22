
import java.rmi.*;
import java.io.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.*;
public class cclient{
    public static void main(String arg[])throws IOException
    {
        BufferedReader x =new BufferedReader(new InputStreamReader(System.in));
          Registry registry=LocateRegistry.getRegistry("localhost",1099);
        int a,b;
        //DataInputStream x=new DataInputStream(System.in);
        System.out.println("Enter two value");
        a=Integer.parseInt(x.readLine());
        b=Integer.parseInt(x.readLine());
        try{
            String o="ci";
            inter c=(inter)registry.lookup(o);
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
