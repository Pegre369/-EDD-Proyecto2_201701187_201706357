
package edd.proyecto2;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Casca
 */
public class Pantalla_Principal extends javax.swing.JFrame {

  public static Lista_Vertice List_Vertice = new Lista_Vertice();
  public static int[][] Recorridos;
    
    public Pantalla_Principal() {
        initComponents();
        
        String b="Chocolate";
            System.out.println(b);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(null);

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 110, 640, 480);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Llega Rapidito");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(390, 30, 250, 60);

        jMenu2.setText("Clientes");
        jMenu2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        jMenu6.setText("Ingresar");
        jMenu6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jMenuItem4.setText("Manual");
        jMenu6.add(jMenuItem4);

        jMenuItem3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jMenuItem3.setText("Carga Masiva");
        jMenu6.add(jMenuItem3);

        jMenu2.add(jMenu6);

        jMenuItem5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jMenuItem5.setText("Mostrar");
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Vehiculos");
        jMenu3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        jMenu9.setText("Ingresar");
        jMenu9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        jMenuItem6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jMenuItem6.setText("Manual");
        jMenu9.add(jMenuItem6);

        jMenuItem7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jMenuItem7.setText("Carga Masiva");
        jMenu9.add(jMenuItem7);

        jMenu3.add(jMenu9);

        jMenuItem8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jMenuItem8.setText("Mostrar");
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Conductores");
        jMenu4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        jMenu10.setText("Ingresar");
        jMenu10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        jMenuItem9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jMenuItem9.setText("Manual");
        jMenu10.add(jMenuItem9);

        jMenuItem10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jMenuItem10.setText("Carga Masiva");
        jMenu10.add(jMenuItem10);

        jMenu4.add(jMenu10);

        jMenuItem11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jMenuItem11.setText("Mostrar");
        jMenu4.add(jMenuItem11);

        jMenuBar1.add(jMenu4);

        jMenu1.setText("Rutas");
        jMenu1.setToolTipText("");
        jMenu1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jMenuItem1.setText("Carga Masiva");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jMenuItem2.setText("Mostrar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu5.setText("Reportes");
        jMenu5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
        Seleccionar_Archivo iniciar = new Seleccionar_Archivo();
        iniciar.show();
        
       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ImageIcon imagen = new ImageIcon("Grafo.png");
        Icon logo = new ImageIcon(imagen.getImage().getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(), Image.SCALE_DEFAULT));
        jLabel1.setIcon(logo);
        this.repaint();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    
    
    

    
    
    
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
            java.util.logging.Logger.getLogger(Pantalla_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
