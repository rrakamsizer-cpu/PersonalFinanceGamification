import java.time.LocalDateTime;
public class CheckingAccount extends Account{
    private double overdraftLimit;
    
    public CheckingAccount(String id, String institutionName, double balance, String currency, double overdraftLimit) {
        super(id, institutionName, balance, currency);
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    public void sync() {
        // Bank API senc simulation
        this.lastSyncTime = LocalDateTime.now();
        System.out.println(getId() + " nolu vadesiz hesap güncellendi.");
    }
    @Override
    public LocalDateTime getLastSyncTime() { 
        return lastSyncTime; 
    }

    @Override
    public String getSyncStatus() { 
        return "SUCCESS"; 
    }
}
