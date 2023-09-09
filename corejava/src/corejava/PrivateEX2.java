package corejava;

 class Privateclass {
	private int b=20;
	private String name;
	public void displayB() {
		System.out.println("Vlaue of B: "+b);
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
}
	public class PrivateEX2{
		private int a=10;
		private void diplay() {
			System.out.println("vaue of a: "+a);
			
		}
	  public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Privateclass p1 = new Privateclass();
		  p1.displayB();
		  p1.setName("edubridge");
		  System.out.println("Name :"+p1.getName());
		  PrivateEX2 p2= new PrivateEX2();
		  p2.diplay();
	  }}
