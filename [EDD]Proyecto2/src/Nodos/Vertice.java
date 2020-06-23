package Nodos;
import edd.proyecto2.Lista_Arista;
/**
 *
 * @author Casca
 */
public class Vertice {
    
    public Vertice Siguiente;
    private String Ciudad;
    
    public Lista_Arista arista;
    
    public Vertice(String Ciudad) {
        this.arista = new Lista_Arista();
        this.Ciudad = Ciudad;
        this.Siguiente = null;
    }

    public String getCiudad() {
        return Ciudad;
    }
    
    public void agregar_arista(String Ciudad1, String Ciudad2, int tiempo){
        
        arista.Insertar(Ciudad1, Ciudad2, tiempo);      
        
    }
    
}
