import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{

    
    public void act(){
        if(Greenfoot.isKeyDown("left")){
            move(-2);
        } else if(Greenfoot.isKeyDown("right")){
            move(2);
        }
        eat();
    }
    
    public void eat(){
        int numberOfApples = 0;
        if(isTouching(Apple.class)){
            removeTouching(Apple.class);
            
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            numberOfApples++;
    }
    }
    
}
