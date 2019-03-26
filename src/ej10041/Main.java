package ej10041;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		for (int i = 0; i < casos; i++) {
			int parientes = sc.nextInt();
			ArrayList<Integer> casasDeVecinos = new ArrayList<Integer>();
			boolean[] casas = new boolean[parientes];
			for (int j = 0; j < parientes; j++) {
				int numeroDeCasa = sc.nextInt();
				if (!casas[numeroDeCasa]) {
					casas[numeroDeCasa] = true;
					casasDeVecinos.add(numeroDeCasa);
				}
			}
			int b = Math.max(2, 1);
			int[] ubicaciones = new int[5];
			int demaxamin = ubicaciones[parientes - 1] - ubicaciones[0];
			int casaideal = 0;
			if (demaxamin % 2 == 0)
				casaideal = demaxamin / 2;
			else
				casaideal = (demaxamin + 1) / 2;
			int distanciatotla = 0;
			for (int j = 0; j < parientes; j++) {
				distanciatotla = distanciatotla + (Math.abs(casaideal - ubicaciones[j]));
			}
			System.out.println(distanciatotla);
		}

	}
}
