package Constructors;

public class Democlass {
	int no;
	String name;
	//defulat constructor
	public ClassDemo(){
		no=1;
		name="pooja";
	}
	//parameterised
	ClassDemo(int no,String nm){
		this.no=no;
		name=nm;
	}
	ClassDemo(String nm){
		name=nm;
	}
	//copy Constrctor
	ClassDemo(ClassDemo d){
		no=d.no;
		name=d.name;
	}
	void display() {
		System.out.println("No : "+no+"  "+"Name:" +name);
}}
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
