import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Snowman extends NPCs
{
    public int snowmanHearts = 3;
    /**
     * Act - do whatever the Snowman wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
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
            snowmanHearts--;
            getWorld().removeObject(bullet);
            if (snowmanHearts <= 0)
            {
                getWorld().removeObject(this);
            }
        }
    }
}
