/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.*;

/**
 *
 * @author 1msc
 */
public class pg2 extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
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
        // TODO start asynchronous download of heavy resources
    }
    // TODO overwrite start(), stop() and destroy() methods
}
//ithu la naa use pannthu netBeans not  necessary fo rapplet code that take a comments  
//<applet code="pg2.class" width=700 height=700></applet>
