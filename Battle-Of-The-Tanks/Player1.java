// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Player1 extends Actor
{

    /**
     * Act - do whatever the Player1 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn();
        shoot();
    }

    /**
     * 
     */
    public void moveAndTurn()
    {
        if (Greenfoot.isKeyDown("w")) {
            this.move(4);
        }
        if (Greenfoot.isKeyDown("s")) {
            this.move(-4);
        }
        if (Greenfoot.isKeyDown("a")) {
            this.turn(-2);
        }
        if (Greenfoot.isKeyDown("d")) {
            this.turn(2);
        }
    }

    /**
     * 
     */
    public void shoot()
    {
        if (Greenfoot.isKeyDown("space")) {
            World world = getWorld();
            world.addObject( new  Bullet(), getX(), getY());
        }
    }
}
