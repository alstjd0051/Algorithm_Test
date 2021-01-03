package step4;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int b = 0;
		int c = a;

		while (true) {
			a = ((a % 10) * 10) + (((a / 10) + (a % 10) % 10));
			c++;
			
			if (c==a) {
				break;
			} 
		}
		System.out.println(b);
	}

}
