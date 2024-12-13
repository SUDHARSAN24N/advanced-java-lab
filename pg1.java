import java.applet.*;
import java.awt.*;
public class pg1 extends Applet
{
public void paint(Graphics g)
{
g.drawLine(100,100,500,100);
g.drawLine(100,100,100,500);
g.drawLine(100,500,500,500);
g.drawLine(500,500,500,100);
g.drawString("I.M.SC",280,130);
g.drawLine(150,150,450,150);
g.drawString("welcome",180,230);
g.drawString("to",300,300);
g.drawString("all",380,380); 
g.drawLine(150,150,150,450);
g.drawLine(150,450,450,450);
g.drawLine(450,450,450,150);
g.drawString("ComputerScience",250,480);
}
}
//<applet code="pg1.class" width=1000 height=1000></applet>