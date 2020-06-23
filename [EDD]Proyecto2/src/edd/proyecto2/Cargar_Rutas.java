package edd.proyecto2;
import Nodos.Vertice;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Casca
 */
public class Cargar_Rutas {

 public static void begin() {
     
       String respuesta=leerArchivo(Seleccionar_Archivo.ruta);
       
       String [] datosseparados = respuesta.split("%");
       
        for (int i = 0; i < datosseparados.length; i++) {
            
            String [] datosfinale = datosseparados[i].split("/");
            
            if(datosseparados[i].equals(" ")){
            
                
            }else{
                Pantalla_Principal.jTextArea1.append(datosfinale[0]+"\n"+datosfinale[1]+"\n"+datosfinale[2]+"\n");
                
                //Vertices
                Pantalla_Principal.List_Vertice.Insertar(datosfinale[0]);
                Pantalla_Principal.List_Vertice.Insertar(datosfinale[1]);
                
                //Aristas
                Vertice ingresar_aristas = Pantalla_Principal.List_Vertice.Buscar(datosfinale[0], Pantalla_Principal.List_Vertice.Cabeza);
                ingresar_aristas.agregar_arista(datosfinale[0], datosfinale[1], Integer.parseInt(datosfinale[2]));
                Pantalla_Principal.List_Vertice.insertar_arisa(Pantalla_Principal.List_Vertice.Cabeza, ingresar_aristas);
                        
            }
            
            //System.out.println(datosseparados[i]);
            
            
        }
        
        Pantalla_Principal.List_Vertice.mostrar(Pantalla_Principal.List_Vertice.Cabeza);
        Pantalla_Principal.List_Vertice.graficar();
       
 }
 
 
 
 public static String leerArchivo(String ruta){
     
        File archivo=null;
        FileReader fr=null;
        BufferedReader br=null;
        String respuesta="";
        try{
            archivo=new File(ruta);
            fr=new FileReader(archivo);
            br=new BufferedReader(fr);
            System.out.println("Leyendo Contenido");
            String linea="";
            boolean bandera=false;
            while((linea=br.readLine())!=null){
                if(bandera==true){
                    respuesta=respuesta+linea;
                }else{
                    respuesta=linea;
                    bandera=true;
                }
            }
        }catch(Exception e){
            System.out.println("Ocurrio un error");
        }finally{
            try{
                if(null!=fr){
                    fr.close();
                }
            }catch(Exception e){
                System.out.println("Ocurrio un error");
            }
        }
        return respuesta;
    }   

    
}
