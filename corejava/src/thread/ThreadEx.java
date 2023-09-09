//using inheritance
package thread;

class Threadone extends Thread {
	public void run() {
		System.out.println("Thread1");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}
}

class Threadtwo extends Thread {
	public void run() {
		System.out.println("Thread2");
		for (int i = 11; i < 25; i++) {
			System.out.println(i);
		}

	}
}
class mul extends Thread{
public void run() {
	int num=5;
	for(int i=0;i<=10;i++) {
		System.out.println(num+"*" +i+ "=" +num*i);
	}
		
	}
}
class evenodd extends Thread{
	public void run() {
		int n=4;
		if(n%2==0) {
			System.out.println("number is even:"+n);
		}else
			{
				System.out.println("number is odd:"+n);
			}
		}
	}
class Fibonacci extends Thread{
	public void run() {
		int num=12;
		int f1=0,f2=1,f3;
		for(int i=1;i<=num;i++) {
			f3=f1+f2;
			System.out.println(+f3);
			f1=f2;
			f2=f3;
		}
	}
}
public class ThreadEx {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Threadone t = new Threadone();
			Threadtwo t1 = new Threadtwo();
			mul t2=new mul();
			t2.setName("multiplication");
			t2.setPriority(Thread.MAX_PRIORITY);
			System.out.println("thread name:"+t2.getName());
			System.out.println("thread priority :"+t2.getPriority());
			evenodd e=new evenodd();
			Fibonacci f=new Fibonacci();
			f.setPriority(Thread.MIN_PRIORITY);
			System.out.println("thread priority: "+f.getPriority());
			t.start();
			t1.start();
		    t2.start();
			e.start();
			f.start();
		}
		
	}

