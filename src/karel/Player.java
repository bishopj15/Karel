/*
 * Player class
 * This class help keep track of gems that karel has pick up
 * and the his vector (location and direction).
 */
package karel;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author Gonzo
 */
public class Player extends Actor {

    private int NumberOfGems;
    private int Direction;
    
     /**
     * @param x Starting position on x axis
     * @param y Starting position on y axis
     * @param th Theme of the actor
     */
    public Player(int x, int y, int th) {
        super(x, y, th);
        determineImage(th);
        Direction=1;
        NumberOfGems=0;
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
    
    
    /**
     * Decreases the number of gems the player is carrying by one
     */
    public void DecGems(){
        
        NumberOfGems--;
    }
    
    /**
     * Sets number of gems the player is carrying to zero
     */
    public void ResetGems(){
        NumberOfGems = 0;
    }
    
    /**
     * Increase the number of gems the player is carrying by one
     */
    public void IncrementGems(){
        
        NumberOfGems++;
    }
    
    /**
     * Returns the number of gems Karel has when asked.
     * @return The number of gems the player is currently holding  
     */
    public int ReturnGemCount(){
        
        return NumberOfGems;
    }
    
    /**
     * Sets the direction the player is facing
     * @param cardinal Integer representation of left(-1) or right(1) turn
     */
    public void SetDir(int cardinal){
        
        Direction=(Direction+cardinal)%4;
        if(Direction<1)
        {
            Direction=4;
        }
        
        adjustPlayerImage();
    }
    
    /**
     * Returns the direction of the player when invoked
     * @return integer representation of the direction  
     */
    public int ReturnDirection(){
        
        return Direction;
    }
    
    public void adjustPlayerImage(){
        switch(getThemeValue()){
            case 0:
                if(Direction == 1){
                    ImageIcon iia = new ImageIcon("skins/default/player.png");
                    Image image = iia.getImage();
                    this.setImage(image);
                }

                else if(Direction == 2){
                    ImageIcon iia = new ImageIcon("skins/default/player2.png");
                    Image image = iia.getImage();
                    this.setImage(image);
                }

                else if(Direction == 3){
                    ImageIcon iia = new ImageIcon("skins/default/player3.png");
                    Image image = iia.getImage();
                    this.setImage(image);
                }

                else if(Direction == 4){
                    ImageIcon iia = new ImageIcon("skins/default/player4.png");
                    Image image = iia.getImage();
                    this.setImage(image);
                }
                break;
                
            case 1:
                if(Direction == 1){
                    ImageIcon iia = new ImageIcon("skins/mario/marioBack.png");
                    Image image = iia.getImage();
                    this.setImage(image);
                }

                else if(Direction == 2){
                    ImageIcon iia = new ImageIcon("skins/mario/marioRight.png");
                    Image image = iia.getImage();
                    this.setImage(image);
                }

                else if(Direction == 3){
                    ImageIcon iia = new ImageIcon("skins/mario/marioFront.png");
                    Image image = iia.getImage();
                    this.setImage(image);
                }

                else if(Direction == 4){
                    ImageIcon iia = new ImageIcon("skins/mario/marioLeft.png");
                    Image image = iia.getImage();
                    this.setImage(image);
                }
                break;
            default:
                break;
        }//end switch 
    }
    
    private void determineImage(int thm){
        if(thm == 1){
            ImageIcon iia = new ImageIcon("skins/mario/marioBack.png");
            Image image = iia.getImage();
            this.setImage(image);
        }
        else{
            ImageIcon iia = new ImageIcon("skins/default/player.png");
            Image image = iia.getImage();
            this.setImage(image);
        }
     }
    
    public void changeTheme(int th){
         setThemeValue(th);
         determineImage(th);
     }
    
}
