package GuardedSuspension.QThreeFive;

public class Main {
    public static void main(String[] args) {
        RequestQueue requestQueue1 = new RequestQueue();
        RequestQueue requestQueue2 = new RequestQueue();
        requestQueue1.putRequest(new Request("阿A"));
        requestQueue1.putRequest(new Request("阿B"));
        new TalkThread(requestQueue1, requestQueue2, "Alice").start();
        new TalkThread(requestQueue2, requestQueue1, "Bobby").start();
    }
}
