
package edd.proyecto2;

import java.awt.Desktop;
import java.awt.Image;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Casca
 */
public class Pantalla_Principal extends javax.swing.JFrame {

  public static Lista_Vertice List_Vertice = new Lista_Vertice(); 
  public static Lista_Arista List_Recorrido = new Lista_Arista();
  public static Lista_Conductores List_Conductores = new Lista_Conductores();
  public static Lista_Arista Recorrido;
  public static Lista_Viajes List_viaje = new Lista_Viajes();
  public static Lista_Top_Cliente Top_Clientes = new Lista_Top_Cliente();
  public static Lista_Top_Cliente Top_Condutores = new Lista_Top_Cliente();
  public static Lista_Top_Carros Top_vehiculo = new Lista_Top_Carros();
  public static int[][] Recorridos;
  public static ArbolB vehiculoRoot = new ArbolB(5);
  public static HashTable tablaHash=new HashTable(37);
  public static int sumado_nombre = 0;
  //public static String a = "prueba";
    public Pantalla_Principal() {
        initComponents();
        ImageIcon imagen = new ImageIcon("Corredor.png");
        Icon logo = new ImageIcon(imagen.getImage().getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(), Image.SCALE_DEFAULT));
        jLabel1.setIcon(logo);
        this.repaint();
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
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(null);

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(490, 30, 190, 170);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Llega Rapidito");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(140, 70, 250, 60);

        jMenu2.setText("Clientes");
        jMenu2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        jMenu6.setText("Ingresar");
        jMenu6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jMenuItem4.setText("Manual");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem4);

        jMenuItem3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jMenuItem3.setText("Carga Masiva");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem3);

        jMenu2.add(jMenu6);

        jMenuItem5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jMenuItem5.setText("Mostrar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem12.setText("Editar-Eliminar");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem12);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Vehiculos");
        jMenu3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        jMenu9.setText("Ingresar");
        jMenu9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        jMenuItem6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jMenuItem6.setText("Manual");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem6);

        jMenuItem7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jMenuItem7.setText("Carga Masiva");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem7);

        jMenu3.add(jMenu9);

        jMenuItem8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jMenuItem8.setText("Mostrar");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem11.setText("Editar-Eliminar");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Conductores");
        jMenu4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        jMenu10.setText("Ingresar");
        jMenu10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        jMenuItem9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jMenuItem9.setText("Manual");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem9);

        jMenuItem10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jMenuItem10.setText("Carga Masiva");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem10);

        jMenu4.add(jMenu10);

        jMenu11.setText("Otros");
        jMenu11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        jMenuItem13.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jMenuItem13.setText("Eliminar");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem13);

        jMenuItem14.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jMenuItem14.setText("Modificar");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem14);

        jMenu4.add(jMenu11);

        jMenu12.setText("Mostrar");
        jMenu12.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        jMenuItem16.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jMenuItem16.setText("Estructura");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem16);

        jMenu4.add(jMenu12);

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

        jMenu13.setText("Mostrar");
        jMenu13.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        jMenuItem17.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jMenuItem17.setText("Lista Ayasente");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem17);

        jMenuItem18.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jMenuItem18.setText("Grafo");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem18);

        jMenu1.add(jMenu13);

        jMenuBar1.add(jMenu1);

        jMenu7.setText("Viajes");
        jMenu7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jMenuItem2.setText("Crear");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem2);

        jMenuBar1.add(jMenu7);

        jMenu5.setText("Reportes");
        jMenu5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        jMenuItem19.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jMenuItem19.setText("Top 10 Clientes");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem19);

        jMenuItem20.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jMenuItem20.setText("Top 10 Conductores");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem20);

        jMenuItem21.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jMenuItem21.setText("Top 10 Vehiculo");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem21);

        jMenuItem15.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jMenuItem15.setText("Ruta de un viaje");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem15);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
        Seleccionar_Archivo_Ruta iniciar = new Seleccionar_Archivo_Ruta();
        iniciar.show();
        
       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        
        Conductores mostrar = new Conductores();
        mostrar.show();
       this.setExtendedState(ICONIFIED);
        
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    
    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        //List_Vertice.Ruta(Recorridos, "Oviedo", "Madrid", Lista_Vertice.poss);
        this.vehiculoRoot=this.vehiculoRoot.getRoot();
        this.graficarC(this.vehiculoRoot.obtenerGrafo(this.vehiculoRoot), "ArbolB_Vehiculos");
        System.out.println("");
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
       System.out.println("Entra a registrar manualmente");
        Vehiculos ventanaV = new Vehiculos();
        ventanaV.setRootTree(this.vehiculoRoot);
        ventanaV.show();
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        Seleccionar_Archivo_Conductor iniciar = new Seleccionar_Archivo_Conductor();
        iniciar.show();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        Eliminar_Conductor mostrar = new Eliminar_Conductor();
        mostrar.show();
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
       Modificar_Conductores inicio = new Modificar_Conductores();
       inicio.show();
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
          try {

            File objetofile = new File ("Lista_Conductores.png");
            Desktop.getDesktop().open(objetofile);

         }catch (IOException ex) {

            System.out.println(ex);

          }
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        VehiculosEditDelete vehiculosED = new VehiculosEditDelete();
        this.vehiculoRoot=this.vehiculoRoot.getRoot();
        vehiculosED.show();
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        Seleccionar_Archivo2 iniciar = new Seleccionar_Archivo2();
        iniciar.show();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
       

     try {

            File objetofile = new File ("Lista_Adyasente.png");
            Desktop.getDesktop().open(objetofile);

     }catch (IOException ex) {

            System.out.println(ex);

     }
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        
     try {

            File objetofile = new File ("Grafo.png");
            Desktop.getDesktop().open(objetofile);

     }catch (IOException ex) {

            System.out.println(ex);

     }
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
      
      
      Viaje mostrar = new Viaje();
      mostrar.show();
      this.setExtendedState(ICONIFIED);
       
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
   /*     try {

            File objetofile = new File ("Lista_Rutas.png");
            Desktop.getDesktop().open(objetofile);

     }catch (IOException ex) {

            System.out.println(ex);

     }*/
    String asd=this.tablaHash.cuerpodot();
        System.out.println("asd");
     this.graficarC(asd, "Tabla_Hash");
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        Seleccionar_Archivo3 iniciar = new Seleccionar_Archivo3();
        iniciar.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        InsertarCliente clienteI = new InsertarCliente();
        clienteI.show();
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        ClienteED clienteI = new ClienteED();
        clienteI.show();
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
       
        Ruta_de_un_Viaje Repo6 = new Ruta_de_un_Viaje();
        Repo6.show();
        this.setExtendedState(ICONIFIED);
        
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
       Top_Clientes Repo2 = new Top_Clientes();
        Repo2.show();
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        Top_Conductores Repo3 = new Top_Conductores();
        Repo3.show();
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        Top_Vehiculos Repo4 = new Top_Vehiculos();
        Repo4.show();
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jMenuItem21ActionPerformed

     
    public void graficarC(String cuerpo, String nombre){
         String contenido;
         contenido = "digraph G { \n graph [ dpi = 300 ];\n";
         FileWriter documento = null;
         PrintWriter crear;
         String nombredot = nombre+".dot";
         String direccion = nombre+".png";
         contenido += cuerpo;
         contenido = contenido + "}";
        
         try {
                documento = new FileWriter(nombredot);
                crear = new PrintWriter(documento);
                crear.print(contenido);
                crear.close();
            } catch (Exception e) {
                System.out.println("Error");
            }
         
           try {
                Runtime.getRuntime().exec("dot -Tpng " + nombredot + " -o " + direccion);
            } catch (Exception e) {
                System.err.println("");
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
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
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
