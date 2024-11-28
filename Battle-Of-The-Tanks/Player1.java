import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Player1 extends PCs
{
    private GreenfootImage[] imagesBlue;
    private int imageIndex = 0;
    private int frameCounter = 0;
    private int animationSpeed = 5;
    
    public Player1(){
        GreenfootImage player1 = getImage();
        player1.scale(65,65);
        setImage(player1);
        
        imagesBlue = new GreenfootImage[3];
        imagesBlue[0] = new GreenfootImage("bluetank_frame1.png");
        imagesBlue[1] = new GreenfootImage("bluetank_frame2.png");
        imagesBlue[2] = new GreenfootImage("bluetank_frame3.png");
        
        for(int i = 0; i < imagesBlue.length; i++){
            imagesBlue[i].scale(65,65);
        }
        
        setImage(imagesBlue[0]);
        
    }
    
    public static int Cooldown_Gun =-10;
    public int Player1Hearts =3;
    /**
     * Act - do whatever the Player1 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Player1Hearts > 0)
        {
            moveAndTurn();
            shoot();
            checkHitByBullet();
            checkForMedkit();
            checkForCactus();
            checkForBoulder();
            checkForIcicle();
            checkForSnowman();
            checkForLava();
            checkForVolcano();
        }
        else
        {
            getWorld().removeObject(this);

            if (getWorld() instanceof IceWorld) {
                Greenfoot.setWorld(new SandWorld());
            }
        }
    }

    /**
     * 
     */
    public void moveAndTurn()
    {
        if (Greenfoot.isKeyDown("w")) {
            move(4);
            animatedMovementForward();
        }
        if (Greenfoot.isKeyDown("s")) {
            move(-4);
            animatedMovementBackward();
        }
        if (Greenfoot.isKeyDown("a")) {
            turn(-2);
        }
        if (Greenfoot.isKeyDown("d")) {
            turn(2);
        }
    }
    private void animatedMovementForward(){
        frameCounter++;
        if(frameCounter % animationSpeed == 0){
            imageIndex = (imageIndex + 1) % imagesBlue.length;
            setImage(imagesBlue[imageIndex]);
        }
        
    }
    private void animatedMovementBackward(){
        frameCounter++;
        if(frameCounter % animationSpeed == 0){
            imageIndex--;
            if(imageIndex < 0){
                imageIndex = imagesBlue.length -1;
            }
            setImage(imagesBlue[imageIndex]);
        }
        
    }
    public void shoot()
    {
        if(Greenfoot.isKeyDown("space") && Cooldown_Gun <= 0)
        {
            Bullet bullet = new Bullet(20);
            bullet.setRotation(getRotation());
            this.getWorld().addObject(bullet,this.getX(), this.getY());
            Cooldown_Gun = 20;
        }
        else if(!Greenfoot.isKeyDown("space"))
        {
            Cooldown_Gun--;
        }
    }
    
    private void checkHitByBullet()
    {
        Bullet bullet = (Bullet) getOneIntersectingObject(Bullet.class);
        if (bullet != null && bullet.getSpeed() < 0) {
            Player1Hearts--;
            getWorld().removeObjects(getWorld().getObjects(LifeTankBlue.class));
            for(int i = 0; i < Player1Hearts; i++)
            {
                  getWorld().addObject(new LifeTankBlue(), 30 + 50 * i, 30);
            }
            getWorld().removeObject(bullet);
        }
    }
    private void checkForMedkit()
    {
        Medkit medkit = (Medkit) getOneIntersectingObject(Medkit.class);
        if (medkit != null)
        {
            Player1Hearts++;
            for(int i = 0; i < Player1Hearts; i++)
            {
                  getWorld().addObject(new LifeTankBlue(), 30 + 50 * i, 30);
            }
            getWorld().removeObject(medkit);
        }
    }
    public void checkForCactus() {
        Cactus cactus = (Cactus) getOneIntersectingObject(Cactus.class);
        if (cactus != null) {
            Player1Hearts--;
            getWorld().removeObjects(getWorld().getObjects(LifeTankBlue.class));
            for(int i = 0; i < Player1Hearts; i++)
            {
                  getWorld().addObject(new LifeTankBlue(), 30 + 50 * i, 30);
            }
            getWorld().removeObject(cactus);
        }
    }
    public void checkForBoulder() {
        Boulder boulder = (Boulder) getOneIntersectingObject(Boulder.class);
        if (boulder != null) {
            Player1Hearts--;
            getWorld().removeObjects(getWorld().getObjects(LifeTankBlue.class));
            for(int i = 0; i < Player1Hearts; i++)
            {
                  getWorld().addObject(new LifeTankBlue(), 30 + 50 * i, 30);
            }
            getWorld().removeObject(boulder);
        }
    }
    public void checkForIcicle() {
        Icicle icicle = (Icicle) getOneIntersectingObject(Icicle.class);
        if (icicle != null) {
            Player1Hearts--;
            getWorld().removeObjects(getWorld().getObjects(LifeTankBlue.class));
            for(int i = 0; i < Player1Hearts; i++)
            {
                  getWorld().addObject(new LifeTankBlue(), 30 + 50 * i, 30);
            }
            getWorld().removeObject(icicle);
        }
    }
    public void checkForSnowman() {
        Snowman snowman = (Snowman) getOneIntersectingObject(Snowman.class);
        if (snowman != null) {
            Player1Hearts--;
            getWorld().removeObjects(getWorld().getObjects(LifeTankBlue.class));
            for(int i = 0; i < Player1Hearts; i++)
            {
                  getWorld().addObject(new LifeTankBlue(), 30 + 50 * i, 30);
            }
            getWorld().removeObject(snowman);
        }
    }
    public void checkForLava() {
        Lava lava = (Lava) getOneIntersectingObject(Lava.class);
        if (lava != null) {
            Player1Hearts--;
            getWorld().removeObjects(getWorld().getObjects(LifeTankBlue.class));
            for(int i = 0; i < Player1Hearts; i++)
            {
                  getWorld().addObject(new LifeTankBlue(), 30 + 50 * i, 30);
            }
            getWorld().removeObject(lava);
        }
    }
    public void checkForVolcano() {
        Volcano volcano = (Volcano) getOneIntersectingObject(Volcano.class);
        if (volcano != null) {
            Player1Hearts--;
            getWorld().removeObjects(getWorld().getObjects(LifeTankBlue.class));
            for(int i = 0; i < Player1Hearts; i++)
            {
                  getWorld().addObject(new LifeTankBlue(), 30 + 50 * i, 30);
            }
            getWorld().removeObject(volcano);
        }
    }
}
