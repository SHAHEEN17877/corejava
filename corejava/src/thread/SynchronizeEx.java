package thread;

class Multitable {
	synchronized void displayMultitable(int n) throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "*" + i + "=" + n * i);
			Thread.sleep(2000);
		}
	}

	synchronized void displayPower(int n) throws InterruptedException {
		int temp = 1;

		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "^" + i + "=" + temp * n);
			temp = temp * n;
			Thread.sleep(2000);
		}
	}
}

class Multi extends Thread {
	Multitable m1;

	public Multi(Multitable m1) {
		super();
		this.m1 = m1;
	}

	public void run() {
		try {
			m1.displayMultitable(2);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Multi1 extends Thread {
	Multitable m1;

	public Multi1(Multitable m1) {
		super();
		this.m1 = m1;
	}

	public void run() {
		try {
			m1.displayPower(2);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

	public class SynchronizeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multitable m=new Multitable();
		Multi mm=new Multi(m);
		Multi1 m1=new Multi1(m);
		mm.start();
		m1.start();
	}
}
