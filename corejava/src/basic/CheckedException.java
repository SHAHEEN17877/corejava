package basic;

public class CheckedException {
	public static void main(String[]args) {
		try {
			Class.forName("basic.Deepcopy");
			System.out.println("class found");
			
		}catch(ClassNotFoundException e) {
			System.out.println("class not found : "+e);
		}
		finally {
			System.out.println("executed ");
		}
		}
	}


