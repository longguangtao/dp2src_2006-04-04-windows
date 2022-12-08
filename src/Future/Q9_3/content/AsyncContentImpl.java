package Future.Q9_3.content;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Auther: Longguangtao
 * Date: 2022年12月08日 15:40:44
 **/
public class AsyncContentImpl extends FutureTask<SyncContentImpl> implements Content {

    public AsyncContentImpl(Callable<SyncContentImpl> callable) {
        super(callable);
    }

    @Override
    public byte[] getBytes() {
        try {
            return get().getBytes();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
