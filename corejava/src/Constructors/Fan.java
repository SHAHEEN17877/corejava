package Constructors;


public class Fan  {
	int no_of_wings;
	String brand;
	String color;
	
	 public Fan(){
		//super
		 }
	 public Fan(int a) {
		 //super
		 no_of_wings=a;
	 }
	 public Fan(int a,String b) {
		 no_of_wings=a;
		 color=b;
	 }
	 public Fan(String a,int b) {
		 //super()
		 brand=a;
		 no_of_wings=b;
	 }
	 public Fan(int a,String b,String c) {
		 no_of_wings=a;
		 brand=b;
		 color=c;
	 }
	 public Fan(String x,String y,int z) {
		 //super
		 color=x;
		 brand=y;
		 no_of_wings=z;
	 }
	 public Fan(String a,int b,String c) {
		 {
			 color=a;
			 no_of_wings=b;
			 brand=c;
		 }
		 
		 }
	 }


