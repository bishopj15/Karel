/*
 * Gem class
 */
package karel;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author Gonzo
 */
public class Gems extends Actor {
     private boolean pickup;
     private boolean onHome;
     
     /**
      * Constructor 
      * @param x Starting position on x axis
      * @param y Starting position on y axis
      * @param th Theme of the actor
      */
     public Gems(int x, int y, int th) {
        super(x, y, th);  
        determineImage(th);
        
        pickup=false;
        onHome=false;
    }
    
     /**
      * Set variable signaling the gem is in a picked up state
      * @param temp Boolean value to set state to 
      */
    public void Setpickup (boolean temp){
       pickup=temp;
    }
    
    /**
     * 
     * @return True if gem is in a picked up state 
     */
    public boolean Gempickup(){
        
        return pickup;
    }
    
    /**
     * Set variable signaling the gem is on home
     * @param temp Boolean value to set state to
     */
    public void setOnHome(boolean temp){
        onHome = temp;
    }
    
    /**
     * 
     * @return True if gem is in a picked up state
     */
    public boolean getOnHome(){
        return onHome;
    }
    
    /**
     * Adjusts the player's position 
     * @param x How many spaces on the x axis to move 
     * @param y How many spaces on the y axis to move
     */
    public void move(int x, int y) {
        int nx = this.x() + x;
        int ny = this.y() + y;
        this.setX(nx);
        this.setY(ny);
    }
    
    private void determineImage(int thm){
        ImageIcon iia;
        Image image;
        
         switch(thm){
            case 1:
            case 4:
            case 5:
            case 6:
                iia = new ImageIcon("skins/mario/coin.png");
                image = iia.getImage();
                this.setImage(image);
                break;
            case 2:
                iia = new ImageIcon("skins/batman/jokerface.png");
                image = iia.getImage();
                this.setImage(image);
                break;
            case 3:
                iia = new ImageIcon("skins/batman/batsignal.png");
                image = iia.getImage();
                this.setImage(image);
                break;
            default:
                iia = new ImageIcon("skins/default/gem.png");
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
