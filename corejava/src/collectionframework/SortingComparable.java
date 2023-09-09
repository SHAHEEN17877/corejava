package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Employeee implements Comparable<Employeee> {
	private String name;
	private double salary;

	public Employeee(String name, double salary) {
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

	public int compareTo(Employeee o) {
		return this.name.compareTo(o.name);
	}
}

public class SortingComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employeee> employee=new ArrayList<Employeee>(Arrays.asList());
		new Employee("shaheen", 2000);
		new Employee("sha", 8000);
		new Employee("asma", 2040);
		new Employee("prema", 4400);
        Collections.sort(employee);
   for(Employeee e:employee)
    {
	System.out.println(e.getName()+" "+e.getSalary());

	}

}}
