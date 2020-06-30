/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;

import java.math.BigInteger;

/**
 *
 * @author Casca
 */
public class TopCliente {
    
        public TopCliente Siguiente;
        public TopCliente Anterior;
        private BigInteger DPI;
        private String nombre;
        private int Cant;

    public TopCliente( BigInteger DPI, String nombre, int Cant) {
        this.Siguiente = null;
        this.Anterior = null;
        this.DPI = DPI;
        this.nombre = nombre;
        this.Cant = Cant;
    }

    public BigInteger getDPI() {
        return DPI;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCant() {
        return Cant;
    }

    public void setCant(int Cant) {
        this.Cant = Cant;
    }
        
        
    
    
}
