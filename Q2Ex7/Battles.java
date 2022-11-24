package exercise06photonantinoaj;

public class Battles {
    
    public static void main(String[] args){
        FireType fire = new FireType("Charmander", 100, 40);
        GrassType grass = new GrassType("Bulbasaur", 100, 40);
        WaterType water = new WaterType("Squirtle", 100, 40);
        
        System.out.println("First Battle: Grass vs Fire");
        while(grass.getHP() > 0 || fire.getHP() > 0){
            if(fire.getHP() <= 0 || grass.getHP() <= 0){
                break;
            } else {
                grass.attack(fire);
                fire.attack(grass);
            }
        }
        grass.restoreHealth();
        fire.restoreHealth();
        
        System.out.println("\nSecond Battle: Fire vs Water");
        while(fire.getHP() > 0 || water.getHP() > 0){
            if(water.getHP() <= 0 || fire.getHP() <= 0){
                break;
            } else {
                fire.attack(water);
                water.attack(fire);
            }      
        }
        fire.restoreHealth();
        water.restoreHealth();
        
        System.out.println("\nThird Battle: Water vs Grass");
        while(water.getHP() > 0 || grass.getHP() > 0){
            if(grass.getHP() <= 0 || water.getHP() <= 0){
                break;
            } else {
                water.attack(grass);
                grass.attack(water);
            }      
        }
        water.restoreHealth();
        grass.restoreHealth();
        
    }
}