/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.proyecto2;

import Nodos.Vehiculo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Steven Sis
 */
public class Seleccionar_Archivo2 extends javax.swing.JFrame {

    /**
     * Creates new form Seleccionar_Archivo2
     */
    public Seleccionar_Archivo2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed

        JFileChooser SelectorArchivo = (JFileChooser) evt.getSource();
        String command = evt.getActionCommand();
        if (command.equals(JFileChooser.APPROVE_SELECTION)) {
            File archivoSeleccionado = SelectorArchivo.getSelectedFile();
            System.out.println(archivoSeleccionado.getAbsolutePath());
            String ruta=archivoSeleccionado.getAbsolutePath();
            cargarVehiculos(ruta);
            JOptionPane.showMessageDialog(null, "Carga Masiva Realizada");
            hide();
        } else if (command.equals(JFileChooser.CANCEL_SELECTION)) {
            //JOptionPane.showMessageDialog(this, "Selecciona un Archivo...");
            hide();
        }
    }//GEN-LAST:event_jFileChooser1ActionPerformed

    public void cargarVehiculos(String ruta){
        String respuesta=leerArchivo(ruta);
       
       String [] datosseparados = respuesta.split(";");
       
        for (int i = 0; i < datosseparados.length; i++) {
            
            String [] datosfinale = datosseparados[i].split(":");
            
            if(datosseparados[i].equals(" ")){
            
                
            }else{
                Pantalla_Principal.vehiculoRoot=Pantalla_Principal.vehiculoRoot.Insertar(new Vehiculo(datosfinale[0],datosfinale[1], datosfinale[2], Integer.valueOf(datosfinale[3]), datosfinale[4], datosfinale[5], datosfinale[6]) );
                        
            }
            
            //System.out.println(datosseparados[i]);
            
            
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Seleccionar_Archivo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seleccionar_Archivo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seleccionar_Archivo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seleccionar_Archivo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seleccionar_Archivo2().setVisible(true);
            }
        });
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JFileChooser jFileChooser1;
    // End of variables declaration//GEN-END:variables
}
