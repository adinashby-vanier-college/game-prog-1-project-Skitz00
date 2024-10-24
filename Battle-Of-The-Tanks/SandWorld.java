import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class SandWorld extends World
{
    public static int Cacti =3;
    public static int Boulders =6;
    /**
     * Constructor for objects of class SandWorld.
     */
    public SandWorld()
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
        Cactus cactus =  new  Cactus();
        addObject(cactus, 832, 209);
        Cactus cactus2 =  new  Cactus();
        addObject(cactus2, 339, 594);
        Cactus cactus3 =  new  Cactus();
        addObject(cactus3, 717, 488);
        cactus.setLocation(446, 172);
        cactus3.setLocation(789, 295);
        Icicle icicle =  new  Icicle();
        addObject(icicle, 830, 627);
        Icicle icicle2 =  new  Icicle();
        addObject(icicle2, 556, 480);
        Icicle icicle3 =  new  Icicle();
        addObject(icicle3, 268, 319);
        Icicle icicle4 =  new  Icicle();
        addObject(icicle4, 646, 161);
        Icicle icicle5 =  new  Icicle();
        addObject(icicle5, 488, 667);
        icicle2.setLocation(626, 300);
        icicle2.setLocation(579, 404);
        Player1 player1 =  new  Player1();
        addObject(player1, 61, 386);
        Player2 player2 =  new  Player2();
        addObject(player2, 1131, 406);
        player1.setLocation(62, 400);
        removeObject(icicle);
        removeObject(icicle2);
        removeObject(icicle5);
        removeObject(icicle3);
        removeObject(icicle4);
        Boulder boulder =  new  Boulder();
        addObject(boulder, 628, 519);
        Boulder boulder2 =  new  Boulder();
        addObject(boulder2, 307, 360);
        Boulder boulder3 =  new  Boulder();
        addObject(boulder3, 608, 247);
        Boulder boulder4 =  new  Boulder();
        addObject(boulder4, 200, 688);
        boulder4.setLocation(873, 669);
        Boulder boulder5 =  new  Boulder();
        addObject(boulder5, 468, 693);
        cactus3.setLocation(828, 367);
        boulder3.setLocation(656, 162);
        boulder.setLocation(592, 275);
        boulder4.setLocation(700, 600);
        boulder4.setLocation(609, 427);
        boulder.setLocation(711, 290);
        boulder.setLocation(893, 196);
        Boulder boulder6 =  new  Boulder();
        addObject(boulder6, 849, 640);
    }
}
