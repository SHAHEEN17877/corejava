package looping;

public class ReverseStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="kal sha";
		String reversed="";
		for(int i=s.length()-1;i>=0;i--)
		{
			reversed=reversed+s.charAt(i);
			
		}
System.out.println("Reversed String: "+reversed);
	

}}
