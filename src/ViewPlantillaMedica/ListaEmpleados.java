/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewPlantillaMedica;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author picure
 */
public class ListaEmpleados extends javax.swing.JFrame {

    /**
     * Creates new form ListaEmpleados
     */
    public ListaEmpleados() {
        initComponents();
        setIconImage(getIconImage());
    }

       @Override
  public Image getIconImage () {  
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Image/Logo.png"));
        return retValue;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaconductor = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablapersonalmedico = new javax.swing.JTable();
        lbTituto = new javax.swing.JLabel();
        BotonRegresar = new javax.swing.JButton();
        ModificarDatoPersonalMedico = new javax.swing.JButton();
        ModificarDatoConductor = new javax.swing.JButton();
        EliminarConductor = new javax.swing.JButton();
        EliminarPersonalMedico = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaconductor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Conductor", "Edad", "Cédula", "Tipo Sangre", "Horario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaconductor.setToolTipText("");
        jScrollPane1.setViewportView(tablaconductor);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 460, 290));

        tablapersonalmedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "Cédula", "Tipo Sangre", "Horario", "Profesión", "Localización"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablapersonalmedico);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 490, 290));

        lbTituto.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbTituto.setForeground(new java.awt.Color(255, 255, 255));
        lbTituto.setText("          Lista de Conductores                                 Lista de Personal Médico");
        getContentPane().add(lbTituto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 920, -1));

        BotonRegresar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonRegresar.setText("Regresar");
        getContentPane().add(BotonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, -1, -1));

        ModificarDatoPersonalMedico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ModificarDatoPersonalMedico.setText("Modificar Datos del Personal");
        getContentPane().add(ModificarDatoPersonalMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 220, 40));

        ModificarDatoConductor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ModificarDatoConductor.setText("Modificar Datos del Conductor");
        ModificarDatoConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarDatoConductorActionPerformed(evt);
            }
        });
        getContentPane().add(ModificarDatoConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 230, 40));

        EliminarConductor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EliminarConductor.setText("Eliminar Conductor");
        EliminarConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarConductorActionPerformed(evt);
            }
        });
        getContentPane().add(EliminarConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 230, 40));

        EliminarPersonalMedico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EliminarPersonalMedico.setText("Eliminar Personal Médico");
        getContentPane().add(EliminarPersonalMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 220, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOTA: Selecciona una Fila de alguna de las dos tablas y presionar el boton modificar respectivo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("para cambiar los datos del conductor o bien del personal medico");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/l.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EliminarConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarConductorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarConductorActionPerformed

    private void ModificarDatoConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarDatoConductorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarDatoConductorActionPerformed

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
            java.util.logging.Logger.getLogger(ListaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BotonRegresar;
    public javax.swing.JButton EliminarConductor;
    public javax.swing.JButton EliminarPersonalMedico;
    public javax.swing.JButton ModificarDatoConductor;
    public javax.swing.JButton ModificarDatoPersonalMedico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbTituto;
    public javax.swing.JTable tablaconductor;
    public javax.swing.JTable tablapersonalmedico;
    // End of variables declaration//GEN-END:variables
}
