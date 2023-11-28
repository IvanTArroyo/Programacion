package tres_en_raya;

import java.util.Scanner;

public class Tres_En_Raya_Ivan_Turro_mod {
	// variable global para leer numeros por teclado
	static Scanner entrada = new Scanner(System.in);
	// variable global del array
	static char[] tablero = new char[9];

	public static void main(String[] args) {
		//variables
		//variable caracteres de jugadores
		char jugador1=' ';
		char jugador2=' ';
		//donde usuario sugiere la posicion
		int pos=0;
		//opcion que mete el usuario para meterese en la opcion del menu
		int opcion=0;
		//contadores de partidas ganas por jugador uno,dos o partidas empatadas
		int empate=0;
		int gan2=0;
		int gan1=0;
		
		//do-while para entrar en un bucle hasta que metamos la opcion de salir
		do {
			//llamar a la funcion menu
			menu();
			//leemos la opcion del usuario
			opcion=entrada.nextInt();
			switch (opcion){
			//caso1 jugar partida
			case 1:
				//vaciamos el array y lo inicializamos con espacios
				iniciar();
				//mostramos el tablero vacio
				dibujaTablero();
				
				do {
					//llamamos a funcion posicion para leer la posicion donde quiere posicionarse el jugador 1
					pos = posicion(pos);
					//validamos la posicion y si no se la volvemos a pedir
					while (!movimientoValido(pos)) {
						System.out.println("ERROR: posicion no válida");
						pos = posicion(pos);
					}
					//guardamos la posicion en el array una vez que esta validada
					mueveJugador1(pos);
					//mostramos como quedaria en el tablero
					dibujaTablero();
					//comprobamos si ha ganado el jugador uno o quedan casilllas disponibles,
					//si es asi, mueve el jugador dos,
					//por el contrario, saltaria el if hasta el while en el que se comprueba definitivamente si ha ganado el jugador uno y saldria del do-while
					if (!ganaJugador1()&&(quedanCasillas()==true)) {
						//guarda la posicion que quiere el jugador 2
						pos = posicion2(pos);
						//comprueba si el moviemiento es valido
						while (!movimientoValido(pos)) {
							System.out.println("ERROR: posicion no válida");
							pos = posicion2(pos);
						}
						//guardamos la posicion en el array una vez validado la casilla
						mueveJugador2(pos);
						//mostramos como quedaria el tablero con el movimiento del jugador 2
						dibujaTablero();
					}
				//comprobamos si quedan casillas vacias o si no ha ganado el jugador uno o si no ha ganado el jugador 2
				//en el caso de que se cumpla una de las 3 condiciones pasariamos a definir si ha ganado jugador 1, o el 2 o ha sido empate en el caso de que ninguno de los dos jugadores haya ganado.	
				}while (esEmpate()==true);
				//si gana jugador uno mostramos mensaje  guardamos en un contador las partidas ganadas por el jugador uno
				muestraResultado();	
				break;
			//caso estadisticas	
			case 2:
				//mostramos un mensaje y con el contador que antes hemos mencionado para mostrar las veces que
				//han ganado el jugador uno, dos y las veces que se han empatado.
				System.out.println("Eljugador 1 ha ganado "+gan1+" veces");
				System.out.println("Eljugador 2 ha ganado "+gan2+" veces");
				System.out.println("Han empatado "+empate+" veces");
				break;
			//caso salir	
			case 3:
				System.out.println("Hasta siempre crack!!");
				break;
			//caso por defecto, que es en caso de que la opcion que se haya metido sea la incorrecta.	
			default:
				System.out.println("Opción incorrecta, intentalo de nuevo.");
			}
		}while (opcion!=3);
		
	}
	//funcion del menu
	public static void menu() {
		// Introducimos el menu
		System.out.println("Elija una de las siguientes opciones:");
		System.out.println("1. Jugar una partida");
		System.out.println("2. Mostrar estadisticas");
		System.out.println("3. Salir");
		
	}
	//funcion para dibujar el tablero
	public static void dibujaTablero() {
		// primera linea
		System.out.println("-------------");
		// segunda linea
		System.out.println("| " + tablero[0] + " | " + tablero[1] + " | " + tablero[2] + " |");
		// tercera linea
		System.out.println("-------------");
		// cuarta linea
		System.out.println("| " + tablero[3] + " | " + tablero[4] + " | " + tablero[5] + " |");
		// quinta linea
		System.out.println("-------------");
		// sexta linea
		System.out.println("| " + tablero[6] + " | " + tablero[7] + " | " + tablero[8] + " |");
		// septima linea
		System.out.println("-------------");
	}
	//funcion para iniciar el tablero cada vez que se inicia una partida
	public static void iniciar() {
		// rellenar el array para dejarlo vacio
		for (int i = 0; i < tablero.length; i++) {
			tablero[i] = ' ';
		}
	}
	//funcion para guardar la posicion del jugador uno en el array y muestre una X en el tablero
	public static void mueveJugador1(int pos) {
		////para el usuario el tablero va del 1 al 9 pero para el array va del 0-8.
		pos = pos - 1;
		tablero[pos] = 'X';

	}
	//funcion para guardar la posicion del jugador dos en el array y muestre una O en el tablero
	public static void mueveJugador2(int pos) {
		//para el usuario el tablero va del 1 al 9 pero para el array va del 0-8.
		pos = pos - 1;
		tablero[pos] = 'O';

	}
	//funcion booleana para decir si el movimeinto es valido
	public static boolean movimientoValido(int pos) {
		//if para decir que la posicion que sugiere el usuario no es menor que 0 o mayor que 9.
		if (pos < 1 || pos > 9) {
			return false;
		}
		//si en la posicion que sugere el usuario hay ya una X o O retornamos falso para decir que ya esta ocupada.
		if ((tablero[pos - 1] == 'X') || (tablero[pos - 1] == 'O')) {
			return false;
		}
		return true;
	}
	//funcion para decir si quedan casillas vacias con un for que recorra todo el array hasta que encuentre una posicion vacia que retornara un true
	//en caso negativo devuelve un false
	public static boolean quedanCasillas() {
		for (int i = 0; i < 9; i++) {
			if (tablero[i] == ' ') {
				return true;
			}
		}
		return false;
	}

	public static boolean ganaJugador2() {
		// todas las posibilidades con las que el jugador dos gana
		if ((tablero[0] == 'O') && (tablero[1] == 'O') && (tablero[2] == 'O')) {
			return true;
		} else if ((tablero[3] == 'O') && (tablero[4] == 'O') && (tablero[5] == 'O')) {
			return true;
		} else if ((tablero[6] == 'O') && (tablero[7] == 'O') && (tablero[8] == 'O')) {
			return true;
		} else if ((tablero[0] == 'O') && (tablero[4] == 'O') && (tablero[8] == 'O')) {
			return true;
		} else if ((tablero[0] == 'O') && (tablero[3] == 'O') && (tablero[6] == 'O')) {
			return true;
		} else if ((tablero[1] == 'O') && (tablero[4] == 'O') && (tablero[7] == 'O')) {
			return true;
		} else if ((tablero[2] == 'O') && (tablero[5] == 'O') && (tablero[8] == 'O')) {
			return true;
		} else if ((tablero[2] == 'O') && (tablero[4] == 'O') && (tablero[6] == 'O')) {
			return true;
		}
		return false;
	}

	public static boolean ganaJugador1() {
		// todas las posibilidades con las que el jugador uno gana
		if ((tablero[0] == 'X') && (tablero[1] == 'X') && (tablero[2] == 'X')) {
			return true;
		} else if ((tablero[3] == 'X') && (tablero[4] == 'X') && (tablero[5] == 'X')) {
			return true;
		} else if ((tablero[6] == 'X') && (tablero[7] == 'X') && (tablero[8] == 'X')) {
			return true;
		} else if ((tablero[0] == 'X') && (tablero[4] == 'X') && (tablero[8] == 'X')) {
			return true;
		} else if ((tablero[0] == 'X') && (tablero[3] == 'X') && (tablero[6] == 'X')) {
			return true;
		} else if ((tablero[1] == 'X') && (tablero[4] == 'X') && (tablero[7] == 'X')) {
			return true;
		} else if ((tablero[2] == 'X') && (tablero[5] == 'X') && (tablero[8] == 'X')) {
			return true;
		} else if ((tablero[2] == 'X') && (tablero[4] == 'X') && (tablero[6] == 'X')) {
			return true;
		}
		return false;
	}

	public static int posicion(int pos) {
		// mensaje para que nos diga la posicion que quiere
		System.out.println("Introduzca movimiento (Jugador1): ");
		// para meter la posición del jugador leemos el numero introducido por el
		// usuario
		pos = entrada.nextInt();
		return pos;
	}
	public static int posicion2(int pos) {
		// mensaje para que nos diga la posicion que quiere
		System.out.println("Introduzca movimiento (Jugador2): ");
		// para meter la posición del jugador leemos el numero introducido por el
		// usuario
		pos = entrada.nextInt();
		return pos;
	}
	public static boolean esEmpate() {
		if ((!ganaJugador1())&&(!ganaJugador2())&&(quedanCasillas()==true)){
			return true;
		}return false;
	}
	public static void muestraResultado() {
		if(ganaJugador1()==true) {
			System.out.println("Ha ganado el JUGADOR 1.");
		}if (ganaJugador2()==true) {
			System.out.println("Ha ganado el JUGADOR 2.");	
		}if (esEmpate()==false) {
			System.out.println("La partida acabo en EMPATE");
		}
	}
	public static void seleccionarFichas(char Jugador1, char Jugador2) {
		System.out.println("Con que fichas quieres jugar Jugador 1: X o O");
		Jugador1=entrada.nextLine().charAt(0);
		while((Jugador1!='X')||(Jugador1!='O')) {
			System.out.println("No has elegido la ficha correcta. Introduce X o O");
			Jugador1=entrada.nextLine().charAt(0);
		}
		if(Jugador1=='X') {
			Jugador2='O';
		}if (Jugador1=='0') {
			Jugador2='X';
			
		}
	}
}
