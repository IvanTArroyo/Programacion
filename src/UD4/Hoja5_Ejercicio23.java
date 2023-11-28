package UD4;

import java.util.Scanner;

//23. Que realice los diferentes métodos de ordenación de arrays utilizando las funciones:
//● Relleno de un array
//● Copia un array a otro.
//● Mostrar en pantalla todos los valores.
public class Hoja5_Ejercicio23 {
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Determine el tamaño del array: ");
		int tam=0;
		tam=entrada.nextInt();
		int [] arrayInicial = new int [tam];
		rellenArray(arrayInicial);
		

	}
	//1.Rellenar el array
	public static void rellenArray (int [] arrayInicial) {
		for (int i=0;i<arrayInicial.length;i++) {
			System.out.println("Introduce valor: ");
			arrayInicial[i]= entrada.nextInt();
		}
	}

}
