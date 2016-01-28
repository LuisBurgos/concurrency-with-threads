public class DemoJoin {

    public static void main(String[] args){
        NewThread4 obj1 = new NewThread4("One");
        NewThread4 obj2 = new NewThread4("Two");
        NewThread4 obj3 = new NewThread4("Three");

        System.out.println("Thread One is alive: " + obj1.t.isAlive());
        System.out.println("Thread Two is alive: " + obj2.t.isAlive());
        System.out.println("Thread Three is alive: " + obj3.t.isAlive());

        //Wait threads to finish.
        try{
            System.out.println("Waiting for threads to finish.");
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        } catch (InterruptedException e){
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Thread One is alive: " + obj1.t.isAlive());
        System.out.println("Thread Two is alive: " + obj2.t.isAlive());
        System.out.println("Thread Three is alive: " + obj3.t.isAlive());
        System.out.println("Main thread exiting.");

    }

}
