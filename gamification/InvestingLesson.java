

// InvestingLesson IS-A Lesson
public class InvestingLesson extends Lesson {
    public String content;

    public InvestingLesson(String title, int xpReward, String content) {
        super(title, xpReward); // Calls the parent constructor
        this.content = content;
    }

    @Override
    public void startLesson() {
        super.startLesson();
        System.out.println("Lesson Content: " + this.content);
        System.out.println("Tip: Compound interest is the 8th wonder of the world!");
    }
}