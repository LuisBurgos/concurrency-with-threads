import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PIX
 */
public class Caller2 implements Runnable {

    public String mMessage;
    public CallMe2 mTarget;
    public Thread mThread;

    public Caller2(CallMe2 target, String message) {
        mTarget = target;
        mMessage = message;
        mThread = new Thread(this);
        mThread.start();
        try {
            mThread.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Caller2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //synchorize calls to call()
    @Override
    public void run() {
        synchronized (mTarget) { //synchonized block
            mTarget.call(mMessage);
        }
    }
}
