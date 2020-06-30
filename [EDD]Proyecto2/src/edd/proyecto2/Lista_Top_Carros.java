/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.proyecto2;

import Nodos.*;
import java.math.BigInteger;

/**
 *
 * @author Casca
 */
public class Lista_Top_Carros {
    
     Top_Vehiculo Cabeza;
     Top_Vehiculo Cola;
    
    public Lista_Top_Carros(){
        
       this.Cabeza = null;
       this.Cola = null;
        
    }
    
      public Top_Vehiculo buscarNodo(String Plcas){
        
        if(Cabeza!=null){
            
            Top_Vehiculo aux = Cabeza;
            
            while(aux!=Cola){
                
                if(aux.getPlaca().equals(Plcas)){
                    
                    return aux;
                    
                }
                aux = aux.Siguiente;
                
            }
          
            aux = Cola;
             if(aux.getPlaca().equals(Plcas)){
                    
                    return aux;
                    
                }
            
        }
        
        return null;
    }
    
      public void insertar(String Placa, String Modelo, String Marca, int Cant){
        
        Top_Vehiculo nuevo = new Top_Vehiculo(Placa, Modelo, Marca, Cant);
        Top_Vehiculo existe = buscarNodo(Placa);
        
        if(existe != null){
            existe.setCant(Cant);
            return;
        }else{
            if (Cabeza == null) {
            nuevo.Siguiente = nuevo;
            nuevo.Anterior = nuevo;
            Cola = nuevo;
            Cabeza = nuevo;
        } else {
            Top_Vehiculo aux = Cabeza;
            while ((aux.Siguiente != Cabeza) && (aux.getCant()>=nuevo.getCant())) {
                aux = aux.Siguiente;
            }
            if ((aux.Siguiente == Cabeza) && (aux.getCant()>=nuevo.getCant())) {
                nuevo.Siguiente= Cabeza;
                nuevo.Anterior = aux;
                aux.Siguiente = nuevo;
                
                Cola = nuevo;
            } else {
                Top_Vehiculo ant = aux.Anterior;
                nuevo.Anterior = ant;
                ant.Siguiente = nuevo;
                nuevo.Siguiente = aux;
                aux.Anterior = nuevo;
                if ((aux == Cabeza) && (aux.getCant()<nuevo.getCant())) {
                    Cabeza = nuevo;
                }
            }
        }
        Cabeza.Anterior = Cola;
        Cola.Siguiente = Cabeza;
    }
    }
    
       public void mostrar(Top_Vehiculo n){
        
        Top_Vehiculo aux = n;
        
        if(aux==null){
            return;
        }
        
        do{
            
            
            System.out.print("Reporte "+aux.getPlaca()+" "+aux.getModelo()+" "+String.valueOf(aux.getCant())+"->");
            
            aux = aux.Siguiente;
            
        }while(aux!=Cabeza);
        
           System.out.println("");
        
    }
    
      
    
}
