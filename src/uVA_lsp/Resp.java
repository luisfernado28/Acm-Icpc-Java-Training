package uVA_lsp;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Resp {
	public void p100(){
		Scanner sc= new Scanner (System.in);
		Queue<Integer> a= new LinkedList<Integer>();
		Queue<Integer> b= new LinkedList<Integer>();
		Queue<Integer> r= new LinkedList<Integer>();
		int limite=0;
		
		while(sc.hasNextInt()){
			int f,l;
			f=sc.nextInt();
			l=sc.nextInt();
			a.add(f);
			b.add(l);
			limite++;
		}
		sc.close();
		for (int i = 0; i < limite; i++) {
			int lim1,lim2;
			lim1=a.poll();
			lim2=b.poll();
			if(lim1>lim2){
				int aux;
				aux=lim1;
				lim1=lim2;
				lim2=aux;
			}
			int R=0;
			for (int j = lim1; j <= lim2; j++) {
				int cont=0;
				int tr=j;
				while(tr>1){
					if(tr%2==0){
						tr=tr/2;
					}else{
						tr=(tr*3)+1;
					}
					cont++;
				}
				if(cont>R){
					R=cont;
				}
				
			}
			r.offer(R);
			
		}
		for (int i = 0; i < limite; i++) {
			System.out.println(a.poll()+" "+b.poll()+""+r.poll());
		}
		
	}
	
	public void p11172(){
		Scanner sc=new Scanner(System.in);
		int lim;
		lim=sc.nextInt();
		int[] a=new int [lim];
		int[] b=new int [lim];
		for (int i = 0; i < lim; i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		for (int i = 0; i < lim; i++) {
			if(a[i]>b[i]){
				System.out.println(">");
			}else if(a[i]<b[i]){
				System.out.println("<");
			}else{
				System.out.println("=");
			}
		}
		
		sc.close();
		
		
	}

}
