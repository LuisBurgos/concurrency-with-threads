/**
 *
 * @author Antonio
 */
public class Clicker implements Runnable {

    public int click = 0;
    public Thread t;
    private volatile boolean running = true;

    public Clicker(int p) {
        t = new Thread(this);
        t.setPriority(p);
    }

    @Override
    public void run() {
        while(running) {
            click++;
        }
    }

    public void stop() {
        running = false;
    }

    public void start() {
        t.start();
    }
}
