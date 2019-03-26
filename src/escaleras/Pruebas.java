package escaleras;

import java.util.Scanner;

public class Pruebas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		String[] res = new String[a];
		for (int i = 0; i < a; i++) {
			String str = "";
			b = sc.nextInt();
			for (int j = 0; j < b; j++) {
				str = str + sc.next();
				str = str + " ";
			}
			res[i] = str;
		}

		for (int i = 0; i < res.length; i++) {
			String palabra = "", respuesta="", inicial="", medio="", fin="";
			boolean corte=true;
			palabra = res[i];
			for (int j = 0; j < palabra.length(); j++) {
				if ((palabra.charAt(j)) == '#' || (palabra.charAt(j)) == ' ') {
					if(corte){
						inicial=inicial+palabra.charAt(i);						
					}else{
						fin=fin+palabra.charAt(i);						
					}
				}else{ 
//				((palabra.charAt(j)) != '#' || (palabra.charAt(j)) != ' ')
					corte=false;
					medio=medio+palabra.charAt(i);
					
				}
			}
			
			respuesta=fin+medio+inicial;
			res[i]=respuesta;

		}
		
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}

		sc.close();
	}

}
