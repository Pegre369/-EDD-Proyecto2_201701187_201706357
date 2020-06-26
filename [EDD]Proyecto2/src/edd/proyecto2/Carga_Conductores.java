package edd.proyecto2;

import Nodos.Vertice;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.math.BigInteger;

/**
 *
 * @author Casca
 */
public class Carga_Conductores {
    
 public static void begin() {
     
       String respuesta=leerArchivo(Seleccionar_Archivo_Conductor.ruta);
       
       String [] datosseparados = respuesta.split(";");
       
        for (int i = 0; i < datosseparados.length; i++) {
            
            String [] datosfinale = datosseparados[i].split("%");
            
            if(datosseparados[i].equals(" ")){
            
                
            }else{
                try{
                BigInteger DPI= new BigInteger(datosfinale[0]);
                
                Pantalla_Principal.List_Conductores.insertar(DPI, datosfinale[1], datosfinale[2], datosfinale[3], datosfinale[4], datosfinale[5], Integer.valueOf(datosfinale[6]), datosfinale[7]);
                        
                }catch (Exception e){
                    
                }
              
            }
            
            
            //System.out.println(datosseparados[i]);
            
            
        }
        
        Pantalla_Principal.List_Conductores.mostrar(Pantalla_Principal.List_Conductores.Cabeza);
        
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
