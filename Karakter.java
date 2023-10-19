import greenfoot.*;  

public class Karakter extends Actor
{
    int count = 0;
    
    void eaten(){
        Counter.add(1);
        getWorld().removeObject(this);
    }
    public void act() 
    {
        if(Greenfoot.isKeyDown("D")){
            setLocation(getX()+5, getY());
       }
       else if(Greenfoot.isKeyDown("A")){
           setLocation(getX()-5, getY()); 
       }
       if(isTouching(Obstacle.class)){
           Counter2.add(-1);
           Greenfoot.playSound("score.wav");
           eaten();
       }
       if(Counter2.value==0){
           Greenfoot.delay(1);
           Greenfoot.setWorld(new Endpage());
           getWorld().removeObject(this);
        }
    }    
}