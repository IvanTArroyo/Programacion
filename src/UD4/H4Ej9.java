package UD4;

import java.util.Scanner;

//9. Que lea 5 números por teclado, los copie a otro array 
//multiplicados por 2 y muestre el segundo array.
public class H4Ej9 {

	public static void main(String[] args) {
		//Habilitamos la lectura de datos por consola
		Scanner entrada=new Scanner(System.in);
		//1.Declaramos los array
		int [] num;
		int [] mult;
		//2. Damos tamaño a los arrays
		num= new int[5];
		mult= new int [5];
		//3. Metemos los datos en el primer array
		for(int i=0;i<5;i++) {
			System.out.println("Introduzca los datos: ");
			num[i]=entrada.nextInt();
		}
		//4. Guardamos la multiplicacion del primer array
		for (int i=0;i<5;i++) {
			mult[i]=num[i]*2;
			
		}
		//5. mostramos es segundo array
		for (int i=0;i<5;i++) {
			System.out.println(mult[i]+" ");		
		}

	}

}
