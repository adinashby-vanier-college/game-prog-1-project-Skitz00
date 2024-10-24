import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Bullet extends NPCs
{
    
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        this.move(20);
        Break_Cactus();
        
        if(this.isAtEdge())
        {
            this.getWorld().removeObject(this);
        }
    }
    public void Break_Cactus()
    {
        if(this.isTouching(Cactus.class))
        {
            Cactus cactus = (Cactus) getOneIntersectingObject(Cactus.class);
            cactus.CactusHearts--;
            if(cactus.CactusHearts < 1)
            {
                SandWorld.Cacti--;
                getWorld().removeObject(cactus);
            }
            //Greenfoot.playSound("")
        }
    }
}
