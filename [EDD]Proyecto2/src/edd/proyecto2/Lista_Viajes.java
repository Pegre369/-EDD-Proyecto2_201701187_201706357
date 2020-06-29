package edd.proyecto2;
import Nodos.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.math.BigInteger;



/**
 *
 * @author Casca
 */
public class Lista_Viajes {
    
    
      private String contenido;
      Nodo_Viaje Cabeza;
      Nodo_Viaje Cola;
    
    public Lista_Viajes(){
        
       this.Cabeza = null;
       this.Cola = null;
        
    }
    
    
     public void insertar(String LlaveMD5, String Llave, String Origen, String Destino, String Fecha, String Hora, Conductor conductor, Vehiculo carro, Lista_Arista recorido,NodoLDC Cliente){
        
        Nodo_Viaje nuevo = new Nodo_Viaje(LlaveMD5, Llave, Origen, Destino, Fecha, Hora, conductor, carro, recorido,Cliente);
        Nodo_Viaje existe = buscarNodo(Llave);
        
        if(existe != null){
            
            System.out.println("No se inserto");
            return;
            
        }
        
        if(Cabeza==null){
            
            nuevo.Siguiente = nuevo;
            nuevo.Anterior = nuevo;
            Cola = nuevo;
            
        }else{
            
            nuevo.Siguiente = Cabeza;
            nuevo.Anterior  = Cola;
            Cola.Siguiente = nuevo;
            Cabeza.Anterior = nuevo;
            
        }
        
        Cabeza = nuevo;
          
    }
    
     public Nodo_Viaje buscarNodo(String Llave){
        
        if(Cabeza!=null){
            
            Nodo_Viaje aux = Cabeza;
            
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
    
     public void graficar(){
        
       
         contenido = "digraph G {\n rankdir=LR \n node[shape=box];\ngraph [ dpi = 300 ];\n";
         FileWriter documento = null;
         PrintWriter crear;
         String nombredot = "Bloc_Viaje.dot";
         String direccion = "Bloc_Viaje.png";
         
         contenido = contenido + cuerpo(Cabeza);
         
         contenido = contenido + "}";
         
        try {
                documento = new FileWriter(nombredot);
                crear = new PrintWriter(documento);
                crear.print(contenido);
                crear.close();
                
        } catch (Exception e) {
                System.out.println("Error");
        }
         
        try {
                Runtime.getRuntime().exec("dot -Tpng " + nombredot + " -o " + direccion);
                //abrirarchivo(direccion);

        } catch (Exception e) {
                System.err.println("");
        }
        
        
    }
    
     private String cuerpo(Nodo_Viaje n){
        
        String body="";
        Nodo_Viaje aux = n;
        
        
        do{
            
            body = body + "D"+aux.getLlaveMD5()+ "[label=\""+aux.getLlaveMD5()+"\n"+"Cliente: "+aux.getCliente().cliente.getNombre()+"\n"+"Conductor: "+ aux.getConductor().getNombre()+"\n"+ aux.getOrigen()+"\n"+aux.getDestino()+"\n"+aux.getFecha()+"\"];\n";  
            
            aux = aux.Siguiente;
            
        }while(aux!=Cabeza);
        
        aux = n;
        
        do{
            
            
            
            body = body + "D"+aux.getLlaveMD5() + "->"+ "D"+aux.Siguiente.getLlaveMD5()+"\n";  
            body = body + "D"+aux.getLlaveMD5() + "->"+ "D"+aux.Anterior.getLlaveMD5()+"\n";
            aux = aux.Siguiente;
            
        }while(aux!=Cabeza);
        
        
        
        return body;
    }
    
}
