package UNIDAD4;

import java.util.Scanner;

//17. Que muestre los primeros 100 números de izquierda a derecha usando un array de dos dimensiones,
//la última fila a mostrará la suma de sus respectivas columnas.
public class H4Ej17 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
		int [][] numeros = new int [11][10];
		int cont=1;
		int acum=0;
		
		//rellenamos el array hasta el 10x10
		for (int i=0;i<10;i++) {
			for (int j=0; j<10; j++) {
				numeros [i][j]= cont;
				cont++;
			}
		}
		
		System.out.println("matriz de 10x10");
		//mostramos el array
		for (int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				System.out.print(numeros [i][j]+" ");
			}
			System.out.println();
		}
		//rellenamos la ultima fila con el acumulador de cada columna,
		//queremos que crezca mas rapido i que j
		for (int j=0; j<10; j++) {
			//inicializamos a 0 para el nuevo acumulador 
			acum=0;
			for(int i=0; i<11; i++) {
				acum = acum + numeros[i][j];
			}
			//metemos el numero aqui porque si lo metemos dentro del for de i va a cumulando todos los numeros por los que pasa.
			numeros[10][j]=acum;
		}
		System.out.println("Matriz con acumuladores");
		//mostramos de nuevo el array con los acumuladores en la ultima posicion
		for (int i=0; i<11; i++) {
			for(int j=0; j<10; j++) {
				System.out.print(numeros [i][j]+" ");
			}
			System.out.println();
		}

	}

}
