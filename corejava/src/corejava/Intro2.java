package corejava;

public class Intro2 {
	//methods are written in class tags
	public void s1() {
	System.out.println("s1 running");
	}
	public void s2() {
		System.out.println("s2 running");
		}
	public void s3() {
		System.out.println("s3 running");
		}
	public void s4() {
		System.out.println("s4 running");
		}
public static void main(String args[]) {
	System.out.println("excicuted");
	Intro2 t = new Intro2();
	t.s1();
	t.s2();
	t.s3();
	t.s4();
}
}
