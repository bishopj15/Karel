/* Wall class
*  Simple wall class. Very easy to implement because it does not move.
*/
package karel;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author Gonzo
 */
public class Wall extends Actor {
    
    /**
     * Constructor
     * @param x Starting position on x axis
     * @param y Starting position on y axis
     * @param th Theme of the actor
     */
    public Wall(int x, int y, int th) {
        super(x, y, th);  
        determineImage(th);
    }
    
    private void determineImage(int thm){
        if(thm == 1){
            ImageIcon iia = new ImageIcon("skins/mario/wall.png");
            Image image = iia.getImage();
            this.setImage(image);
        }
        else{
            ImageIcon iia = new ImageIcon("skins/default/wall.png");
            Image image = iia.getImage();
            this.setImage(image);
        }
     }
    
    public void changeTheme(int th){
         setThemeValue(th);
         determineImage(th);
     }
     
}