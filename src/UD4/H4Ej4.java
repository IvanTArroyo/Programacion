package UD4;
//4. Que rellene un array con los números pares comprendidos entre
//1 y 100 y los muestre en pantalla en orden ascendente.
public class H4Ej4 {

	public static void main(String[] args) {
		//1. Declaramos el array
		int [] pares;
		//2. Damos tamaño al array
		pares= new int [50];
		//guardamos los numeros
		int numero=2;
		//3. Rellenamos el array
		for(int i=0;i<50;i++) {
			pares[i]=numero;
			numero=numero+2;
		}
		//4. Mostramos el array
		for (int i=0;i<50;i++) {
			System.out.print(pares[i]+ " ");
		}
	}

}
