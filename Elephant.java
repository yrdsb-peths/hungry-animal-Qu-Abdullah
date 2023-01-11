import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/*
 * Write a description of class MyWorld here.
 * 
 * @Qureshi
 * @2023
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("pacman_chomp.wav");
    GreenfootImage[] idleRight = new GreenfootImage[4];
    GreenfootImage[] idleLeft = new GreenfootImage[4];
    GreenfootImage[] death = new GreenfootImage[10];
    
    private int elephantScore = 0;
    private int speed = 2;
    
    
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    
    public Elephant(){
        for(int i = 0; i < idleRight.length;i++){
            idleRight[i] = new GreenfootImage("images\\pacman_walk\\idle" + i  + ".png");
            idleRight[i].scale(100,100);
        }
        
        for(int i = 0; i < idleLeft.length;i++){
            idleLeft[i] = new GreenfootImage("images\\pacman_walk\\idle" + i  + ".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(100,100);
        }
        
        for(int i = 0; i < death.length; i++){
            death[i] = new GreenfootImage("images\\anti_pacman\\death_" + i + ".png");
        }
        
        animationTimer.mark();
        
        setImage(idleRight[0]);
    }
    
    int imageIndex = 0;
    public void animateElephant(){
        
        if(animationTimer.millisElapsed() < 125){
            return;
        }
        
        animationTimer.mark();
        
        if(facing.equals("right")){
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        } 
        else{
           setImage(idleLeft[imageIndex]);
           imageIndex = (imageIndex + 1) % idleLeft.length; 
        }
    }
    
    
    public void act(){
    
        if(Greenfoot.isKeyDown("left")){
            facing = "left";
            move(-speed);
        } else if(Greenfoot.isKeyDown("right")){
            facing = "right";
            move(speed);
        }
        eat();
        animateElephant();

    }
    
    public void eat(){

        if(isTouching(Apple.class)){
            removeTouching(Apple.class);
            elephantSound.play();
            MyWorld world = (MyWorld) getWorld();         
            world.createApple();
            world.increaseScore();
            elephantScore++;
            if(elephantScore % 15 == 0){
                speed++;
            }
        }
    }
    
}
