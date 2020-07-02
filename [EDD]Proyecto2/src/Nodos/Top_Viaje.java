/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;

/**
 *
 * @author Casca
 */
public class Top_Viaje {
    
    public Top_Viaje Siguiente;
    public Top_Viaje Anterior;
    private String Llave;
    private String Origen;
    private String Destino;
    private int Largo;

    public Top_Viaje(String Llave, String Origen, String Destino, int Largo) {
        this.Llave = Llave;
        this.Origen = Origen;
        this.Destino = Destino;
        this.Largo = Largo;
    }

    public String getLlave() {
        return Llave;
    }

    public String getOrigen() {
        return Origen;
    }

    public String getDestino() {
        return Destino;
    }

    public int getLargo() {
        return Largo;
    }
    
    
    
    
}
