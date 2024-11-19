import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Player2 extends PCs
{
    private GreenfootImage[] imagesRed;
    private int imageIndex = 0;
    private int frameCounter = 0;
    private int animationSpeed = 5;
    public Player2(){
        GreenfootImage player2 = getImage();
        player2.scale(66,66);
        setImage(player2);
        
        imagesRed = new GreenfootImage[3];
        imagesRed[0] = new GreenfootImage("redtank_frame1_cropped.png");
        imagesRed[1] = new GreenfootImage("redtank_frame2_cropped.png");
        imagesRed[2] = new GreenfootImage("redtankog_frame3_cropped.png");
        
        for(int i = 0; i < imagesRed.length; i++){
            imagesRed[i].scale(66,66);
        }
        
        setImage(imagesRed[0]);
    }
    
    public static int Cooldown_Gun =-10;
    public static int Player2Hearts = 3;
    /**
     * Act - do whatever the Player2 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn();
        shoot();
    }
    
    /**
     * 
     */
    public void moveAndTurn()
    {
        if (Greenfoot.isKeyDown("i")) {
            move(-4);
            animatedMovementForward();
        }
        if (Greenfoot.isKeyDown("k")) {
            move(4);
            animatedMovementBackward();
        }
        if (Greenfoot.isKeyDown("j")) {
            turn(-2);
        }
        if (Greenfoot.isKeyDown("l")) {
            turn(2);
        }
    }
    private void shoot()
    {
        if (Greenfoot.isKeyDown("enter") && Cooldown_Gun <= 0)
        {
            Bullet bullet = new Bullet(-20);
            bullet.setRotation(getRotation());
            this.getWorld().addObject(bullet,this.getX(), this.getY());
            //Greenfoot.playSound("")
            Cooldown_Gun = 20;
        }
        else if(!Greenfoot.isKeyDown("enter"))
        {
            Cooldown_Gun--;
        }
    }
    private void animatedMovementForward(){
        frameCounter++;
        if(frameCounter % animationSpeed == 0){
            imageIndex = (imageIndex + 1) % imagesRed.length;
            setImage(imagesRed[imageIndex]);
        }
        
    }
    private void animatedMovementBackward(){
        frameCounter++;
        if(frameCounter % animationSpeed == 0){
            imageIndex--;
            if(imageIndex < 0){
                imageIndex = imagesRed.length -1;
            }
            setImage(imagesRed[imageIndex]);
        }
    }
}
