import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameTitleScreen extends World
{
    private long startTime;
    public GameTitleScreen()
    {
        super(1200, 800, 1);
        startTime = System.currentTimeMillis();
    }
    public void createButtons(World nextWorld) {
        
    }
    public void act(){
        if (System.currentTimeMillis() - startTime >= 3000) {
            Greenfoot.setWorld(new GameTutMoveTank());
        }
    }
}
