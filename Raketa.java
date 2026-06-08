import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Raketa here.
 * 
 * @author Jakub Kyncl 
 * @version 20.05.2026
 */
public class Raketa extends Actor
{
    private int mnozstviPaliva;
     
    //public void Raketa(natankuj)
    {
        //mnozstviPaliva=natankuj;
    }
    public void act()
    {
        mnozstviPaliva = 0;
        pohyb();
    }
    public void pohyb()
    {
        move(3);
        mnozstviPaliva--;
        if(mnozstviPaliva <= 0)
        {
            move(0);
        }
    }
}
