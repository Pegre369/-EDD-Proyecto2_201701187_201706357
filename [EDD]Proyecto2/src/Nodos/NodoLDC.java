/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;

/**
 *
 * @author Steven Sis
 */
public class NodoLDC {
    public Cliente cliente;
    
    public NodoLDC siguiente;
    public NodoLDC anterior;

    public NodoLDC(Cliente cliente) {
        this.cliente = cliente;
        this.siguiente=null;
        this.anterior=null;
    }
    
}
