import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Start extends World
{
    public GameTitleScreen gameTitleScreen;
    public GameTutMoveTank gameTutMoveTank;
    
    /**
     * Constructor for objects of class Start.
     */
    public Start()
    {
        super(1200, 800, 1);
        gameTitleScreen = new GameTitleScreen();
        gameTutMoveTank = new GameTutMoveTank();
        
        gameTitleScreen.createButtons(gameTutMoveTank);
        
        Greenfoot.setWorld(gameTitleScreen);
    }
}
