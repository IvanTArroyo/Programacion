package UD4;
//2. Que rellene un array con los 100 primeros números enteros y
//los muestre en pantalla en orden descendente.
public class H4Ej2 {

	public static void main(String[] args) {
		//1. Declaramos el array
		int [] numero;
		//2. Damos tamaño el array
		numero= new int[100];
		//declaramos variable
		int numeroGuardado=1;
		//3. rellenamos el array
		for (int i=0;i<100;i++) {
			numero[i]=numeroGuardado;
			numeroGuardado++;
		}
		//4. Muestro el array
		for (int i=99;i>=0;i--) {
			System.out.print(numero[i]+" ");
		}

	}

}
