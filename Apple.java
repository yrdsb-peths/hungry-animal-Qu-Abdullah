import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Makes apples fall down
 */
public class Apple extends Actor
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public void act()
    {    
        setLocation(getX(),getY()+1);
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight()){
            world.gameOver();
            world.removeObject(this);
        }
        
    }
}
