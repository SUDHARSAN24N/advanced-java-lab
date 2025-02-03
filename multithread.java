import java.io.*;
import java.lang.*;
class thread extends Thread
{
    public void run(){
        System.out.println("First thread start");
    
        try{
             sleep(5000);
            for(int i=1;i<=5;i++)  //use sleep,stop,start,run
             System.out.println("Thread 1 is"+i);
              System.out.println("First thread is closed");
        }
        catch(Exception e){
                  System.out.println(e);
}
    }
} 
class two extends Thread
{
    public void run(){
        System.out.println("Second thread start");
    
        try{
            for(int j=1;j<=5;j++)
             System.out.println("Thread 2 is"+j);
              System.out.println("Second thread is closed");
        }
        catch(Exception e){
                  System.out.println(e);
}
    }
} 
class three extends Thread
{
    public void run(){
        System.out.println("Third thread start");
    
        try{
            for(int k=1;k<=5;k++)
             System.out.println("Thread 3 is"+k);
              System.out.println("Third thread is closed");
        }
        catch(Exception e){
                  System.out.println(e);
}
    }
} 
class multithread
{
    public static void main(String args[])
    {
        thread obj1=new thread();
        two obj2=new two();
        three obj3=new three();
        
        obj1.start();
        obj2.start();
        obj3.start();
        
    }
    
}

