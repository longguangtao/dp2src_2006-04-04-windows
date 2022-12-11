package ThreadSpecificStorage.Q11_6;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class Main {
    private static final int TASKS = 10;
    public static void main(String[] args) {
        // 要运行的服务
        ExecutorService service = Executors.newFixedThreadPool(3);
        try {
            for (int t = 0; t < TASKS; t++) {
                // 写日志的任务
                Runnable printTask = new Runnable() {
                    public void run() {
                        Log.println("Hello!");
                    }
                };
                // 执行任务
                service.execute(printTask);
            }
            Log.close();
        } finally {
            service.shutdown();
        }
    }
}
