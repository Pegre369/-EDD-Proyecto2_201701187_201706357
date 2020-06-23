package edd.proyecto2;
import Nodos.Vertice;
import Nodos.Rutas;
import java.io.FileWriter;
import java.io.PrintWriter;
/**
 *
 * @author Casca
 */
public class Lista_Vertice {

    public Vertice Cabeza;
    private String contenido;
    private int contador;
    
    public Lista_Vertice() {
    
         Cabeza = null;
        
    }
 
    
    public void Insertar(String Ciudad){
        
        Vertice nuevo = new Vertice(Ciudad); 
        
        Vertice Buscar = Buscar(Ciudad, Cabeza);
        
        if(Buscar != null){
            return;
        }
        
        if(Cabeza==null){
            
            Cabeza = nuevo;
            
            
        }else{
            
            Vertice tmp = Cabeza;
            
            while(tmp.Siguiente != null){
                
                tmp = tmp.Siguiente;
                
            }
            
            tmp.Siguiente = nuevo;
            
        }

    }
    
    public Vertice Buscar(String City, Vertice inicio){
        
        Vertice aux = inicio;
        
        while(aux != null){
            
            if(aux.getCiudad().equals(City)){
                
                return aux;
                
            }else{
                
                aux = aux.Siguiente;
                
            }
                     
        }
        
        return null;
        
    }

    public void mostrar(Vertice inicio){
        
        Vertice tmp = inicio;
        
        while(tmp != null){
            
            System.out.print(tmp.getCiudad() + " -> ");
            tmp = tmp.Siguiente;
            
        }

    }

    public void insertar_arisa(Vertice Cab, Vertice ingresar){
        
        
        Vertice aux = Cab;
        
        while(aux!=null){
            
            if(aux.getCiudad().endsWith(ingresar.getCiudad())){
                
                aux.arista = ingresar.arista;
                return;
                
            }
            
            aux=aux.Siguiente;
            
        }
        
        System.out.println("No encontro vertice parecido");
        
    }

    public void graficar(){
        contador = 1;
         contenido = "digraph G {\n rankdir=LR \n node[shape=box];\n";
         FileWriter documento = null;
         PrintWriter crear;
         String nombredot = "Lista_Adyasente.dot";
         String direccion = "Lista_Adyasente.png";
              
         contenido = contenido + cuerpo(Cabeza) +"\n";
         contenido = contenido + cuerpo_Arista(Cabeza) +"\n";
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
            } catch (Exception e) {
                System.err.println("");
            }
           
    }
    
    //Creacion de nodos
    private String cuerpo(Vertice Head){
        
        String contenr;
        Vertice temp = Head;
        
        contenr = temp.getCiudad() +"[ label = \""+ temp.getCiudad() + "\", fontsize=12]; \n";
        
        temp = temp.Siguiente; 
        
        while(temp!=null){
            
            contenr = contenr + temp.getCiudad() +"[ label = \""+ temp.getCiudad() + "\", fontsize=12];\n";
            
            temp = temp.Siguiente;
            
        }
        
        temp = Head;
        
        while(temp!=null){
            
            if(temp.Siguiente!=null){
            
                contenr = contenr + temp.getCiudad() +"->"+ temp.Siguiente.getCiudad()+"[constraint=false];\n";
            
            }
            temp = temp.Siguiente;
            
        }
        
        return contenr;
    }
    
    //Creacion de Aristas
    private String cuerpo_Arista(Vertice Head){
        
        String contenr="";
        Vertice temp = Head;
        
        while(temp!=null){
            
            Rutas tempA = temp.arista.Cabeza;
            
            while(tempA!=null){
                
            contenr = contenr + tempA.getLugar_Destino()+String.valueOf(contador) +"[ label = \""+ tempA.getLugar_Destino() + "\", fontsize=12]; \n";
            contador++;
            
            tempA=tempA.Siguiente;
           
            }
            
            
            
            
            
            temp = temp.Siguiente;
            
        }
        
        temp = Head;
        contador =1;
        boolean a = true;
        while(temp!=null){
        
            
            Rutas tempA = temp.arista.Cabeza;

            while(tempA!=null){
               
              if(a==true){
                  contenr = contenr + temp.getCiudad() + "->" +tempA.getLugar_Destino()+String.valueOf(contador)+";\n";
                  a=false;
              }
              
                if(tempA.Siguiente!=null){
            
                    contenr = contenr + tempA.getLugar_Destino()+String.valueOf(contador) +"->"+ tempA.Siguiente.getLugar_Destino()+String.valueOf(++contador)+";\n";
                               
                }
                
                tempA = tempA.Siguiente;
                
            }
            
          
            temp = temp.Siguiente;
            if(a==false){
                  a=true;
                  contador++;
              }

        }
        
        return contenr;
    }
    
}


