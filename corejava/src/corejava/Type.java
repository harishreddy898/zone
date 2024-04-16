package corejava;

public class Type {
	int a= 30;//instance var (define out side the method inside the class)
	int b= 10;
	//non static methods
	static int empid = 101;//static var (keyword static) 
	public void dt1() {
		int b = 40; //local var(inside the methods)
		System.out.println("Dt 1 passed");
	System.out.println(b + a+ "local");
	System.out.println(empid);
	}
	public void dt2() {
	System.out.println("Dt 2 passed");
	System.out.println(a + b +" instance");//instance var (define out side the method inside the class)
	System.out.println(empid);          //static var (keyword static)
	
	}
	public void dt3() {
		System.out.println("Dt 3 passed");
		System.out.println(a +" instance");
		System.out.println(empid); 
	}
	public static void main (String args[]) {
		System.out.println("methods exicuting");
		//classname objectname = new classname();
		Type var = new Type();
		var.dt1();
		var.dt2();
		var.dt3();
	}

}
