package collectionframework;
//using getter/setter
import java.util.HashSet;

class Department{
	int dId;
	String dName;
	//public Department(int dId, String dName) {
		//super();
		//this.dId = dId;
		//this.dName = dName;
	//}
	public String getDname() {
		return dName;
		
	}
	public void setDname(String name) {
		this.dName="musk";
		
	}
	
}

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Department>hs=new HashSet<>();
		Department on=new Department();
		on.setDname("HR");
		on.dId=4;
		hs.add(on);
		//hs.add(new Department(1,"sales"));
		//hs.add(new Department(2,"IT"));
		for(Department d:hs) {
			System.out.println(d.dId);
			System.out.println(d.dName);

		}
	}

}
