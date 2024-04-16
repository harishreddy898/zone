package corejava;

public class Static {
	int b = 10;
	public void dc1() {
		System.out.println(b);
		System.out.println("dc1 executed");
	}
	public void dc2() {
		System.out.println(b);
		System.out.println("dc2 executed");
	}
	public void dc3() {
		System.out.println(b);
		System.out.println("dc3 executed");
	}
	//static method
	public static void see() {
		System.out.println("see the answer");
	}
public static void main (String args[]) {
	System.out.println("main method executed");
	//Static use =new Static();
	//use.dc1();
	//use.dc2();
	//use.dc3();
	Static.see();
	
}
}
