/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udistrital.edu.co.ruletacc.model;

/**
 *
 * @author Andres Ramos - 20242020005
 */

public class Nodo {

	int info;
	Nodo siguiente;
	
        /*
        * Constructor for the model Nodo.
        */
	public Nodo() {
		this.info = 0;
		this.siguiente = null;
	}
	
        /*
        * Constructor for the model Nodo.
        *@param info The data that the Nodo will contain
        *@param siguiente The next nodo inthe list
        */
	public Nodo(int info, Nodo siguiente) {
		this.info = info;
		this.siguiente = siguiente;
	}

        /*
        *This method will allow to having the information (int) that Nodo 
        contains.
        */
	public int getInfo() {
		return info;
	}
        
        /*
        *This method will allow setting the information (int) that Nodo 
        contains.
        */
	public void setInfo(int info) {
		this.info = info;
	}
        
        /*
        *This method will allow getting the next Nodo 
        */
	public Nodo getSiguiente() {
		return siguiente;
	}

        /*
        *This method will allow setting the next Nodo 
        */
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
        
        /*
        *This method will allow printing the Nodo information.
        */
	@Override
	public String toString() {
		return "Nodo[ info = " + info +" ]";
	}
	
}
