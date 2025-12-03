package test_Threads;

/*
 * Thread represents a single, independent path of execution within a program.
 * Java is a multi-threaded language, meaning a single program can have multiple threads running concurrently, allowing for multitasking and improved responsiveness
 
 * Normally, main method will executes the other methods one by one.
 * But It will run the threads Concurrently (Parallel).
  
 * If we extends any class with Thread class, It will become a Thread and it should have run() method.
 
 *  There are two primary ways to create a thread in Java: 
               Extending the Thread Class.
               Implementing the Runnable Interface: This is generally preferred as it allows your class to extend another class if needed.
 */

public class Test_ThreadConcept extends Thread {

	public void run() {
		for (int i = 1; i < 100; i++) {
			System.out.println("Thread running by extending Parent Thread class."+currentThread());

			try {
				Thread.sleep(10); // sleep method will go to waiting stage once it executed the 1st line.. here it
									// waits for 10 milliseconds to execute next line
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		Test_ThreadConcept obj = new Test_ThreadConcept();
		obj.start(); // Starts the thread, calling the run() method

		C1 obj1 = new C1();
		obj1.start();

	}

}

class C1 extends Test_ThreadConcept {
	public void run() {
		for (int i = 1; i < 100; i++) {
			System.out.println("Thread running by extending Child Thread class."+currentThread());

			try {
				Thread.sleep(10); // sleep method will stop for 50 millisecond once executed one line
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
