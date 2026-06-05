public class SavingsStreakChallenge extends Challenge {
    private int requiredDays; // Görevin tamamlanması için gereken gün sayısı (Örn: 7 gün)

    public SavingsStreakChallenge(String title, int requiredDays) {
        // super ile Challenge sınıfına görevin adını paslıyoruz
        this.title = title; // Veya ana sınıfın constructor yapısına göre super(title);
        this.requiredDays = requiredDays;
        this.isCompleted = false;
    }

    // Challenge sınıfındaki abstract olan checkChallenge metodunu ezmek (Override) zorundayız!
    @Override
    public void checkChallenge(double currentStreakDays) {
        // Eğer kullanıcının birikim serisi günü gereken günden büyük veya eşitse
        if (currentStreakDays >= requiredDays) {
            this.isCompleted = true;
        }
    }
}