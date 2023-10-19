import greenfoot.*;  

public abstract class Obstacle extends Actor
{
    abstract void createnew();
    abstract void maju();

    void eated(){
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
            Counter2.add(-1);
            eated();
        }
        if(Counter2.value==0){
           getWorld().removeObject(this);
        }
    }    
}
