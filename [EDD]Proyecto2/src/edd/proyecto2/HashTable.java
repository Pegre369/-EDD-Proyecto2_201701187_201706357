/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.proyecto2;

import Nodos.Cliente;
import Nodos.NodoLDC;
import java.math.BigInteger;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Steven Sis
 */
public class HashTable {
    int tamaño;
    ListaClientes [] indices;
    int contadorC=0;
    public HashTable(int tamaño) {
        this.tamaño = tamaño;
        this.indices = new ListaClientes[tamaño];
    }
    
    public void insertar(BigInteger Dpi, String Nombre, String Apellido, String Genero, String FechaNac, int Telefono, String Direccion){
        if(this.contadorC>(this.tamaño*0.75)){
            this.rehash();
        }
        int posicion = posicion(Dpi, this.tamaño);
        if(buscarCliente(Dpi)==null){
            if(indices[posicion]==null){
                indices[posicion]=new ListaClientes();
                indices[posicion].insertar(new Cliente(Dpi, Nombre, Apellido, Genero, FechaNac, Telefono, Direccion), indices[posicion].primero);
                this.contadorC++;
            }else{
                indices[posicion].insertar(new Cliente(Dpi, Nombre, Apellido, Genero, FechaNac, Telefono, Direccion), indices[posicion].primero);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Dpi Duplicado");
        }
    }
    
    public void rehash(){
        HashTable aux = new HashTable(this.tamaño*2);
        for (int i = 0; i < this.indices.length; i++) {
            if(this.indices[i]!=null){
                NodoLDC temp=this.indices[i].primero;
                while(temp!=null){
                    aux.insertar(temp.cliente.getDpi(), temp.cliente.getNombre(), temp.cliente.getApellido(), temp.cliente.getGenero(), temp.cliente.getFechaNac(), temp.cliente.getTelefono(), temp.cliente.getDireccion());
                    temp=temp.siguiente;
                }
            }
        }
        this.contadorC=aux.contadorC;
        this.tamaño=aux.tamaño;
        this.indices=aux.indices;
    }
    
    public int posicion(BigInteger dpi,int tamanio){
        return dpi.mod(BigInteger.valueOf(tamanio)).intValue();
    }
    
    public NodoLDC buscarCliente(BigInteger dpi){
        
        for (int i = 0; i < indices.length; i++) {
            if(indices[i]!=null){
                NodoLDC temp=indices[i].buscar(dpi);
                if (temp!=null) {
                    return temp;
                }
            }
        }
        
        return null;
    }
    
    public String cuerpodot(){
        String cuerpo = "\nnode[shape = box]\n";
        int tempC=0;
        ListaClientes temp;
        
        for (int i = 0; i < this.indices.length; i++) {
            temp=this.indices[i];
                if (i!=this.indices.length-1) {
                    if(temp!=null){
                        cuerpo+="\""+(i)+"\" ->";
                        if(this.indices[i+1]!=null){
                            cuerpo+="\""+(i+1)+"\" \n";
                        }else{
                            cuerpo+="\""+(i+1)+"\"  \n";
                        }
                    }else{
                        cuerpo+="\""+i+"\"  ->";
                        if(this.indices[i+1]!=null){
                            cuerpo+="\""+(i+1)+"\" \n";
                        }else{
                            cuerpo+="\""+(i+1)+"\"  \n";
                        }
                    }
                }
            
        }
        
 
        for (int i = 0; i < this.indices.length; i++) {
            temp=this.indices[i];
            if(temp!=null){
                NodoLDC aux = temp.primero;
                String alinear="\n{rank = same ;"+i;
                cuerpo+=" \n \""+i+"\" -> \""+aux.cliente.getDpi().toString()+"\"\n";
                while(aux!=null){
                    cuerpo+="\""+aux.cliente.getDpi().toString()+"\" [label=\""+aux.cliente.getDpi().toString()+" \\n "+aux.cliente.getNombre()+" \", color=green; ]\n";
                    if(aux.siguiente!=null){
                        cuerpo+="\""+aux.cliente.getDpi().toString()+"\" -> "+"\""+aux.siguiente.cliente.getDpi().toString()+"\" \n ";
                    }
                    alinear+= ";"+aux.cliente.getDpi().toString();
                    aux=aux.siguiente;
                }
                alinear+="}\n";
                cuerpo+=alinear;
            }
            
        }
        return cuerpo;
    }
}
