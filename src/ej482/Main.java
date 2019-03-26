package ej482;

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
		StringTokenizer st,st2;
		
		int casos=fr.nextInt();
		fr.nextLine();
		
		for (int i = 0; i < casos; i++) {
		
			if(i==0) {
			}else {
				System.out.println();
				
			}
			st=new StringTokenizer(fr.nextLine());
			st2=new StringTokenizer(fr.nextLine());			
			
			int r=st.countTokens();
			int[] orden= new int[r];
			String[] valoresAMostrar= new String[r];
			for (int j = 0; j < orden.length; j++) {
				orden[j]=Integer.parseInt(st.nextToken());
			}
			for (int j = 0; j < valoresAMostrar.length; j++) {
				valoresAMostrar[j]=st2.nextToken();
			}
			int cont=1;
			for (int j = 0; j < orden.length; j++) {
				if(cont==orden[j]) {
					System.out.println(valoresAMostrar[j]);
					cont++;
					j=-1;
				}
			}
			fr.nextLine();			
		}
		
		
	}

}

