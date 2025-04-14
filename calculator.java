import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class calculator extends Applet implements ActionListener,TextListener
{
TextField t1;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
Button C,add,sub,mul,div,eql,dot;
String s,s1,s2,s3,s4;
double a,b,c;
public void init(){
    setLayout(null);
    t1=new TextField(20);
    t1.setBounds(30,30,150,40);//text field
    
    b1=new Button("1");
    b1.setBounds(30,184,44,44);
    b1.addActionListener(this);
    
    b2=new Button("2");
    b2.setBounds(82,184,44,44);
    b2.addActionListener(this);
    
    b3=new Button("3");
    b3.setBounds(134,184,44,44);
    b3.addActionListener(this);
    
    b4=new Button("4");
    b4.setBounds(30,132,44,44);
    b4.addActionListener(this);
    
    b5=new Button("5");
    b5.setBounds(82,132,44,44);
    b5.addActionListener(this);
    
    b6=new Button("6");
    b6.setBounds(134,132,44,44);
    b6.addActionListener(this);
    
    b7=new Button("7");
    b7.setBounds(30,80,44,44);
    b7.addActionListener(this);
    
    b8=new Button("8");
    b8.setBounds(82,80,44,44);
    b8.addActionListener(this);
    
    b9=new Button("9");
    b9.setBounds(134,80,44,44);
    b9.addActionListener(this);
    
    b0=new Button("0");
    b0.setBounds(82,236,44,44);//numeric buttons
    b0.addActionListener(this);
   
    add=new Button("+");
    add.setBounds(186,236,44,44);
    add.addActionListener(this);
    
    sub=new Button("-");
    sub.setBounds(186,184,44,44);
    sub.addActionListener(this);
    
    mul=new Button("*");
    mul.setBounds(186,132,44,44);
    mul.addActionListener(this);
    
    div=new Button("/");
    div.setBounds(186,80,44,44);//arithmetic 
    div.addActionListener(this);
    
    eql=new Button("=");
    eql.setBounds(134,236,44,44);
    eql.addActionListener(this);
    
    dot=new Button(".");
    dot.setBounds(30,236,44,44);
    dot.addActionListener(this);
    
    C=new Button("Clear");
    C.setBounds(186,29,42,42);
    C.addActionListener(this);
    
    add(t1);
    add(b7);
    add(b8);
    add(b9);
    add(div);
    
    add(b4);
    add(b5);
    add(b6);
    add(mul);
    
    add(b1);
    add(b2);
    add(b3);
    add(sub);
    
    add(dot);
    add(C);
    add(b0);
    add(eql);
    add(add);  
 }  

public void actionPerformed(ActionEvent e){
    s=e.getActionCommand();
    if(s.equals("0")||s.equals("1")||s.equals("2")||s.equals("3")||s.equals("4")||s.equals("5")||s.equals("6")||s.equals("7")||s.equals("8")||s.equals("9"))
    {
        s1=t1.getText()+s;
        t1.setText(s1);
    }
    if(s.equals("."))
    {
        if(!t1.getText().contains(".")){
            t1.setText(t1.getText()+".");
        }
    }
    if(s.equals("+"))
    {
        s2=t1.getText();
        t1.setText("");
        s3="+";
    }
    if(s.equals("-"))
    {
        s2=t1.getText();
        t1.setText("");
        s3="-";
    }
     if(s.equals("*"))
    {
        s2=t1.getText();
        t1.setText("");
        s3="*";
    }
      if(s.equals("/"))
    {
        s2=t1.getText();
        t1.setText("");
        s3="/";
    }
     if(s.equals("="))
     {
        s4=t1.getText();
        a=Double.parseDouble(s2);
        b=Double.parseDouble(s4); 
        
        if(s3.equals("+")){
            c=a+b;
        }
         if(s3.equals("-")){
            c=a-b;
        }
          if(s3.equals("*")){
            c=a*b;
        }
           if(s3.equals("/")){
               if(b!=0){
                   c=a/b;
               }
               else{
                   t1.setText("Error");
                   return;
               }
           }
            t1.setText(String.valueOf(c));
        }
     if(s.equals("Clear")){
         t1.setText("");
    }
}
public void paint(Graphics g){
    g.setColor(Color.gray);
    g.fillRect(20,20,220,270);
}
public void textValueChanged(TextEvent e){
}
}
//<applet code="calculator.class" width=1000 height=1000></applet>

