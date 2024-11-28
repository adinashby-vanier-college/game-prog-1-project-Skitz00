import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class FireWorld extends World
{
    
    /**
     * Constructor for objects of class FireWorld.
     */
    public FireWorld()
    {
        super(1200, 800, 1);
        prepare();
        
       for(int i = 0;i < 3; i++){
        addObject(new LifeTankBlue(), 30 + 50*i, 30);
        
       }
     
       for(int i = 0;i < 3; i++){
        addObject(new LifeTankRed(), 1000 + 50*i, 30);
        
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Volcano volcano =  new  Volcano();
        addObject(volcano, 742, 158);
        Volcano volcano2 =  new  Volcano();
        addObject(volcano2, 393, 622);
        Volcano volcano3 =  new  Volcano();
        addObject(volcano3, 560, 378);
        Lava lava =  new  Lava();
        addObject(lava, 709, 639);
        Lava lava2 =  new  Lava();
        addObject(lava2, 901, 384);
        Lava lava3 =  new  Lava();
        addObject(lava3, 940, 552);
        Lava lava4 =  new  Lava();
        addObject(lava4, 355, 418);
        Lava lava5 =  new  Lava();
        addObject(lava5, 150, 336);
        lava4.setLocation(378, 203);
        lava5.setLocation(308, 406);
        lava3.setLocation(592, 56);
        Player1 player1 =  new  Player1();
        addObject(player1, 54, 394);
        Player2 player2 =  new  Player2();
        addObject(player2, 1150, 389);
        lava5.setLocation(397,399);
        volcano3.setLocation(650,370);
        volcano2.setLocation(416,642);
        volcano.setLocation(881,130);
        lava3.setLocation(680,143);
        lava2.setLocation(878,365);
        lava.setLocation(691,598);
    }
}
