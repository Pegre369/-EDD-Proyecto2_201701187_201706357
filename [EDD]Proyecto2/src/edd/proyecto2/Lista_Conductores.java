package edd.proyecto2;
import Nodos.Conductor;
import java.math.BigInteger;
/**
 *
 * @author Casca
 */
public class Lista_Conductores {
    
      Conductor Cabeza;
      Conductor Cola;
    
    public Lista_Conductores(){
        
       this.Cabeza = null;
       this.Cola = null;
        
    }
    
    
    public void insertar(BigInteger Dpi, String Nombre, String Apellido, String Licencia, String Genero, String FechaNac, int Telefono, String Direccion){
        
        Conductor nuevo = new Conductor (Dpi, Nombre, Apellido, Licencia, Genero, FechaNac, Telefono, Direccion);
        
        if(Cabeza == null){
            
            nuevo.Siguiente = nuevo;
            nuevo.Anterior = nuevo;
            Cola =nuevo;
            
        }else{
            
            nuevo.Siguiente = Cabeza;
            nuevo.Anterior = Cola;
            Cola.Siguiente = nuevo;
            Cabeza.Anterior = nuevo;
            
        }
        
        Cabeza = nuevo;
        
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


}
