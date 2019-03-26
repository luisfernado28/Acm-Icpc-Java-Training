package uVA_lsp;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l;
		int x,y;
		while((l=sc.nextInt())!=0){
			x=sc.nextInt();
			y=sc.nextInt();
			for (int i = 0; i < l; i++) {
				int coor1,coor2;
				coor1=sc.nextInt();
				coor2=sc.nextInt();
				if ((coor1==x)||(coor2==y)){
					System.out.println("divisa");
				}
			}
		}
		
			
			sc.close();
		
		
	}

}