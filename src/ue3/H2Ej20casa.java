package ue3;

import java.util.Scanner;

//20. Que haga un menú del tipo “desea salir (S/N)” y
//el programa no termine hasta que el usuario teclee “S”.
public class H2Ej20casa {

	public static void main(String[] args) {
		//Habilitamos la lectura de datos por consola
		Scanner entrada=new Scanner(System.in);
		//Declaramos variables e inicilizamos
		char letra='0';
		//mensaje
		System.out.println("Introduzca una letra (s/n)");
		//leemos letra
		letra=entrada.nextLine().charAt(0);
		
		while (letra!='s') {
			System.out.println("Error!! Introduzca otra letra.");
			letra=entrada.nextLine().charAt(0);
		}
		System.out.println("CIAO!!");
		
			}
		
	}

