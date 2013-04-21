/*
 * Actor base class
 */
package karel;

import java.awt.Image;

/**
 *
 * @author Gonzo
 */
public class Actor {

    private final int SPACE = 30;
    private int x;
    private int y;
    private Image image;

    /**
     * Constructor
     * @param x Starting position on x axis
     * @param y Starting position on y axis
     */
    public Actor(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Returns character for the actor
     * @return Character representation the actor 
     */
    public Image getImage() {
        return this.image;
    }

    /**
     * Set the character used to represent the actor 
     * @param ch Character used to represent the actor 
     */
    public void setImage(Image img) {
        this.image = img;
    }

    /**
     * Returns x position
     * @return The x coordinate of the actor 
     */
    public int x() {
        return this.x;
    }

    /**
     * Returns y position
     * @return The y coordinate of the actor
     */
    public int y() {
        return this.y;
    }

    /**
     * Set the x coordinate of the actor
     * @param x Value to be set to
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Set the y coordinate of the actor
     * @param y Value to be set to
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Test if left collision will happen
     * @param actor Actor to test with
     * @return True if a collision will happen
     */
    public boolean isLeftCollision(Actor actor) {
        if (((this.x()-SPACE) == actor.x()) &&
            (this.y() == actor.y())) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Test if right collision will happen
     * @param actor Actor to test with
     * @return True if a collision will happen
     */
    public boolean isRightCollision(Actor actor) {
        if (((this.x() + SPACE) == actor.x())
                && (this.y() == actor.y())) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Test if top collision will happen
     * @param actor Actor to test with
     * @return True if a collision will happen
     */
    public boolean isTopCollision(Actor actor) {
        if (((this.y()-SPACE) == actor.y()) &&
            (this.x() == actor.x())) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Test if bottom collision will happen
     * @param actor Actor to test with
     * @return True if a collision will happen
     */
    public boolean isBottomCollision(Actor actor) {
        if (((this.y() + SPACE) == actor.y())
                && (this.x() == actor.x())) {
            return true;
        } else {
            return false;
        }
    }

}