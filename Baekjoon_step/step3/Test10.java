package step3;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i = 1; i<= a; i++) {
			for(int j = 1; j<= a -i; j++) {
				System.out.print(" ");
			}
			for( int b = 0; b <i; b++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
