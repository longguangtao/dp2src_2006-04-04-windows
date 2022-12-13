package ActiveObject.Q12_2a;

import ActiveObject.Sample.activeobject.ActiveObject;
import ActiveObject.Sample.activeobject.ActiveObjectFactory;

public class Main {
    public static void main(String[] args) {
        ActiveObject activeObject = ActiveObjectFactory.createActiveObject();
        new AddClientThread("Diana", activeObject).start();
    }
}
