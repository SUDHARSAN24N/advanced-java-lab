import java.io.*;
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
public class cserver extends UnicastRemoteObject implements inter
{
    public cserver()throws RemoteException{
        super();
    }
    public int add(int a,int b)throws RemoteException{
        return(a+b);
    }
    public int sub(int a,int b)throws RemoteException{
        return(a-b);
    }
    public int mul(int a,int b)throws RemoteException{
        return(a*b);
    }
    public int div(int a,int b)throws RemoteException{
        return(a/b);
    }
    public static void main(String arg[]){
        try{
            inter ci=new cserver();
            String o="ci";
            Registry registry=LocateRegistry.createRegistry(1099);
            registry.rebind(o,ci);
            //Naming.rebind(o,ci);
            System.out.println("SErvers bound and started ");
        }
        catch(Exception e){
        e.printStackTrace();
        }
        
    }
}
