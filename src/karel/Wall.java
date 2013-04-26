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
        ImageIcon iia;
        Image image;
        
         switch(thm){
            case 1:
            case 4:
            case 5:
            case 6:
                iia = new ImageIcon("skins/mario/wall.png");
                image = iia.getImage();
                this.setImage(image);
                break;
            case 2:
            case 3:
                iia = new ImageIcon("skins/batman/stonewall.png");
                image = iia.getImage();
                this.setImage(image);
                break;
            default:
                iia = new ImageIcon("skins/default/wall.png");
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