
package personalfinancegamification;
import java.time.LocalDateTime;

public interface ISyncable {
    void  sync();                      //update from an external source 
    LocalDateTime getLastSyncTime();   //for upadate time
    String getSyncStatus();            //for updte case
    
}
