import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    }
}
