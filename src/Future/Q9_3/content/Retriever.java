package Future.Q9_3.content;

import java.util.concurrent.Callable;

public class Retriever {
    public static Content retrieve(String urlstr) {
        AsyncContentImpl asyncContentImpl = new AsyncContentImpl(new Callable<SyncContentImpl>() {
            
            @Override
            public SyncContentImpl call() throws Exception {
                return new SyncContentImpl(urlstr);
            }
            
        });
        
        new Thread(asyncContentImpl).start();
        
        return asyncContentImpl;
    }

    // 单线程执行
    // public static Content retrieve(String urlstr) {
    //     return new SyncContentImpl(urlstr);
    // }
}
