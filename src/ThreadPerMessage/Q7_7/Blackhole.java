package ThreadPerMessage.Q7_7;

public class Blackhole {
    public static void enter(Object obj) {
        System.out.println("Step 1");
        magic(obj);
        System.out.println("Step 2");
        synchronized (obj) {
            System.out.println("Step 3 (never reached here)"); // 不会执行到这里
        }
    }

    // （接下来请完成magic方法的编写）
    public static void magic(Object obj) {
        synchronized (obj) {
            new Thread(new Runnable() {
                public void run() {
                    synchronized (obj) {
                        while(true);
                    }
                }
            }).start();
        }
            
        // try {
        //     Thread.sleep(1000);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

    }

}
