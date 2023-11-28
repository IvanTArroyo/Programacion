package ue3;
//21.Que calcule el factorial de un número cualquiera y lo muestre en pantalla.
public class H1Ej21 {

	public static void main(String[] args) {
		// Declaracion de variables e inicializamos
		int fact=1;
		int a=5;
		
		
		//mientras (a<=1)
		//	fact <- fact*a
		//	a <- a-1
		//Fin_Mientras
		while(a<=1) {
			fact=fact*a;
			a=a-1;
		}

	}

}
