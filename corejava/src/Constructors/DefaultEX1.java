//usage of static variable
package Constructors;

public class DefaultEX1 {
	static String name="pooja";
	static String degree="BCA";
	DefaultEX1(String deg){
		degree=deg;
		
	}
   static void displayName() {
    	System.out.println("my name : "+name);
    	System.out.println("Degree :"+degree );
    }
   public static void main(String[]args) {
	//DefaultEX1 d=new DefaultEX1();
	//d.degree="fifth";
	//d.displayName();
	  // DefaultEX1.degree="deg";
	   displayName();
	   
	
}}
