package UD4;

import java.util.Scanner;

public class Tres_En_Raya_Ivan_Turro {
	//variable global para leer numeros por teclado
	static Scanner entrada = new Scanner(System.in);
	//variable global del array
	static char[] tablero = new char[9];
	public static void main(String[] args) {
		//variables
		char jugador1='X';
		char jugador2='0';
		dibujar_tablero();
	
		
	}
	public static void menu () {
		//Introducimos el menu
		System.out.println("Elija una de las siguientes opciones:");
		System.out.println("1. Jugar una partida");
		System.out.println("2. Mostrar estadistica");
		System.out.println("3. Salir");
	}
	public static void dibujar_tablero() {
		//primera linea
		System.out.println("-------------");
		//segunda linea
		System.out.print("|"+tablero[0]+"|"+tablero[1]+"|"+tablero[2]+"|");
		//tercera linea
		System.out.println("-------------");
		//cuarta linea
		System.out.print("|"+tablero[3]+"|"+tablero[4]+"|"+tablero[5]+"|");
		//quinta linea
		System.out.println("-------------");
		//sexta linea
		System.out.print("|"+tablero[6]+"|"+tablero[7]+"|"+tablero[8]+"|");
		//septima linea
		System.out.println("-------------");
	}
	public static Iniciar
	
}
