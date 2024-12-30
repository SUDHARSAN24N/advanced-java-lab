/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;

/**
 *
 * @author 1msc
 */
public class login extends Frame {

   Label l1,l2;
   TextField t1,t2;
   Button b1,b2;
   login(){
       l1=new Label("user id");
       l2=new Label("password");
       l1.setBounds(30,100,80,30);
       l2.setBounds(30,150,80,30);
       t1=new TextField();
       t1.setBounds(150,100,80,30);
       t2=new TextField();
       t2.setBounds(150,150,80,30);
       b1=new Button("OK");
       b1.setBounds(30,200,80,30);
       b2=new Button("cancel");
       b2.setBounds(150,200,80,30);
       add(l1);
       add(l2);
       add(t1);
       add(t2);
       add(b1);
       add(b2);
       setSize(300,300);
       setTitle("sign up");
       setLayout(null);
       setVisible(true);
   }
   public static void main(String args[]){
       login f=new login();}
   
   }
   
   

