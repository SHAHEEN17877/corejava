package looping;

public class SumNo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int armst(int number) {
		int number1=716,originalNumber,reminder,result=0;
		originalNumber=number;
		while(originalNumber!=0) {
			reminder=originalNumber%10;
			result /=10;
			originalNumber /=10;
		}
      if(result==number) {
    	  System.out.println(number+" is an armstrong number");
      }
      
    	  else
    		  System.out.println(number+" is not an armstrong number");
      
	SumNo1 s=new SumNo1();
	
	}

}}
