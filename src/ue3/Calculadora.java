package ue3;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		//Habilitamos la lectura de datos por consola
		Scanner entrada=new Scanner(System.in);
		//declaramos variables
		char opcion='0';
		double num1,num2,suma,rest,mult,div=0;
		//menu
		do {
			//mostramos menu
			System.out.println("Opciones del menú");
			System.out.println("Introduce una letra para realizar una operacion");
			System.out.println("S. Sumar");
			System.out.println("R. Restar");
			System.out.println("M. Multiplicar");
			System.out.println("D. Dividir");
			System.out.println("A. Salir");
			//leemos opcion
			opcion=entrada.nextLine().charAt(0);
			switch (opcion) {
				//suma
				case 's': case 'S':
					System.out.println("Introduzca el primer operando");
					num1=entrada.nextDouble();
					System.out.println("Introduzca el segundo operando");
					num2=entrada.nextDouble();	
					suma=num1+num2;
					System.out.println("El resultado de la suma es: "+suma);
					entrada.nextLine();
				break;
				//caso resta
				case 'r': case 'R':
					System.out.println("Introduzca el primer operando");
					num1=entrada.nextDouble();
					System.out.println("Introduzca el segundo operando");
					num2=entrada.nextDouble();	
					rest=num1-num2;
					System.out.println("El resultado de la rest es: "+rest);
					entrada.nextLine();
				break;
				//caso multiplicacion
				case 'm': case 'M':
					System.out.println("Introduzca el primer operando");
					num1=entrada.nextDouble();
					System.out.println("Introduzca el segundo operando");
					num2=entrada.nextDouble();	
					mult=num1*num2;
					System.out.println("El resultado de la multiplicacion es: "+mult);
					entrada.nextLine();
					
				break;
				//caso division
				case 'd': case 'D':
					System.out.println("Introduzca el primer operando");
					num1=entrada.nextDouble();
					System.out.println("Introduzca el segundo operando");
					num2=entrada.nextDouble();
					if (num2==0) {
						System.out.println("Error: no se puede dividir entre 0");
						entrada.nextLine();
					}else if (num2!=0) {
						div=num1/num2;
						System.out.println("El resultado de la division es: "+div);
						entrada.nextLine();
					}
				break;
				//caso salir
				case 'a': case 'A':
					System.out.println("Hasta luego!");
				break;
				default:
					System.out.println("Opcion no valida");	
			}
			
		}while((opcion!='a')&&(opcion!='A'));

	}
}