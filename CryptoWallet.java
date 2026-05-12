import java.time.LocalDateTime;
public class CryptoWallet extends Account{
    private String walletAddress;

    public CryptoWallet(String id, String institutionName, double balance, String currency, String walletAddress) {
        super(id, institutionName, balance, currency);
        this.walletAddress = walletAddress;
    }
    @Override
    public void sync() {
        // Blockchain ağ tarama simülasyonu
        this.lastSyncTime = LocalDateTime.now();
        System.out.println(walletAddress + " adresli cüzdan blockchain üzerinden güncellendi.");
    }
    @Override
    public LocalDateTime getLastSyncTime() { 
        return lastSyncTime; 
    }

    @Override
    public String getSyncStatus() { 
        return "CONNECTED"; 
    }
    
}
