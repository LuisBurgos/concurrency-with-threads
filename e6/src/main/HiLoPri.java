/**
 *
 * @author Antonio
 */
public class HiLoPri {
    public static void main(String[] args) {
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        Clicker hi = new Clicker(Thread.NORM_PRIORITY);
        Clicker lo = new Clicker(Thread.NORM_PRIORITY - 2);

        hi.start();
        lo.start();

        try {
            Thread.sleep(5000);
        } catch(InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        lo.stop();
        hi.stop();

        //Wait for child threads to terminate
        try {
            hi.t.join();
            lo.t.join();
        } catch(InterruptedException e) {
            System.out.println("InterruptedException caught");
        }

        System.out.println("Low-priority thread: " + lo.click);
        System.out.println("High-priority thread: " + hi.click);
    }
}
