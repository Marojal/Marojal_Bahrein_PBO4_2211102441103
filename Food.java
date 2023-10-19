import greenfoot.*;  

public abstract class Food extends Actor
{
    abstract void createnew();
    abstract void maju();
    
    void eaten(){
        Counter.add(1);
        Greenfoot.playSound("score.wav");
        createnew();
        getWorld().removeObject(this);
    }
    
    public void act() 
    {
        maju();
        if(getY()>=799){
            setLocation(Greenfoot.getRandomNumber(600),0);
        }
        if(isTouching(Karakter.class)){
            eaten();
        }
        if(Counter2.value==0){
           getWorld().removeObject(this);
        }
    }    
}
