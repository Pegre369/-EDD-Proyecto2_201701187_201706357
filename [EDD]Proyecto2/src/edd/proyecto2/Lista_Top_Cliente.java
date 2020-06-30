package edd.proyecto2;
import Nodos.TopCliente;
import java.math.BigInteger;


/**
 *
 * @author Casca
 */
public class Lista_Top_Cliente {
   
      TopCliente Cabeza;
      TopCliente Cola;
    
    public Lista_Top_Cliente(){
        
       this.Cabeza = null;
       this.Cola = null;
        
    }
    
      public TopCliente buscarNodo(BigInteger Dpi){
        
        if(Cabeza!=null){
            
            TopCliente aux = Cabeza;
            
            while(aux!=Cola){
                
                if(aux.getDPI().equals(Dpi)){
                    
                    return aux;
                    
                }
                aux = aux.Siguiente;
                
            }
          
            aux = Cola;
            if(aux.getDPI().equals(Dpi)){
                    
                    return aux;
                    
                }
            
        }
        
        return null;
    }
    
      public void insertar(BigInteger DPI, String nombre, int Cant){
        
        TopCliente nuevo = new TopCliente(DPI, nombre, Cant);
        TopCliente existe = buscarNodo(DPI);
        
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
            TopCliente aux = Cabeza;
            while ((aux.Siguiente != Cabeza) && (aux.getCant()>=nuevo.getCant())) {
                aux = aux.Siguiente;
            }
            if ((aux.Siguiente == Cabeza) && (aux.getCant()>=nuevo.getCant())) {
                nuevo.Siguiente= Cabeza;
                nuevo.Anterior = aux;
                aux.Siguiente = nuevo;
                
                Cola = nuevo;
            } else {
                TopCliente ant = aux.Anterior;
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
    
       public void mostrar(TopCliente n){
        
        TopCliente aux = n;
        
        if(aux==null){
            return;
        }
        
        do{
            
            
            System.out.print("Reporte "+aux.getDPI()+" "+aux.getNombre()+ String.valueOf(aux.getCant())+"->");
            
            aux = aux.Siguiente;
            
        }while(aux!=Cabeza);
        
           System.out.println("");
        
    }
    
      
      
}
