package UD4;

import java.util.Scanner;

//Programa 2 metodos estaticos
//public static boolean esValido (int num)
//public static void multiplicar (int num)
// main: comprueba num entre 0 y 10 sino error y volver a pedir y 
//main: muestra la tabla de multiplicar
public class Examen2_Ejercicio2_notas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		//declaracion de variables
		int nota =0;
		
		do {
			System.out.println("Introduzca una nota entre 0 y 10");
			nota = entrada.nextInt();
			if (!esValido(nota))
				System.out.println("Rango no válido");
		}while (esValido(nota)==false);
		multiplicar(nota);
		
	}
	public static boolean esValido(int nota) {
		if ((nota < 0)||(nota > 10)) {
			return false;
		}else {
			return true;
		}
	}
	public static void multiplicar (int nota) {
		for (int i=0;i<=10;i++) {
			System.out.println(nota+ "X"+i+"="+(nota*i));
		}
	}

}
