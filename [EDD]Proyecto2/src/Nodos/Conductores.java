package Nodos;
import java.math.*;
/**
 *
 * @author Casca
 */
public class Conductores {
    
    private BigInteger Dpi;
    private String Nombre;
    private String Apellido;
    private String Licencia;
    private String Genero;
    private String FechaNac;
    private int Telefono;
    private String Direccion;

    public Conductores(BigInteger Dpi, String Nombre, String Apellido, String Licencia, String Genero, String FechaNac, int Telefono, String Direccion) {
        this.Dpi = Dpi;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Licencia = Licencia;
        this.Genero = Genero;
        this.FechaNac = FechaNac;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
    }

    public BigInteger getDpi() {
        return Dpi;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getLicencia() {
        return Licencia;
    }

    public String getGenero() {
        return Genero;
    }

    public String getFechaNac() {
        return FechaNac;
    }

    public int getTelefono() {
        return Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    
    
    
}
