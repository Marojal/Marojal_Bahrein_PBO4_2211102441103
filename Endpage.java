import greenfoot.*; 

public class Endpage extends World
{
    public Endpage()
    {    
        super(600, 800, 1); 
        prepare();
    }
    
    private void prepare()
    {
        Exit exit = new Exit();
        addObject(exit,300,400);
    }
}
