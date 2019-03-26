package ej11586;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int casos= sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < casos; i++) {
			String piezas=sc.nextLine();
			int cantidadDePiezas=(piezas.length()+1)/3;
			String[] puntas= new String[cantidadDePiezas];
			String jok="";
			int cont=0;
			for (int j = 0; j < piezas.length(); j=j+3) {
				puntas[cont]=jok+piezas.charAt(j)+piezas.charAt((j+1));	
				cont++;
			}
			for (int j = 0; j < puntas.length; j++) {
				String t=puntas[j];
				char search1='M';
				char search2='M';
				
				if(t.charAt(0)=='M'){
					search1='F';
				}
				if(t.charAt(1)=='M'){
					search2='F';
				}
				for (int k = j; k < puntas.length; k++) {
					if(search1==puntas[k].charAt(0)||search1==puntas[k].charAt(1))
						
				}
				
			}
			
			
		}
		
	}

}
