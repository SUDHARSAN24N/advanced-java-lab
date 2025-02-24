import java.applet.Applet;
import java.awt.*;
public class pg2 extends Applet {
    public void paint(Graphics g) {
        for(int i=0;i<4;i++){
         if(i%2==0)   
         {
        g.drawOval(120,i*60+10,50,50);
        }
         else{
             g.fillOval(120, i*60+10, 50, 50);
         }
        }
    }
}
//ithu la naa use pannthu netBeans not  necessary fo rapplet code that take a comments  
//<applet code="pg2.class" width=700 height=700></applet>
