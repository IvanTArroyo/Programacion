package ue3;

import java.util.Scanner;

//leer dos numeros por teclado y mostrar suma
public class ejemplo_leer_teclado {

	public static void main(String[] args) {
		//Habilitamos la lectura de datos por consola
		Scanner entrada=new Scanner(System.in);
		int num1, num2;
		System.out.println("Introduce numero 1");
		//Leer num1
		num1=entrada.nextInt();
		System.out.println("Introduce numero 2");
		//Leer num2
		num2=entrada.nextInt();
		
		System.out.println("La suma es: "+(num1+num2));
	}

}
