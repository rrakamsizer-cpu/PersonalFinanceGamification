

public class GamificationEngine {
    private int userXP;
    private String userLevel;

    public GamificationEngine() {
        this.userXP = 0;
        this.userLevel = "Rookie";
    }

    public void addXP(int points) {
        if (points > 0) {
            this.userXP += points;
            System.out.println("Coach Nudge: +" + points + " XP earned!");
            
            if (this.userXP >= 100) {
                this.userLevel = "Saver";
            }
        }
    }

    public int getUserXP() { return this.userXP; }
    public String getUserLevel() { return this.userLevel; }
}