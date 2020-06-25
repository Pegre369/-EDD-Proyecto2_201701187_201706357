/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.proyecto2;
import Nodos.Vehiculo;
import java.util.LinkedList;

/**
 *
 * @author Steven Sis
 */
public class ArbolB {
    
    String cuerpoArbolS="";
    int M;

    LinkedList<Vehiculo> values;

    ArbolB parent;

    LinkedList<ArbolB> children;

    private ArbolB() {
        this.values = new LinkedList<Vehiculo>();
        this.children = new LinkedList<ArbolB>();
    }

    public ArbolB(int m) {
        this();
        if(m < 3) {
            throw new RuntimeException("Un arbol b tiene que ser grado mayor a 2.");
        }
        this.M = m;
    }

    public ArbolB(ArbolB parent) {
        this(parent.M);
        this.parent = parent;
    }


    public ArbolB Insertar(Vehiculo vehic) {
        if(paginaVacia()) {
            values.add(vehic);
            children.add(new ArbolB(this));
            children.add(new ArbolB(this));
            return this;
        }
        ArbolB temp = getRoot().search(vehic.getPlaca());
        if(!temp.paginaVacia()) {
            throw new RuntimeException("No se pueden insertar duplicados, key: " + vehic);
        }
        InsertarVehiculo(temp.parent, vehic, new ArbolB(temp.M));
        return getRoot();
    }

    private void InsertarVehiculo(ArbolB node, Vehiculo e, ArbolB eNode) {
        int valueIndex = 0;
        while(valueIndex < node.values.size() && node.values.get(valueIndex).getPlaca().compareTo(e.getPlaca()) < 0) {
            valueIndex++;
        }
        node.values.add(valueIndex, e);
        eNode.parent = node;
        node.children.add(valueIndex+1, eNode);
        if(node.values.size() > M-1) {

            int upIndex = M/2;
            Vehiculo up = node.values.get(upIndex);
            ArbolB rNode = new ArbolB(M);
            rNode.values = new LinkedList(node.values.subList(upIndex+1, M));
            rNode.children = new LinkedList(node.children.subList(upIndex+1, M+1));

            for(ArbolB rChild : rNode.children) {
                rChild.parent = rNode;
            }
            node.values = new LinkedList(node.values.subList(0, upIndex));
            node.children = new LinkedList(node.children.subList(0, upIndex+1));

            if(node.parent == null) {
                node.parent = new ArbolB(M);
                node.parent.values.add(up);
                node.parent.children.add(node);
                node.parent.children.add(rNode);
                rNode.parent = node.parent;
                return;
            }

            InsertarVehiculo(node.parent, up, rNode);
        }
    }
 
    
    public ArbolB delete(Vehiculo e) {
        if(paginaVacia()) {
            return this;
        }
        ArbolB p = getRoot().search(e.getPlaca());
        if(p.paginaVacia()) {
            throw new RuntimeException("the key to be deleted is not exist, key: " + e);
        }
        int valueIndex = 0;
        while(valueIndex < p.values.size() && p.values.get(valueIndex).getPlaca().compareTo(e.getPlaca()) < 0) {
            valueIndex++;
        }
        
        if(!p.children.get(0).paginaVacia()) {
            ArbolB rMin = p.children.get(valueIndex);
            while(!rMin.children.get(0).paginaVacia()) {
                rMin = rMin.children.get(0);
            }
            p.values.set(valueIndex, rMin.values.get(0));
            return delete(rMin, valueIndex, 0);
        }
        return delete(p, valueIndex, 0);
    }


  
    private ArbolB delete(ArbolB pagina, int valueIndex, int childIndex) {
        pagina.values.remove(valueIndex);
        pagina.children.remove(childIndex);
        if(pagina.children.size() >= Math.ceil(M/2.0)) {
            return pagina.getRoot();
        }
        if(pagina.isRoot()) {
            if(pagina.children.size() > 1) {
                return pagina;
            }else {
                ArbolB remplazo = pagina.children.get(0);
                remplazo.parent = null;
                return remplazo;
            }
        }
        int parentChildIndex = 0;
        while(parentChildIndex < pagina.parent.children.size() && pagina.parent.children.get(parentChildIndex) != pagina) {
            parentChildIndex++;
        }
        if(parentChildIndex > 0 && pagina.parent.children.get(parentChildIndex-1).values.size() >= Math.ceil(M/2.0)) {
            Vehiculo downKey = pagina.parent.values.get(parentChildIndex-1);
            ArbolB leftSibling = pagina.parent.children.get(parentChildIndex-1);
            Vehiculo upKey = leftSibling.values.remove(leftSibling.values.size()-1);
            ArbolB mergeChild = leftSibling.children.remove(leftSibling.children.size()-1);
            pagina.values.add(0, downKey);
            pagina.children.add(0, mergeChild);
            pagina.parent.values.set(parentChildIndex-1, upKey);
            return pagina.getRoot();
        }else if(parentChildIndex < pagina.parent.children.size()-1 &&
                pagina.parent.children.get(parentChildIndex+1).values.size() >= Math.ceil(M/2.0)) {
            Vehiculo downKey = pagina.parent.values.get(parentChildIndex);
            ArbolB rightSibling = pagina.parent.children.get(parentChildIndex+1);
            Vehiculo upKey = rightSibling.values.remove(0);
            ArbolB mergeChild = rightSibling.children.remove(0);
            pagina.values.add(downKey);
            pagina.children.add(mergeChild);
            pagina.parent.values.set(parentChildIndex, upKey);
            return pagina.getRoot();
        }else {

            int parentValueIndex;
            if(parentChildIndex > 0) {

                ArbolB leftSibling = pagina.parent.children.get(parentChildIndex-1);

                parentValueIndex = parentChildIndex - 1;
                Vehiculo downKey = pagina.parent.values.get(parentValueIndex);
                leftSibling.values.add(downKey);

                leftSibling.values.addAll(pagina.values);
                pagina.children.forEach(c -> c.parent=leftSibling);
                leftSibling.children.addAll(pagina.children);
            }else {

                ArbolB rightSibling = pagina.parent.children.get(parentChildIndex+1);

                parentValueIndex = parentChildIndex;
                Vehiculo downKey = pagina.parent.values.get(parentValueIndex);
                rightSibling.values.add(0, downKey);
                rightSibling.values.addAll(0, pagina.values);
                pagina.children.forEach(c -> c.parent=rightSibling);
                rightSibling.children.addAll(0, pagina.children);
            }
            return delete(pagina.parent, parentValueIndex, parentChildIndex);
        }
    }

     
    public ArbolB search(String target) {
        if(paginaVacia()) {
            return this;
        }
        int valueIndex = 0;
        while(valueIndex < values.size() && values.get(valueIndex).getPlaca().compareTo(target) <= 0) {
            if(values.get(valueIndex).getPlaca().equals(target)) {
                return this;
            }
            valueIndex++;
        }
        return children.get(valueIndex).search(target);
    }
//Obtenemos la a partir de la pagina en donde nos encontramos
    public ArbolB getRoot() {
        ArbolB p = this;
        while(!p.isRoot()) {
            p = p.parent;
        }
        return p;
    }

    public boolean paginaVacia() {
        if(values == null || values.size() == 0) {
            return true;
        }
        return false;
    }

    public boolean isRoot() {
        return parent == null;
    }

    public void clear() {
        values.clear();
        children.clear();
    }


    public void print() {
        printNode(this, 0);
    }


    private void printNode(ArbolB node, int depth) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < depth; i++) {
            sb.append("|    ");
        }
        if(depth > 0) {
            sb.append("|----");
        }
        sb.append(node.values);
        System.out.println(sb.toString());
        for(ArbolB child : node.children) {
            printNode(child, depth+1);
        }
    }
    
    public void imprimirArbol(ArbolB nodo){
        if(nodo.values.size()>0){
            System.out.print("[");
            for (Vehiculo ve : nodo.values) {
                System.out.print(ve.getPlaca()+",");
            }
            System.out.println("]");
            for(ArbolB child : nodo.children) {
                if(child.values.size()>0){
                    System.out.print("-*>");
                    imprimirArbol(child);
                }
                
            }
        }
    }
    
    public String obtenerGrafo(ArbolB root){
        this.cuerpoArbolS=" rankdir=TB;\n" + "node [shape = record, style=filled, fillcolor=gray76]; ";
        
            cuerpoGrafo(root);
        return this.cuerpoArbolS;
    }
    
    public void cuerpoGrafo(ArbolB nodo){
        int contP=0;
        int conH=0;
        if(nodo.values.size()>0){
            this.cuerpoArbolS+="\n \""+nodo.toString()+"\" [ label =\"<C0>";
            for (Vehiculo ve : nodo.values) {
                this.cuerpoArbolS+="| "+ve.getPlaca()+" \\n "+ve.getMarca()+"; "+ve.getModelo()+"; "+ve.getPrecio()+" |";
                contP++;
                this.cuerpoArbolS+=" <C"+contP+"> ";
            }
            this.cuerpoArbolS+=" \"];";
            for(ArbolB child : nodo.children) {
                if(child.values.size()>0){
                    this.cuerpoArbolS+="\n \""+nodo.toString()+"\":C"+conH+" -> \""+child.toString()+"\" \n";
                    cuerpoGrafo(child);
                    conH++;
                }
                
            }
        }
    }
    
    public Vehiculo searchPlaca(ArbolB root,String placa){
        if(root.values.size()>0){
            System.out.print("[");
            for (Vehiculo ve : root.values) {
                if(ve.getPlaca().equals(placa)){
                    return ve;
                }
            }
            System.out.println("]");
            for(ArbolB child : root.children) {
                if(child.values.size()>0){
                    Vehiculo temp= searchPlaca(child,placa);
                    if(temp!=null){
                        return temp;
                    }
                }
            }
        }
        return null;
    }
    
}
