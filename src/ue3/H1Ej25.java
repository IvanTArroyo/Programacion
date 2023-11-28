package ue3;
//25. Que calcule el sueldo que le corresponde al trabajador de una empresa que cobra
//40.000 euros anuales, el programa debe realizar los cálculos en función de los
//siguientes criterios:
//a. Si lleva más de 10 años en la empresa se le aplica un aumento del 10%.
//b. Si lleva menos de 10 años pero más que 5 se le aplica un aumento del 7%.
//c. Si lleva menos de 5 años pero más que 3 se le aplica un aumento del 5%.
//d. Si lleva menos de 3 años se le aplica un aumento del 3%

//Inicio
public class H1Ej25 {

	public static void main(String[] args) {
	//Declaracion de variables
	//sueldo total, porcentaje, años
	double sueldo;
	int anos;
	//Inicializamos años <- 0
	anos=0;
	//Inicilizamos sueldo
	sueldo=0;
	//Mostrar sueldo
	System.out.println("Mostrar sueldo");
	//Leer sueldo
	sueldo=40000;
	//Mostrar "Cuantos años lleva en la empresa"
	System.out.println("Cuantos años lleva en la empresa");
	//Leer años
	anos=6;
	
	if (anos<=3) {
		sueldo=sueldo*0.03+sueldo;
	}
	
	else if((anos>3)&&(anos<=5)){
		sueldo=sueldo*0.05+sueldo;
		
	}
	else if ((anos>5)&&(anos<=10)) {
		sueldo=sueldo*0.07+sueldo;
	}
	
	else if (anos>10) {
		sueldo=sueldo*0.1+sueldo;	
	}
	System.out.println("Su sueldo final es:"+sueldo) ;
		
//Fin
	}

}
