package exercise06photonantinoaj;

public class Main {
    
    public static void main(String[] args){
        FireType fTest = new FireType("Carrot", 100, 10);
        GrassType gTest = new GrassType("Herb", 100, 10);
        WaterType wTest = new WaterType("Blizzard", 100, 10);
        fTest.attack(gTest);
    }
}
