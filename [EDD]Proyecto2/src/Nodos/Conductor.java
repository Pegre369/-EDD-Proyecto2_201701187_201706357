package Nodos;
import java.math.*;
/**
 *
 * @author Casca
 */
public class Conductor {
    
    public Conductor Siguiente;
    public Conductor Anterior;
    private BigInteger Dpi;
    private String Nombre;
    private String Apellido;
    private String Licencia;
    private String Genero;
    private String FechaNac;
    private int Telefono;
    private String Direccion;
    private int Contador;

    public Conductor(BigInteger Dpi, String Nombre, String Apellido, String Licencia, String Genero, String FechaNac, int Telefono, String Direccion) {
        this.Siguiente = null;
        this.Anterior = null;
        this.Dpi = Dpi;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Licencia = Licencia;
        this.Genero = Genero;
        this.FechaNac = FechaNac;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Contador = 0;
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

    public int getContador() {
        return Contador;
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

    public void setLicencia(String Licencia) {
        this.Licencia = Licencia;
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

    public void setContador(int Contador) {
        this.Contador = Contador;
    }

}
