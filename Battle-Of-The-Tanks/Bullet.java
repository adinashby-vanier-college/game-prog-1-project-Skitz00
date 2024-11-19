import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Bullet extends NPCs
{
    private int speed;
    
    public Bullet(int speed) 
    {
        this.speed = speed;
    }
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(speed);
        if(this.isAtEdge())
        {
            this.getWorld().removeObject(this);
        }
    }
    
}
