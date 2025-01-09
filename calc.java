import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class calc extends Applet implements ActionListener{
        TextField t1;
        Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
        Button add,sub,mul,div,dot,c,equ;
        String msg="",tmp;
        int a,b;
    public void init(){
        setLayout(null); 
        t1=new TextField();
        t1.setBounds(15,15,150,30);
        t1.addActionListener(this);

        b9=new Button("9");
        b9.setBounds(18,50,32,32);
        b9.addActionListener(this);

        b8=new Button("8");
        b8.setBounds(53,50,32,32);
        b8.addActionListener(this);

        b7=new Button("7");
        b7.setBounds(88,50,32,32);
        b7.addActionListener(this);

        b6=new Button("6");
        b6.setBounds(18,85,32,32);
        b6.addActionListener(this);

        b5=new Button("5");
        b5.setBounds(53,85,32,32);
        b5.addActionListener(this);

        b4=new Button("4");
        b4.setBounds(88,85,32,32);
        b4.addActionListener(this);

        b3=new Button("3");
        b3.setBounds(18,118,32,32);
        b3.addActionListener(this);

        b2=new Button("2");
        b2.setBounds(53,118,32,32);
        b2.addActionListener(this);

        b1=new Button("1");
        b1.setBounds(88,118,32,32);
        b1.addActionListener(this);

        add=new Button("+");
        add.setBounds( 129, 50, 32, 32);
        add.addActionListener(this);

        sub=new Button("-");
        sub.setBounds(129,85,32,32);
        sub.addActionListener(this);

        mul=new Button("*");
        mul.setBounds(129,118,32,32);
        mul.addActionListener(this);

        div=new Button("/");
        div.setBounds(129,152,32,32);
        div.addActionListener(this);

        dot=new Button(".");
        dot.setBounds(18,152,32,32);
        dot.addActionListener(this);

        b0=new Button("0");
        b0.setBounds(53,152,32,32);
        b0.addActionListener(this);

        equ=new Button("=");
        equ.setBounds(128,152,32,32);
        equ.addActionListener(this);

        c=new Button("c");
        c.setBounds(180,180,32,32);
        c.addActionListener(this);

        add(t1);
        add(b9);
        add(b8);
        add(b7);
        add(b6);
        add(b5);
        add(b4);
        add(b3);
        add(b2);
        add(b1);
        add(b0);
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(dot);
        add(equ);
        add(c);          
    }

    public void actionPerformed(ActionEvent ae)
    {
        String s=ae.getActionCommand();
        if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/"))
        {
        String s1=t1.getText();
        tmp=s;
        a=Integer.parseInt(s1);
        msg="";
        }
        else if(s.equals("="))
        {
            String s2=t1.getText();
            b=Integer.parseInt(s2);
            int sum=0;
            if(tmp=="+")
                sum=a+b;
            else if(tmp=="-")
                sum=a-b;
            else if(tmp=="*")
                sum=a*b;
            else if(tmp=="/")
                sum=a/b;
        }
       else if(s.equals("c"))
        {
            t1.setText("");
      }
        
}
public void paint(Graphics g){
        g.setColor(Color.gray);
        g.fillRect(10,10,185,185);  
}
}
