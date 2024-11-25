import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Boulder extends NPCs
{
    public int boulderHearts = 2;
    /**
     * 
     */
    public Boulder()
    {
        GreenfootImage boulder = getImage();
        boulder.scale(100, 100);
        setImage(boulder);
    }

    /**
     * Act - do whatever the Boulder wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
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
            boulderHearts--;
            getWorld().removeObject(bullet);
            if (boulderHearts <= 0)
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
