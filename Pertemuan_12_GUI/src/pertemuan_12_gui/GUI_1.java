package pertemuan_12_gui;
import javax.swing.JOptionPane;

public class GUI_1 extends javax.swing.JFrame {
    
    double a,b,c,d;
    double hasil;

    public GUI_1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JUDUL = new javax.swing.JLabel();
        FORM_1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FORM_2 = new javax.swing.JTextField();
        button_jumlah = new javax.swing.JButton();
        button_kurang = new javax.swing.JButton();
        button_kali = new javax.swing.JButton();
        button_bagi = new javax.swing.JButton();
        button_hapus = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        FORM_3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JUDUL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JUDUL.setText("KALKULATOR");

        FORM_1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        FORM_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FORM_1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("BILANGAN 1");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("BILANGAN 2");

        FORM_2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        FORM_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FORM_2ActionPerformed(evt);
            }
        });

        button_jumlah.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        button_jumlah.setText("+");
        button_jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_jumlahActionPerformed(evt);
            }
        });

        button_kurang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        button_kurang.setText("-");
        button_kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_kurangActionPerformed(evt);
            }
        });

        button_kali.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        button_kali.setText("*");
        button_kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_kaliActionPerformed(evt);
            }
        });

        button_bagi.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        button_bagi.setText("/");
        button_bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_bagiActionPerformed(evt);
            }
        });

        button_hapus.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        button_hapus.setText("AC");
        button_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_hapusActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("HASIL");

        FORM_3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(JUDUL))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(button_kurang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(button_jumlah))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(button_bagi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(button_kali)))
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addComponent(button_hapus))
                            .addComponent(FORM_1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FORM_3, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FORM_2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JUDUL, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(FORM_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FORM_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_jumlah)
                    .addComponent(button_kali)
                    .addComponent(button_hapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_kurang)
                    .addComponent(button_bagi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FORM_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FORM_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FORM_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FORM_1ActionPerformed

    private void FORM_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FORM_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FORM_2ActionPerformed

    private void button_jumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_jumlahActionPerformed
        a=Double.parseDouble(FORM_1.getText());
        b=Double.parseDouble(FORM_2.getText());
        
        hasil = a+b;
        FORM_3.setText(Double.toString(hasil));
    }//GEN-LAST:event_button_jumlahActionPerformed

    private void button_kurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_kurangActionPerformed
        c=Double.parseDouble(FORM_1.getText());
        d=Double.parseDouble(FORM_2.getText());
        
        hasil=c-d;
        FORM_3.setText(Double.toString(hasil));
    }//GEN-LAST:event_button_kurangActionPerformed

    private void button_kaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_kaliActionPerformed
        a=Double.parseDouble(FORM_1.getText());
        b=Double.parseDouble(FORM_2.getText());
        
        hasil = a*b;
        FORM_3.setText(Double.toString(hasil));
    }//GEN-LAST:event_button_kaliActionPerformed

    private void button_bagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_bagiActionPerformed
       c=Double.parseDouble(FORM_1.getText());
        d=Double.parseDouble(FORM_2.getText());
        
        hasil=c/d;
        FORM_3.setText(Double.toString(hasil));
    }//GEN-LAST:event_button_bagiActionPerformed

    private void button_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_hapusActionPerformed
        FORM_1.setText("");
        FORM_2.setText("0");
        FORM_3.setText("00");
    }//GEN-LAST:event_button_hapusActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FORM_1;
    private javax.swing.JTextField FORM_2;
    private javax.swing.JTextField FORM_3;
    private javax.swing.JLabel JUDUL;
    private javax.swing.JButton button_bagi;
    private javax.swing.JButton button_hapus;
    private javax.swing.JButton button_jumlah;
    private javax.swing.JButton button_kali;
    private javax.swing.JButton button_kurang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}