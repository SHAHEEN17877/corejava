package thread;
class Customer{
	int amount=10000;
	synchronized void withdraw(int amount) {
		System.out.println("Going to withdraw...");
		if(this.amount<amount) {
			System.out.println("less balance;waiting for deposite:");
			try {
				wait();
			}
			catch(Exception e) {
				
			}
		}
			this.amount-=amount;
			System.out.println("withdraw completed........."+this.amount);
		
		}
		synchronized void deposit(int amount) {
			System.out.println("going to deposite........");
			this.amount+=amount;
			System.out.println("deposite completed...."+this.amount);
			notify();
		}}
		
class Threadwithdraw extends Thread{
	Customer c;
	public Threadwithdraw(Customer c) {
		this.c=c;
	}
	public void run() {
	c.withdraw(400);	
	}
}
class Threaddeposite extends Thread{
	Customer c;
	public Threaddeposite(Customer c) {
		this.c=c;
	}
	public void run() {
	c.deposit(500);	
	}
}
public class BankingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Customer c=new Customer();
		Threadwithdraw tw=new Threadwithdraw(c);
		tw.start();
		Threaddeposite td=new Threaddeposite(c);
		td.start();
		//new Thread1() {
		//public void run() {
			//c.withdraw(50000);

		}

}
