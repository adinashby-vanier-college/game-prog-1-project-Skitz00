import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Player1 extends PCs
{
    public Player1(){
        
        GreenfootImage player1 = getImage();
        player1.scale(65,65);
        setImage(player1);
        
    }
    
    public static int Cooldown_Gun =-10;
    public static int Player1Hearts =3;
    /**
     * Act - do whatever the Player1 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Player1Hearts>0)
        {
            moveAndTurn();
            shoot();
        }
    }

    /**
     * 
     */
    public void moveAndTurn()
    {
        if (Greenfoot.isKeyDown("w")) {
            move(4);
        }
        if (Greenfoot.isKeyDown("s")) {
            move(-4);
        }
        if (Greenfoot.isKeyDown("a")) {
            turn(-2);
        }
        if (Greenfoot.isKeyDown("d")) {
            turn(2);
        }
    }
    public void shoot()
    {
        if(Greenfoot.isKeyDown("space") && Cooldown_Gun <= 0)
        {
            Bullet bullet = new Bullet();
            bullet.setRotation(getRotation());
            this.getWorld().addObject(bullet,this.getX(), this.getY());
            //Greenfoot.playSound("")
            Cooldown_Gun = 20;
        }
        else if(!Greenfoot.isKeyDown("space"))
        {
            Cooldown_Gun--;
        }
    }
}
