package ActiveObject.Sample.activeobject;

/**
 * Auther: Longguangtao
 * Date: 2022年12月13日 16:06:37
 **/
public class AddRequest extends MethodRequest<String>{
    private final String x; 
    private final String y;
    
    public AddRequest(Servant servant, FutureResult<String> future, String x, String y) {
        super(servant, future);
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
        Result<String> result = servant.add(x, y);
        future.setResult(result);
    }

}
