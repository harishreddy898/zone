package corejava;

public class Static_2 {
	int a = 10;
	int b = 12;
	public void me1() {
		System.out.println("me1 running");
		System.out.println(a+b);
	}
	public void me2() {
		int x =12;
		int y =20;
		System.out.println("me2 running");
		System.out.println(x + y);
	}
	public void me3() {
		
		System.out.println("me3 running");
		System.out.println(a + b);
	}
		public static void st() {
			System.out.println("st running ");
	
		}
	public static void main (String args[]) {
		Static_2 on = new Static_2();
		on.me1();
		on.me2();
		on.me3();
		Static_2.st();
	}

}
