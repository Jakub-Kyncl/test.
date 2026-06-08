import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Jakub Kyncl  
 * @version 20.05.2026
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        rampa();
        stanice();
         
    }
    
    public void rampa()
    {
        OdpalovaciRampa oR = new OdpalovaciRampa();
        addObject(oR, getWidth()/2, getHeight() - 50);
    }
    
    public void stanice()
    {
        for(int i=0; i<10; i++)
        {
            int y = Greenfoot.getRandomNumber(100)+101,getHeigt;
            Stanice s = new Stanice();
            addObject(s, i*50, y);
        }
    }
}
