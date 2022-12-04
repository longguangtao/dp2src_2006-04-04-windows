package ProducerConsumer.Q5_7;

public class Host {
    
    static boolean flag = false;

    public static void execute(int count) throws InterruptedException {
        for (int i = 0; i < count; i++) {
            doHeavyJob();
            
            if (flag) {
                Thread.sleep(10000);
            }
           
        }
    }

    private static void doHeavyJob() {
        // 下面代码用于表示"无法取消的繁重处理"（循环处理约10秒）
        System.out.println("doHeavyJob BEGIN");
        long start = System.currentTimeMillis();
        while (start + 10000 > System.currentTimeMillis()) {
            // busy loop
        }
        System.out.println("doHeavyJob END");
    }
}
