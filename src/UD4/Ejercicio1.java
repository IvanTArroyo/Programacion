package UD4;

import java.util.Scanner;

//Ejercicio 1. Leer una palabra de 4 letras (letra a letra) 
//y mostrar en una línea la palabra formada y su palíndroma.
public class Ejercicio1 {

	public static void main(String[] args) {
		//Constante tamaño
		final int TAM = 4;
		//Habilitamos la lectura de datos por consola
		Scanner entrada=new Scanner(System.in);
		
		//Declaramos el array y varaibles
		char [] palabra;
		char [] palindroma;
		
		//Damos tamaño al array
		palabra= new char[TAM];
		palindroma = new char [TAM];
		
		//for para meter letras en el array
		for (int i=0;i<TAM;i++) {
			System.out.println("Introduce las letras");
			palabra[i]=entrada.nextLine().charAt(0);
		}
		
		//for para mostrar las letras de final a inicio
		for (int i=0;i<TAM;i++) {
			palindroma[i] = palabra [(TAM-1)-i];
		}
		//mostrar la palabra del derecho y del reves
		for (int i=0;i<TAM;i++)
			System.out.print(palabra[i]);
		System.out.println();
		for (int i=0;i<TAM;i++)
			System.out.print(palindroma[i]);
		
	}
	
}
