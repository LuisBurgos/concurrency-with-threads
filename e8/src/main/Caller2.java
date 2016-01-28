package principal;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PIX
 */
public class Caller2 implements Runnable {

    String msg;
    CallMe2 target;
    Thread t;
    
//    static int counter = 0;
//    static String prevAcum = "";
//    static String acum = "";
    public Caller2(CallMe2 targ, String s) {
//        counter++;
//        acum += s;
//        prevAcum += s;
//        if(counter % 3 == 0){
//            if(!acum.equals(prevAcum)){
//                System.err.println("LALALALA"); 
//            }
//            acum = "";
//        }
        
        
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
        try {
            t.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Caller2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //synchorize calls to call()
    @Override
    public void run() {
        synchronized (target) { //synchonized block
            target.call(msg);
        }
    }

}
