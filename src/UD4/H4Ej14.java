package UD4;

import java.util.Scanner;

//14. Que rellene un array con 20 números y 
//luego busque un número concreto.
//En caso de repetir numero solo mostrar el primero
public class H4Ej14 {

	public static void main(String[] args) {
		//Definicion de constantes
		final int TAMANO=5;
		
		//Habilitamos la lectura de datos por consola
		Scanner entrada=new Scanner(System.in);
		//1. Declaramos el array
		int [] num;
		int numBusca=0;
		boolean numEncontrado=false;
		//2. Damos tamaño al array
		num= new int [TAMANO];
		//3. Metemos datos en el array
		for(int i=0;i<TAMANO;i++) {
			System.out.println("Introduce un numero: ");
			num[i]=entrada.nextInt();
			
		}
		//4. Mostrar la posicion en la que se encuentra
		System.out.println("Introduce un numero para encontrar su posicion: ");
		numBusca=entrada.nextInt();
		for(int i=0;i<TAMANO;i++) {
			if ((numBusca==num[i])&&(numEncontrado==false)) {
				System.out.println("La posicion es: "+(i+1));
				numEncontrado=true;
				
			}else {
				System.out.println("No se encuentra");
			}
				
		}

	}

}
