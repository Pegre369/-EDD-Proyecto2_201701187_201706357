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

    public void setDpi(BigInteger Dpi) {
        this.Dpi = Dpi;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public void setFechaNac(String FechaNac) {
        this.FechaNac = FechaNac;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
       
    
    
    
}
