package ThreadPerMessage.Q7_3;

import ThreadPerMessage.Sample.Helper;

public class Host {
    private final Helper helper = new Helper();
    public void request(final int count, final char c) {
        System.out.println("    request(" + count + ", " + c + ") BEGIN");
        new Thread() {
            public void run() {
                helper.handle(count, c);
            }
        }.run(); // 如何使用 run 只是主线程（单线程）执行方法
        System.out.println("    request(" + count + ", " + c + ") END");
    }
}
