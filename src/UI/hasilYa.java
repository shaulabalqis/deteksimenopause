/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author ShaulaBalqis
 */
public class hasilYa extends javax.swing.JFrame {

    /**
     * Creates new form hasilYa
     */
    public hasilYa() {
        initComponents();
        solusi.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        solusiLabel = new javax.swing.JLabel();
        solusiDokter = new javax.swing.JRadioButton();
        solusiSendiri = new javax.swing.JRadioButton();
        OK = new javax.swing.JButton();
        hasil = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        solusi = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hasil");

        solusiLabel.setText("Apakah pasien ingin :");

        solusiDokter.setText("Konsultasi ke dokter");
        solusiDokter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                solusiDokterMouseClicked(evt);
            }
        });

        solusiSendiri.setText("Melakukan perawatan sendiri");
        solusiSendiri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                solusiSendiriMouseClicked(evt);
            }
        });

        OK.setText("OK");
        OK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OKMouseClicked(evt);
            }
        });

        hasil.setText("jLabel1");

        solusi.setEditable(false);
        jScrollPane1.setViewportView(solusi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(OK)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(solusiLabel)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(solusiDokter)
                                    .addGap(18, 18, 18)
                                    .addComponent(solusiSendiri))
                                .addComponent(hasil)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hasil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(solusiLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(solusiDokter)
                    .addComponent(solusiSendiri))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OK)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKMouseClicked
        deteksimenopause.DeteksiMenopause.prim.setEnabled(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_OKMouseClicked

    private void solusiDokterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_solusiDokterMouseClicked
        solusiSendiri.setSelected(false);
        if (solusiDokter.isSelected()==true){
            solusi.setText(deteksimenopause.DeteksiMenopause.goal[3]);
            solusi.setVisible(true);
        }
        else{
            solusi.setVisible(false);
        }// TODO add your handling code here:
    }//GEN-LAST:event_solusiDokterMouseClicked

    private void solusiSendiriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_solusiSendiriMouseClicked
        solusiDokter.setSelected(false);
        if (solusiSendiri.isSelected()==true){
            solusi.setText(deteksimenopause.DeteksiMenopause.goal[4]);
            solusi.setVisible(true);
        }
        else{
            solusi.setVisible(false);
        }// TODO add your handling code here:
    }//GEN-LAST:event_solusiSendiriMouseClicked

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
            java.util.logging.Logger.getLogger(hasilYa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hasilYa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hasilYa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hasilYa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                solusi.setVisible(false);
                new hasilYa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OK;
    public static javax.swing.JLabel hasil;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTextPane solusi;
    private javax.swing.JRadioButton solusiDokter;
    private javax.swing.JLabel solusiLabel;
    private javax.swing.JRadioButton solusiSendiri;
    // End of variables declaration//GEN-END:variables
}