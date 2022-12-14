import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Starting display of the Game
 * 
 * @author Abdullah 
 * @version December 2022
 */
public class TitleScreen extends World
{

    Label titleLabel = new Label("Hungry Elephant",75);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject(titleLabel,getWidth()/2,50);
        prepare();
    }

    public void act(){

        if(Greenfoot.isKeyDown("space")){
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
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
        Elephant elephant = new Elephant();
        addObject(elephant,289,176);
        elephant.setLocation(327,206);
        elephant.setLocation(299,217);
    }
}
