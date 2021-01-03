package step3;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int x = sc.nextInt();
		int arr[] = new int[a];
		
		for(int i = 0; i<a;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i<a; i++) {
			if (arr[i] < x) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
