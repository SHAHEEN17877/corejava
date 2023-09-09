package collectionframework;

public class Employee11 implements Comparable<Employee11> {
	private String name;
	private double salary;
	

	public Employee11(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public static void main(String[]args) {}
	
 //  @Override
	public int compareTo(Employee11 employee) {
		
	   if(this.getSalary() > employee.getSalary()) {
		   return 1;
	   }else if(this.getSalary() < employee.getSalary()) {
		   return -1;
	   }
	   else {
		   return 0;
	   }
		}}
