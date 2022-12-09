package TwoPhaseTermination.Q10_5;

public class Service {
    private static volatile boolean flag = true;
    
    // 开始运行服务
    public static void service() {
        try {
            while (flag) {

                System.out.print("service");
                
                for (int i = 0; i < 50; i++) {
                    System.out.print(".");
                    Thread.sleep(100);
                    // Thread.currentThread().interrupt();
                    if (!flag) {
                        Thread.currentThread().interrupt();
                    }
                }
                return;
            }
            Thread.currentThread().interrupt();
        } catch (InterruptedException e) {
        } finally {
            System.out.println("done.");
        }

    }

    // 停止服务
    public static void cancel() {
        // 未实现
        flag = false;
        System.out.println("cancel.");
    }
}
