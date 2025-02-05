import java.io.*;
import java.lang.*;
import static java.lang.Thread.sleep;
class multins1 extends Thread{
    public void run(){
        System.out .println("1 st thread started");
        try{
            for(int i=1;i<=5;i++)
                System.out.println("position of the first thread is "+i);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("1st thread is closed");
    }
}
class  multins2 extends Thread{
    public void run(){
        System.out.println("2nd thread is started");
        try{
            sleep(3000);
            for(int j=1;j<=5;j++)
             System.out.println("postion of second thread is"+j);                
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("2nd thread is closed");
    }
}
class multins3 extends Thread{
  public  void run(){
        System.out.println("3rd Thread is started");
        try{
            for(int k=1;k<=5;k++)
               System.out.println("psotion of third thread is "+k) ;   
        }
        catch(Exception e){
            System.out.println(e);
        }            
        System.out.println("3rd thread is closed");
    }
}
class threadns {
    public static void main(String args[]){
        multins1 a=new multins1();
        multins2 b=new multins2();
        multins3 c=new multins3();
        a.start();
        b.start();
        c.start();
    }
    
}
