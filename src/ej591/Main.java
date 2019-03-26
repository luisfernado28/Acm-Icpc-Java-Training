package ej591;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	public static void main(String[] args) throws IOException {
		FastReader fr= new FastReader();
		
		int largo = fr.nextInt();
		int numeroSet = 1;
		while (largo > 0) {
			int[] columnas = new int[largo];
			int sumatotal = 0;
			for (int i = 0; i < columnas.length; i++) {
				int valorDeColumna = fr.nextInt();
				sumatotal += valorDeColumna;
				columnas[i] = valorDeColumna;
			}
			int largoIdeal = sumatotal / largo;
			int pasos=0;
			for (int i = 0; i < columnas.length; i++) {
				if(columnas[i]>largoIdeal) {
					pasos+= columnas[i]-largoIdeal;
				}
			}
			System.out.println("Set #" + numeroSet);
			System.out.println("The minimum number of moves is " + pasos+".\n");
	
			largo = fr.nextInt();
			numeroSet++;
		}
	}

}
