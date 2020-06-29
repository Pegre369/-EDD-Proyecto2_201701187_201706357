/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.proyecto2;

import Nodos.Cliente;
import Nodos.NodoLDC;
import java.math.BigInteger;

/**
 * Esta es la clase "Lista simple, con la que se solucionara las colisiones
 * @author Steven Sis
 */
public class ListaClientes {
    NodoLDC primero;
    NodoLDC ultimo;

    public ListaClientes() {
    this.primero = null;
    this.ultimo = null;
    }
    
    public void insertar(Cliente cliente, NodoLDC n){
        NodoLDC temp = new NodoLDC(cliente);
        
        if(this.primero==null){
            //Lista vacia
            this.primero = temp;
            this.ultimo = temp;
        }else if(n==this.primero){
            //Insertar al inicio
            temp.siguiente=this.primero;
            primero.anterior=temp;
            primero=temp;
        }else{
            System.out.println("No se pude insertar, revise la lista");
        }
    }
    
    public void elimnar(NodoLDC cliente){
        if(this.primero==null){
            //Lista vacia
            System.out.println("Lista vacia no se puede eliminar");
        }else if(this.primero == this.ultimo){
                //Lista solo hay un nodo
                this.ultimo=null;
                this.primero = null;
        }else if(cliente==this.primero){
            //Eliminar primero
            this.primero=this.primero.siguiente;
            this.primero.anterior=null;
        }else if(cliente==this.ultimo){
            this.ultimo=this.ultimo.anterior;
            this.ultimo.siguiente=null;
        }else{
            //Elimina un nodo que no es el primero ni el ultimo
            cliente.anterior.siguiente=cliente.siguiente;
            cliente.siguiente.anterior=cliente.anterior;
        }
    }
    
    public NodoLDC buscar(BigInteger dpi){
        NodoLDC temp=this.primero;
        while(temp!=null){
            if(dpi.toString().equals(temp.cliente.getDpi().toString())){
                return temp;
            }
            temp=temp.siguiente;
        }
        return null;
    }
}
