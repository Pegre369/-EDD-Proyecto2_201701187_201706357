package edd.proyecto2;
import Nodos.Vertice;
import Nodos.Rutas;
import java.awt.Desktop;
import java.io.File;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;

/**
 *
 * @author Casca
 */
public class Lista_Vertice {

    public Vertice Cabeza;
    private String contenido;
    private int contador;
    public static int poss=0;
    
    public Lista_Vertice() {
    
         Cabeza = null;
         
    }
 
    
    public void Insertar(String Ciudad){
        
        Vertice nuevo = new Vertice(Ciudad); 
        nuevo.posicion = poss;
        Vertice Buscar = Buscar(Ciudad, Cabeza);
        
        if(Buscar != null){
            return;
        }
        
        if(Cabeza==null){
            
            
            Cabeza = nuevo;
            poss++;
            
        }else{
            
            Vertice tmp = Cabeza;
            
            while(tmp.Siguiente != null){
                
                tmp = tmp.Siguiente;
                
            }
            
            tmp.Siguiente = nuevo;
            poss++;
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
    
     public Vertice BuscarXNodo(int City, Vertice inicio){
        
        Vertice aux = inicio;
        
        while(aux != null){
            
            if(City == aux.getPosicion()){
                
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
            
            System.out.print(tmp.getPosicion()+ tmp.getCiudad() + " -> ");
            tmp = tmp.Siguiente;
            
        }

    }
    
    public void mostrar_Viaje(Vertice inicio){
        
        Vertice tmp = inicio;
        
        while(tmp != null){
            
            Viaje.L1.addItem(tmp.getCiudad());
            Viaje.L2.addItem(tmp.getCiudad());
            //System.out.print(tmp.getPosicion()+ tmp.getCiudad() + " -> ");
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
         contenido = "digraph G {\n rankdir=LR \n node[shape=box];\n graph [ dpi = 300 ];\n";
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
                //abrirarchivo(direccion);

            } catch (Exception e) {
                System.err.println("");
            }
           
    }
    
    public void abrirarchivo(String archivo){

     try {

            File objetofile = new File (archivo);
            Desktop.getDesktop().open(objetofile);

     }catch (IOException ex) {

            System.out.println(ex);

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
    
    //Creacion de Grafo
    public void graficar_grafo(){
       
         contenido = "digraph G {\nrankdir=LR\ngraph [ dpi = 300 ];\n";
         FileWriter documento = null;
         PrintWriter crear;
         String nombredot = "Grafo.dot";
         String direccion = "Grafo.png";
              
         contenido = contenido + cuerpo_Grafo(Cabeza) +"\n";
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
    
    private String cuerpo_Grafo(Vertice Head){
        
        String contenr="";
        Vertice temp = Head;
        
        
        while(temp!=null){
        
            
            Rutas tempA = temp.arista.Cabeza;

            while(tempA!=null){
               
                           
              
            
                    contenr = contenr + tempA.getLugar_Origen() +"->"+ tempA.getLugar_Destino()+"[label ="+ String.valueOf(tempA.getTiempo()) +",dir=none];\n";
                               
             
                
                tempA = tempA.Siguiente;
                
            }
            
          
            temp = temp.Siguiente;
        
        }
        
        return contenr;
    }
    
    public int[][] llenar_matriz(int tam){
        
      int MatrizA[][] = new int[tam][tam];
      
      //Primero obtenemos la posicion de x(de la columna vertical)
      Vertice aux = Cabeza;
      while(aux!=null){
      
          int x = aux.posicion;
          
          //Segundoo vamos a obtener la posicion en y(de la columna horizontal)
          Rutas aux2 = aux.arista.Cabeza; 
          
          while(aux2!=null){
             
              Vertice bus = Buscar(aux2.getLugar_Destino(), Cabeza);
              
              if(bus!=null){
                
                  int y = bus.posicion;
                  
                  MatrizA[x][y] = aux2.getTiempo();
                  
              }
              
              aux2 = aux2.Siguiente;
              
          }
          
          
          aux=aux.Siguiente;
          
      }
      
        
       return MatrizA; 
    }
    
    public void Ruta(int [][] MatrizAdyasente, String origen, String destino, int tam){
        
        int [][] tabla = new int[tam][3];
        
        for(int n=0; n<tam; n++){
            
            tabla[n][0]=0;
            tabla[n][1]= Integer.MAX_VALUE;
            tabla[n][2]=0;
            
        }
        
        Vertice inicio = Buscar(origen, Cabeza);
        
        int Inic;
        
        if(inicio != null){
            Inic = inicio.posicion;
        }else{
            return;
        }
        
        tabla[Inic][1]=0;
        
        int actual = Inic;
        
        do{
            
            tabla[actual][0]=1;
            
            for(int col = 0; col < tam; col++){
                
                if(Pantalla_Principal.Recorridos[actual][col]!=0){
                    
                    int distancia = Pantalla_Principal.Recorridos[actual][col] + tabla[actual][1];
                    
                    if(distancia<tabla[col][1]){
                        
                        tabla[col][1] = distancia;
                        tabla[col][2] = actual;
                        
                    }                  
                    
                }
                
            }
            
            int indiceMenor =-1;
            int distanciaMenor = Integer.MAX_VALUE;
            
            for(int x =0; x<tam; x++){
                
                if(tabla[x][1]<distanciaMenor && tabla[x][0]==0){
                    indiceMenor  = x;
                    distanciaMenor = tabla[x][1];
                }
                
            }
            
            actual = indiceMenor;
            
        }while(actual!=-1);
        

        ArrayList<Integer> ruta = new ArrayList<Integer>();
        
        int nodo;
        
        Vertice fin = Buscar(destino, Cabeza);
         if(fin != null){
            nodo = fin.posicion;
        }else{
            return;
        }
         
         while(nodo!= Inic){
             ruta.add(nodo);
             nodo = tabla[nodo][2];
         }
         ruta.add(Inic);
         Collections.reverse(ruta);
         
         
        
         for (int pos : ruta) 
        { 
           Vertice Ciudad_encontrada = BuscarXNodo(pos, Cabeza);
              
            Pantalla_Principal.List_Recorrido.Insertar(Ciudad_encontrada.getCiudad(), "no", tabla[pos][1]);
            System.out.println(pos + "->" + Ciudad_encontrada.getCiudad()+"->"+tabla[pos][1]);
        }
         
        
    }  
    
}


