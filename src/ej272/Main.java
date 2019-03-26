package ej272;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase = "";
		boolean cambio = true;
		while (sc.hasNext()) {
			frase = sc.nextLine();
			char[] letras = frase.toCharArray();
			String res = "";
			for (char c : letras) {
				if (c == '"') {
					if (cambio) {
						res = res + "``";
						cambio = false;
					} else {
						res = res + "''";
						cambio = true;
					}
				} else {
					res = res + c;
				}
			}
			System.out.println(res);
		}
		sc.close();
	}
}
