import greenfoot.*;  

public class Obstacle2 extends Obstacle
{
    void createnew(){
        Obstacle2 obstacle2 = new Obstacle2();
        getWorld().addObject(obstacle2,Greenfoot.getRandomNumber(600),0);
    }
    void maju(){
        setLocation(getX(), getY()+2);
    }
    public void act(){
        super.act();
    }
}
