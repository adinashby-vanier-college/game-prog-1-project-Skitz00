import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Volcano extends NPCs
{
    public int volcanoHearts = 3;
    /**
     * Act - do whatever the Volcano wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
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
            volcanoHearts--;
            getWorld().removeObject(bullet);
            if (volcanoHearts <= 0)
            {
                getWorld().removeObject(this);
            }
        }
    }
}
