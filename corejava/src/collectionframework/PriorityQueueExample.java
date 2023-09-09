package collectionframework;

import java.util.PriorityQueue;

 class Employee implements Comparable<Employee> {
	 private String name;
	 private double salary;
	 public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
    public String getName() {
		return name;
	}
   public void setName(String name) {
		this.name = name;
	}
   public double getSalary() {
		return salary;
	}
   public void setSalary(double salary) {
		this.salary = salary;
	}
   public String toString() {
	   return "Employee{+name="+name+'\''+", salary="+salary+'}';
   }
   @Override
   public int  compareTo(Employee employee) {
       if(this.getSalary() > employee.getSalary()) {
           return 1;
       } else if (this.getSalary() < employee.getSalary()) {
           return -1;
       } else {
           return 0;
       }	
   }
   public class PriorityQueueExample{
   public static void main(String[] args) {
		// TODO Auto-generated method stub
  PriorityQueue<Employee> employeePriorityQueue=new PriorityQueue<Employee>();
   employeePriorityQueue.add(new Employee("sadaf",100000.00));
   employeePriorityQueue.add(new Employee("saniya",20000.00));
   employeePriorityQueue.add(new Employee("mirja",50000.00));
   employeePriorityQueue.add(new Employee("rehana",248000.00));
   System.out.println(employeePriorityQueue);
   for(Employee e:employeePriorityQueue) {
	   System.out.println(e);
   }
   
   //while (!employeePriorityQueue.isEmpty()) {
    //   System.out.println(employeePriorityQueue.remove());
   }
   
	}

}
