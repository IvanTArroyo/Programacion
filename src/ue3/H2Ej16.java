package ue3;
//16. Que pida un número y muestre en pantalla
//el mismo número de asteriscos.
import java.util.Scanner;

public class H2Ej16 {

	public static void main(String[] args) {
		//Declaramos para poder monstrar por pantalla
		Scanner entrada=new Scanner(System.in);
		//Declaracion de variables e inicializacion
		int i=0;
		int j;
		char caracter ='*';
		
		//mostrar pon pantalla mensaje
		System.out.println("Introduce un numero: ");
		//leer numero
		j=entrada.nextInt();
		
		//blucle for
		for (j=j;j>i;j=j-1) {
			System.out.print(caracter);
			
		}
		
		

	}

}
