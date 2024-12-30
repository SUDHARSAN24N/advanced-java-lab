import java.applet.Applet;
import java.awt.*;
public class calc extends Applet {
    public void paint(Graphics g){
        TextField t1;
        Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
        Button add,sub,mul,div,c,ac;
        t1=new TextField();
        t1.setBounds(15,15,150,30);
        b9=new Button("9");
        b9.setBounds(18,50,32,32);
        b8=new Button("8");
        b8.setBounds(53,50,32,32);
        b7=new Button("7");
        b7.setBounds(88,50,32,32);
        b6=new Button("6");
        b6.setBounds(18,85,32,32);
        b5=new Button("5");
        b5.setBounds(53,85,32,32);
        b4=new Button("4");
        b4.setBounds(88,85,32,32);
        b3=new Button("3");
        b3.setBounds(18,118,32,32);
        b2=new Button("2");
        b2.setBounds(53,118,32,32);
        b1=new Button("1");
        b1.setBounds(88,118,32,32);
        add=new Button("+");
        add.setBounds( 129, 50, 32, 32);
        sub=new Button("-");
        sub.setBounds(129,85,32,32);
        mul=new Button("*");
        mul.setBounds(129,118,32,32);
        div=new Button("/");
        div.setBounds(129,159,32,32);
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
        add(add);
        add(sub);
        add(mul);
        add(div);
        
    }
}
