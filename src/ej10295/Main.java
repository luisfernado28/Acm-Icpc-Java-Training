package ej10295;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int palabras=sc.nextInt();
		int descripciones=sc.nextInt();
		String[] clave= new String[palabras];
		int[] valor= new int[palabras];
		for (int i = 0; i < palabras; i++) {
			clave[i]=sc.next();
			valor[i]=sc.nextInt();
		}
		for (int i = 0; i < descripciones; i++) {
			int valorpersona=0;
			String palabra=sc.next();
			while(!palabra.equals(".")){
				for (int j = 0; j < palabras; j++) {
					if(palabra.equals(clave[j]))
						valorpersona =valorpersona+valor[j];
				}
				palabra=sc.next();
			}
			System.out.println(valorpersona);
		}
	}

}
