import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.Color;
/**
 * Write a description of class Contador1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Contador1 extends Actor
{
    /**
     * Act - do whatever the Contador1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
 //   private int score;
 //   int puntuacion=0;
  //  public void act()
  //  {
  //     setImage(new GreenfootImage("Puntuacion:" + puntuacion, 24,Color.GREEN, Color. BLACK));
  //  }
    
  //  public void incrementaPuntuacion() 
  //  {
  //      puntuacion++;
  //      updateImage();  
  //  }
    
 //   public Contador1()
 //   {
  //      updateImage();
  //  }
    
    private int score;
   // public void act()
   // {
       // Background world = (Background) getWorld();
      //  Bubble Bubble = world.getBubble();
      //  if(Greenfoot.mouseClicked(Bubble))
      //  {
      //      addScore(1);
      //  }
  //  }
    public Contador1()
    {
        score = 0;
        setImage (new GreenfootImage(200, 30));
        update();
    }
    public void addScore(int amount)
    {
        score += amount;
        update();
    }
    public void update()
    {
        GreenfootImage img = getImage();
        img.clear();
        img.setColor(Color.BLACK);
        img.drawString("Score: " + score, 4, 20);
    }
}

