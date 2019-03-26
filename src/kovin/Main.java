package kovin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numi = sc.nextInt();
		int casi = sc.nextInt();
		int resultado = 0;
		String pc = "";
		String[] palabras = new String[numi];
		int[] valores = new int[numi];
		for (int i = 0; i < numi; i++) {
			palabras[i] = sc.next();
			valores[i] = sc.nextInt();
		}
		while (casi > 0) {
			pc = sc.next();	
			while (!pc.equals(".")) {
				for (int i = 0; i < numi; i++) {
					if (palabras[i].equals(pc)) {
						resultado = resultado + valores[i];
					}

				}
				pc = sc.next();
			}
			System.out.println(resultado);
			casi--;
			resultado = 0;
		}
	}
}
