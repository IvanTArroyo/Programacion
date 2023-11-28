package UD4;

public class Ejemplo_Funcion {
	//funcion principal. Es la UNICA funcion
	//que se ejecuta en un programa
	public static void main(String[] args) {
		int sum=suma(5,4);
		System.out.println(sum);

	}
	//Definimos una funcion
	//1. definimos la cabecera
	public static int suma(int a, int b) {
		return a+b; //2. cuerpo de una funcion
	}
}
