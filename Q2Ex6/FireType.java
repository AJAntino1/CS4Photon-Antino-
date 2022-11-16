package exercise06photonantinoaj;

public class FireType extends Monster{
    
    public FireType(String name, int hp, int base){
        super("f", "fire", "grass", "water", 100, 10);
        
    }
    
    @Override
    public void special(){
        super.special();
        getAtk();
        
    }
}
