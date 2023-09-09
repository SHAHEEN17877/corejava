package collectionframework;
class Student{

	int id;
	String name;
	int age;
	String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	void display() {
		System.out.println("Id:"+id+"Name: "+name+" Age:"+age+"City:"+city);
	}
	public class MethodChining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.setId(10);
		s.setName("shaheen");
		s.setAge(29);
		s.setCity("pune");
		s.display();

	}

	}}
