/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import excepciones.NombreNulo;
import javax.swing.JOptionPane;

/**
 *
 * @author Steven Sis
 */
public class prubea {
    
    private static final long serialVersionUID = 1L;
	
	private Winzip winzip;

    public prubea() {
        winzip=new Winzip();
    }
    
    public void comprimir(String acomprimir,String nameA){
        String texto=acomprimir;
        try {
            //Verificamos que la cadena no sea nula, si lo es se lanza una excepcion
					if(texto.length()==0){
						JOptionPane.showMessageDialog(null, "Error. No hay datos que comprimir","Error",JOptionPane.ERROR_MESSAGE);
						throw new NombreNulo();
					}
					//Utilizamos la funcion comprimir del objeto winzip y le pasamos la cadena a comprimir
					String[] cadenas=winzip.Comprimir(texto,nameA);
					//Mostramos la cadena de direcciones y la cadena de bytes
					       System.out.println("Direcciones: "+cadenas[0]+"\nCaracteres: "+cadenas[1]);
        } catch (Exception e) {
            System.out.println("Algo asalio mal en comprimir "+e);
        }
					
    }
    
    public String descomprimir(String nameA){
				//Utilizamos la funcion descomprimir de la clase Winzip
        try {
            return "El mensaje original es: "+winzip.Descomprimir(nameA);
        } catch (Exception e) {
            System.out.println("Algo salio mal");
        }
         
	return null;
    }
}
