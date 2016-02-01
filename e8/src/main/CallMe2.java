package principal;

/**
 *
 * @author PIX
 */
public class CallMe2 {
    void call(String msg){
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) 
        {
            System.out.println("Interrupted");
        }
        System.out.print("]" + "\n");
    }
}
