import java.io.*;
import java.rmi.*;
public interface inter extends Remote{
    int add(int a,int b)throws RemoteException;
    int sub(int a,int b)throws RemoteException;
    int mul(int a,int b)throws RemoteException;
    int div(int a,int b)throws RemoteException;
}