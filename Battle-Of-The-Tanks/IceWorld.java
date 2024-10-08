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
        super(1300, 900, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Snowman snowman =  new  Snowman();
        addObject(snowman, 881, 232);
        Snowman snowman2 =  new  Snowman();
        addObject(snowman2, 830, 714);
        Snowman snowman3 =  new  Snowman();
        addObject(snowman3, 507, 413);
        Snowman snowman4 =  new  Snowman();
        addObject(snowman4, 566, 179);
        snowman3.setLocation(373, 528);
        snowman4.setLocation(610, 289);
        snowman.setLocation(781, 480);
        snowman2.setLocation(885, 751);
        Snowman snowman5 =  new  Snowman();
        addObject(snowman5, 829, 168);
        Player1 player1 =  new  Player1();
        addObject(player1, 91, 462);
        Player2 player2 =  new  Player2();
        addObject(player2, 1222, 431);
    }
}
