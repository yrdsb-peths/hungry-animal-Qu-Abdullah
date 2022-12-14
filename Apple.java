import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Makes apples fall down
 * 
 * @author Abdullah
 * @Version December 2022
 */
public class Apple extends Actor
{

    private int speed = 1;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public void act()
    {    
        setLocation(getX(),getY()+speed);
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight()){
            world.gameOver();
            world.removeObject(this);
        }
        
    }
    
    public void setSpeed(int spd){
        speed = spd;
    }
}
