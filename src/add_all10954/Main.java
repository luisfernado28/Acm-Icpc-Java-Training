package add_all10954;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int caso=sc.nextInt();
		while(caso>0){
			int var;
			int [] ejer= new int[caso];
			//llenado de vector con valores
			for (int i = 0; i < caso; i++) {
				var=sc.nextInt();
				ejer[i]=var;
			}
			//ordena el vector demayor a menor			
			caso=sc.nextInt();
		}
	}

}
