package corejava;
class A{
	int a = 10;
	int b = 30;
	public void Add() {
	System.out.println("Addition");
	}
}
class B extends A{
	int c= 50;
	int d= 40;
	public void mul() {
		System.out.println("Multiply");
	}
}
public class M_L_I extends B {
  public void res() {
	  System.out.println("result");
	  System.out.println(a + b);
	  System.out.println(a + c);
	  System.out.println(c + d);
  }
  public static void main (String args[]) {
	  M_L_I ob = new M_L_I();
	  ob.res();
	  ob.Add();
	  ob.mul();
  }
}