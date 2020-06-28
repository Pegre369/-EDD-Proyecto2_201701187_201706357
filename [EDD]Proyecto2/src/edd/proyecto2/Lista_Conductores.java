package edd.proyecto2;
import Nodos.Conductor;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
/**
 *
 * @author Casca
 */
public class Lista_Conductores {
      
    private String contenido;
      Conductor Cabeza;
      Conductor Cola;
    
    public Lista_Conductores(){
        
       this.Cabeza = null;
       this.Cola = null;
        
    }
    
    
    public void insertar(BigInteger Dpi, String Nombre, String Apellido, String Licencia, String Genero, String FechaNac, int Telefono, String Direccion){
        
        Conductor nuevo = new Conductor(Dpi, Nombre, Apellido, Licencia, Genero, FechaNac, Telefono, Direccion);
        Conductor existe = buscarNodo(Dpi);
        if(existe != null){
            return;
        }else{
            if (Cabeza == null) {
            nuevo.Siguiente = nuevo;
            nuevo.Anterior = nuevo;
            Cola = nuevo;
            Cabeza = nuevo;
        } else {
            Conductor aux = Cabeza;
            while ((aux.Siguiente != Cabeza) && (aux.getDpi().compareTo(nuevo.getDpi())==-1 )) {
                aux = aux.Siguiente;
            }
            if ((aux.Siguiente == Cabeza) && aux.getDpi().compareTo(nuevo.getDpi())==-1 ) {
                nuevo.Siguiente= Cabeza;
                nuevo.Anterior = aux;
                aux.Siguiente = nuevo;
                
                Cola = nuevo;
            } else {
                Conductor ant = aux.Anterior;
                nuevo.Anterior = ant;
                ant.Siguiente = nuevo;
                nuevo.Siguiente = aux;
                aux.Anterior = nuevo;
                if ((aux == Cabeza) && (Cabeza.getDpi().compareTo(nuevo.getDpi())==1)) {
                    Cabeza = nuevo;
                }
            }
        }
        Cabeza.Anterior = Cola;
        Cola.Siguiente = Cabeza;
    }
    }
    
    public void mostrar(Conductor n){
        
        Conductor aux = n;
        
        if(aux==null){
            return;
        }
        
        do{
            
            
            System.out.print(aux.getDpi()+" "+aux.getNombre()+"->");
            
            aux = aux.Siguiente;
            
        }while(aux!=Cabeza);
        
        
        
    }
    
    public Conductor buscarNodo(BigInteger Dpi){
        
        if(Cabeza!=null){
            
            Conductor aux = Cabeza;
            
            while(aux!=Cola){
                
                if(aux.getDpi().equals(Dpi)){
                    
                    return aux;
                    
                }
                aux = aux.Siguiente;
                
            }
          
            aux = Cola;
            if(aux.getDpi() == Dpi){
                    
                    return aux;
                    
                }
            
        }
        
        return null;
    }
    
    public void eliminar(BigInteger Dpi){
     
         if (Cabeza != null) {
            if (Cabeza == Cola) {
                Cabeza = Cola = null;
            } else {
                Conductor aux = buscarNodo(Dpi);
                aux.Siguiente.Anterior = aux.Anterior;
                aux.Anterior.Siguiente = aux.Siguiente;
                if (aux == Cabeza) {
                    Cabeza = aux.Siguiente;
                } else if (aux == Cola) {
                    Cola = aux.Anterior;
                }
            }
        }
    }
         
    public void modificar(BigInteger Dpi,String Nombre, String Apellido, String Licencia, String Genero, String FechaNac, int Telefono, String Direccion){
        
        Conductor modificar = buscarNodo(Dpi);
        
        if(modificar!=null){
            
            modificar.setNombre(Nombre);
            modificar.setApellido(Apellido);
            modificar.setLicencia(Licencia);
            modificar.setGenero(Genero);
            modificar.setFechaNac(FechaNac);
            modificar.setTelefono(Telefono);
            modificar.setDireccion(Direccion);
            
        }
        
        
        
    }

    public void mostrar_existente(Conductor n){
        
        Conductor aux = n;
        
        if(aux==null){
            return;
        }
        
        do{
            
            
            System.out.print(aux.getDpi()+" "+aux.getNombre()+"->");
            Modificar_Conductores.jComboBox5.addItem(aux.getDpi().toString());
            
            
            aux = aux.Siguiente;
            
        }while(aux!=Cabeza);
        
        
        
    }
    
    public void mostrar_existente2(Conductor n){
        
        Conductor aux = n;
        
        if(aux==null){
            return;
        }
        
        do{
            
            
            System.out.print(aux.getDpi()+" "+aux.getNombre()+"->");
            Eliminar_Conductor.jComboBox5.addItem(aux.getDpi().toString());
            
            
            aux = aux.Siguiente;
            
        }while(aux!=Cabeza);
        
        
        
    }
    
        public void mostrar_existente3(Conductor n){
        
        Conductor aux = n;
        
        if(aux==null){
            return;
        }
        
        do{
            
            
            System.out.print(aux.getDpi()+" "+aux.getNombre()+"->");
            Viaje.cbconductor.addItem(aux.getDpi().toString());
            
            
            aux = aux.Siguiente;
            
        }while(aux!=Cabeza);
        
        
        
    }

    public void graficar(){
        
       
         contenido = "digraph G {\n rankdir=LR \n node[shape=box];\ngraph [ dpi = 300 ];\n";
         FileWriter documento = null;
         PrintWriter crear;
         String nombredot = "Lista_Conductores.dot";
         String direccion = "Lista_Conductores.png";
         
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
    
    
     private String cuerpo(Conductor n){
        
        String body="";
        Conductor aux = n;
        
        
        do{
            
            body = body + aux.getDpi().toString() + "[label=\""+aux.getDpi().toString()+"\n"+ aux.getNombre()+"\n"+aux.getLicencia()+"\"];\n";  
            
            aux = aux.Siguiente;
            
        }while(aux!=Cabeza);
        
        aux = n;
        
        do{
            
            
            
            body = body + aux.getDpi().toString() + "->"+ aux.Siguiente.getDpi().toString()+"\n";  
            body = body + aux.getDpi().toString() + "->"+ aux.Anterior.getDpi().toString()+"\n";
            aux = aux.Siguiente;
            
        }while(aux!=Cabeza);
        
        
        
        return body;
    }
    
    
}
