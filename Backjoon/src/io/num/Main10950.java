package io.num;

import java.util.Scanner;

public class Main10950 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int [] A = new int[num];
		int [] B = new int[num];
		for(int i=0; i<num; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
		for(int i=0; i<num; i++) {
			System.out.println(A[i]+B[i]);
		}
		sc.close();
	}
}

