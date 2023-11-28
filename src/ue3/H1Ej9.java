package ue3;
/*9. Que imprima la suma de todos los números pares que van del 1 al 100 y diga cuántos
hay.
*/
public class H1Ej9 {

	public static void main(String[] args) {
		//declaracion de variables
		int num=0;
		int acum=0;
		int contNumPares=0;
		//mientras (cont<=100)
		//	cont <- cont + 2
		//	acum <- acum + cont
		//Fin_Mientras
		while (num<100) {
			num=num+2;
			acum=acum+num;
			contNumPares=contNumPares+1;
		}
		System.out.println("Hay: " +contNumPares+  "y"  +acum);
	}

}
