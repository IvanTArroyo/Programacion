package UD4;

import java.util.Scanner;

//que pida 10 notas y muestr la media
//ademas debera mostrar las notas pedidas
public class Ejemplo_Arrays {

	public static void main(String[] args) {
		//habilatamos entrada por scanner
		Scanner entrada=new Scanner(System.in);
		//1. Definimos el array de notas
		int [] notas;
		int suma=0;
		//2. Construimos el array de 10 posiciones
		notas=new int [10];
		//3. Metemos el valor por teclado
		for (int i=0;i<=9;i++) {
			System.out.println("Introduce un valor");
			notas[i]=entrada.nextInt();
			suma=suma+notas[i];
		}
		//4. Mostramos las notas del array
		for(int i=0;i<=9;i++) {
			System.out.println(notas[i]);
		}
		System.out.println("La media es: "+(suma/10));
	}

}
