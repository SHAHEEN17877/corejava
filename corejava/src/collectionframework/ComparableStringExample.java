package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

 class StudentComparator {
	int rollno;
	String name,address;

	public StudentComparator(int rollno, String name, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "StudentComparator [rollno=" + rollno + ", name=" + name + ", address=" + address + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	//class2
	class sortbyroll implements Comparator<StudentComparator>{

	

	@Override
	public int compare(StudentComparator o1, StudentComparator o2) {
		// TODO Auto-generated method stub
		return o1.rollno-o2.rollno;
	}}
	//class 3
	class sortbyname implements Comparator<StudentComparator>{

		@Override
		public int compare(StudentComparator a, StudentComparator b) {
			// TODO Auto-generated method stub
			return a.name.compareTo(b.name);
		}
	}
		//class 3
		class sortbyaddress implements Comparator<StudentComparator>{

			@Override
			public int compare(StudentComparator c, StudentComparator d) {
				// TODO Auto-generated method stub
				return c.address.compareTo(d.address);
			}
	
		}}
		public class ComparableStringExample{
			public static void main(String[] args) {
				// TODO Auto-generated method stub
        ArrayList<StudentComparator> ar=new ArrayList<StudentComparator>();
        ar.add(new StudentComparator(111,"shaheen","shaikh"));
        ar.add(new StudentComparator(112,"shaheeda","shakh"));
        ar.add(new StudentComparator(113,"laila","mulla"));
        ar.add(new StudentComparator(116,"asma","mujavar"));
        ar.add(new StudentComparator(114,"rehana","saiyad"));
        ar.add(new StudentComparator(118,"muskan","mulla"));
      //  Collections.sort(ar,new sortbyname());
			}
			}
		
		
	
	



