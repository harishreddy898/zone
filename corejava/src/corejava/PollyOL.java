package corejava;
//polymorphism in overload 
public class PollyOL {
	public void add(int a ,int b) {
		System.out.println(a + b);
	}
public void add(int a,int b,int c) {
	System.out.println(a + b + c);
}
public static void main (String args[]) {
	PollyOL ov = new PollyOL();
	ov.add(12,20);
	ov.add(2, 4, 0);
	Or or = new Or();
	or.less(14, 7);
	
}
}
//over load method name should be same ,signatures should be different
class PolyOR{
	public void less(int a,int b) {
		System.out.println(a - b);
		System.out.println("old method ");
	}
	//totally replaced with new method
}
class Or extends PolyOR{
public void less(int a, int b) {
		System.out.println(a + b);
		System.out.println("new method");
	}
}
//over ride, method name & signature name both should be same 