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
     */
    public Wall(int x, int y) {
        super(x, y);    
        URL loc = this.getClass().getResource("/karel/wall.jpg");
        ImageIcon iia = new ImageIcon(loc);
        Image image = iia.getImage();
        this.setImage(image);
    }
}