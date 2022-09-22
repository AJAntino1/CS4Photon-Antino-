package exercise3;

public class Singer {
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    private double numberOfPeople;
    
    
    public void performForAudience(double n) {
        noOfPerformances += 1;
        earnings += 100;
    }
    
    public void changeFavSong() {
        
    }
}
