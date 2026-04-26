/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udistrital.edu.co.ruletacc.view;
import java.util.Scanner;
/**
 *
 * @author Andres Ramos - 20242020005
 */
public class VistaConsola {
    private Scanner sc;
	
	public VistaConsola() {
		sc = new Scanner(System.in);
	}
	
        /**
        * This method show information in the console.
        * @param mensaje The dada that you will show
        */
	public void mostrarInformacion(String mensaje) {
		System.out.println(mensaje);
	}
	
        /*
        *This method take an input from the console
        *@param mensaje The data that you will read
        *@return The Sting
        */
	public String leerDato(String mensaje) {
		System.out.println(mensaje);
		String dato = sc.nextLine();
		return dato;
	}
}
