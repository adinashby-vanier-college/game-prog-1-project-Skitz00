import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class IceWorld extends World
{
    
    //these  are the counter for the lives
    
    //public static Counter redTankLivesCount = new Counter();
 
    /**
     * Constructor for objects of class IceWorld.
     */
    public IceWorld()
    {
        super(1200, 800, 1);
        prepare();
        //add counter on screen with coordinates and nb lives for blue
        //addObject(blueTankLivesCount, 50, 20);
        //blueTankLivesCount.setValue(3);
        //this new code down here is with the new heart image. revert to previous code for old counter
        
        for(int i = 0;i < 3; i++){
        addObject(new LifeTankBlue(), 30 + 50*i, 30);
        
    }
     
       for(int i = 0;i < 3; i++){
        addObject(new LifeTankRed(), 1070 + 50*i, 30);
        
    }
        
        //add counter on screen with coordinates and nb lives for red
    //    addObject(redTankLivesCount, 900, 20);
    //    redTankLivesCount.setValue(3);
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
}
