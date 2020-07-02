/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.proyecto2;

import Nodos.*;

/**
 *
 * @author Casca
 */
public class Lista_Top_Viaje {
    
      Top_Viaje Cabeza;
      Top_Viaje Cola;
    
    public Lista_Top_Viaje(){
        
       this.Cabeza = null;
       this.Cola = null;
        
    }
    
      public Top_Viaje buscarNodo(String Llave){
        
        if(Cabeza!=null){
            
            Top_Viaje aux = Cabeza;
            
            while(aux!=Cola){
                
                if(aux.getLlave().equals(Llave)){
                    
                    return aux;
                    
                }
                aux = aux.Siguiente;
                
            }
          
            aux = Cola;
            if(aux.getLlave().equals(Llave)){
                    
                    return aux;
                    
                }
            
        }
        
        return null;
    }
    
      public void insertar(String Llave, String Origen, String Destino, int Largo){
        
        Top_Viaje nuevo = new Top_Viaje(Llave, Origen, Destino, Largo);
        Top_Viaje existe = buscarNodo(Llave);
        
        if(existe != null){
            //existe.setCant(Cant);
            return;
        }else{
            if (Cabeza == null) {
            nuevo.Siguiente = nuevo;
            nuevo.Anterior = nuevo;
            Cola = nuevo;
            Cabeza = nuevo;
        } else {
            Top_Viaje aux = Cabeza;
            while ((aux.Siguiente != Cabeza) && (aux.getLargo()>=nuevo.getLargo())) {
                aux = aux.Siguiente;
            }
            if ((aux.Siguiente == Cabeza) && (aux.getLargo()>=nuevo.getLargo())) {
                nuevo.Siguiente= Cabeza;
                nuevo.Anterior = aux;
                aux.Siguiente = nuevo;
                
                Cola = nuevo;
            } else {
                Top_Viaje ant = aux.Anterior;
                nuevo.Anterior = ant;
                ant.Siguiente = nuevo;
                nuevo.Siguiente = aux;
                aux.Anterior = nuevo;
                if ((aux == Cabeza) && (aux.getLargo()<nuevo.getLargo())) {
                    Cabeza = nuevo;
                }
            }
        }
        Cabeza.Anterior = Cola;
        Cola.Siguiente = Cabeza;
    }
    }
    
       public void mostrar(Top_Viaje n){
        
        Top_Viaje aux = n;
        
        if(aux==null){
            return;
        }
        
        do{
            
            
            System.out.print("Reporte "+aux.getLlave()+" "+aux.getOrigen()+" "+ String.valueOf(aux.getLargo())+"->");
            
            aux = aux.Siguiente;
            
        }while(aux!=Cabeza);
        
           System.out.println("");
        
    }
}
