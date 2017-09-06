class Runner implements Runnable{
	
	private Thread t;
	private String threadName;

	Runner(String threadName){
		this.threadName = threadName;
		System.out.println("Initiating " + threadName);
	}

	public void run(){
		System.out.println("Running " + threadName);
		try{
			for(int i = 0; i < 5; i++){
				System.out.println(i + " by " + threadName);
				Thread.sleep(50);
			}
		}
		catch(InterruptedException e){
			System.out.println("Interrupted Thread: " + threadName);
		}
		System.out.println("Exiting " + threadName);
	}

	public void start(){
		System.out.println("Starting " + threadName);
		if(t == null){
			t = new Thread(this, threadName);
			t.start();
		}
	}
}

class TestThread{
	public static void main(String[] args) {
		Runner t1 = new Runner("Thread 1");
		t1.start();
		Runner t2 = new Runner("Thread 2");
		t2.start();
	}
}