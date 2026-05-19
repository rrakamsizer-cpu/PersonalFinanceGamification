


// Base class for all educational lessons
public class Lesson {
    public String title;
    public int xpReward;

    public Lesson(String title, int xpReward) {
        this.title = title;
        this.xpReward = xpReward;
    }

    // This will be overridden by specific lessons
    public void startLesson() {
        System.out.println("Starting lesson: " + this.title);
    }
}