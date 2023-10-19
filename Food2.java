import greenfoot.*;  

public class Food2 extends Food
{
    void createnew(){
        Food2 food2 = new Food2();
        getWorld().addObject(food2,Greenfoot.getRandomNumber(600),0);
    }
    void maju(){
        setLocation(getX(), getY()+3);
    } 
    public void act(){
        super.act();
    }    
}
