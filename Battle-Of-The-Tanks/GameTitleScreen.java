import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameTitleScreen extends World
{
    private Button nextButton;
    private Button previousButton;
     
    
    public GameTitleScreen()
    {
        super(1200, 800, 1);
    }
    
    public void createButtons(World gameTutMoveTank)
    {
        nextButton = new Button("next.png", gameTutMoveTank);
        
        //scale image
        
        
        //put object on screen
        addObject(nextButton,1050,725);
    }
}
