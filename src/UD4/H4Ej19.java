package UD4;

import java.util.Scanner;

//19. Que rellene una matriz de 3x3 y
//muestre su traspuesta (la traspuesta se consigue intercambiando filas por columnas y viceversa).
public class H4Ej19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		//decalaramos los dos arrays
		int [][] matriz = new int [3][3];
		int [][] matrizT =new int [3][3];
		int aux=0;
		//rellenamos el primer array de 3x3
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				System.out.println("Introduzca 9 valores");
				matriz[i][j]=entrada.nextInt();
			}
			
		}
		System.out.println("Matriz Original");
		//mostramos el array en modo matriz
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}	
		
		//Utilizando el primer array rellenamos el array traspuesto
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				matrizT[j][i] = matriz[i][j];
			}	
		}
		System.out.println("Matriz Traspuesta");
		//mostramos el array en modo matriz
		for (int j=0;j<3;j++) {
			for (int i=0;i<3;i++) {
				System.out.print(matrizT[j][i]+" ");
			}
			System.out.println();
		}
		/*Esto si lo queremos mostrar directamente sin meter los resultados en otro array,
		 * pero para ello deberiamos quitar la matrizT
		 * for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				System.out.print(matriz[j][i]+" ");
			}
			System.out.println();
		}*/	
	}	
}