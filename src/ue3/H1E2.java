package ue3;
//2. Que pida un número y diga si es par o impar.

//Inicio
public class H1E2 {
	public static void main(String[] args) {
	//declaracion de variables
	// tipo_dato nombre_variable;
	int num;
	//inicializo la variable
	//num <- 0
	num=0;
	//Mostrar por pantalla "Introduce un numero"
	System.out.println("Introduce un numero");
	//Leer num
	num=5;
	//Si (num MOD 2)=0 entonces
	if ((num%2)==0) {
	//Mostrar "Es par"
		System.out.println("Es par");
	//sino
	}else {
	//Mostrar "Es impar"
		System.out.println("Es impar");
	//Fin_si
	}
//Fin
	}

}
