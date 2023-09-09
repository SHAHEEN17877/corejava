package corejava;
public class InstanceVariable {
	//instance variable
	int a;
	int b;
	int c;
	int z;
	//static variable
	static String d="sha";
	
	
	public int add(int first,int second) {
		//local variable 
		a=first;
		 b=second;
		 c=a+b;
		 return c;
	}

	public static void main(String[] args) {
	InstanceVariable a=new InstanceVariable();	
	

	}

}
