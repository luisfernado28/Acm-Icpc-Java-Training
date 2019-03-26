package summingDigits;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int n=sc.nextInt();
		List<Integer> res=new LinkedList<>();
		while(n!=0){
			int var=0;
			if(n%9==0){
				var=9;
			}else{
				var=n%9;
			}
			res.add(var);
			n=sc.nextInt();
		}
		int largo=res.size();
		for (int i = 0; i < largo; i++) {
			System.out.println(res.get(i));
		}
		sc.close();
	}
}
