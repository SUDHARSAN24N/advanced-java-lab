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
       l2.setBounds(80,100,80,30);
       add(l1);
       add(l2);
       setSize(300,300);
       setTitle("sign up");
       setLayout(null);
       setVisible(true);
   }
   public static void main(String args[]){
       login f=new login();}
   
   }
   
   

