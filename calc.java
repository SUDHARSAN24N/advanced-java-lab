import java.applet.*; 
import java.awt.*;
import java.awt.event.*;

public class calc extends Applet implements ActionListener {

    TextField t1;
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    Button add, sub, mul, div, dot, c, equ;
    String msg = "", tmp, s, s1, s2;
    double a, b, sum;

    public void init() {
        setLayout(null);

        t1 = new TextField(20);
        t1.setBounds(15, 15, 135, 30);
        t1.addActionListener(this);

        b9 = new Button("9");
        b9.setBounds(18, 50, 42, 42);
        b9.addActionListener(this);

        b8 = new Button("8");
        b8.setBounds(63, 50, 42, 42);
        b8.addActionListener(this);

        b7 = new Button("7");
        b7.setBounds(108, 50, 42, 42);
        b7.addActionListener(this);

        b6 = new Button("6");
        b6.setBounds(18, 95, 42, 42);
        b6.addActionListener(this);

        b5 = new Button("5");
        b5.setBounds(63, 95, 42, 42);
        b5.addActionListener(this);

        b4 = new Button("4");
        b4.setBounds(108, 95, 42, 42);
        b4.addActionListener(this);

        b3 = new Button("3");
        b3.setBounds(18, 138, 42, 42);
        b3.addActionListener(this);

        b2 = new Button("2");
        b2.setBounds(63, 138, 42, 42);
        b2.addActionListener(this);

        b1 = new Button("1");
        b1.setBounds(108, 138, 42, 42);
        b1.addActionListener(this);

        add = new Button("+");
        add.setBounds(153, 50, 42, 42);
        add.addActionListener(this);

        sub = new Button("-");
        sub.setBounds(153, 95, 42, 42);
        sub.addActionListener(this);

        mul = new Button("*");
        mul.setBounds(153, 138, 42, 42);
        mul.addActionListener(this);

        div = new Button("/");
        div.setBounds(153, 182, 42, 42);
        div.addActionListener(this);

        dot = new Button(".");
        dot.setBounds(18, 182, 42, 42);
        dot.addActionListener(this);

        b0 = new Button("0");
        b0.setBounds(63, 182, 42, 42);
        b0.addActionListener(this);

        equ = new Button("=");
        equ.setBounds(108, 182, 42, 42);
        equ.addActionListener(this);

        c = new Button("AC");
        c.setBounds(160, 15, 32, 32);
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

    public void actionPerformed(ActionEvent ae) {
        s = ae.getActionCommand();

        if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
            s1 = t1.getText();
            tmp = s;
            a = Double.parseDouble(s1);
            msg = "";
        } else if (s.equals("=")) {
            s2 = t1.getText();
            b = Double.parseDouble(s2);
            sum = 0;

            if (tmp.equals("+")) sum = a + b;
            else if (tmp.equals("-")) sum = a - b;
            else if (tmp.equals("*")) sum = a * b;
            else if (tmp.equals("/")) sum = a / b;

            s1 = String.valueOf(sum);
            t1.setText("" + s1);
            msg = "";
        } else {
            msg += s;
            t1.setText("" + msg);
        }

        if (s.equals(".")) {
            if (!t1.getText().contains(".")) {
                t1.setText(t1.getText() + ".");
            }
        }

        if (s.equals("AC")) {
            
            t1.setText("");
            msg="";
            tmp="";
            s1="";
            s2="";
            return;
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.gray);
        g.fillRect(10, 10, 190, 220);
    }
}

// <appletviewer code="calc.class" width="370" height="370"></applet>