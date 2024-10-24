import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Player2 extends PCs
{

    /**
     * Act - do whatever the Player2 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn();
    }
    
    /**
     * 
     */
    public void moveAndTurn()
    {
        if (Greenfoot.isKeyDown("i")) {
            move(-4);
        }
        if (Greenfoot.isKeyDown("k")) {
            move(4);
        }
        if (Greenfoot.isKeyDown("j")) {
            turn(-2);
        }
        if (Greenfoot.isKeyDown("l")) {
            turn(2);
        }
    }
}
