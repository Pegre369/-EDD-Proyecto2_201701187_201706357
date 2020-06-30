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
    private String Precio;
    private String Transmision;
    private int Contador;
    
    public Vehiculo(String Placa, String Marca, String Modelo, int anio, String Color, String Precio, String Transmision) {
        this.Placa = Placa;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.anio = anio;
        this.Color = Color;
        this.Precio = Precio;
        this.Transmision = Transmision;
        this.Contador = 0;
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

    public String getPrecio() {
        return Precio;
    }

    public String getTransmision() {
        return Transmision;
    }

    public int getContador() {
        return Contador;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public void setTransmision(String Transmision) {
        this.Transmision = Transmision;
    }

    public void setContador(int Contador) {
        this.Contador = Contador;
    }
    
    
    
    
}
