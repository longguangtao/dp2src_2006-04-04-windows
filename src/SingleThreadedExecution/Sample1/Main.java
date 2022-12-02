package SingleThreadedExecution.Sample1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing Gate, hit CTRL+C to exit.");
        Gate gate = new Gate();
        new UserThread(gate, "Alice", "Alaska").start();
        new UserThread(gate, "Bobby", "Brazil").start();
        new UserThread(gate, "Chris", "Canada").start();
        new UserThread(gate, "Dhris", "Danada").start();
        new UserThread(gate, "Ehris", "Eanada").start();
        new UserThread(gate, "Fhris", "Fanada").start();
        new UserThread(gate, "Ghris", "Ganada").start();
        new UserThread(gate, "Hhris", "Hanada").start();
        new UserThread(gate, "Nhris", "Nanada").start();
        new UserThread(gate, "Mhris", "Manada").start();
    }
}
