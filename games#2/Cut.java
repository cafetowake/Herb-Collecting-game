import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cut extends Actor
{
    /**
     * Act - do whatever the Cut wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn();
        eat();
   
    }
    
        public void moveAndTurn()
    {
        move(4);
        
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }
    }
    
    public void eat()
    {
        Actor p1;
        p1 = getOneObjectAtOffset(0, 0, P1.class);
        if (p1 != null)
        {
            World world;
            world = getWorld();
            world.removeObject(p1);
            Greenfoot.playSound("cut.mp3");
        }
        
        Actor p2;
        p2 = getOneObjectAtOffset(0, 0, P2.class);
        if (p2 != null)
        {
            World world;
            world = getWorld();
            world.removeObject(p2);
            Greenfoot.playSound("cut.mp3");
        }
    }  
    } 

