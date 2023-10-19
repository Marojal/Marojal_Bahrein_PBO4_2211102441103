import greenfoot.*;

public class Homepage extends World
{
    public Homepage()
    {    
        super(600, 800, 1); 
        prepare();
    }

    private void prepare()
    {
        Play play = new Play();
        addObject(play,300,400);
    }
}
