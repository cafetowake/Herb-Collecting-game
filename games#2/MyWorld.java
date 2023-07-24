import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    GreenfootSound backgroundMusic = new GreenfootSound("lofiGarden.mp3");
    public MyWorld()
    
    {    
        super(560, 560, 1); 
        backgroundMusic.playLoop();
        setBackground("2.png");
        prepare();
        
    }
    
    private void prepare()
    {

        P1 p1 = new P1();
        addObject(p1,98,225);
        P1 p12 = new P1();
        addObject(p12,491,341);
        P1 p13 = new P1();
        addObject(p13,160,469);
        P2 p2 = new P2();
        addObject(p2,359,170);
        P2 p22 = new P2();
        addObject(p22,266,399);
        Cut cut = new Cut();
        addObject(cut,220,69);
    }
    

}
