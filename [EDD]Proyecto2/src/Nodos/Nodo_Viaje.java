package Nodos;

import edd.proyecto2.Lista_Arista;

/**
 *
 * @author Casca
 */
public class Nodo_Viaje {
    
    public Nodo_Viaje Siguiente;
    public Nodo_Viaje Anterior;
    private String LlaveMD5;
    private String Llave;
    private String Origen;
    private String Destino;
    private String Fecha;
    private String Hora;
    private Conductor conductor;
    private Vehiculo carro;
    private Lista_Arista recorido;

    public Nodo_Viaje(String LlaveMD5, String Llave, String Origen, String Destino, String Fecha, String Hora, Conductor conductor, Vehiculo carro, Lista_Arista recorido) {
        this.LlaveMD5 = LlaveMD5;
        this.Llave = Llave;
        this.Origen = Origen;
        this.Destino = Destino;
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.conductor = conductor;
        this.carro = carro;
        this.recorido = recorido;
    }

    public String getLlaveMD5() {
        return LlaveMD5;
    }

    public String getLlave() {
        return Llave;
    }

    public String getOrigen() {
        return Origen;
    }

    public String getDestino() {
        return Destino;
    }

    public String getFecha() {
        return Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public Vehiculo getCarro() {
        return carro;
    }

    public Lista_Arista getRecorido() {
        return recorido;
    }
    
    
    
    


    
}
