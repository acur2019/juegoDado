/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udistrital.edu.co.ruletacc.controller;
import udistrital.edu.co.ruletacc.model.ListaCircular;
import udistrital.edu.co.ruletacc.view.VistaConsola;

import java.util.Random;
/**
 *
 * @author Andres Ramos - 20242020005
 */
public class Controller {
    VistaConsola vista = new VistaConsola();
    Random random = new Random();
    
    
    
    public int generarNum (){
    int min = 1;
    int max =6;
    int dado = random.nextInt((max-min)-1)+min;
    return dado;
    }
    
    public boolean esPar(int numero) {
    return numero % 2 == 0;
    }
        
    
    public void run(){
        vista.mostrarInformacion("Bienvenido al juego tipo ruleta");
        int jugadores = 0;
        do{
           jugadores = Integer.parseInt(vista.leerDato("Por favor ingrese el numero de jugadores"));
        }while (jugadores == 0);
        
        ListaCircular lista = new ListaCircular();
        for (int i=1;i<=jugadores; i++ ){
            lista.insertar(i);
        }
        do{
            for (int i=1;i<=jugadores;i++){
                int num = generarNum();
                if (esPar(num)!= true){
                    lista.eliminar(i);
                }
            }
        }while(lista.getSize() != 1);
        vista.mostrarInformacion("El ganador es el jugador"+ lista.mostrar());
    }
    
}
