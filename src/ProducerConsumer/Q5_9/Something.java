package ProducerConsumer.Q5_9;

public class Something {
    public static void method(long x) throws InterruptedException {
        if (x != 0) {
            Object object = new Object(); // 获取唯一的对象锁
            synchronized (object) {
                object.wait(x); // 线程 wait 指定的 x 的时间
            }
        }
    }
}
