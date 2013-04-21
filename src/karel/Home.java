/*
 * Home class
 */
package karel;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author Gonzo
 */
public class Home extends Actor {
    private int GemCounter;
    
    /**
     * 
     * @param x Starting position on x axis
     * @param y Starting position on y axis
     */
     public Home(int x, int y) {
        super(x, y);       
        URL loc = this.getClass().getResource("/karel/home.png");
        ImageIcon iia = new ImageIcon(loc);
        Image image = iia.getImage();
        this.setImage(image);
        GemCounter=0;
    }
    
     /**
      * Increase number of gems on home by one
      */
     public void CountInc(){
         
         GemCounter++;
     }
     
     /**
      * Decrease number of gems on home by one
      */
     public void CountDec(){
         
         GemCounter--;
     }
     
     /**
      * 
      * @return Number of gems on home  
      */
     public int CountGet(){
         
         return GemCounter;
     }
}

