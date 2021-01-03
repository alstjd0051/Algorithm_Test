package step2;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt(); // 시
		int M = sc.nextInt(); // 분

		if (M < 45) {
			H--; // 시 감소
			M = 60 - (45 - M); //분 감소 
			if (H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		} else {
			System.out.println(H + " " + (M - 45));
		}
	}

}
