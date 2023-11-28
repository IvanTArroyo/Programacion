package ue3;
//25. Que escriba los primeros 25 dígitos de la sucesión de Fibonacci.
public class H2Ej25 {

	public static void main(String[] args) {
		//declaracion e inicializacion de variables
		int a=0;
		int b=1;
		int c;
		int cont=3;
		//Mostramos los dos primeros términos de la serie
		System.out.println(a);
		System.out.println(b);
		//bucle mientras hasta 25 numeros
		while (cont<=25) {
			c=b+a;
			System.out.println("cont:"+cont+"num:"+c);
			a=b;
			b=c;
			cont=cont+1;
		}
		

	}

}
