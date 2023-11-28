package ue3;
//11. Que pida una letra y detecte si es una vocal.

//Inicio
public class H1E11 {

	public static void main(String[] args) {
	//Declaracion de variables
	//letra
	char letra;
	//inicilizamos letra <- '0'
	letra='0';
	//Mostramos por pantalla "Introduce una letra"
	System.out.println("Introduce una letra");
	//leer letra
	letra='a';
	//Comprobamos si es una vocal
	//Si (letra=a) or (letra=e) or (letra=i) or (letra=o) or (letra=u)
	if ((letra=='a')||(letra=='e')||(letra=='i')
		||(letra=='o')||(letra=='u')) {
		//Mostrar "Es vocal"
		System.out.println("Es vocal");
	}else { //es una consonante
		System.out.println("Es una consonante");
	}
		
//Fin
	}

}
