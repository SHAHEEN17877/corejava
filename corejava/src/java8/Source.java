package java8;

@FunctionalInterface
interface Validate{
	boolean isValid(String firstName,String lastName);
}


public class Source {
	boolean validate(String username,String password) {
		Validate v=(str1,str2)->{return(str1.equals("ABC")&&str2.equals("DEF"))?true:false;};
		return v.isValid(username,password);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Source s=new Source();
		System.out.println(s.validate("ABC", "DEF"));

	}}


