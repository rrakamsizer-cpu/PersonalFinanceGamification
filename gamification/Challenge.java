
package gamification;

public class Challenge {
    public String title;
    public boolean isCompleted;

    public Challenge(String title) {
        this.title = title;
        this.isCompleted = false;
    }

    public void checkChallenge(double spending) {
        // Empty base method
    }
}