package ThreadPerMessage.Sample;

/**
 * Auther: Longguangtao
 * Date: 2022年12月06日 16:21:25
 **/
public class HelperThread{
    private Helper helper = new Helper();
    private final int count;
    private final char c;

    private final Runnable runnable = new Runnable() {

        @Override
        public void run() {
            helper.handle(count, c);
        }
        
    };

    public HelperThread(int count, char c) {
        this.count = count;
        this.c = c;
    }

    public void execute() {
        new Thread(runnable).start();;
    }
    
}
