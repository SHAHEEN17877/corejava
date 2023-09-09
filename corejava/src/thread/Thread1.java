//using interface
package thread;

public class Thread1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread");
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub
Thread1 t1=new Thread1();
Thread t=new Thread(t1);
t.start();
}}
