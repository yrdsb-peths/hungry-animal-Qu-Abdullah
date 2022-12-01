import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public void act()
    {    
        if(Greenfoot.isKeyDown("a")){
            move(2);
        }
        if(greenfoot.isKeyDown("d")){
            move(-2);
        }
    }
}
