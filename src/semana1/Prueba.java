package semana1;

public class Prueba {
	public static void main(String[] args) {
		int[] x= {4,6};
		int[] y= {4,6};
		int[] cantidad= {20,10};
		int fuerza=1;
		int u=0;
		int[][] city=new int[10][10];
		for (int k = 0; k < x.length; k++) {
			int cnt = cantidad[k];
			int aux = fuerza;
			int corr = x[k] - aux, lim = (aux * 2) + 1;
			lim=lim+corr;
			int corr2 = x[k] - aux, lim2 = (aux * 2) + 1;
			lim2=lim2+corr2;
			for (u = corr; u < lim; u++) {
				for (int l = corr2; l < lim2; l++) {
					city[u][l] = city[u][l] + cnt;
				}
			}

		}
		for (int i = 0; i < city.length; i++) {
			for (int j = 0; j < city.length; j++) {
				System.out.print(city[i][j]+"  ");
			}
			System.out.println();
		}

	}
}
