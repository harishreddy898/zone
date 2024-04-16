package corejava;
import java.util.*;
class e{
	public void num() {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter 1st no");
	 int a =sc.nextInt();
	 System.out.println("enter 2nd no");
	 int b =sc.nextInt();
	 System.out.println("result");
	 int c= a +b;
	 System.out.println(c);
	}
}
class f extends e{
	public void cal() {
		System.out.println("calculation done");
		System.out.println();
	}
}
public class M_l extends f {
public static void main (String args[]) {
	M_l on=new M_l();
	on.num();
	on.cal();
}
}
