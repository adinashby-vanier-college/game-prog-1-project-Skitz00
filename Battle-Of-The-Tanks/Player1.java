import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Player1 extends PCs
{
    private GreenfootImage[] imagesBlue;
    private int imageIndex = 0;
    private int frameCounter = 0;
    private int animationSpeed = 5;
    public Player1(){
        
        GreenfootImage player1 = getImage();
        player1.scale(65,65);
        setImage(player1);
        
        imagesBlue = new GreenfootImage[3];
        imagesBlue[0] = new GreenfootImage("bluetank_frame1.png");
        imagesBlue[1] = new GreenfootImage("bluetank_frame2.png");
        imagesBlue[2] = new GreenfootImage("bluetank_frame3.png");
        
        for(int i = 0; i < imagesBlue.length; i++){
            imagesBlue[i].scale(65,65);
        }
        
        setImage(imagesBlue[0]);
        
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
            animatedMovementForward();
        }
        if (Greenfoot.isKeyDown("s")) {
            move(-4);
            animatedMovementBackward();
        }
        if (Greenfoot.isKeyDown("a")) {
            turn(-2);
        }
        if (Greenfoot.isKeyDown("d")) {
            turn(2);
        }
    }
    private void animatedMovementForward(){
        frameCounter++;
        if(frameCounter % animationSpeed == 0){
            imageIndex = (imageIndex + 1) % imagesBlue.length;
            setImage(imagesBlue[imageIndex]);
        }
        
    }
    private void animatedMovementBackward(){
        frameCounter++;
        if(frameCounter % animationSpeed == 0){
            imageIndex--;
            if(imageIndex < 0){
                imageIndex = imagesBlue.length -1;
            }
            setImage(imagesBlue[imageIndex]);
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
