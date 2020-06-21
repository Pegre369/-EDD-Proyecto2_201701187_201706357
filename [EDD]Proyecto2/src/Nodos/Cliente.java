package Nodos;
import java.math.*;
/**
 *
 * @author Casca
 */
public class Cliente {
    
    private BigInteger Dpi;
    private String Nombre;
    private String Apellido;
    private String Genero;
    private String FechaNac;
    private int Telefono;
    private String Direccion;

    public Cliente(BigInteger Dpi, String Nombre, String Apellido, String Genero, String FechaNac, int Telefono, String Direccion) {
        this.Dpi = Dpi;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
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
