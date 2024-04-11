package feelings;
import java.util.*;

public class Math {
	public  void m1() {
		int a = 11;
		int b = 15;
		int ans = a+b;
		System.out.println(ans);
	}
	public void m2() {
		int c = 20;
		int d = 30;
		int ans = c + d;
		System.out.println(ans);
	}
	public void scam() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.println(a + b);
		System.out.println(b + c);
		System.out.println(a+b+c);
		System.out.println(a+b-c);
	}
	public void loop() {
		int n = 4;
		for (int i = 1; i<=n ; i++) {
			for(int j = 1 ;j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void main(String args[]) {
	
		Math ob = new Math();
		ob.m1();
		ob.m2();
		ob.scam();
		ob.loop();
}
}