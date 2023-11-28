package UD4;

import java.util.Scanner;

public class Ejemplo_Funciones_Arrays {
	static Scanner entrada=new Scanner(System.in);
	public static void main(String[] args) {
		//1.declarar un array
		int [] nums = new int[3];
		
		rellenArray(nums);
		muestrArray(nums);
	}
	public static void rellenArray(int[] nums) {
		//2.rellenamos el array
		for(int i=0;i<nums.length;i++) {
			System.out.println("Introduce un valor:");
			nums [i]=entrada.nextInt();
		}
		
	}
	//no hay return porque no devuelve nada (void)
	public static void muestrArray (int []nums) {
		for (int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
}
