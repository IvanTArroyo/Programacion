package ue3;
//que dibuje asteriscos por numeros que pongamos y filas
import java.util.Scanner;

public class asteriscos_fig_1 {

	public static void main(String[] args) {
		//Habilitamos la lectura de datos por consola
		Scanner entrada=new Scanner(System.in);	
		//declaracion de variables
		int filasLeidas,filasCont=1;
		int numAst=1;
		
		
		System.out.println("Introduzca el número de filas: ");
		//leemos numero 
		filasLeidas=entrada.nextInt();
		//bucle for para recorrer filas
		for (filasCont=1;filasCont<=filasLeidas;filasCont++) {
			//pintamos asteriscos
			for (numAst=1;numAst<=filasCont;numAst++) {
				System.out.print('*');
		}
		System.out.println();
	}
		
	}	

}
