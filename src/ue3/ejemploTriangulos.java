package ue3;

import java.util.Scanner;

public class ejemploTriangulos {

	public static void main(String[] args) {
		//Habilitamos la lectura de datos por consola
		Scanner entrada=new Scanner(System.in);
		//Declaramos variables
		double lado1,lado2,lado3,perimetro;
		int opcion;
		//menú
		do {
		//mostramos menu
			System.out.println("Opciones del menú");
			System.out.println("1.Equilatero");
			System.out.println("2.Isosceles");
			System.out.println("3.Escaleno");
			System.out.println("4.Salir");
			//leemos opcion
			opcion=entrada.nextInt();
			switch(opcion) {
				//caso equilatero
				case 1:
					System.out.println("Introduce el lado");
					lado1=entrada.nextInt();
					perimetro=3*lado1;
					System.out.println("El perimetro es: "+perimetro);
				break;
				//caso isosceles
				case 2:
					System.out.println("Introduce el lado");
					lado1=entrada.nextInt();
					lado2=entrada.nextInt();
					perimetro=(2*lado1)+lado2;
					System.out.println("El perimetro es: "+perimetro);
				break;
				//caso escaleno
				case 3:
					System.out.println("Introduce el lado");
					lado1=entrada.nextInt();
					lado2=entrada.nextInt();
					lado3=entrada.nextInt();
					perimetro=lado1+lado2+lado3;
					System.out.println("El perimetro es: "+perimetro);
				break;
				//caso salir
				case 4:
					System.out.println("Hasta otra");
				break;
				//caso por defecto
				default:
					System.out.println("Opcion no válida");
					
			}
			
		}while (opcion!=4);
	}

}
