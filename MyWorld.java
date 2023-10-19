import greenfoot.*;  

public class MyWorld extends World
{
    public MyWorld()
    {    
        super(600, 800, 1); 
        prepare();
    }

    private void prepare()
    {
        Karakter karakter = new Karakter();
        addObject(karakter,293,756);
        Food1 food1 = new Food1();
        addObject(food1,12,54);
        Food2 food2 = new Food2();
        addObject(food2,98,210);
        Live lv = new Live();
        addObject(lv,232,338);
        Obstacle1 obstacle1 = new Obstacle1();
        addObject(obstacle1,15,375);
        Obstacle2 obstacle2 = new Obstacle2();
        addObject(obstacle2,136,15);
        Counter counter = new Counter("");
        addObject(counter,48,778);
        Counter2 counter2 = new Counter2("HP : ");
        addObject(counter2,553,777);
    }
}
