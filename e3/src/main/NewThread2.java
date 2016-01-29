import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a13116349
 */
public class NewThread2 extends Thread {

    public NewThread2() {
        super("Demo Thread");
        System.out.println("Chlid thread: " + this);
        start();
    }

    //This is the entry point for the second thread
    public void run() {
        try {
            for (int i = 10; i > 0; i--) {
                System.out.println("Child thread " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException ex) {
            System.out.println("Child interrupted");
        }
        System.out.println("Exiting child");
    }
}
