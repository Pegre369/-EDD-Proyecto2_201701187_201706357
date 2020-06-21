package Nodos;


/**
 *
 * @author Casca
 */
public class Vehiculo {
    
    private String Placa;
    private String Marca;
    private String Modelo;
    private int anio;
    private String Color;
    private Double Precio;
    private String Transmision;

    public Vehiculo(String Placa, String Marca, String Modelo, int anio, String Color, Double Precio, String Transmision) {
        this.Placa = Placa;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.anio = anio;
        this.Color = Color;
        this.Precio = Precio;
        this.Transmision = Transmision;
    }

    public String getPlaca() {
        return Placa;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public int getAnio() {
        return anio;
    }

    public String getColor() {
        return Color;
    }

    public Double getPrecio() {
        return Precio;
    }

    public String getTransmision() {
        return Transmision;
    }
    
    
    
    
}
