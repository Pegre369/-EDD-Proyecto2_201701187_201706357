package edd.proyecto2;
import Nodos.Vertice;
/**
 *
 * @author Casca
 */
public class Lista_Vertice {

    public Vertice Cabeza;
    
    public Lista_Vertice() {
    
         Cabeza = null;
        
    }
 
    
    public void Insertar(String Ciudad){
        
        Vertice nuevo = new Vertice(Ciudad); 
        
        if(Cabeza==null){
            
            Cabeza = nuevo;
            
            
        }else{
            
            Vertice tmp = Cabeza.Siguiente;
            
            while(tmp != null){
                
                
                tmp = tmp.Siguiente;
                
                
            }
            
            
            
        }
        
        
        
    }
    
    public void Buscar(){
        
    }
}
