public class BudgetingLesson extends Lesson {
    private String budgetRuleTip; // Bütçe dersine özel bir ipucu (Örn: 50-30-20 kuralı)

    public BudgetingLesson(String title, int xpReward, String lessonContent, String budgetRuleTip) {
        // super() ile ders adı ve XP ödülünü ana sınıfa (Lesson) gönderiyoruz
        super(title, xpReward); 
        this.budgetRuleTip = budgetRuleTip;
    }

    // Senin Lesson sınıfında yazdığın startLesson() metodu varsa onu kullanabilir
}
