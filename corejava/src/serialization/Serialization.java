package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) throws IOException {
		Employei e=new Employei();
		e.id=4567;
		e.name="shaheen";
		FileOutputStream fos=new FileOutputStream("emp.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e);
		System.out.println("data inserted in file");
		oos.close();

	}

}
