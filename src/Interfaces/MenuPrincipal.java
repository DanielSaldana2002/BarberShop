package Interfaces;

import java.time.LocalTime;
import javax.swing.JFrame;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        lSaludo.setText(this.saludo());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HD = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lTituloEncabezado = new javax.swing.JLabel();
        bVentas = new javax.swing.JButton();
        bRegistrarVenta = new javax.swing.JButton();
        bInventario = new javax.swing.JButton();
        lSaludo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio - Edgar Barber Shop");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HD.setBackground(new java.awt.Color(255, 255, 255));
        HD.setPreferredSize(new java.awt.Dimension(1366, 768));
        HD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(156, 195, 219));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lTituloEncabezado.setFont(new java.awt.Font("Stencil", 0, 56)); // NOI18N
        lTituloEncabezado.setText("Edgar Barber Shop");
        jPanel2.add(lTituloEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        HD.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 120));

        bVentas.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        bVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono informe-ventas (1).png"))); // NOI18N
        bVentas.setText(" VENTAS");
        bVentas.setHideActionText(true);
        bVentas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bVentasMouseExited(evt);
            }
        });
        HD.add(bVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 400, 160));

        bRegistrarVenta.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        bRegistrarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono dinero (1).png"))); // NOI18N
        bRegistrarVenta.setText(" REGISTRAR");
        bRegistrarVenta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bRegistrarVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bRegistrarVentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bRegistrarVentaMouseExited(evt);
            }
        });
        bRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistrarVentaActionPerformed(evt);
            }
        });
        HD.add(bRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 380, 160));

        bInventario.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        bInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono invetario (1).png"))); // NOI18N
        bInventario.setText(" INVENTARIO");
        bInventario.setHideActionText(true);
        bInventario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bInventarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bInventarioMouseExited(evt);
            }
        });
        HD.add(bInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 250, 400, 160));

        lSaludo.setFont(new java.awt.Font("Corbel", 1, 48)); // NOI18N
        lSaludo.setText("Saludo");
        HD.add(lSaludo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 520, 70));

        getContentPane().add(HD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        lSaludo.setText(this.saludo());
    }//GEN-LAST:event_formWindowActivated

    private void bRegistrarVentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bRegistrarVentaMouseEntered
        this.setCursor(HAND_CURSOR);
    }//GEN-LAST:event_bRegistrarVentaMouseEntered

    private void bRegistrarVentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bRegistrarVentaMouseExited
        this.setCursor(DEFAULT_CURSOR);
    }//GEN-LAST:event_bRegistrarVentaMouseExited

    private void bVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVentasMouseEntered
        this.setCursor(HAND_CURSOR);
    }//GEN-LAST:event_bVentasMouseEntered

    private void bVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVentasMouseExited
        this.setCursor(DEFAULT_CURSOR);
    }//GEN-LAST:event_bVentasMouseExited

    private void bInventarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bInventarioMouseEntered
        this.setCursor(HAND_CURSOR);
    }//GEN-LAST:event_bInventarioMouseEntered

    private void bInventarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bInventarioMouseExited
        this.setCursor(DEFAULT_CURSOR);
    }//GEN-LAST:event_bInventarioMouseExited

    private void bRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistrarVentaActionPerformed
        RegistrarVentas registrarVentas = new RegistrarVentas(this,true);
        registrarVentas.setLocationRelativeTo(this);
        registrarVentas.setResizable(false);
        registrarVentas.setVisible(true);
    }//GEN-LAST:event_bRegistrarVentaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel HD;
    private javax.swing.JButton bInventario;
    private javax.swing.JButton bRegistrarVenta;
    private javax.swing.JButton bVentas;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lSaludo;
    private javax.swing.JLabel lTituloEncabezado;
    // End of variables declaration//GEN-END:variables
    
    public String saludo(){
        LocalTime horaActual = LocalTime.now();
        String saludo;

        if (horaActual.isAfter(LocalTime.of(5, 59)) && horaActual.isBefore(LocalTime.of(12, 0))) {
            saludo = "¡Hola, Buenos días!";
        } else if (horaActual.isAfter(LocalTime.of(11, 59)) && horaActual.isBefore(LocalTime.of(18, 0))) {
            saludo = "¡Hola, Buenas tardes!";
        } else {
            saludo = "¡Hola, Buenas noches!";
        }
        return saludo;
    }

}
