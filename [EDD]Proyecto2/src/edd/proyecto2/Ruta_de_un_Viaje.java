/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.proyecto2;

import Nodos.Rutas;
import java.awt.Image;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Casca
 */
public class Ruta_de_un_Viaje extends javax.swing.JFrame {

    /**
     * Creates new form Ruta_de_un_Viaje
     */
    public Ruta_de_un_Viaje() {
        initComponents();
        Pantalla_Principal.List_viaje.mostrar_existente(Pantalla_Principal.List_viaje.Cabeza);
        ImageIcon imagen = new ImageIcon("Viaje_Logo.png");
        Icon logo = new ImageIcon(imagen.getImage().getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(), Image.SCALE_DEFAULT));
        jLabel1.setIcon(logo);
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        L1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(null);

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(380, 30, 330, 220);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Viajes");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(130, 110, 110, 60);

        L1.setBackground(new java.awt.Color(0, 102, 153));
        L1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        L1.setForeground(new java.awt.Color(255, 255, 255));
        L1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(L1);
        L1.setBounds(280, 280, 350, 31);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Llave de la ruta:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(120, 280, 160, 30);

        jButton1.setBackground(new java.awt.Color(0, 102, 153));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Regresar");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(470, 650, 170, 60);

        jButton3.setBackground(new java.awt.Color(0, 102, 153));
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Registrar Viaje");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(90, 650, 190, 60);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(130, 350, 460, 250);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //Pantalla_Principal.a="Modificado";
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        jTextArea1.setText("");
        String ruta_tomada = (String) L1.getSelectedItem();;
        Nodos.Nodo_Viaje encontrado = Pantalla_Principal.List_viaje.buscarNodo(ruta_tomada);

        String contenido ="";
        if(encontrado!=null){
            
            
             Rutas tmp = encontrado.getRecorido().Cabeza;
        
            while(tmp != null){
            
            //System.out.print("("+tmp.getLugar_Origen()+ ", "+String.valueOf(tmp.getTiempo())+") ->" );
            contenido = contenido + tmp.getLugar_Origen() + "->" + String.valueOf(tmp.getTiempo())+"\n";
            tmp = tmp.Siguiente;
            
            }
           
            
            jTextArea1.setText(contenido);
            
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Ruta_de_un_Viaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ruta_de_un_Viaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ruta_de_un_Viaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ruta_de_un_Viaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ruta_de_un_Viaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> L1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
