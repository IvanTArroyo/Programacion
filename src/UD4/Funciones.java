package UD4;

import java.util.Scanner;

public class Funciones {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int op1= 0;
		int op2 = 0;
		
		
		int sumar=suma( op1,op2);
		System.out.println(sumar);
		
		

	}
	public static int suma(int op1, int op2) {
		op1=entrada.nextInt();
		op2=entrada.nextInt();
		int hola=op1+op2;		
		return hola;
		
		
	}

}

