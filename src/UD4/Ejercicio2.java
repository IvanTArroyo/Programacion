package UD4;

import java.util.Scanner;

//Ejercicio 2. Leer 10 números,
//almacenarlos en un array,
//luego tiene que salir el siguiente menú:

//a. el valor máximo y mínimo del array

//b. eliminar duplicados y sutituirlos por 0 (todos menos el primero)

//c. rotar array

//d. salir
public class Ejercicio2 {

	public static void main(String[] args) {
		//Habilitamos la lectura de datos por consola
		Scanner entrada=new Scanner(System.in);
		
		//Constante tamaño del array
		final int TAM=10;
		
		//Declaramos el array y damos tamaño al array
		int [] numeros=new int [TAM];
		
		//Declaracion de variables
		char opcion;
		
		//Introducir numeros en el array
		for (int i=0;i<TAM;i++) {
			System.out.println("Introduce 10 numeros:");
			numeros[i]=entrada.nextInt();
		}
		do {
			//mostramos el menú
			System.out.println("Elija una opcion: ");
			System.out.println("a. el valor maximo y minimo del array");
			System.out.println("b. eliminar duplicados y sutituirlos por 0 (todos menos el primero)");
			System.out.println("c. rotar array");
			System.out.println("d. salir");
			//leemos opcion
			opcion=entrada.nextLine().charAt(0);
			//switch case para las opciones
			switch (opcion) {
			//el valor maximo y minimo del array
			case 'a': case 'A':
				for(int i=0;i<TAM;i++) {
					
				}
			//eliminar duplicados y sutituirlos por 0 (todos menos el primero)	
			case 'b': case'B':
				for(int i=0;i<TAM;i++) {
					
				}
			//rotar array
			case 'c': case 'C':
				int [] num_Reves = new int [TAM];
				for (int i=0;i<TAM;i++) {
					num_Reves[i]= numeros[(TAM-1)-i];
				}	
				for(int i=0;i<TAM;i++)
					System.out.println(num_Reves[i]);
				break;
			case 'd': case 'D':
				System.out.println("¡¡¡Hasta luego!!!");
			default:
				System.out.println("La opcion es incorrecta");
			}	
		} while (opcion!='d');		
				
	}

}


