package ue3;

import java.util.Scanner;

public class H2Ej22_FOR {

	public static void main(String[] args) {
		//Habilitamos la lectura de datos por consola
		Scanner entrada=new Scanner(System.in);	
		//declaracion variables
		int i,num;
		double media=0,suma=0;
		for (i=1;i<=10;i++) {
			System.out.println("introduce un numero");
			//leer num
			num=entrada.nextInt();
			suma=suma+num;
		}
		media=suma/10;
		System.out.println("La media es: "+media);
	}

}
