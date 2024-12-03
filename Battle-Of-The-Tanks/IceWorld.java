import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class IceWorld extends World
{
    private GreenfootSound gameMusic;
    //these  are the counter for the lives
    
    //public static Counter redTankLivesCount = new Counter();
 
    /**
     * Constructor for objects of class IceWorld.
     */
    public IceWorld()
    {
        super(1200, 800, 1);
        prepare();
        gameMusic = new GreenfootSound("iceBackground.wav");
        gameMusic.setVolume(20);
        started();
        //add counter on screen with coordinates and nb lives for blue
        //addObject(blueTankLivesCount, 50, 20);
        //blueTankLivesCount.setValue(3);
        //this new code down here is with the new heart image. revert to previous code for old counter
        
        for(int i = 0;i < 3; i++){
        addObject(new LifeTankBlue(), 30 + 50*i, 30);
        
        }
     
       for(int i = 0;i < 3; i++){
        addObject(new LifeTankRed(), 1000 + 50*i, 30);
        
        }
        
        //if(Player1.class == null){
        //            Greenfoot.setWorld(new SandWorld());
        //       }
    
        //add counter on screen with coordinates and nb lives for red
        //    addObject(redTankLivesCount, 900, 20);
        //    redTankLivesCount.setValue(3);
    }
    
    public void started()
    {
        gameMusic.play();
    }
    
    public void stopped(World SandWorld)
    {        
        gameMusic.stop();        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player1 player1 =  new  Player1();
        addObject(player1, 49, 379);
        Player2 player2 =  new  Player2();
        addObject(player2, 1158, 386);
        Snowman snowman =  new  Snowman();
        addObject(snowman, 796, 186);
        Snowman snowman2 =  new  Snowman();
        addObject(snowman2, 236, 604);
        Snowman snowman3 =  new  Snowman();
        addObject(snowman3, 644, 441);
        snowman.setLocation(724, 174);
        snowman3.setLocation(775, 485);
        Icicle icicle =  new  Icicle();
        addObject(icicle, 272, 183);
        Icicle icicle2 =  new  Icicle();
        addObject(icicle2, 540, 320);
        Icicle icicle3 =  new  Icicle();
        addObject(icicle3, 470, 535);
        Icicle icicle4 =  new  Icicle();
        addObject(icicle4, 960, 652);
        Icicle icicle5 =  new  Icicle();
        addObject(icicle5, 901, 277);
              
    }
    
    public void act(){
        //Player1 player1 = (Player1) getObjects(Player1.class.get(0));
        
        Player1 player1 = (Player1)getObjects(Player1.class).get(0);
        Player2 player2 = (Player2)getObjects(Player2.class).get(0);
        
        if(player1.Player1Hearts <=0 || player2.Player2Hearts <=0){
            Greenfoot.setWorld(new SandWorld());
        }
    }
}
