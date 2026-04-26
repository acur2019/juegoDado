/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udistrital.edu.co.ruletacc.model;

/**
 *
 * @author Andres Ramos - 20242020005
 */
public class ListaCircular {
    private Nodo cabeza = null;
    private Nodo cola = null;

    // Método para insertar un nodo al final
    public void insertar(int dato) {
        Nodo nuevo = new Nodo();
        nuevo.setInfo(dato);
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            nuevo.siguiente = cabeza;
        } else {
            cola.siguiente = nuevo;
            nuevo.siguiente = cabeza;
            cola = nuevo;
        }
    }

    // Método para eliminar un nodo por valor
    public boolean eliminar(int valor) {
        if (cabeza == null) {
            return false; // Lista vacía
        }

        Nodo actual = cabeza;
        Nodo anterior = cola;
        do {
            if (valor == actual.info) {
                if (actual == cabeza) {
                    cabeza = cabeza.siguiente;
                    cola.siguiente = cabeza;
                } else if (actual == cola) {
                    cola = anterior;
                    cola.siguiente = cabeza;
                } else {
                    anterior.siguiente = actual.siguiente;
                }
                // Si la lista queda vacía
                if (cabeza == cola && cabeza.info == valor) {
                    cabeza = null;
                    cola = null;
                }
                return true;
            }
            anterior = actual;
            actual = actual.siguiente;
        } while (actual != cabeza);

        return false; // No encontrado
    }

    // Método para mostrar la lista
    public String mostrar() {
        String mensaje = "";
        if (cabeza == null) {
            mensaje = "No hay datos en la lista";
            return mensaje;
        }
        Nodo actual = cabeza;
        do {
            mensaje += actual.getInfo() + " -> ";
            actual = actual.siguiente;
        } while (actual != cabeza);
        mensaje = "(vuelve al inicio)";
        return mensaje;
    }
    
    public int getSize() {
        if (cabeza == null) {
        return 0; 
        }
        Nodo actual = cabeza;
        int size = 0;
        do{
            size++;
            actual = actual.siguiente;
        }while (actual != cabeza);
        return size;
    }
}
