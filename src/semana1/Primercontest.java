package semana1;

import java.util.Scanner;

public class Primercontest {
	public void res12372() {
		Scanner sc = new Scanner(System.in);
		int tr = 0;
		do {
			tr = sc.nextInt();
		} while ((tr <= 0) || (tr > 100));
		int[][] V = new int[tr][3];
		for (int i = 0; i < tr; i++) {

			V[i][0] = sc.nextInt();
			V[i][1] = sc.nextInt();
			V[i][2] = sc.nextInt();
		}
		boolean res = false;
		for (int i = 0; i < tr; i++) {
			res = false;
			for (int j = 0; j < 3; j++) {
				if (V[i][j] > 20) {
					res = true;
					j = 3;
				}
			}
			if (res) {
				System.out.println("Case " + (i + 1) + ": " + "bad");
			} else {
				System.out.println("Case " + (i + 1) + ": " + "good");
			}
		}
		sc.close();
	}

	public void res12149() {
		// import java.util.LinkedList;
		// import java.util.Queue;
		// import java.util.Scanner;
		//
		// public class Main {
		// public static void main(String[] args) {
		// Scanner sc= new Scanner(System.in);
		// Queue<Integer> p= new LinkedList <Integer>();
		// int a=1;
		// while(a!=0){
		// a=sc.nextInt();
		// if(a!=0){
		// p.add(a);
		// }
		// }
		// int[] r= new int[p.size()];
		// int v=0,aux=0,cont=0;
		// while(!p.isEmpty()){
		// aux=p.poll();
		// cont=0;
		// for (int i = 1; i <= aux; i++) {
		// cont=cont + (i*i);
		// }
		// r[v]=cont;
		// v++;
		// }
		// for (int i = 0; i < r.length; i++) {
		// System.out.println(r[i]);
		// }
		// sc.close();
		// }
		// }
		// }

	}

	public void res11799() {
		// import java.util.Scanner;
		//
		// public class Main {
		// public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// int lim = 0, cont = 0;
		// lim = sc.nextInt();
		// int[] R = new int[lim];
		// for (int i = 0; i < lim; i++) {
		// int aux = 0;
		// aux = sc.nextInt();
		// int[] V = new int[aux];
		// V[0] = sc.nextInt();
		// R[cont] = V[0];
		// for (int j = 1; j < V.length; j++) {
		// V[j] = sc.nextInt();
		// if (V[j] > R[cont]) {
		// R[cont] = V[j];
		// }
		// }
		// cont++;
		// }
		// for (int i = 0; i < R.length; i++) {
		// System.out.println("Case " + (i+1) +": " + R[i]);
		// }
		// sc.close();
		// }
		// }
	}

	public void res10469() {
		// import java.util.LinkedList;
		// import java.util.Queue;
		// import java.util.Scanner;
		//
		// public class Main {
		// public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// int i = 0, a = 0;
		// Queue<Integer> ejer = new LinkedList<Integer>();
		// while (sc.hasNextInt()) {
		// a = sc.nextInt();
		// ejer.add(a);
		// i++;
		// }
		// int larg = ejer.size();
		// int largmitad = larg / 2;
		// int[] r = new int[32];
		// int[] n1 = new int[32];
		// int[] n2 = new int[32];
		// for (i = 0; i < largmitad; i++) {
		// int v = 0, aux = 0;
		// v = ejer.poll();
		// for (int j = 31; j >= 0; j--) {
		// aux = v % 2;
		// v = v / 2;
		// n1[j] = aux;
		// if (v == 1) {
		// n1[j - 1] = 1;
		// j = -1;
		// }
		// }
		// v = ejer.poll();
		// for (int j = 31; j >= 0; j--) {
		// aux = v % 2;
		// v = v / 2;
		// n2[j] = aux;
		// if (v == 1) {
		// n2[j - 1] = 1;
		// j = -1;
		// }
		// }
		// for (int j = 31; j >= 0; j--) {
		// if (n2[j] == n1[j]) {
		// r[j] = 0;
		// } else {
		// r[j] = 1;
		// }
		// }
		//
		// int res = 0, conv = 2;
		// if (r[31] == 1) {
		// res = 1;
		// }
		//
		// for (int j = 30; j >= 0; j--) {
		// if (r[j] == 1) {
		// res = res + conv;
		// }
		// conv = conv * 2;
		// }
		// System.out.println(res);
		// sc.close();
		// for (int j = 0; j < 32; j++) {
		// n1[j] = 0;
		// n2[j] = 0;
		// r[j] = 0;
		// }
		// }
		// }
		//
		// }
	}

	public void res10360re() {
		// Scanner sc = new Scanner(System.in);
		// int fuerza = 0, pop = 0, escenarios = 0;
		// int c = 0;
		// int j = 0;
		// escenarios = sc.nextInt();
		// int[][] r = new int[escenarios][3];
		// while (escenarios > j) {
		// fuerza = sc.nextInt();
		// pop = sc.nextInt();
		// int i = 0;
		// int[] x = new int[pop];
		// int[] y = new int[pop];
		// int[] cantidad = new int[pop];
		// // recibe los valores de los nidos
		// while (pop > i) {
		// x[i] = sc.nextInt();
		// y[i] = sc.nextInt();
		// cantidad[i] = sc.nextInt();
		// i++;
		// }
		// int[][] city = new int[1025][1025];
		// // coloca los valores a todas las casillas
		// for (int k = 0; k < x.length; k++) {
		// city[x[k]][y[k]] = cantidad[k];
		// int cnt = cantidad[k];
		// int aux = fuerza;
		// for (int l = 1; l <= aux; l++) {
		// for (int m = 1; m <= aux; m++) {
		// city[x[k]][y[k] + m] = city[x[k]][y[k] + m] + cnt;
		// }
		// for (int m = 1; m <= aux; m++) {
		// city[x[k]][y[k] + m] = city[x[k]][y[k] - m] + cnt;
		// }
		// }
		// for (int l = 1; l <= aux; l++) {
		// for (int m = 1; m <= aux; m++) {
		// city[x[k] + l][y[k] + m] = city[x[k] + l][y[k] + m] + cnt;
		// }
		// for (int m = 1; m <= aux; m++) {
		// city[x[k] + l][y[k] + m] = city[x[k] + l][y[k] - m] + cnt;
		// }
		// }
		// for (int l = 1; l <= aux; l++) {
		// city[x[k] - l][y[k]] = city[x[k] - l][y[k]] + cnt;
		// for (int m = 1; m <= aux; m++) {
		// city[x[k] - l][y[k] + m] = city[x[k] - l][y[k] + m] + cnt;
		// }
		// for (int m = 1; m <= aux; m++) {
		// city[x[k] - l][y[k] - m] = city[x[k] - l][y[k] - m] + cnt;
		// }
		// }
		// }
		// r[c][0] = 0;
		// r[c][1] = 0;
		// r[c][2] = city[0][0];
		//
		// //escoje el mayor lugar
		// for (int k = 0; k < 1025; k++) {
		// for (int k2 = 0; k2 < 1025; k2++) {
		// if (r[c][2] < city[k][k2]) {
		// r[c][0] = k;
		// r[c][1] = k2;
		// r[c][2] = city[k][k2];
		// }
		// }
		// }
		//
		// c++;
		// j++;
		// }
		// for (int i = 0; i < escenarios; i++) {
		// System.out.print(r[i][0]+" ");
		// System.out.print(r[i][1]+" ");
		// System.out.print(r[i][2]);
		//
		// }
		//
		// sc.close();

		// }
	}

	public void res10360Nv() {
		// Scanner sc = new Scanner(System.in);
		// int fuerza = 0, pop = 0, escenarios = 0;
		// int c = 0;
		// int j = 0;
		// escenarios = sc.nextInt();
		// int[][] r = new int[escenarios][3];
		// while (escenarios > j) {
		// fuerza = sc.nextInt();
		// pop = sc.nextInt();
		// int i = 0;
		// int[] x = new int[pop];
		// int[] y = new int[pop];
		// int[] cantidad = new int[pop];
		// // recibe los valores de los nidos
		// while (pop > i) {
		// x[i] = sc.nextInt();
		// y[i] = sc.nextInt();
		// cantidad[i] = sc.nextInt();
		// i++;
		// }
		// int[][] city = new int[1025][1025];
		// // coloca los valores a todas las casillas
		// int u=0;
		// for (int k = 0; k < x.length; k++) {
		// int cnt = cantidad[k];
		// int aux = fuerza;
		// int corr = x[k] - aux, lim = (aux * 2)+1;
		// int corr2 = x[k] - aux, lim2 = (aux * 2)+1;
		// for ( u=corr ; u <= lim; u++) {
		// city[u][y[k]] = city[u][y[k]] + cnt;
		// for (int l = corr2; l <= lim2; l++) {
		// city[u][l] = city[u][l] + cnt;
		// }
		// }
		// u=0;
		// System.out.println(city[4][4]);
		//
		//
		// }
		// r[c][0] = 0;
		// r[c][1] = 0;
		// r[c][2] = city[0][0];
		//
		// // escoje el mayor lugar
		// for (int k = 0; k < 1025; k++) {
		// for (int k2 = 0; k2 < 1025; k2++) {
		// if (r[c][2] < city[k][k2]) {
		// r[c][0] = k;
		// r[c][1] = k2;
		// r[c][2] = city[k][k2];
		// }
		// }
		// }
		//
		// c++;
		// j++;
		// }
		// for (int i = 0; i < escenarios; i++) {
		// System.out.print(r[i][0] + " ");
		// System.out.print(r[i][1] + " ");
		// System.out.print(r[i][2]);
		//
		// }
		//
		// sc.close();
		//
		//
	}

	public void res2rat() {
		// import java.util.Scanner;
		//
		// public class Main {
		// public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// int fuerza = 0, pop = 0, escenarios = 0;
		// int c = 0;
		// int j = 0;
		// escenarios = sc.nextInt();
		// int[][] r = new int[escenarios][3];
		// while (escenarios > j) {
		// int[][] city = new int[1025][1025];
		// fuerza = sc.nextInt();
		// pop = sc.nextInt();
		// int i = 0;
		// int[] x = new int[pop];
		// int[] y = new int[pop];
		// int[] cantidad = new int[pop];
		// // recibe los valores de los nidos
		// while (pop > i) {
		// x[i] = sc.nextInt();
		// y[i] = sc.nextInt();
		// cantidad[i] = sc.nextInt();
		// i++;
		// }
		// int u = 0;
		// for (int k = 0; k < x.length; k++) {
		// int cnt = cantidad[k];
		// int aux = fuerza;
		// int corr = x[k] - aux, lim = (aux * 2) + 1;
		// lim=lim+corr;
		// int corr2 = x[k] - aux, lim2 = (aux * 2) + 1;
		// r[c][0] = 0;
		// r[c][1] = 0;
		// r[c][2] = city[0][0];
		// lim2=lim2+corr2;
		// for (u = corr; u < lim; u++) {
		// for (int l = corr2; l < lim2; l++) {
		// city[u][l] = city[u][l] + cnt;
		// if (r[c][2] < city[u][l]) {
		// r[c][0] = u;
		// r[c][1] = l;
		// r[c][2] = city[u][l];
		// }
		// }
		//
		// }
		// u = 0;
		//
		// }
		// c++;
		// j++;
		// }
		// for (int i = 0; i < escenarios; i++) {
		// System.out.print(r[i][0] + " ");
		// System.out.print(r[i][1] + " ");
		// System.out.print(r[i][2]);
		//
		// }
		//
		// sc.close();
		//
		// }
		// }
	}
}
