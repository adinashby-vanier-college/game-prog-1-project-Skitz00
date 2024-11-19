import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Cactus extends NPCs
{
    public int cactusHearts = 3;
    public void act()
    {
        checkHitByBullet();
    }
    
    private void checkHitByBullet()
    {
        Bullet bullet = (Bullet) getOneIntersectingObject(Bullet.class);
        if (bullet != null)
        {
            cactusHearts--;
            getWorld().removeObject(bullet);
            if (cactusHearts <= 0)
            {
                getWorld().removeObject(this);
            }
        }
    }
}
