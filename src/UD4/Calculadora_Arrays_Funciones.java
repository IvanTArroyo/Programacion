package UD4;

import java.util.Scanner;

//Hacer una función principal que lea 5 números por teclado y pruebe los siguiente métodos (no es necesario un menú):
public class Calculadora_Arrays_Funciones {
	static Scanner entrada= new Scanner (System.in);

	public static void main(String[] args) {
	//Definimos el array y su tamaño
	double [] nums = new double [5]; 	
	rellenarArray (nums);
	double suma=sumarElementos (nums);
	System.out.println("La suma total es: "+suma);
	double resta=restarElementos (nums);
	System.out.println("La resta total es: "+resta);
	double mult=multiplicarElementos (nums);
	System.out.println("La multiplicacion total es: "+mult);
	double div=dividirElementos (nums);
	System.out.println("La division total es: "+ div);
	double prom=calcularPromedio(nums);
	System.out.println("El promedio total es: "+prom);
	
	double[] arrayInv=invertirArray(nums);
	for (int i=0;i<nums.length;i++) {
		System.out.println(arrayInv[i]);
	}
	
	}
	//rellenar el array
	public static void rellenarArray (double [] nums) {
		for (int i=0;i<5;i++) {
			System.out.println("Introduzca los valores: ");
			nums[i]=entrada.nextDouble();
		}
	}
	//calcular la suma
	public static double sumarElementos (double [] nums) {
		//definimos variable suma siempre antes del for porque sino inicializamos variable en cada interaccion
		double suma = 0;
		for (int i=0;i<nums.length;i++) {
			suma = nums[i]+suma;
		}return suma;	
	}
	//calcular resta
	public static double restarElementos (double [] nums) {
		double resta =0;
		for (int i=0;i<nums.length;i++) {
			resta = resta - nums [i];
		}return resta;
	}
	//calcular multriplicacion
	public static double multiplicarElementos (double [] nums) {
		double mult =1;
		for (int i=0;i<nums.length;i++) {
			mult = mult * nums [i];
		}return mult;
	}
	//calcular division
	public static double dividirElementos (double [] nums) {
		double div=1;
		for (int i=0;i<nums.length;i++) {
			if (nums[i]==0) {
				System.out.println("No se puede dividir entre 0");
				div=0;
			}else
				div = div / nums[i];
		}return div;
	}
	//calcular promeddio
	public static double calcularPromedio (double [] nums) {
		double prom=0;
		//llamamos a la funcion de sumar elementos y
		// y dividimos entre nums.length que es el tamaño del array(5)
		prom = sumarElementos(nums)/(nums.length);
		return prom;
	}
	//invertir array
	public static double[] invertirArray (double [] nums) {
		double [] arrayInv = new double [nums.length];
		for (int i=0;i<nums.length;i++) {
			arrayInv[i]=nums[nums.length-(i+1)];
		}
		return arrayInv;
	}

}
