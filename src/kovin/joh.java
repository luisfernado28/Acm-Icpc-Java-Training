package kovin;

import java.util.Scanner;

public class joh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numi = sc.nextInt();
		int casi = sc.nextInt();
		int invertido = 0;
		int resultado = 0;
		int resulcasos = 0;
		boolean comprobador = false;
		while (numi > 0) {
			resultado = casi;
			while (comprobador == false) {
				if (palindrome(resultado) != 0) {
					invertido = palindrome(resultado);
					resultado = resultado + invertido;
					System.out.println(resultado);
					resulcasos++;
					if (palindrome(resultado) == 0) {
						System.out.println(resulcasos + " " + resultado);
						comprobador = true;
						break;
					}
				}
				else{
					System.out.println(resulcasos + " " + resultado);
					comprobador=true;
					break;
					
				}
			}
			numi--;
			casi = sc.nextInt();
			resulcasos=0;
		}
	}

	public static int palindrome(int s) {
		int invertido = 0;
		int backup = s;
		while (s > 0) {
			invertido =(invertido*10+ (s % 10));
			s = s / 10;
		}
		System.out.println(invertido);
		if (backup == invertido) {
			return 0;
		} else {
			return invertido;
		}
	}

}
