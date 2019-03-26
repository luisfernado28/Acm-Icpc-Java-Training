package ej10783;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int casos= sc.nextInt();
		
		for (int i = 0; i < casos; i++) {
			int min = sc.nextInt();
			int max = sc.nextInt();
			int res=0;
			if(min%2==0)
				min=min++;
			for (int j = min; j <= max;j=j+2) {
				res=res+j;
			}
			System.out.println("Case "+(i+1)+": "+res);
			
		}
		sc.close();
	}
}
