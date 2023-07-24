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

        P6 p6 = new P6();
        addObject(p6,499,429);
        P6 p62 = new P6();
        addObject(p62,70,498);
        P6 p63 = new P6();
        addObject(p63,277,45);
        P7 p7 = new P7();
        addObject(p7,57,212);
        P7 p72 = new P7();
        addObject(p72,491,242);
        P3 p3 = new P3();
        addObject(p3,148,359);
        p3.setLocation(159,358);
        P3 p32 = new P3();
        addObject(p32,159,358);
        P3 p33 = new P3();
        addObject(p33,262,162);
        p3.setLocation(170,352);
        P1 p1 = new P1();
        addObject(p1,140,154);
        P1 p12 = new P1();
        addObject(p12,512,60);
        P1 p13 = new P1();
        addObject(p13,212,488);
        P1 p14 = new P1();
        addObject(p14,460,327);
        P1 p15 = new P1();
        addObject(p15,36,331);
        P8 p8 = new P8();
        addObject(p8,374,415);
        p8.setLocation(385,447);
        P8 p82 = new P8();
        addObject(p82,385,447);
        P8 p83 = new P8();
        addObject(p83,401,132);
        p83.setLocation(433,134);
        P8 p84 = new P8();
        addObject(p84,433,134);
        P8 p85 = new P8();
        addObject(p85,118,505);
        P5 p5 = new P5();
        addObject(p5,368,269);
        P5 p52 = new P5();
        addObject(p52,308,482);
        p52.setLocation(273,487);
        P4 p4 = new P4();
        addObject(p4,273,487);
        p5.setLocation(330,281);
        P4 p42 = new P4();
        addObject(p42,330,281);
        P2 p2 = new P2();
        addObject(p2,170,248);
        p2.setLocation(207,259);
        P2 p22 = new P2();
        addObject(p22,207,259);
        P2 p23 = new P2();
        addObject(p23,480,509);
        P2 p24 = new P2();
        addObject(p24,271,355);
        p24.setLocation(309,359);
        P2 p25 = new P2();
        addObject(p25,309,359);
        Cut cut = new Cut();
        addObject(cut,74,57);
        p85.setLocation(141,498);
        p2.setLocation(349,188);
        p24.setLocation(262,311);
        p25.setLocation(83,416);
        p52.setLocation(279,423);
        p5.setLocation(415,281);
        p8.setLocation(345,385);
        p8.setLocation(366,486);
        p85.setLocation(138,510);
        p83.setLocation(393,63);
        p83.setLocation(452,123);
        Contador1 contador1 = new Contador1();
        addObject(contador1,393,34);
        contador1.setLocation(431,26);
        contador1.setLocation(355,22);
        removeObject(contador1);
    }
    

}
