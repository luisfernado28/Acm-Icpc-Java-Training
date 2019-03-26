package ej755;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int datasets = sc.nextInt();
		for (int i = 0; i < datasets; i++) {
			int NofTelephoneNumbers = sc.nextInt();
			String[] Numbers = new String[NofTelephoneNumbers];
			sc.nextLine();
			for (int j = 0; j < NofTelephoneNumbers; j++) {
				Numbers[j] = sc.nextLine();
			}
			// System.out.println(Arrays.toString(Numbers));
			String[] CleanNumbers = new String[NofTelephoneNumbers];
			for (int j = 0; j < Numbers.length; j++) {
				String number = "";
				for (int j2 = 0; j2 < Numbers[j].length(); j2++) {
					char carac = Numbers[j].charAt(j2);
					if (carac == 'A' || carac == 'B' || carac == 'C') {
						carac = '2';
					} else if (carac == 'D' || carac == 'F' || carac == 'E') {
						carac = '3';
					} else if (carac == 'H' || carac == 'I' || carac == 'G') {
						carac = '4';
					} else if (carac == 'J' || carac == 'L' || carac == 'K') {
						carac = '5';
					} else if (carac == 'M' || carac == 'N' || carac == 'O') {
						carac = '6';
					} else if (carac == 'P' || carac == 'R' || carac == 'S') {
						carac = '7';
					} else if (carac == 'T' || carac == 'U' || carac == 'V') {
						carac = '8';
					} else if (carac == 'W' || carac == 'X' || carac == 'Y') {
						carac = '9';
					}
					number = number + carac;
				}
				CleanNumbers[j] = number.replace("-", "");
				CleanNumbers[j] = CleanNumbers[j].replace(" ", "");

			}
			// ordena y limpia el string
			Set<String> mySet = new HashSet<String>(Arrays.asList(CleanNumbers));
			String UniqueNumbers = mySet.toString();
			UniqueNumbers = UniqueNumbers.replace("[", "");
			UniqueNumbers = UniqueNumbers.replace("]", "");
			UniqueNumbers = UniqueNumbers.replace(" ", "");

			String[] u = UniqueNumbers.split(",", -1);
			//System.out.println(Arrays.toString(u));
			Arrays.sort(u);
			int[] repeticiones = new int[u.length];
			boolean ExistenRepetidos = false;
			for (int j = 0; j < u.length; j++) {
				int cont = 0;
				for (int k = 0; k < CleanNumbers.length; k++) {
					//System.out.println(u[j] + "  " + CleanNumbers[k]);
					if (u[j].equals(CleanNumbers[k])) {
						cont++;
						if (cont > 1) {
							ExistenRepetidos = true;
						}
					}
				}
				repeticiones[j] = cont;
			}
			// System.out.println(ExistenRepetidos);
			// System.out.println(Arrays.toString(repeticiones));
			if (ExistenRepetidos) {
				for (int j = 0; j < repeticiones.length; j++) {
					if (repeticiones[j] > 1) {

						 System.out.println(u[j].substring(0, 3) + "-" +u[j].charAt(3)+ u[j].charAt(4) + u[j].charAt(5) + u[j].charAt(6) +" "+ repeticiones[j] );
					}
				}
			} else {
				System.out.println("No duplicates.");
			}

			System.out.println();
		}

		sc.close();

	}

}
