package ActiveObject.Sample.activeobject;

import java.math.BigDecimal;

class Servant implements ActiveObject {
    public Result<String> makeString(int count, char fillchar) {
        char[] buffer = new char[count];
        for (int i = 0; i < count; i++) {
            buffer[i] = fillchar;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
        return new RealResult<String>(new String(buffer));
    }

    public void displayString(String string) {
        try {
            System.out.println("displayString: " + string);
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
    }

    @Override
    public Result<String> add(String x, String y) {
        try {
            BigDecimal a = new BigDecimal(x);
            BigDecimal b = new BigDecimal(y);
            return new RealResult<String>(a.add(b).toString());
        } catch (Exception e) {
            return null;
        }
    }
}
