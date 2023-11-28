package ue3;

import java.util.Scanner;

//22.Que calcule la media de 10 números.
public class H2Ej22 {

	public static void main(String[] args) {
		//habilitamos lectura por teclado
		Scanner entrada=new Scanner(System.in);
		//inicializamos las variables
		int suma=0;
		int nota=0;
		int cont=0;
		double media=0;
		//bucle
		while (cont<10) {
			//mostrar por pantalla
			System.out.println("Introduce una nota");
			//leemos por pantalla
			nota=entrada.nextInt();
			suma=nota+suma;
			cont=cont+1;
		}
		
		media=suma/(cont);
		System.out.println("la media es: "+media);

	}

}
