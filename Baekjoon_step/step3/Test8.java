package step3;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		for (int i = 1; i <= a; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println("Ca " + i + ": " + A + "+" + B + "=" + (A + B));
		}

	}

}
