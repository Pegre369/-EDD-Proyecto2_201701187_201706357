package Nodos;

/**
 *
 * @author Casca
 */
public class Rutas {


    private String Lugar_Origen;
    private String Lugar_Destino;
    private int Tiempo;

    public Rutas(String Lugar_Origen, String Lugar_Destino, int Tiempo) {
        this.Lugar_Origen = Lugar_Origen;
        this.Lugar_Destino = Lugar_Destino;
        this.Tiempo = Tiempo;
    }

    public String getLugar_Origen() {
        return Lugar_Origen;
    }

    public String getLugar_Destino() {
        return Lugar_Destino;
    }

    public int getTiempo() {
        return Tiempo;
    }
    
    
    
    
}
