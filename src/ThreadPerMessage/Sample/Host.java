package ThreadPerMessage.Sample;

public class Host {
    // private final Helper helper = new Helper();
    public void request(final int count, final char c) {
        System.out.println("    request(" + count + ", " + c + ") BEGIN");

        HelperThread helperThread = new HelperThread(count, c);
        helperThread.execute();

        System.out.println("    request(" + count + ", " + c + ") END");
    }
}
