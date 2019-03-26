package p11498;

import java.util.Scanner;

public class Main {

	private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		int k=sc.nextInt();
		while(k>0){
			int x,y;
			x=sc.nextInt();
			y=sc.nextInt();
			for (int i = 0; i < k; i++) {
				int n,m;
				n=sc.nextInt();
				m=sc.nextInt();
				if(n==x||m==y){
					System.out.println("divisa");
				}else if(n<x){
					if(m>y){
						System.out.println("NO");
					}else{
						System.out.println("SO");
					}
				}else{
					if(m>y){
						System.out.println("NE");
					}else{
						System.out.println("SE");
					}
				}
			}
			
			k=sc.nextInt();
		}
	}
}
