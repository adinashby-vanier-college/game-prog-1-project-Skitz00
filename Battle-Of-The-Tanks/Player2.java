// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Player2 extends Actor
{
    private int gunReloadTime;
    private int reloadDelayCount;
    private int shotsFired;
    private Vector movement;

    /**
     * 
     */
    public Player2()
    {
        gunReloadTime = 20;
        reloadDelayCount = 0;
        shotsFired = 0;
    }

    /**
     * Act - do whatever the Player2 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkKeys();
        shoot();
    }

    /**
     * 
     */
    public void checkKeys()
    {
        if (Greenfoot.isKeyDown("i")) {
            this.move(-4);
        }
        if (Greenfoot.isKeyDown("k")) {
            this.move(4);
        }
        if (Greenfoot.isKeyDown("j")) {
            this.turn(-2);
        }
        if (Greenfoot.isKeyDown("l")) {
            this.turn(2);
        }
        if (Greenfoot.isKeyDown("enter")) {
            shoot();
        }
    }

    /**
     * 
     */
    public int getShotsFired()
    {
        return shotsFired;
    }

    /**
     * 
     */
    public void setGunReloadTime(int reloadTime)
    {
        gunReloadTime = reloadTime;
    }

    /**
     * 
     */
    public void shoot()
    {
        if (reloadDelayCount >= gunReloadTime) {
            Bullet bullet =  new  Bullet(getMovement().copy(), getRotation());
            getWorld().addObject(bullet, getX(), getY());
            bullet.move();
            shotsFired = shotsFired + 1;
            reloadDelayCount = 0;
        }
    }

    /**
     * 
     */
    public Vector getMovement()
    {
        return movement;
    }
}
