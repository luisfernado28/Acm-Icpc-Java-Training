package uVA_lsp;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Pub {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0, a = 0;
		Queue<Integer> ejer = new LinkedList<Integer>();
		while (sc.hasNextInt()) {
			a = sc.nextInt();
			ejer.add(a);
			i++;
		}
		int larg = ejer.size();
		int largmitad = larg / 2;
		int[] r = new int[32];
		int[] n1 = new int[32];
		int[] n2 = new int[32];
		for (i = 0; i < largmitad; i++) {
			int v = 0, aux = 0;
			v = ejer.poll();
			for (int j = 31; j >= 0; j--) {
				aux = v % 2;
				v = v / 2;
				n1[j] = aux;
				if (v == 1) {
					n1[j - 1] = 1;
					j = -1;
				}
			}
			v = ejer.poll();
			for (int j = 31; j >= 0; j--) {
				aux = v % 2;
				v = v / 2;
				n2[j] = aux;
				if (v == 1) {
					n2[j - 1] = 1;
					j = -1;
				}
			}
			for (int j = 31; j >= 0; j--) {
				if (n2[j] == n1[j]) {
					r[j] = 0;
				} else {
					r[j] = 1;
				}
			}

			int res = 0, conv = 2;
			if (r[31] == 1) {
				res = 1;
			}

			for (int j = 30; j >= 0; j--) {
				if (r[j] == 1) {
					res = res + conv;
				}
				conv = conv * 2;
			}
			System.out.println(res);
			sc.close();
			for (int j = 0; j < 32; j++) {
				n1[j] = 0;
				n2[j] = 0;
				r[j] = 0;
			}
		}
	}

	// Scanner sc=new Scanner(System.in);
	// while(sc.hasNextInt()){
	//
	// }
	//
	//
	// sc.close();

}
