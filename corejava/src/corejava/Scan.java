package corejava;
import java.util.Scanner;

public class Scan {	
	public void m1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
	    String name =sc.nextLine(); 
		String hari="harish";
	String abhi = "abhi";
	String sri = "sritam";
	String rat = "rati";
	String gugu= "gudu";
		if (name == hari) {
			System.out.println("next step");
			
		}else if (name == abhi) {
			System.out.println("enter roll no");
		}else if (name == sri) {
			System.out.println("enter roll no");
			
		}else if (name == rat) {
			System.out.println("enter roll no");
		}else if (name == gugu) {
			System.out.println("enter roll no");
		}
	}
	public void m2() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your roll no");
		int roll = sc.nextInt();
		int f = 21;
		int g = 22;
		int h = 23;
		int i = 24;
		int j= 25;
		if (roll == f) {
			System.out.println("455");
			
		}else if (roll == g) {
			System.out.println("478");
		}else if (roll == h) {
			System.out.println("387");
		}else if (roll == i) {
			System.out.println("490");
		}else if (roll == j) {
			System.out.println("487");
		}else {
			System.out.println("invalid");
		}
	}
	
public static void main (String args[]) {
	
	System.out.println("your Names");
	System.out.println("hsrish");
	System.out.println("abhi");
	System.out.println("sritam");
	System.out.println("rati");
	System.out.println("gudu");
	System.out.println();
	System.out.println("your roll");
	System.out.println("21");
	System.out.println("22");
	System.out.println("23");
	System.out.println("24");
	System.out.println("25");
System.out.println();
System.out.println();
	
		Scan op = new Scan();
		op.m1();
		op.m2();
	

}
}
