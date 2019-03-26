package ejr_indUva;

public class Grafos {
	private int[][] Adyacentes;
	private Object[] Informacion;
	private int nodos;
	private boolean vacio=true;
	
	public Grafos(int numeroNodos){
		Adyacentes = new int [numeroNodos][numeroNodos];
		Informacion =new Object[numeroNodos];
		for (int i = 0; i < numeroNodos; i++) {
			for (int j = 0; j < numeroNodos; j++) {
				Adyacentes[i][j]=0;
				System.out.print(Adyacentes[i][j]);
				nodos= numeroNodos;
			}
			System.out.println();
		}
		System.out.println(nodos);
	}
}
