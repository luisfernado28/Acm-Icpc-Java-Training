package p11727;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] sueldos = new int[3];
		for (int i = 0; i < n; i++) {
			sueldos[0] = sc.nextInt();
			sueldos[1] = sc.nextInt();
			sueldos[2] = sc.nextInt();
			for (int j = 1; j < sueldos.length; j++) {
				int key = sueldos[j];
				int k = j - 1;
				while (k >= 0 && sueldos[k] > key) {
					sueldos[k + 1] = sueldos[k];
					k = k - 1;
					sueldos[k + 1] = key;
				}
			}
			System.out.println("Case "+ (i+1)+": "+sueldos[1]);
		}
		
	}

}
