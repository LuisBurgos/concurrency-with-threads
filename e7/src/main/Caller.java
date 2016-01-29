import java.util.logging.Level;
import java.util.logging.Logger;

public class Caller implements Runnable {

    public String mMessage;
    public Callme mTarget;
    public Thread mThread;

    public Caller(Callme target, String message) {
        mTarget = target;
        mMessage = message;
        mThread = new Thread(this);
        mThread.start();        
    }

    @Override
    public void run() {
        mTarget.call(mMessage);
    }
}
