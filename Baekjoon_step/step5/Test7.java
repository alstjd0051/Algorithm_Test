package step5;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr;

		int testcase = sc.nextInt();

		for (int i = 0; i < testcase; i++) {
			int N = sc.nextInt(); // 학생수
			arr = new int[N];

			double sum = 0; // 성적 누적 합

			// 성적 입력
			for (int j = 0; j < N; j++) {
				int val = sc.nextInt();
				arr[j] = val;
				sum += val; // 성적 누적 합
			}

			double mean = (sum / N);
			double count = 0;// 평균 넘는 학생수
			
			for(int j = 0; j<N; j++) {
				if(arr[j] > mean) {
					count++;
				}
			}
			
			System.out.printf("%.3f%%\n",(count/N)*100);
		}
	}

}
