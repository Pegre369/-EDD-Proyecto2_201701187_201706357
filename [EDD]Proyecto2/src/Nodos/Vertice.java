package Nodos;

/**
 *
 * @author Casca
 */
public class Vertice {
    
    public Vertice Siguiente;
    private String Ciudad;

    public Vertice(String Ciudad) {
        this.Ciudad = Ciudad;
        this.Siguiente = null;
    }

    public String getCiudad() {
        return Ciudad;
    }
    
    
    
}
