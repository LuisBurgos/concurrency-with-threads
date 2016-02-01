package principal;

/**
 *
 * @author PIX
 */
public class Caller2 implements Runnable {

    String msg;
    CallMe2 target;
    Thread t;
    

    public Caller2(CallMe2 targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    //synchorize calls to call()
    @Override
    public void run() {
        synchronized (target) { //synchonized block
            target.call(msg);
        }
    }

}
