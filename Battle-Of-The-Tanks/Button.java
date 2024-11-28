import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    private String label;
    public Button(String label)
    {
        this.label = label;
        GreenfootImage image = new GreenfootImage(label, 24, Color.WHITE, Color.BLACK);
        
        int borderWidth = 5;
        GreenfootImage borderedImage = new GreenfootImage(image.getWidth() + 2 * borderWidth, image.getHeight() + 2 * borderWidth);
        borderedImage.setColor(Color.WHITE);
        borderedImage.fillRect(0, 0, borderedImage.getWidth(), borderedImage.getHeight());
        borderedImage.drawImage(image, borderWidth, borderWidth);

        setImage(borderedImage);
    }
    
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new IceWorld());
        }
    }
    
}
