package Pattern;

import java.util.Scanner;

public class PyramidNumber {
	
	void test() {
		System.out.println("Enter a number for print Pyrmid");
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	
	for (int i = 1; i < n; i++ ) {
		
		for (int j = 1; j <= n-i; j++) {
			System.out.print(" ");
		}
		    for (int j = 1; j <= i; j++) {
			     System.out.print(i+" ");
		}
		System.out.println();
	}
}
		public static void main(String[] args) {
			
			PyramidNumber p = new PyramidNumber();
			p.test();
		}
}
