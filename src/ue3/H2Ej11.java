package ue3;
//11. Que pida dos números y muestre todos los números que van desde el primero al segundo.
//Se debe controlar que los valores son correctos.
import java.util.Scanner;

public class H2Ej11 {

	public static void main(String[] args) {
		//hablitamos lectura 
		Scanner entrada=new Scanner(System.in);	
		//Inicializamos variables
		int numero1;
		int numero2=0;
		//mostramos mensaje y leemos numeros
		System.out.println("Introduzca numero 1: ");
		numero1=entrada.nextInt();
		System.out.println("Introduzca numero 2: ");
		numero2=entrada.nextInt();
		//alternativa if para numero1>numero2
		if (numero1>numero2) {
			System.out.println("Error");
		}
		//Como sabemos las vueltas maximas que va a dar en un bucle utilizamos
		//el bucle FOR
		for (numero1=numero1;numero1<=numero2;numero1=numero1+1) {
			System.out.println("Los numeros son: "+numero1);
		}
	}

}
