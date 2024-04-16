package corejava;
import java.util.Scanner;
public class Scan1 {
public static void ex2() {
	System.out.println("enter 1st no");
	System.out.println("enter 2nd no");
	System.out.println("enter 3rd no");
	System.out.println("result");
	}
public static void main (String args[]) {
	Scanner ob = new Scanner(System.in);
	int a = ob.nextInt();
	int b = ob.nextInt();
	int sum= (a + b);
	System.out.println(sum);
	
	Scan1.ex2();
	
}

}
