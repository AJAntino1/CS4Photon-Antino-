package exercise07photonantinoaj;

public class FireType extends Monster{
    
    public FireType(String name, int hp, int base){
        super(name, "fire", "grass", "water", hp, base);
        this.atk = (int) (base*1.3);
        this.def = (int) (base*0.7);
    }
    
    @Override
    public void special(){
        this.atk = atk + 2;
        this.hp = (int) (hp - maxHP*0.1);
        System.out.println(name + "increased their atk by 2 points. Their atk is now " + atk);
        System.out.println(name + "'s HP is now " + hp);
    }
}