/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import javax.swing.JInternalFrame;

/**
 *
 * @author Diego Velez
 */
public class frmInicio extends javax.swing.JFrame {

    /**
     * Creates new form frmInicio
     */
    public frmInicio() {
        initComponents();
        this.setExtendedState(frmInicio.MAXIMIZED_BOTH);
        this.setTitle("Sistema de Almacén y Gestión de Ventas - CREACIONES JHOAN");

    }

    public void centrarVentanaInterna(JInternalFrame internalFrame) {
        int x = (escritorio.getWidth() / 2) - internalFrame.getWidth() / 2;
        int y = (escritorio.getHeight() / 2) - internalFrame.getHeight() / 2;
        if (internalFrame.isShowing()) {
            escritorio.setLocation(x, y);
        } else {
            escritorio.add(internalFrame);
            internalFrame.setLocation(x, y);
            internalFrame.show();
        }

    }
    
   

/**
 * This method is called from within the constructor to initialize the form.
 * WARNING: Do NOT modify this code. The content of this method is always
 * regenerated by the Form Editor.
 */
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        editMenu = new javax.swing.JMenu();
        mnuProductos = new javax.swing.JMenuItem();
        mnuClientes = new javax.swing.JMenuItem();
        mnuPedidos = new javax.swing.JMenu();
        mnuRemisiones = new javax.swing.JMenu();
        mnuPagos = new javax.swing.JMenu();
        mnuConsultas = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        mnuUsuarios = new javax.swing.JMenuItem();
        mnuHerramientas = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        mnuAcercade = new javax.swing.JMenuItem();
        mnuAyuda = new javax.swing.JMenuItem();
        MnuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(255, 255, 255));

        fileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sistema.png"))); // NOI18N
        fileMenu.setMnemonic('f');
        fileMenu.setText("SysControl");
        menuBar.add(fileMenu);

        editMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Archivo-32.png"))); // NOI18N
        editMenu.setMnemonic('e');
        editMenu.setText("Archivo");

        mnuProductos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        mnuProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ropa-32.png"))); // NOI18N
        mnuProductos.setMnemonic('t');
        mnuProductos.setText("Productos");
        mnuProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProductosActionPerformed(evt);
            }
        });
        editMenu.add(mnuProductos);

        mnuClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mnuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cliente de empresa-32.png"))); // NOI18N
        mnuClientes.setMnemonic('y');
        mnuClientes.setText("Clientes");
        mnuClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuClientesMouseClicked(evt);
            }
        });
        mnuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuClientesActionPerformed(evt);
            }
        });
        editMenu.add(mnuClientes);

        menuBar.add(editMenu);

        mnuPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Repositorio-32.png"))); // NOI18N
        mnuPedidos.setMnemonic('h');
        mnuPedidos.setText("Pedidos");
        menuBar.add(mnuPedidos);

        mnuRemisiones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Factura-32.png"))); // NOI18N
        mnuRemisiones.setText("Remisiones");
        menuBar.add(mnuRemisiones);

        mnuPagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Caja registradora-32.png"))); // NOI18N
        mnuPagos.setText("Pagos");
        mnuPagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuPagosMouseClicked(evt);
            }
        });
        mnuPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPagosActionPerformed(evt);
            }
        });
        menuBar.add(mnuPagos);

        mnuConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Gráfico de barras-32.png"))); // NOI18N
        mnuConsultas.setText("Consultas");
        menuBar.add(mnuConsultas);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Solicitar servicio-32.png"))); // NOI18N
        jMenu2.setText("Configuraciones");

        mnuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Usuario-32.png"))); // NOI18N
        mnuUsuarios.setText("Usuarios y accesos");
        jMenu2.add(mnuUsuarios);

        menuBar.add(jMenu2);

        mnuHerramientas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ajustes-32.png"))); // NOI18N
        mnuHerramientas.setText("Herramientas");
        menuBar.add(mnuHerramientas);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ayuda-32.png"))); // NOI18N
        jMenu4.setText("Ayuda");

        mnuAcercade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Información.png"))); // NOI18N
        mnuAcercade.setText("Acerca de...");
        jMenu4.add(mnuAcercade);

        mnuAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ayuda-32.png"))); // NOI18N
        mnuAyuda.setText("Ayuda");
        jMenu4.add(mnuAyuda);

        menuBar.add(jMenu4);

        MnuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir redondeado-48.png"))); // NOI18N
        MnuSalir.setText("Salir");
        MnuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MnuSalirMouseClicked(evt);
            }
        });
        menuBar.add(MnuSalir);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1241, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProductosActionPerformed
        frmProducto form = new frmProducto();
        centrarVentanaInterna(form);
        //Bloquea el JInternalFrame para que no se mueva dentro del Escritorio
        //el metodo hay que sobre escribirlo en este caso en la clase frmProducto
        form.setLocked(true); 
    }//GEN-LAST:event_mnuProductosActionPerformed

    private void MnuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MnuSalirMouseClicked
        System.exit(0);
        
    }//GEN-LAST:event_MnuSalirMouseClicked

    private void mnuClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuClientesMouseClicked
        
    }//GEN-LAST:event_mnuClientesMouseClicked

    private void mnuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuClientesActionPerformed
        frmCliente cliente = new frmCliente();
        centrarVentanaInterna(cliente);
        //Bloquea el JInternalFrame para que no se mueva dentro del Escritorio
        //el metodo hay que sobre escribirlo en este caso en la clase frmProducto
        cliente.setLocked(true);
    }//GEN-LAST:event_mnuClientesActionPerformed

    private void mnuPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPagosActionPerformed

    }//GEN-LAST:event_mnuPagosActionPerformed

    private void mnuPagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuPagosMouseClicked
        frmFactura f = new frmFactura();
        centrarVentanaInterna(f);
        f.setLocked(true);
    }//GEN-LAST:event_mnuPagosMouseClicked

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
            java.util.logging.Logger.getLogger(frmInicio.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MnuSalir;
    private javax.swing.JMenu editMenu;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mnuAcercade;
    private javax.swing.JMenuItem mnuAyuda;
    private javax.swing.JMenuItem mnuClientes;
    private javax.swing.JMenu mnuConsultas;
    private javax.swing.JMenu mnuHerramientas;
    private javax.swing.JMenu mnuPagos;
    private javax.swing.JMenu mnuPedidos;
    private javax.swing.JMenuItem mnuProductos;
    private javax.swing.JMenu mnuRemisiones;
    private javax.swing.JMenuItem mnuUsuarios;
    // End of variables declaration//GEN-END:variables

}
