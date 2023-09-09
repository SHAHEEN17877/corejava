package garbagecollector;

public class FinalizeEx {
	String s;
	public FinalizeEx(String s)
	{
		this.s=s;
		}
	public static void main(String[]args) {
		FinalizeEx t1=new FinalizeEx("t1");
		FinalizeEx t2=new FinalizeEx("t2");
		t1=t2;
		t1=null;
		t2=null;
		System.gc();
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("object was refferd previously by "+this.s+" is succussefully collected."); 
	
	}
}
