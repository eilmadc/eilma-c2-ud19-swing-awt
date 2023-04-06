/**
* C02 - UD19 - Elena López
*/
package main;

import java.util.Scanner;

import ejercicio1.Ejercicio1;
import ejercicio2.Ejercicio2;
import ejercicio3.Ejercicio3;
import ejercicio4.Ejercicio4;
import utils.ColorConsole;
import utils.Utils;

/**
 * @author elena-01
 *
 */
public class MainApp {
	// --------- Variables ------------
	public Scanner sc = new Scanner(System.in);
	public static Utils utils = new utils.Utils();
	public ColorConsole cc = new utils.ColorConsole();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO: hacer Switch case control Ejercicio 1 a 5
		// Muestra el menu mediante poantalla y dialog
		utils.mostrarPrograma("UNIDAD 19 : SWING-AWT");
		imprimeMenuPrincipal();
	}

	// Imprimir Menu
	static public void imprimeMenuPrincipal() {

		String mensaje = " Opcion 1: EJERCICIO 1" + "\n Opcion 2: EJERCICIO 2" + "\n Opcion 3: EJERCICIO 3"
				+ "\n Opcion 4: EJERCICIO 4";

		int opcion;

		// Pide mensaje hasta que se introduzca una opcion correcta.(Entre 1 y 4)
		do {

			// Pide numero de opcion de MENU mediante dialog
			opcion = utils.pideInt(mensaje, "UD19");

		} while (opcion > 5);

		verificaOpcionPrincipal(opcion);

	}

	// Verifica Opcion del menu
	/**
	 * @param opcion
	 */
	static public void verificaOpcionPrincipal(int opcion) {

		switch (opcion) {
		case 1:
			// Ejercicio1
			try {
				Ejercicio1 frame = new Ejercicio1();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}

			break;
		case 2:
			// Ejercicio3
			try {
				Ejercicio2 frame = new Ejercicio2();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case 3:
			// Ejercicio3
			try {
				Ejercicio3 frame = new Ejercicio3();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case 4:
			// Ejercicio4
			try {
				Ejercicio4 frame = new Ejercicio4();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		default:
			break;
		}

	}
}