import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Starting display of the Game
 * 
 * @author Abdullah 
 * @version December 2022
 */
public class TitleScreen extends World
{

    Label titleLabel = new Label("Picky Pacman",75);
    Elephant elephant = new Elephant();
    
    //Variable that allows the intro music to play once
    int i = 0;
    
    GreenfootSound intro = new GreenfootSound("Intro.mp3");
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        addObject(titleLabel,getWidth()/2,50);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Press the Space Button to Start", 40);
        addObject(label,287,95);
        label.setLocation(302,95);
        addObject(elephant,289,176);
        elephant.setLocation(-50,217);
        label.setLocation(347,365);
        label.setLocation(383,318);
        label.setLocation(176,328);
        label.setLocation(192,321);
        label.setLocation(259,322);
        label.setLocation(292,328);
        label.setLocation(320,307);
        Label label2 = new Label("Use \u2190 and \u2192 to Move", 40);
        addObject(label2,288,362);
        label2.setLocation(292,356);
        Elephant elephant2 = new Elephant();
        addObject(elephant2,285,208);
    }
    
    public void act(){
        
        if(i<1){
            intro.play();
            i++;
        }

        if(Greenfoot.isKeyDown("space")){
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
        
        elephant.move(700);
    }
    
    
}
