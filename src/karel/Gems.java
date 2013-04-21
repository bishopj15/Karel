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
      */
     public Gems(int x, int y) {
        super(x, y);       
        URL loc = this.getClass().getResource("/karel/gem.jpg");
        ImageIcon iia = new ImageIcon(loc);
        Image image = iia.getImage();
        this.setImage(image);
        
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

}
