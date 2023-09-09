package Constructors;

public class DemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassDemo d=new ClassDemo();//default constructor
		d.no=10;
		d.name="dnfkd";
		d.display();
		System.out.println("-----------------------");
		ClassDemo d1=new ClassDemo(15,"lekha");
		d1.display();
		System.out.println("-----------------------");
		ClassDemo d2=new ClassDemo("vipul");
		d2.display();
		System.out.println("-----------------------");
		ClassDemo d3=new ClassDemo(d1);
		d3.display();
	}

	}

}
