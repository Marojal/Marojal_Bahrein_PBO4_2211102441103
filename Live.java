import greenfoot.*;  

public class Live extends PowerUp
{
    void createnew(){
        Live lv = new Live();
        getWorld().addObject(lv,Greenfoot.getRandomNumber(600),0);
    }
    void maju(){
        setLocation(getX(), getY()+3);
    } 
    public void act(){
        super.act();
    }    
}
