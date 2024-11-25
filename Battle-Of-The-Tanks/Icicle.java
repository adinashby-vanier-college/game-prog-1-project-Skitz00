import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Icicle extends NPCs
{
    public int icicleHearts = 2;
    /**
     * Act - do whatever the Icicle wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkHitByBullet();
    }
    
    private void checkHitByBullet()
    {
        Bullet bullet = (Bullet) getOneIntersectingObject(Bullet.class);
        if (bullet != null)
        {
            icicleHearts--;
            getWorld().removeObject(bullet);
            if (icicleHearts <= 0)
            {
                spawnMedkit();
                getWorld().removeObject(this);
            }
        }
    }
    private void spawnMedkit() {
        if (Greenfoot.getRandomNumber(3) == 0) {
            Medkit medkit = new Medkit();
            getWorld().addObject(medkit, getX(), getY());
        }
    }
}
