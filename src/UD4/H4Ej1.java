package UD4;

//1. Que rellene un array con los 100 primeros números enteros y 
//los muestre en pantalla en orden ascendente
public class H4Ej1 {

	public static void main(String[] args) {
		//1. Declaramos Array
		int [] numero;
		//2. Damos un tamaño array
		numero= new int [100];
		//declaramos variable
		int numeroGuardado=1;
		//3. rellenamos el array
		//Introducir los numeros del array
		for (int i=0;i<100;i++) {
			numero[i]=numeroGuardado;
			numeroGuardado++;
		}
		//4. Muestro el array
		for (int i=0;i<100;i++) {
			System.out.print(numero[i]+" ");
		}

	}

}
