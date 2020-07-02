package edd.proyecto2;
import Nodos.*;
import static edd.proyecto2.Modificar_Conductores.jComboBox5;
import java.awt.Desktop;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Casca
 */
public class Viaje extends javax.swing.JFrame {


    
    public Viaje() {
        initComponents();
        Pantalla_Principal.List_Conductores.mostrar_existente3(Pantalla_Principal.List_Conductores.Cabeza);
        Pantalla_Principal.List_Vertice.mostrar_Viaje(Pantalla_Principal.List_Vertice.Cabeza);
        rellenar(Pantalla_Principal.vehiculoRoot);
        rellenar2();
        fechas();
        jButton3.enable(false);
        ImageIcon imagen = new ImageIcon("Viaje_Logo.png");
        Icon logo = new ImageIcon(imagen.getImage().getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(), Image.SCALE_DEFAULT));
        jLabel1.setIcon(logo);
        this.repaint();
        
    }

    public void rellenar(ArbolB nodo){
        if(nodo.values.size()>0){
            for (Vehiculo ve : nodo.values) {
                cbvehiculo.addItem(ve.getPlaca());
            }
            for(ArbolB child : nodo.children) {
                if(child.values.size()>0){
                    rellenar(child);
                }
                
            }
        }
    }
    
    public void rellenar2(){
        HashTable temp = Pantalla_Principal.tablaHash;
        for (int i = 0; i <temp.indices.length ; i++) {
            if(temp.indices[i]!=null){
                NodoLDC tempN = temp.indices[i].primero; 
                while(tempN!=null){
                    cbcliente.addItem(tempN.cliente.getDpi().toString());
                    tempN=tempN.siguiente;
                }
            }
        }
    }
    
    public void fechas(){
        Date fech = new Date();
        DateFormat f = new SimpleDateFormat("dd/MM/yy");
        DateFormat h = new SimpleDateFormat("HH:mm");
        FH.setText(f.format(fech));
        H1.setText(h.format(fech));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FH = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        L1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        cbconductor = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        cbvehiculo = new javax.swing.JComboBox<>();
        cbcliente = new javax.swing.JComboBox<>();
        L2 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        H1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

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

        FH.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        FH.setForeground(new java.awt.Color(255, 255, 255));
        FH.setText("a");
        jPanel1.add(FH);
        FH.setBounds(190, 500, 160, 30);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cliente:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(100, 340, 70, 30);

        L1.setBackground(new java.awt.Color(0, 102, 153));
        L1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        L1.setForeground(new java.awt.Color(255, 255, 255));
        L1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(L1);
        L1.setBounds(170, 270, 200, 31);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Lugar Origen:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 270, 130, 30);

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
        jButton1.setBounds(540, 650, 170, 60);

        jButton2.setBackground(new java.awt.Color(0, 102, 153));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Ruta Tomada");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(490, 520, 230, 60);

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Conductor:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(430, 340, 100, 30);

        cbconductor.setBackground(new java.awt.Color(0, 102, 153));
        cbconductor.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cbconductor.setForeground(new java.awt.Color(255, 255, 255));
        cbconductor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(cbconductor);
        cbconductor.setBounds(530, 340, 200, 31);

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Vehículo:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(90, 420, 77, 30);

        cbvehiculo.setBackground(new java.awt.Color(0, 102, 153));
        cbvehiculo.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cbvehiculo.setForeground(new java.awt.Color(255, 255, 255));
        cbvehiculo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(cbvehiculo);
        cbvehiculo.setBounds(170, 420, 200, 31);

        cbcliente.setBackground(new java.awt.Color(0, 102, 153));
        cbcliente.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cbcliente.setForeground(new java.awt.Color(255, 255, 255));
        cbcliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(cbcliente);
        cbcliente.setBounds(170, 340, 200, 31);

        L2.setBackground(new java.awt.Color(0, 102, 153));
        L2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        L2.setForeground(new java.awt.Color(255, 255, 255));
        L2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(L2);
        L2.setBounds(540, 270, 200, 31);

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Lugar Destino:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(410, 270, 130, 30);

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
        jButton3.setBounds(40, 650, 190, 60);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(100, 500, 70, 30);

        H1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        H1.setForeground(new java.awt.Color(255, 255, 255));
        H1.setText("a");
        jPanel1.add(H1);
        H1.setBounds(190, 560, 160, 30);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Hora:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(110, 560, 60, 30);

        jButton4.setBackground(new java.awt.Color(0, 102, 153));
        jButton4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Mostrar Estructura");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(290, 650, 190, 60);

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        Pantalla_Principal.List_Recorrido = new Lista_Arista();
        
        String origen = (String) L1.getSelectedItem();
        String fin = (String) L2.getSelectedItem();
        
        if(!origen.endsWith(fin)){
            
           Pantalla_Principal.List_Vertice.Ruta(Pantalla_Principal.Recorridos, origen, fin, Lista_Vertice.poss);
           Pantalla_Principal.List_Recorrido.graficar(Pantalla_Principal.sumado_nombre);
           
            try {
                Thread.sleep(100);
                
                  try {

                        File objetofile = new File ("Lista_Rutas"+Pantalla_Principal.sumado_nombre+".png");
                        Desktop.getDesktop().open(objetofile);

                     }catch (IOException ex) {

                        System.out.println(ex);

                    }  
                
            } catch (InterruptedException ex) {
                System.out.println("No jalo");
            }
           
            Pantalla_Principal.sumado_nombre++;
            
        }else{
            
             JOptionPane.showMessageDialog(null, "No puede hacer rutas donde: \n el destino es igual al origen");
            
        }
        System.out.println(Lista_Vertice.Largo_Viaje);
        jButton3.enable(true);
        jButton2.enable(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        
        
        Date fech = new Date();
        
        DateFormat fh = new SimpleDateFormat("ddMMyyHH:mm:ss");
        
        //System.out.println(fh.format(fech));
        
        String Llave1 = fh.format(fech);
        
        String Placa = (String) cbvehiculo.getSelectedItem();
        
        String Llave = Placa + Llave1;
        
        String LlaveMD5 = MD5(Llave);
        
        String Origen = (String) L1.getSelectedItem();
        
        String Destino = (String) L2.getSelectedItem();
        
        String Fecha =  FH.getText();
        
        String Hora = H1.getText();
        
        //Cliente
        
         String dpiC = (String) cbcliente.getSelectedItem();
        
         BigInteger Clientedpi = new BigInteger(dpiC);
        
         // Reprote Top 
         
         NodoLDC cliente = Pantalla_Principal.tablaHash.buscarCliente(Clientedpi);
         
         int sum = cliente.cliente.getContador() + 1;
         
         cliente.cliente.setContador(sum);
        
         Pantalla_Principal.Top_Clientes.insertar(cliente.cliente.getDpi(), cliente.cliente.getNombre(), sum);
         
         //Pantalla_Principal.Top_Clientes.mostrar(Pantalla_Principal.Top_Clientes.Cabeza);
         
        //Condutor
        
        String dpi = (String) cbconductor.getSelectedItem();
       
        BigInteger DPI = new BigInteger(dpi);
        
        //Reprote Top
        
        Conductor conductor = Pantalla_Principal.List_Conductores.buscarNodo(DPI);
        
        int sum2 = conductor.getContador() + 1;
         
        conductor.setContador(sum2);
        
        Pantalla_Principal.Top_Condutores.insertar(conductor.getDpi(), conductor.getNombre(), sum2);
         
        //Pantalla_Principal.Top_Condutores.mostrar(Pantalla_Principal.Top_Condutores.Cabeza);
       
        //Vehiculo
        
        String placaId= (String) cbvehiculo.getSelectedItem();
        
        //Reporte Top
        
        Vehiculo carro = Pantalla_Principal.vehiculoRoot.searchPlaca(Pantalla_Principal.vehiculoRoot, placaId);
        
        int sum3 = carro.getContador() + 1;
         
        carro.setContador(sum3);
        
        Pantalla_Principal.Top_vehiculo.insertar(carro.getPlaca(), carro.getMarca(), carro.getMarca(), sum3);
        Pantalla_Principal.Top_vehiculo.mostrar(Pantalla_Principal.Top_vehiculo.Cabeza);
        
        
        Pantalla_Principal.List_viaje.insertar(LlaveMD5, Llave, Origen, Destino, Fecha, Hora, conductor, carro, Pantalla_Principal.List_Recorrido,cliente);
        try {
            
            Thread.sleep(100);
            Pantalla_Principal.List_viaje.graficar();
            JOptionPane.showMessageDialog(null, "Viaje Registrado");
        
        } catch (Exception e) {
            
            System.out.println(e);
            
        }
        
        Pantalla_Principal.Top_Viajes.insertar(LlaveMD5, Origen, Destino, Lista_Vertice.Largo_Viaje);
        Pantalla_Principal.Top_Viajes.mostrar(Pantalla_Principal.Top_Viajes.Cabeza);
        
        
       // System.out.println(Placa + " -> " + Llave +" = "+LlaveMD5);
       jButton2.enable(true);
       jButton3.enable(false); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {

            File objetofile = new File ("Bloc_Viaje.png");
            Desktop.getDesktop().open(objetofile);

     }catch (IOException ex) {

            System.out.println(ex);

     }
        
       
        
    }//GEN-LAST:event_jButton4ActionPerformed

    
    
    public static String MD5(String llave){
        
        try{
            
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(llave.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);

            while (hashtext.length() < 32) {
            hashtext = "0" + hashtext;
            }
            
            return hashtext;
            
        }catch (Exception e){
            throw new RuntimeException(e);
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
            java.util.logging.Logger.getLogger(Viaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Viaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Viaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Viaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Viaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FH;
    private javax.swing.JLabel H1;
    public static javax.swing.JComboBox<String> L1;
    public static javax.swing.JComboBox<String> L2;
    public static javax.swing.JComboBox<String> cbcliente;
    public static javax.swing.JComboBox<String> cbconductor;
    public static javax.swing.JComboBox<String> cbvehiculo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
