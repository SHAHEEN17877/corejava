import java.lang.*;
public class GFG1 {
	static void subString(int n,String str[]) {
		for(int len=1;len<=n;len++) {
			{
				for(int i=0;i<=n-len;i++) {
					int j= i+len-1;
					for(int k=i;k<=j;k++) {
						System.out.print(str[k]);					
				}
			}System.out.println();
			
		}}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s1="12abc";
	//int  s2=123;
	  //  if( s1.substring(s2) != null) {
	    //	System.out.println("YES");
		String str[]= {"aghij"};
		String str1[]= {"aghkmnl"};
		subString(str.length, str1);
	    }

	}


