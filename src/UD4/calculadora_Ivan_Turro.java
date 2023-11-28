package UD4;

import java.util.Scanner;

public class calculadora_Ivan_Turro {

	public static void main(String[] args) {
		// Habilitamos la lectura de datos por consola
		Scanner entrada = new Scanner(System.in);
		// variables
		char opcion;
		double op1 = 0;
		double op2 = 0;
		double resul = 0;

		do {
			// llamamos a la funcion "menu"
			menu();

			// leemos opcion
			opcion = entrada.nextLine().charAt(0);
			switch (opcion) {

			// suma
			case 's':
			case 'S':	
				System.out.println("Introduzca un primer operando");
				op1 = entrada.nextDouble();
				System.out.println("Introduzca un segundo operando");
				op2 = entrada.nextDouble();

				resul = suma(op1, op2);

				System.out.println("El resultado es:" + resul);
				// capturamos el "Enter"
				entrada.nextLine();
				break;
			// resta
			case 'r':
			case 'R':	
				System.out.println("Introduzca un primer operando");
				op1 = entrada.nextDouble();
				System.out.println("Introduzca un segundo operando");
				op2 = entrada.nextDouble();

				resul = resta(op1, op2);

				System.out.println("El resultado es:" + resul);
				// capturamos el "Enter"
				entrada.nextLine();
				break;
			// multiplicación
			case 'm':
			case 'M':	
				System.out.println("Introduzca un primer operando");
				op1 = entrada.nextDouble();
				System.out.println("Introduzca un segundo operando");
				op2 = entrada.nextDouble();

				resul = multiplicacion(op1, op2);

				System.out.println("El resultado es:" + resul);
				// capturamos el "Enter"
				entrada.nextLine();
				break;
			// division
			case 'd':
			case 'D':
				System.out.println("Introduzca un primer operando");
				op1 = entrada.nextDouble();
				do {
					System.out.println("Introduzca un segundo operando");
					op2 = entrada.nextDouble();
					// capturamos el "Enter"
					entrada.nextLine();
				} while (op2 == 0);

				resul = division(op1, op2);
				System.out.println("El resultado es: " + resul);
				break;

			// salir
			case 'a':
			case 'A':	
				System.out.println("Hasta pronto!!");
				break;

			// caso por defecto, opcion no valida
			default:
				System.out.println("Opcion inválida: Introduzca una de las opciones anteriores ");
			}
		} while ((opcion != 'a') && (opcion != 'A'));

	}

	// funcion de suma
	public static double suma(double op1, double op2) {
		return op1 + op2;
	}

	// funcion de resta
	public static double resta(double op1, double op2) {
		return op1 - op2;
	}

	// funcion de resta
	public static double multiplicacion(double op1, double op2) {
		return op1 * op2;
	}

	public static double division(double op1, double op2) {
		return op1 / op2;
	}

	public static void menu() {
		// mostramos menu
		System.out.println("Opciones del menú");
		System.out.println("Introduce una letra para realizar una operacion");
		System.out.println("S. Sumar");
		System.out.println("R. Restar");
		System.out.println("M. Multiplicar");
		System.out.println("D. Dividir");
		System.out.println("A. Salir");
	}
}
