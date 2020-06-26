package edd.proyecto2;
import Nodos.Rutas;
/**
 *
 * @author Casca
 */
public class Lista_Arista {
   

    public Rutas Cabeza;
    
    public Lista_Arista() {
    
         Cabeza = null;
        
    }
 
    
     public void Insertar(String Ciudad1, String Ciudad2, int tiempo){
        
        Rutas nuevo = new Rutas(Ciudad1, Ciudad2, tiempo); 
        
        Rutas Buscar = Buscar(Ciudad1, Ciudad2,Cabeza);
        
        if(Buscar != null){
            return;
        }
        
        if(Cabeza==null){
            
            Cabeza = nuevo;
            
            
        }else{
            
            Rutas tmp = Cabeza;
            
            while(tmp.Siguiente != null){
                
                tmp = tmp.Siguiente;
                
            }
            
            tmp.Siguiente = nuevo;
            
        }

    }
    
public Rutas Buscar(String City1, String City2, Rutas inicio){
        
        Rutas aux = inicio;
        
        while(aux != null){
            
            if(aux.getLugar_Origen().equals(City1) && aux.getLugar_Destino().equals(City2)){
                
                return aux;
                
            }else{
                
                aux = aux.Siguiente;
                
            }
                     
        }
        
        return null;
        
    }

   public void mostrar(Rutas inicio){
        
        Rutas tmp = inicio;
        
        while(tmp != null){
            
            System.out.print("("+tmp.getLugar_Origen()+ ", "+tmp.getLugar_Destino()+") ->" );
            tmp = tmp.Siguiente;
            
        }

    }


}

