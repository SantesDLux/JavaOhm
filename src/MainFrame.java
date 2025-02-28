/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author José Santes
 */
public class MainFrame extends javax.swing.JFrame {

    //My JFrames
    DescriptionPage descriptionPage = new DescriptionPage();
    ExamplePage examplePage = new ExamplePage();
    ImageFrame imageFrame = new ImageFrame();

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGoImage = new javax.swing.JButton();
        btnGoDescription = new javax.swing.JButton();
        btnGoExample = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ley de ohm");

        btnGoImage.setText("Imagen");
        btnGoImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoImageActionPerformed(evt);
            }
        });

        btnGoDescription.setText("Descripción");
        btnGoDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoDescriptionActionPerformed(evt);
            }
        });

        btnGoExample.setText("Ejemplo");
        btnGoExample.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoExampleActionPerformed(evt);
            }
        });

        lblTitle.setText("Instituto Tecnologico de Minatítlan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnGoImage)
                .addGap(56, 56, 56)
                .addComponent(btnGoDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnGoExample)
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGoImage)
                    .addComponent(btnGoDescription)
                    .addComponent(btnGoExample))
                .addGap(48, 48, 48))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoImageActionPerformed
        // TODO add your handling code here:
        imageFrame.setVisible(true);
    }//GEN-LAST:event_btnGoImageActionPerformed

    private void btnGoDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoDescriptionActionPerformed
        descriptionPage.setVisible(true);
    }//GEN-LAST:event_btnGoDescriptionActionPerformed

    private void btnGoExampleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoExampleActionPerformed
        // TODO add your handling code here:
        examplePage.setVisible(true);
    }//GEN-LAST:event_btnGoExampleActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGoDescription;
    private javax.swing.JButton btnGoExample;
    private javax.swing.JButton btnGoImage;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
