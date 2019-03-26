package ejr_indUva;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> listaa = new LinkedList<Integer>();
		Queue<Integer> listab = new LinkedList<Integer>();
		Queue<Integer> r = new LinkedList<Integer>();
		int raux = 0;
		int a, b;
	
		while (sc.hasNextInt()) {
			a = sc.nextInt();
			listaa.add(a);
			b = sc.nextInt();
			listab.add(b);
			int numero = 0;
			int aux=0;
			if(a>b){
				aux=a;
				a=b;
				b=aux;
			}
			for (int i = a; i <= b; i++) {
				numero = i;
				int cont = 0;
				while (numero > 1) {
					if (numero % 2 == 0) {
						numero = numero / 2;
					} else {
						numero = (3 * numero) + 1;
					}
					cont++;
				}
				cont++;
				if (cont > raux) {
					raux = cont;
				}

			}
			r.add(raux);
			raux=0;
		}
		int p = r.size();
		for (int i = 0; i < p; i++) {
			System.out.println(listaa.poll() + " " + listab.poll() + " " + r.poll());

		}
		sc.close();

	}

}
