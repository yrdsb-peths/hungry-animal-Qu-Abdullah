import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The world where the elephant lives in.
 * 
 * @author Abdullah 
 * @version 12/01/2022
 */
public class MyWorld extends World
{

    public int score = 0;
    Label scoreLabel;
    int level = 1;
    GreenfootSound loseSound = new GreenfootSound("losesound.wav");
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        Elephant elephant = new Elephant();
        addObject(elephant,300,300);
        
        scoreLabel = new Label(0,80);
        addObject(scoreLabel,50,50);
        
        createApple();
    }
    
    public void increaseScore(){
        score++;
        scoreLabel.setValue(score);
        if(score % 10 == 0){
            level ++;
        }
    }
    
    public void gameOver(){
        Label gameOverLabel = new Label("Game Over",100);
        loseSound.play();
        addObject(gameOverLabel,300,200);

    }
    
    public void createApple(){
        Apple apple = new Apple();
        apple.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        
        addObject(apple,x,y);
    }
}
