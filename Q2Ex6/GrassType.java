package exercise06photonantinoaj;

public class GrassType extends Monster{
    
    public GrassType(String name, int hp, int base){
        super("g", "grass", "water", "fire", hp, base);
        this.atk = base;
        this.def = base;
    }
    
    @Override
    public void special(){
        super.special();
        this.hp = (int) (hp + maxHP*0.2);
        System.out.println(name + hp);
    }
    
    public void rest(){
        this.hp = (int) (hp + maxHP*0.5);
        System.out.println(name + "'s HP is now " + hp);
    }
}

