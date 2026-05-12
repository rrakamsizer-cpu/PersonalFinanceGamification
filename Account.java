
package personalfinancegamification;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Account implements ISyncable {
    private double balance;                         //encapsulation
    private String id;
    private String institutionName;
    private String currency;
    protected LocalDateTime lastSyncTime;
    
    
    public Account(String id, String institutionName,double initialBalance, String currency ){
        this.id=id;
        this.institutionName=institutionName;
        this.balance=balance;
        this.currency=currency;
        this.lastSyncTime=LocalDateTime.now();
    }
    //to invest money
    public void credit (double amount){
        if(amount>0){
            this.balance+=amount;
        }
    }
    //withdraw money from the acc
    public void debit(double amount)throws Exception{
        if(amount>this.balance){
            throw new Exception("No enough balance"+ id);
        }
        this.balance-=amount;
    }
    public double getBalance(){
        return balance;
    }
    public String getId(){
        return id;
    }
    public String getCurrency(){
        return currency;
    }
    
}
