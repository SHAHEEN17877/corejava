package basic;

public class Strmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1=" india is my country";
		String str2="orange,whilte,green";
		String str3="jai hind";
		System.out.println("length of the String is: "+str1.length());
		System.out.println("UpperCase: "+str2.toUpperCase());
		System.out.println("LoweCase: "+str3.toLowerCase());
		System.out.println(" is both strings are equal: "+str2.equals(str1));
		System.out.println(" is both strings are equal: "+str2.equalsIgnoreCase(str3));
		System.out.println("concat string:"+str3.concat("jan gan man "));
		System.out.println("Index of i: "+str2.indexOf('i'));
		System.out.println("last index of y: "+str1.lastIndexOf('y'));
		System.out.println("contains of: "+str1.contains(str3));
		System.out.println("substring: "+str2.substring(2,5));
		System.out.println("length of str3: "+str3.length());
		StringBuffer sb1=new StringBuffer(" hi ");
		StringBuilder sb2=new StringBuilder("hello");
		System.out.println("my String Before append : "+sb1);
		sb1.append("made in india");
		System.out.println("my string after append : "+sb1);
		System.out.println("reverse string : "+sb1.reverse());
		sb1.insert(7, " india ");
		System.out.println("my string after insert : "+sb1);
		sb1.delete(4, 10); 

	}

}
