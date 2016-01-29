/**
 *
 * @author PIX
 */
public class CallMe2 {
    public void call(String msg){
        System.out.print("[" + msg);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e)
        {
            System.out.println("Interrupted");
        }
        System.out.print("]" + "\n");
    }
}
