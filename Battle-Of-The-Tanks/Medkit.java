import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Medkit extends NPCs
{
    private GreenfootImage[]images;
    private int imageIndex = 0;
    private int animationDelay =  5;
    private int frameCount = 0;
    
    public Medkit(){
        images = new GreenfootImage[3];
        images[0] = new GreenfootImage("medkit_big_frame3_cropped.png");
        images[1] = new GreenfootImage("medkit_original_frame2_cropped.png");
        images[2] = new GreenfootImage("medkit_small_frame1_cropped.png");
        
        for(int i = 0; i < images.length; i++){
            images[i].scale(65,65);
        }
        
        setImage(images[0]);
    }
    /**
     * Act - do whatever the Medkit wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        animate();
    }
    private void animate(){
        frameCount++;
        if(frameCount >= animationDelay){
            frameCount = 0;
            imageIndex = (imageIndex + 1)% images.length;
            setImage(images[imageIndex]);
        }
        
    }
}
