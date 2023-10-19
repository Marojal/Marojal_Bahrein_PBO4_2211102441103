import greenfoot.*;  

public class Obstacle1 extends Obstacle
{
    void createnew(){
        Obstacle1 obstacle1 = new Obstacle1();
        getWorld().addObject(obstacle1,Greenfoot.getRandomNumber(600),0);
    }
    void maju(){
        setLocation(getX(), getY()+2);
    }
    public void act(){
        super.act();
    }
}
