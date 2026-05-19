



public class WeeklyBudgetChallenge extends Challenge {
    public double budgetLimit;

    public WeeklyBudgetChallenge(String title, double budgetLimit) {
        super(title);
        this.budgetLimit = budgetLimit;
    }

    @Override
    public void checkChallenge(double spending) {
        if (spending <= budgetLimit) {
            this.isCompleted = true;
        }
    }
}