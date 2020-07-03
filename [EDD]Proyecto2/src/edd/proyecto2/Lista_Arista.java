package edd.proyecto2;
import Nodos.Rutas;
import java.io.FileWriter;
import java.io.PrintWriter;
/**
 *
 * @author Casca
 */
public class Lista_Arista {
   
    private String contenido;
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
            
            System.out.print("("+tmp.getLugar_Origen()+ ", "+String.valueOf(tmp.getTiempo())+") ->" );
            tmp = tmp.Siguiente;
            
        }

    }

    public void graficar(int a){
         contenido = "";
         contenido = "digraph G {\n rankdir=LR \n node[shape=box];\ngraph [ dpi = 300 ];\n";
         FileWriter documento = null;
         PrintWriter crear;
         String nombredot = "Lista_Rutas"+a+".dot";
         String direccion = "Lista_Rutas"+a+".png";
              
         contenido = contenido + cuerpo(Cabeza) +"\n";
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

    public String cuerpo(Rutas n){
        
        String body = "";
        Rutas aux = n;
        
        body = aux.getLugar_Origen()+"[ label = \""+ aux.getLugar_Origen()+"\n"+String.valueOf(aux.getTiempo())+ "\", fontsize=12]; \n";
        
        aux = aux.Siguiente; 
        
        while(aux!=null){
            
            body = body + aux.getLugar_Origen() +"[ label = \""+ aux.getLugar_Origen()+"\n"+String.valueOf(aux.getTiempo())+ "\", fontsize=12];\n";
            
            aux = aux.Siguiente;
            
        }
        
        
        aux = n;
        
        while(aux!=null){
            
            if(aux.Siguiente!=null){
            
                body = body + aux.getLugar_Origen() +"->"+ aux.Siguiente.getLugar_Origen()+";\n";
            
            }
            aux = aux.Siguiente;
            
        }
        
        return body;
    }
    
    
    
    
}

