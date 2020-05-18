import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * The world where ants live.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class AntWorld extends World
{
    public static final int SIZE = 640;

    /**
     * Create a new world. It will be initialised with a few ant hills
     * and food sources
     */
    public AntWorld()
    {
        super(SIZE, SIZE, 1);
        setPaintOrder(Ant.class, AntHill.class);
        prepare();
    }
    public void act()
    { 
    if(getObjects(Food.class).size() == 0)
    {
     Greenfoot.stop();
    }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        AntHill antHill = new AntHill();
        addObject(antHill,179,210);
        Food food = new Food();
        addObject(food,486,322);
        Food food2 = new Food();
        addObject(food2,387,341);
        food.setLocation(482,324);
        Food food3 = new Food();
        addObject(food3,482,324);
        Food food4 = new Food();
        addObject(food4,310,440);
        Food food5 = new Food();
        addObject(food5,346,474);
        Food food6 = new Food();
        addObject(food6,113,410);
        Food food7 = new Food();
        addObject(food7,168,346);
        Food food8 = new Food();
        addObject(food8,477,215);
        Food food9 = new Food();
        addObject(food9,384,125);
        Food food10 = new Food();
        addObject(food10,275,112);
        Food food11 = new Food();
        addObject(food11,439,102);
        Food food12 = new Food();
        addObject(food12,536,496);
        Food food13 = new Food();
        addObject(food13,419,541);
        Food food14 = new Food();
        addObject(food14,254,547);
        Food food15 = new Food();
        addObject(food15,195,492);
        Food food16 = new Food();
        addObject(food16,81,536);
        Food food17 = new Food();
        addObject(food17,73,346);
        Food food18 = new Food();
        addObject(food18,77,199);
        Food food19 = new Food();
        addObject(food19,103,45);
        Food food20 = new Food();
        addObject(food20,332,20);
        Food food21 = new Food();
        addObject(food21,509,43);
        Food food22 = new Food();
        addObject(food22,580,253);
        Food food23 = new Food();
        addObject(food23,316,233);
        Food food24 = new Food();
        addObject(food24,279,311);
        Food food25 = new Food();
        addObject(food25,451,422);
        Food food26 = new Food();
        addObject(food26,561,127);
    }
}
