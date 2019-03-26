package ej10018;

	import java.util.Scanner;
	
	public class Main {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int casos = sc.nextInt();
	
			for (int i = 0; i < casos; i++) {
	
				long numero = sc.nextInt();
				long cont = 0;
				while (true) {
					long numinicial = numero;
					long invertido = 0;
					while (numinicial != 0) {
						long adi = numinicial % 10;
						numinicial /= 10;
						invertido= (invertido*10)+adi;
					}				
					if (numero == invertido) {
						System.out.println(cont + " " + invertido);
						break;
					}
					numero += invertido;
					cont++;
				}
	
			}
	
		}
	}
