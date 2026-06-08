import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class OdpalovaciRampa here.
 * 
 * @author Jakub Kyncl  
 * @version 20.05.2026
 */
public class OdpalovaciRampa extends Actor
{
    List<Raketa> seznamRaket = new ArrayList<>();
    int palivo;
    public void act()
    {
        otaceni();
        seznam();
        palivovac();
        odpal();
    }
    public void otaceni()
    {
        MouseInfo mi = Greenfoot.getMouseInfo();
        if( mi != null)
        {
            int X = mi.getX();
            int Y = mi.getY();
            turnTowards(Y, X);
        }
    }
    public void seznam()
    {
        Raketa r = (Raketa) getOneIntersectingObject(Raketa.class);
        if(r != null)
        {
            seznamRaket.add(r);
            //clone(25);
            
        }
       
    }
    public void palivovac()
    {
        palivo=0;
        if("up".equals(Greenfoot.getKey()))
        {
            palivo += 10;
        }
        //getWorld().showText("Palivo".palivo(),200, 30());
    }
    public void odpal()
    {
        if("space".equals(Greenfoot.getKey()))
        {
            World svet = getWorld();
            //svet.addObject(r);
            palivo=0;
        }
    }
}
