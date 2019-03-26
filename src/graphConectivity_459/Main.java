package graphConectivity_459;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		sc.nextLine();
		sc.nextLine();
		for (int c = 0; c < casos; c++) {
			int nodos = sc.nextLine().charAt(0) - 'A' + 1;// Metodo de sacar
															// valores ASCCI de
															// las letras
			boolean[][] mat = new boolean[nodos][nodos];
			String str = sc.nextLine();
			while (!str.equals("")) {
				int from = str.charAt(0) - 'A';
				int to = str.charAt(1) - 'A';
				mat[from][to] = true;
				mat[to][from] = true;
				str = sc.nextLine();
			}
			
			boolean[] visitados = new boolean[nodos];
			int contador = 0;
			for (int nodo = 0; nodo < nodos; nodo++) {
				if (!visitados[nodo]) {
					visitados[nodo] = true;
					contador++;
					Stack<Integer> stack = new Stack<>();
					stack.push(nodo);
					while (!stack.isEmpty()) {
						int actual = stack.pop();
						for (int vecino = 0; vecino < nodos; vecino++) {
							if (!visitados[vecino] && mat[actual][vecino]){
								stack.push(vecino);
								visitados[vecino]=true;
							}
						}
					}
				}
			}
			System.out.println(contador);
			System.out.println();
		}
	}
}
