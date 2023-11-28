package UNIDAD4;

import java.util.Scanner;

/*. Escribe la función CompruebaSudoku a la que le pasas un array de 9x9 enteros y te
dice si el array contiene un sudoku correcto (devuelve un bool que será true si es
correcto).
 Un sudoku será correcto si en cada fila, en cada columna y en cada
submatriz de 3x3 aparecen todos los números del 1 al 9 y una sola vez cada uno.
Se recomienda crear la función CompruebaArray19 al que le pasas un array de 9
enteros y te dice si en él se encuentran todos los números del 1 al 9 una sola vez.
Con esta función, sólo tendréis que pasar cada fila, columna y submatriz a un array de
9 enteros y pasárselo a esta función para comprobar si está bien.
 */
public class Ejercicio_Sudoku {
	static Scanner entrada= new Scanner (System.in);
	public static void main(String[] args) {
		//declaramos el array de 9x9
		int [][] sudoku = new int [9][9];
		//rellenamos el array
		for (int i=0;i<9;i++) {
			for(int j=0;j<9; j++) {
				System.out.println("Introduce un numero:");
				sudoku[i][j]=entrada.nextInt();
				
			}
		}

	}
	public static boolean compruebaSudoku (int [][] sudoku) {
		if ()
	}
	public static void cuadrante() {
		
	}
	public static void linea(int [][] sudoku) {
		for (int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				if (sudoku[i][j]== sudoku[i][j]) {
					System.out.println("Numero ya introducido, introduzca otro numero: ");
					sudoku[i][j]= entrada.nextInt();
				}	
			}
		}
	}
	public static void columna(int [][] sudoku) {
		for (int j=0; j<9; j++) {
			for(int i=0; i<9; i++) {
				if (sudoku[j][i]== sudoku[j][i]) {
					System.out.println("Numero ya introducido, introduzca otro numero: ");
					sudoku[i][j]= entrada.nextInt();
				}
			}
		}
	}
}
