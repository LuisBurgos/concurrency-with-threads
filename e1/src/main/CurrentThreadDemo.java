public class CurrentThreadDemo{
	/**Creates a new instance of CurrentThreadDemo*/
	public CurrentThreadDemo(){

	}
	public static void main(String[] args) {
		Thread t= Thread.currentThread();
		System.out.println("Current thread " +t);
		t.setName("My Thread");
		System.out.println("After name changed " +t);
		try{
			for(int n=5;n>0;n--){
				System.out.println(n);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println("Main Thread Interrupted ");
		}
	}
}