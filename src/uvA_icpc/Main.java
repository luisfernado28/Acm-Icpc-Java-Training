package uvA_icpc;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static char[][][] dungeon;
	static int[][][] distancia;
	static Queue<int[]> cola;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l, r, c;
		l = sc.nextInt();
		r = sc.nextInt();
		c = sc.nextInt();
		// sc.next().toString();
		sc.nextLine();
		while (l > 0) {
			dungeon = new char[l][r][c];
			for (int i = 0; i < l; i++) {
				for (int j = 0; j < r; j++) {
					dungeon[i][j] = sc.nextLine().toCharArray();
				}
				sc.nextLine();
			}
			int[] posinit = new int[3];

			for (int i = 0; i < l; i++) {
				for (int j = 0; j < r; j++) {
					for (int k = 0; k < c; k++) {
						if (dungeon[i][j][k] == 'S') {
							posinit[0] = i;
							posinit[1] = j;
							posinit[2] = k;
						}
					}
				}
			}
			int[] posactual = posinit;
			distancia = new int[l][r][c];
			distancia[posactual[0]][posactual[1]][posactual[2]] = 1;
			int distanciaactual = 1;
			Queue<int[]> cola = new LinkedList<>();
			while ((posactual != null) && (dungeon[posactual[0]][posactual[1]][posactual[2]] != 'E')) {
				if (posactual[0] > 0) {
					conisderarVecino(posactual[0] - 1, posactual[1], posactual[2], distanciaactual);
				}
				if (posactual[0] < l - 1) {
					conisderarVecino(posactual[0] + 1, posactual[1], posactual[2], distanciaactual);
				}
				if (posactual[1] > 0) {
					conisderarVecino(posactual[0], posactual[1] - 1, posactual[2], distanciaactual);
				}
				if (posactual[1] < r - 1) {
					conisderarVecino(posactual[0], posactual[1] + 1, posactual[2], distanciaactual);
				}
				if (posactual[2] > 0) {
					conisderarVecino(posactual[0], posactual[1], posactual[2] - 1, distanciaactual);
				}
				if (posactual[2] < c - 1) {
					conisderarVecino(posactual[0], posactual[1], posactual[2] + 1, distanciaactual);
				}
				if (cola.isEmpty()) {
					posactual = null;
				} else {
					posactual = cola.poll();
					distanciaactual = distancia[posactual[0]][posactual[1]][posactual[2]];
				}
			}
			if (posactual == null) {
				System.out.println("Trapped");
			} else {
				System.out.println(
						"Escaped in " + (distancia[posactual[0]][posactual[1]][posactual[2]] - 1) + " minutes(s)");
			}
			l = sc.nextInt();
			r = sc.nextInt();
			c = sc.nextInt();
			sc.nextLine();
		}
	}

	public static void conisderarVecino(int i, int j, int k, int distanciaactual) {

		if (dungeon[i][j][k] != '#' && distancia[i][j][k] == 0) {
			int[] vecino = new int[3];
			vecino[0] = i;
			vecino[1] = j;
			vecino[2] = k;
			cola.add(vecino);
			distancia[i][j][k] = distanciaactual + 1;
		}
	}
}
