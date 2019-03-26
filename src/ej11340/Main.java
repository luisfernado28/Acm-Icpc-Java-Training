package ej11340;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args) throws IOException {
		FastReader sc= new FastReader();
		int cases=sc.nextInt();
		for (int i = 0; i < cases; i++) {
			int[] simbolos= new int[95];
			int numeroCaracteres=sc.nextInt();
			for (int j = 0; j < numeroCaracteres; j++) {
				int letra=((int) (sc.next().charAt(0)))-32;
				simbolos[letra]= sc.nextInt();				
			}
			int numeroDeLineas= sc.nextInt();
			int costo= 0;
			for (int j = 0; j < numeroDeLineas; j++) {
				String linea=sc.nextLine();
				for (char c : linea.toCharArray()) {
					costo+= simbolos[((int)c)-32];
				}
			}
			int dolares= costo/100;
			int cents=(costo%100);
			if(cents==0) {
			System.out.println(dolares+".00$");
				
			}else {
			System.out.println(dolares+"."+cents+"$");
			}
		}
	}
	static class FastReader  {
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

}
