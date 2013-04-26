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
     public Home(int x, int y, int th) {
        super(x, y, th); 
        determineImage(th);
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
     
     private void determineImage(int thm){
        if(thm == 1){
            ImageIcon iia = new ImageIcon("skins/mario/castle.png");
            Image image = iia.getImage();
            this.setImage(image);
        }
        else{
            ImageIcon iia = new ImageIcon("skins/default/home.png");
            Image image = iia.getImage();
            this.setImage(image);
        }
     }
     
     public void changeTheme(int th){
         setThemeValue(th);
         determineImage(th);  
     }
        
}

