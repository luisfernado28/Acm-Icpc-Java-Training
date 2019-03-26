package ej489;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numerodeturno=sc.nextInt();
		int round=1;
		while(numerodeturno!=-1){
			String res=sc.next();
			String palabra=sc.next();
			String resultado="You chickened out.";
			int largo=0;
			if(res.length()>palabra.length()){
				largo=palabra.length();
			}else{
				largo=res.length();
			}
				
			for (int i = 0; i < largo;i++) {
				if(res.charAt(i)==palabra.charAt(i)){
					resultado="You win.";
				}
			}
			numerodeturno=sc.nextInt();
			System.out.println("Round "+round);
			round++;
			if(numerodeturno==-1){
				System.out.println("You lose." );
				break;
			}else{
				System.out.println(resultado);				
			}
		}
	}
}
