package corejava;

public class ClassDemo {
	int no;
	int id;
	int Degree;
	String name;
	void display()
	{System.out.println("NO : "+no+" "+"Name :" +name);}
	
	//parameterized
	ClassDemo(int no,String nm){
		this.no=no;
		name=nm;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassDemo d=new ClassDemo(0, "sha");
		d.no=10;
		d.name="shaa";
		d.display();
		

	}

}
