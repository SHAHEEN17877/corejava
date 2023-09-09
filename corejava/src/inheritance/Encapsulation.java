package inheritance;

public class Encapsulation {
	private int rollno;
	private String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 Encapsulation(int rollno,String name){}
		//super();
		public static void main(String[]args) {
		Encapsulation e=new Encapsulation(10,"sha");
		e.setRollno(7);
		e.setName("shaa");
		System.out.println(e.getName());
		System.out.println(e.getRollno());
	}

}
