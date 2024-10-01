// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
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
        Player1 player1 =  new Player1();
        addObject(player1, 91, 448);
        Player2 player2 =  new Player2();
        addObject(player2, 1237, 446);
        Obstacle obstacle =  new Obstacle();
        addObject(obstacle, 818, 130);
        Obstacle obstacle2 =  new Obstacle();
        addObject(obstacle2, 851, 741);
        Obstacle obstacle3 =  new Obstacle();
        addObject(obstacle3, 820, 435);
        Obstacle obstacle4 =  new Obstacle();
        addObject(obstacle4, 469, 579);
        Obstacle obstacle5 =  new Obstacle();
        addObject(obstacle5, 258, 278);
        Obstacle obstacle6 =  new Obstacle();
        addObject(obstacle6, 503, 731);
        obstacle3.setLocation(911, 324);
        obstacle.setLocation(657, 299);
        obstacle2.setLocation(790, 441);
        obstacle4.setLocation(376, 479);
        obstacle6.setLocation(498, 749);
        Obstacle obstacle7 =  new Obstacle();
        addObject(obstacle7, 791, 712);
        Obstacle obstacle8 =  new Obstacle();
        addObject(obstacle8, 799, 144);
        Obstacle obstacle9 =  new Obstacle();
        addObject(obstacle9, 425, 119);
        Obstacle obstacle10 =  new Obstacle();
        addObject(obstacle10, 1040, 746);
        Obstacle obstacle11 =  new Obstacle();
        addObject(obstacle11, 1042, 504);
        obstacle11.setLocation(1066, 481);
        obstacle11.setLocation(1047, 164);
        obstacle3.setLocation(993, 498);
        obstacle2.setLocation(852, 337);
        obstacle.setLocation(619, 451);
        obstacle11.setLocation(1052, 96);
        obstacle11.setLocation(948, 256);
        obstacle2.setLocation(579, 248);
        obstacle.setLocation(718, 434);
        obstacle4.setLocation(320, 596);
        obstacle5.setLocation(297, 240);
        obstacle5.setLocation(314, 282);
        obstacle11.setLocation(1015, 189);
        player2.setLocation(1048, 519);
        player2.setLocation(1241, 432);
        player2.setLocation(1254, 431);
        obstacle.setLocation(492, 470);
        obstacle8.setLocation(762, 292);
        obstacle11.setLocation(671, 79);
        obstacle3.setLocation(959, 94);
        obstacle10.setLocation(944, 480);
    }
}
