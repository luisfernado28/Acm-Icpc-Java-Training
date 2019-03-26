package p11559;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int personas, budget, hoteles, weekends;
			personas = sc.nextInt();
			budget = sc.nextInt();
			hoteles = sc.nextInt();
			weekends = sc.nextInt();
			int[] precio = new int[hoteles];
			int[][] disponibilidad = new int[hoteles][weekends];
			for (int i = 0; i < hoteles; i++) {
				precio[i] = sc.nextInt();
				for (int j = 0; j < weekends; j++) {
					disponibilidad[i][j] = sc.nextInt();
				}
			}
			int costo = personas * precio[0], res = 0, aux;
			for (int i = 0; i < hoteles; i++) {
				aux = personas * precio[i];
				if (costo > aux) {
					costo = aux;
				}
				if (costo < budget) {
					for (int j = 0; j < weekends; j++) {
						if (personas <= disponibilidad[i][j]) {
							res = costo;
						}
					}
				}
				if (res == 0) {
					costo = Integer.MAX_VALUE;
				}
			}
			if (res != 0) {
				System.out.println(res);
			} else {
				System.out.println("stay home");
			}
		}
	}
}
