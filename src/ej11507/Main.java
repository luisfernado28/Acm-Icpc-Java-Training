package ej11507;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int largo = sc.nextInt();
		while (largo > 0) {
			String posicion = "+x";
			for (int i = 1; i < largo; i++) {
				String accion = sc.next();
				if (!accion.equals("No")) {
					if (posicion.charAt(1) == 'x') {
						if (posicion.charAt(0) == '+') {
							posicion = accion;
						} else if (accion.charAt(0) == '-') {
							posicion = "+" + accion.charAt(1);
						} else {
							posicion = "-" + accion.charAt(1);
						}
					} else if (posicion.charAt(1) == 'y' && accion.charAt(1) == 'y') {
						if (posicion.charAt(0) == accion.charAt(0)) {
							posicion = "-x";
						} else {
							posicion = "+x";
						}
					} else {
						if (posicion.charAt(1) == 'z' && accion.charAt(1) == 'z') {
							if (posicion.charAt(0) == accion.charAt(0)) {
								posicion = "-x";
							} else {
								posicion = "+x";
							}
						}
					}
				}

			}
			System.out.println(posicion);

			largo = sc.nextInt();
		}
	}
}
