package UD4;

import java.util.Scanner;

//Edades comprendidas entre 18 y 99. Array de 10 personas.
//3 metodos estaticos
//a)public static void pedirEdades (int [] edades); introducir edades dentro de la funcion.
//b) public static double calculeEdadMedia (int[] edades); 
//c) public static int damePersonasEnJubilacion (int [] edades); contador de personas mayores de 65.
public class Examen2_Ejercicio3_Jubilacion {
	static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {
		//declaramos el array y variable
		int [] edades = new int [10];
		
		pedirEdades(edades);
		

	}
	//rellenamos el array
	public static void pedirEdades (int [] edades) {
		for (int i=0; i<edades.length; i++) {
			System.out.println("Introduce una edad");
			edades[i] = entrada.nextInt();
			while ((edades[i]<18)||(edades[i]>99)) {
				System.out.println("Error, edad no comprendida, introduzca una edad entre 18 y 99");
				edades [i] = entrada.nextInt();
			}
		}
	}
	public static double calculeEdadMedia (int[] edades) {
		double media = 0;
		for (int i=0; i<edades.length; i++) {
			media = media + edades[i];
		}
		return media = media/edades;
	}
	public static int damePersonasEnJubilacion (int [] edades)

}
