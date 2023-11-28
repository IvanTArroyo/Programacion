package UD4;

import java.util.Scanner;

//Pedir un numero de 5 cifras
//se debe controlar, si no lo es se pide de nuevo
//mostrar por pantalla si es capicua o no
public class Examen2_Ejercicio_1_Capicua {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		//declaracion de variables
		int capicuaLeido=0;
		int capicua=0;
		
		//leemos el numero
		System.out.println("Introduzca un numero de 5 cifras");
		capicuaLeido=entrada.nextInt();
		//controlamos que el numero es de 5 cifras
		while((capicuaLeido<10000)||(capicuaLeido>99999)) {
			System.out.println("No es un numero de 5 cifras, introduzcalo de nuevo");
			capicuaLeido = entrada.nextInt();
		}
		
		capicua = capicuaLeido;
		//pasamos el numero metido por el usuario a otra variable con la que vamos a comprobar si es capicua
		while (capicua >=10001) {
			capicua = capicua - 10001;
		}
		//Utilizamos el while para comprobar si el el primer numero es igual al ultimo y el cuarto es igual al segundo
		while (capicua >=1010) {
			capicua = capicua - 1010;
		}
		//Utilizamos un while para para restar el numero del medio
		while (capicua >=100) {
			capicua = capicua - 100;
		}
		//comprobamos con un if si la condicion de todas las restas dan 0, en ese caso seria capicua,
		//en caso contrario NO seria un numero capicua.
		if (capicua==0) {
			System.out.println(capicuaLeido+" Es un numero capicua.");
		}else {
			System.out.println(capicuaLeido + " NO es un numero capicua.");
		}
		

	}

}
