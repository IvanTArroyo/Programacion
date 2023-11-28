package ue3;
/*18.Que escriba las tablas de multiplicar del 0 al 10.*/

public class H1Ej22 {

	public static void main(String[] args) {
		// declaracion de variables
		int a=0;
		int b=0;
		int mult=0;
		//mientras (a<=10)
		//	mientras(b<=10)
		//		mult<-a*b
		//		mostras mult
		//		b <- b +1
		//	Fin_mientras
		//	a <- a+1
		//Fin_Mientras
		while (a<=10) {
			while(b<=10) {
				mult=a*b;
				System.out.println(mult +"=" +a+ '*' +b);
				b=b+1;
			}
			a=a+1;
			b=0;
		}
		
	}

}
