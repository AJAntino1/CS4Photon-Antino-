package exercise06photonantinoaj;

public class WaterType extends Monster{
    
    public WaterType(String name, int hp, int base){
        super(name, "water", "fire", "grass", hp, base);
        this.atk = (int) (base*0.7);
        this.def = (int) (base*1.3);
    }
    
    @Override
    public void special(){
        super.special();
        this.def = def + 2;
        this.hp = (int) (hp - maxHP*0.1);
        System.out.println(name + "'s Def is now " + def);
        System.out.println(name + "'s HP is now " + hp);
    }
}

