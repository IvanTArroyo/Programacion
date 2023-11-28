package ue3;

import java.util.Scanner;

//Que solicite la media de X números, se dejarán de solicitar 
//números hasta que se introduzca el cero.
public class H2Ej18casa {

	public static void main(String[] args) {
		//habilitamos lectura
		Scanner entrada=new Scanner(System.in);
		//como no sabemos cuantas vueltas va a dar en el bucle utilizamos un while en vez de un for
		//declaramos variables e inicializamos 
		
		double media=0;
		double suma=0;
		int i=0;
		int nota;
		System.out.println("Introduce una nota para hallar la media");
		//leer nota
		nota=entrada.nextInt();
		while (nota!=0) {
			suma=suma+nota;
			i=i+1;
			System.out.println("Introdduce otra nota");
			//leer nota
			nota=entrada.nextInt();
		}
		if (i!=0) {
		media=suma/i;
		System.out.println("La nota media es: "+ media);
		}else {
			System.out.println("No la puedo calcular");
		}

	}

}
