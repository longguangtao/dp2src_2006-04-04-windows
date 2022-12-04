package ProducerConsumer.Sample;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Table table = new Table(3);     // 创建一个能放置3个蛋糕的桌子
        MakerThread makerThread1 = new MakerThread("MakerThread-1", table, 31415);
        MakerThread makerThread2 = new MakerThread("MakerThread-2", table, 92653);
        MakerThread makerThread3 = new MakerThread("MakerThread-3", table, 58979);
        EaterThread eaterThread1 = new EaterThread("EaterThread-1", table, 32384);
        EaterThread eaterThread2 = new EaterThread("EaterThread-2", table, 62643);
        EaterThread eaterThread3 = new EaterThread("EaterThread-3", table, 38327);

        makerThread1.start();
        makerThread2.start();
        makerThread3.start();
        eaterThread1.start();
        eaterThread2.start();
        eaterThread3.start();

        Thread.sleep(10000);
        makerThread1.interrupt();
        makerThread2.interrupt();
        makerThread3.interrupt();
        eaterThread1.interrupt();
        eaterThread2.interrupt();
        eaterThread3.interrupt();
        
    }
}
