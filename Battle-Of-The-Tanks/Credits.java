import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Credits extends World
{
    private long startTime;
    /**
     * Constructor for objects of class Credits.
     */
    public Credits()
    {
        super(1200, 800, 1);
        startTime = System.currentTimeMillis();
    }
    
    public void act(){
        if (System.currentTimeMillis() - startTime >= 3000) {
            Greenfoot.setWorld(new GameTitleScreen());
        }
    }
    
}
