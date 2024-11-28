import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameTutMoveTank extends World
{
    public GameTutMoveTank()
    {
        super(1200, 800, 1);
        
        Button returnButton = new Button("PRESS TO START");
        addObject(returnButton, getWidth() / 2, getHeight() / 2);
    }
}
