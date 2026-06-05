package gamification;

public class Main {
    public static void main(String[] args) {
        // 1. Initialize the engine
        GamificationEngine engine = new GamificationEngine();
        System.out.println("Current Level: " + engine.getUserLevel());

        System.out.println("\n--- Step 1: Education Module ---");
        // User takes an investing lesson
        InvestingLesson lesson = new InvestingLesson("Compound Interest 101", 50, "Compound interest makes your money work for you.");
        lesson.startLesson();
        engine.addXP(lesson.xpReward); // Award XP for finishing the lesson

        System.out.println("\n--- Step 2: Weekly Challenge ---");
        // User tries to complete a spending challenge
        WeeklyBudgetChallenge challenge = new WeeklyBudgetChallenge("Weekly Grocery Challenge", 150.0);
        double amountSpent = 120.0; // Simulated spending from your group mate's code
        
        challenge.checkChallenge(amountSpent);

        if (challenge.isCompleted) {
            System.out.println("Success! Completed: " + challenge.title);
            engine.addXP(100); // Award XP for completing the challenge
        }

        System.out.println("\n--- Final Status ---");
        System.out.println("Total XP: " + engine.getUserXP());
        System.out.println("New Level: " + engine.getUserLevel());
    }
}