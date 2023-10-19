import greenfoot.*;  

public class Food1 extends Food
{
    void createnew(){
        Food1 food1 = new Food1();
        getWorld().addObject(food1,Greenfoot.getRandomNumber(600),0);
    }
    void maju(){
        setLocation(getX(), getY()+3);
    } 
    public void act(){
        super.act();
    }    
}
