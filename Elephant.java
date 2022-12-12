import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    GreenfootImage[] idleRight = new GreenfootImage[8];
    GreenfootImage[] idleLeft = new GreenfootImage[8];
    
    
    String facing = "right";
    public Elephant(){
        for(int i = 0; i < idleRight.length;i++){
            idleRight[i] = new GreenfootImage("images/elephant_idle/idle" + i  + ".png");
            idleRight[i].scale(100,100);
        }
        setImage(idleRight[0]);
    }
    
    int imageIndex = 0;
    public void animateElephant(){
        setImage(idleRight[imageIndex]);
        imageIndex = (imageIndex + 1) % idleRight.length;
    }
    
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
            elephantSound.play();
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            numberOfApples++;
    }
    }
    
}
