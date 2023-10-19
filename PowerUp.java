import greenfoot.*;  

public abstract class PowerUp extends Actor
{
    abstract void createnew();
    abstract void maju();
    
    void eaten(){
        Counter2.add(1);
        Greenfoot.playSound("one_beep-99630.mp3");
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
