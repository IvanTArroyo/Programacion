package UD4;

import java.util.Scanner;

//2. Que mediante una función calcule el cuadrado de un número cualquiera y
//lo muestre en pantalla.
//4. Que realice la media de dos números, utilizar una función.
public class H5Ej2 {

	public static void main(String[] args) {
		//Habilitamos la lectura de datos por consola
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce un numero para calcular su cuadrado: ");
		//Leemos un entero
		int a=entrada.nextInt();
		int cuad = cuadrado(a);
		System.out.println(cuad);
		

	}
	public static int cuadrado(int a) {
		return(a*a);
	}
}
