/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edd.proyecto2;

import Nodos.TopCliente;
import principal.prubea;

/**
 *
 * @author Casca
 */
public class Top_Conductores extends javax.swing.JFrame {
private String Para_reporte="";
    /** Creates new form Top_Conductores */
    public Top_Conductores() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescomprimir = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtcomprimir = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(0, 102, 153));
        jPanel4.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Top de Conductores");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(210, 60, 350, 60);

        jButton4.setBackground(new java.awt.Color(0, 102, 153));
        jButton4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Regresar");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4);
        jButton4.setBounds(40, 560, 180, 60);

        jButton5.setBackground(new java.awt.Color(0, 102, 153));
        jButton5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Descomprimir");
        jButton5.setToolTipText("");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5);
        jButton5.setBounds(30, 400, 190, 60);

        txtDescomprimir.setColumns(20);
        txtDescomprimir.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtDescomprimir.setRows(5);
        txtDescomprimir.setEnabled(false);
        jScrollPane1.setViewportView(txtDescomprimir);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(270, 450, 460, 180);

        jButton6.setBackground(new java.awt.Color(0, 102, 153));
        jButton6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Generar y comprimir");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6);
        jButton6.setBounds(30, 240, 190, 60);

        txtcomprimir.setColumns(20);
        txtcomprimir.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtcomprimir.setRows(5);
        txtcomprimir.setEnabled(false);
        jScrollPane2.setViewportView(txtcomprimir);

        jPanel4.add(jScrollPane2);
        jScrollPane2.setBounds(270, 220, 460, 180);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        //Pantalla_Principal.a="Modificado";
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
String descomprimido="";
      String mostrar="";
      prubea p = new prubea();
      descomprimido= p.descomprimir("Top_10_Conductores");
      String [] contenido0 = descomprimido.split(";");
        for (String a : contenido0) {
            String [] contenido1=a.split("/");
            for (String b : contenido1) {
                mostrar+=(b+" ");
            }
            mostrar+=("\n");
        }
      txtDescomprimir.setText(mostrar);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        String reporte = "";
        String Nombre = "Top_10_Conductores";

        reporte = contenido();

        txtcomprimir.setText(reporte);

        System.out.println(Para_reporte);
        
        prubea p = new prubea();
        p.comprimir(Para_reporte, Nombre);
    }//GEN-LAST:event_jButton6ActionPerformed

    public String contenido(){
        
        String cuerpo ="";
        
        TopCliente aux = Pantalla_Principal.Top_Condutores.Cabeza;
        
        Lista_Top_Cliente nueva = new Lista_Top_Cliente();
        
        do{
        
            nueva.insertar(aux.getDPI(), aux.getNombre(), aux.getCant());
        
            aux = aux.Siguiente;
            
        }while(aux!=Pantalla_Principal.Top_Condutores.Cabeza);
        
        TopCliente aux2  = nueva.Cabeza;
        int cont = 1;
        
        do{
            
            cuerpo = cuerpo + String.valueOf(cont)+" "+String.valueOf(aux2.getDPI())+" "+ aux2.getNombre()+" "+ String.valueOf(aux2.getCant())+"\n";
            Para_reporte  = Para_reporte + String.valueOf(cont)+"/"+String.valueOf(aux2.getDPI())+"/"+ aux2.getNombre()+"/"+ String.valueOf(aux2.getCant())+";";
            txtcomprimir.setText(String.valueOf(cont)+" "+String.valueOf(aux2.getDPI())+" "+ aux2.getNombre()+" "+ String.valueOf(aux2.getCant()));
            cont++;
            aux2 = aux2.Siguiente;
            
        }while(aux2!= nueva.Cabeza  || cont ==10);
        
        return cuerpo;
        
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
            java.util.logging.Logger.getLogger(Top_Conductores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Top_Conductores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Top_Conductores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Top_Conductores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Top_Conductores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtDescomprimir;
    private javax.swing.JTextArea txtcomprimir;
    // End of variables declaration//GEN-END:variables

}
