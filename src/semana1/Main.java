package semana1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fuerza = 0, pop = 0, escenarios = 0;
		int c = 0;
		int j = 0;
		escenarios = sc.nextInt();
		int[][] r = new int[escenarios][3];
		while (escenarios > j) {
			int[][] city = new int[1025][1025];
			fuerza = sc.nextInt();
			pop = sc.nextInt();
			int i = 0;
			int[] x = new int[pop];
			int[] y = new int[pop];
			int[] cantidad = new int[pop];
			// recibe los valores de los nidos
			while (pop > i) {
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
				cantidad[i] = sc.nextInt();
				i++;
			}
			int u = 0;
			for (int k = 0; k < x.length; k++) {
				int cnt = cantidad[k];
				int aux = fuerza;
				int corr = x[k] - aux, lim = (aux * 2) + 1;
				lim=lim+corr;
				int corr2 = x[k] - aux, lim2 = (aux * 2) + 1;
				r[c][0] = 0;
				r[c][1] = 0;
				r[c][2] = city[0][0];
				lim2=lim2+corr2;
				for (u = corr; u < lim; u++) {
					for (int l = corr2; l < lim2; l++) {
						city[u][l] = city[u][l] + cnt;
						if (r[c][2] < city[u][l]) {
							r[c][0] = u;
							r[c][1] = l;
							r[c][2] = city[u][l];
						}
					}
					
				}
				u = 0;

			}
			c++;
			j++;
		}
		for (int i = 0; i < escenarios; i++) {
			System.out.print(r[i][0] + " ");
			System.out.print(r[i][1] + " ");
			System.out.print(r[i][2]);

		}

		sc.close();

	}
}
