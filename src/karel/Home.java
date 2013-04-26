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
        ImageIcon iia;
        Image image;
        
         switch(thm){
            case 1:
            case 4:
            case 5:
            case 6:
                iia = new ImageIcon("skins/mario/castle.png");
                image = iia.getImage();
                this.setImage(image);
                break;
            case 2:
                iia = new ImageIcon("skins/batman/asylum2.png");
                image = iia.getImage();
                this.setImage(image);
                break;
            case 3:
                iia = new ImageIcon("skins/batman/waynemanor2.png");
                image = iia.getImage();
                this.setImage(image);
                break;
            default:
                iia = new ImageIcon("skins/default/home.png");
                image = iia.getImage();
                this.setImage(image);
                break;
        }
         
     }
     
     public void changeTheme(int th){
         setThemeValue(th);
         determineImage(th);  
     }
        
}

