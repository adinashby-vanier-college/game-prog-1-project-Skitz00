// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class IceWorld extends World
{

    /**
     * Constructor for objects of class IceWorld.
     */
    public IceWorld()
    {
        super(1200, 800, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player1 player1 =  new Player1();
        addObject(player1, 49, 379);
        Player2 player2 =  new Player2();
        addObject(player2, 1158, 386);
        Snowman snowman =  new Snowman();
        addObject(snowman, 796, 186);
        Snowman snowman2 =  new Snowman();
        addObject(snowman2, 236, 604);
        Snowman snowman3 =  new Snowman();
        addObject(snowman3, 644, 441);
        snowman.setLocation(724, 174);
        snowman3.setLocation(775, 485);
        Icicle icicle =  new Icicle();
        addObject(icicle, 272, 183);
        Icicle icicle2 =  new Icicle();
        addObject(icicle2, 540, 320);
        Icicle icicle3 =  new Icicle();
        addObject(icicle3, 470, 535);
        Icicle icicle4 =  new Icicle();
        addObject(icicle4, 960, 652);
        Icicle icicle5 =  new Icicle();
        addObject(icicle5, 901, 277);
    }
}
