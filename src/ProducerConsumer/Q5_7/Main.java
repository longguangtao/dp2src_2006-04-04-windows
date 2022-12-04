package ProducerConsumer.Q5_7;

/**
 * Auther: Longguangtao
 * Date: 2022年12月04日 17:52:16
 **/
public class Main {
    public static void main(String[] args) throws InterruptedException {

        

        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                try {
                    Host.execute(10000);
                } catch (InterruptedException e) {
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        Thread.sleep(10000);

        Host.flag = true;

        Thread.sleep(10000);
        
        thread.interrupt();

    }
}
