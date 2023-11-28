package ue3;

import java.util.Scanner;

//Pida dos numeros entre 0-100, 
//controlar que los valores son correctos, en caso contrario mostrar error (iguales o no estan entre 0-100)
//a<b, mostrar numeros entre a y b en orden creciente
//a>b, mostrar numeros entre a y b en orden decreceinte
public class Examen_Ejercicio_3 {

	public static void main(String[] args) {
		//Habilitamos la lectura de datos por consola
		Scanner entrada=new Scanner(System.in);
		
		//declaramos variables
		int a=0;
		int b=0;
		int cont=0;
		
		//mostrar mensaje y Leemos un entero
		System.out.println("Introduce un primer valor");
		a=entrada.nextInt();
		System.out.println("Introduce un segundo valor");
		b=entrada.nextInt();
		
		//controlamos los valores
		
			if ((a<0)||(a>100)||(b<0)||(b>100)||(a==b)) {
				System.out.println("Error");
			}else { // número están en el rango
				if (a<b)
					for(int i=a;i<=b;i++) {
						System.out.println(i);
					}
				if (a>b)
					for(int i=a;i>=b;i--) {
						System.out.println(i);
					}
			}

	}

}
