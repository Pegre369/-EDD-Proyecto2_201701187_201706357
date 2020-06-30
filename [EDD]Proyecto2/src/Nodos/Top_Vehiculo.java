/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;

/**
 *
 * @author Casca
 */
public class Top_Vehiculo {
    
      public Top_Vehiculo Siguiente;
        public Top_Vehiculo Anterior;
        private String Placa;
        private String Modelo;
        private String Marca;
        private int Cant;

    public Top_Vehiculo(String Placa, String Modelo, String Marca, int Cant) {
        this.Placa = Placa;
        this.Modelo = Modelo;
        this.Marca = Marca;
        this.Cant = Cant;
    }

    public String getPlaca() {
        return Placa;
    }

    public String getModelo() {
        return Modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public int getCant() {
        return Cant;
    }
    
    public void setCant(int Cant) {
        this.Cant = Cant;
    }

   
}
