/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pemvismodul3;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class sppNew extends javax.swing.JFrame {

    /**
     * Creates new form sppNew
     */
    public sppNew() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tfNama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        blnJan = new javax.swing.JCheckBox();
        blnMei = new javax.swing.JCheckBox();
        blnSep = new javax.swing.JCheckBox();
        blnFeb = new javax.swing.JCheckBox();
        blnJun = new javax.swing.JCheckBox();
        blnOkt = new javax.swing.JCheckBox();
        blnMar = new javax.swing.JCheckBox();
        blnJul = new javax.swing.JCheckBox();
        blnNov = new javax.swing.JCheckBox();
        blnApr = new javax.swing.JCheckBox();
        blnAgu = new javax.swing.JCheckBox();
        blnDes = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pembayaran SPP");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jLabel2.setFont(new java.awt.Font("Square721 Cn BT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("AHMAD DANI - 23-177");
        jPanel1.add(jLabel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jLabel3.setFont(new java.awt.Font("Square721 Cn BT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama :");

        tfNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNamaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Square721 Cn BT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Bulan");

        jPanel4.setBackground(new java.awt.Color(51, 51, 255));
        jPanel4.setLayout(new java.awt.GridLayout(4, 3, 10, 5));

        blnJan.setFont(new java.awt.Font("Square721 Cn BT", 0, 18)); // NOI18N
        blnJan.setForeground(new java.awt.Color(0, 0, 0));
        blnJan.setText("Januari");
        jPanel4.add(blnJan);

        blnMei.setFont(new java.awt.Font("Square721 Cn BT", 0, 18)); // NOI18N
        blnMei.setForeground(new java.awt.Color(0, 0, 0));
        blnMei.setText("Mei");
        blnMei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blnMeiActionPerformed(evt);
            }
        });
        jPanel4.add(blnMei);

        blnSep.setFont(new java.awt.Font("Square721 Cn BT", 0, 18)); // NOI18N
        blnSep.setForeground(new java.awt.Color(0, 0, 0));
        blnSep.setText("September");
        jPanel4.add(blnSep);

        blnFeb.setFont(new java.awt.Font("Square721 Cn BT", 0, 18)); // NOI18N
        blnFeb.setForeground(new java.awt.Color(0, 0, 0));
        blnFeb.setText("Februari");
        jPanel4.add(blnFeb);

        blnJun.setFont(new java.awt.Font("Square721 Cn BT", 0, 18)); // NOI18N
        blnJun.setForeground(new java.awt.Color(0, 0, 0));
        blnJun.setText("Juni");
        jPanel4.add(blnJun);

        blnOkt.setFont(new java.awt.Font("Square721 Cn BT", 0, 18)); // NOI18N
        blnOkt.setForeground(new java.awt.Color(0, 0, 0));
        blnOkt.setText("Oktober");
        jPanel4.add(blnOkt);

        blnMar.setFont(new java.awt.Font("Square721 Cn BT", 0, 18)); // NOI18N
        blnMar.setForeground(new java.awt.Color(0, 0, 0));
        blnMar.setText("Maret");
        blnMar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blnMarActionPerformed(evt);
            }
        });
        jPanel4.add(blnMar);

        blnJul.setFont(new java.awt.Font("Square721 Cn BT", 0, 18)); // NOI18N
        blnJul.setForeground(new java.awt.Color(0, 0, 0));
        blnJul.setText("Juli");
        jPanel4.add(blnJul);

        blnNov.setFont(new java.awt.Font("Square721 Cn BT", 0, 18)); // NOI18N
        blnNov.setForeground(new java.awt.Color(0, 0, 0));
        blnNov.setText("November");
        jPanel4.add(blnNov);

        blnApr.setFont(new java.awt.Font("Square721 Cn BT", 0, 18)); // NOI18N
        blnApr.setForeground(new java.awt.Color(0, 0, 0));
        blnApr.setText("April");
        jPanel4.add(blnApr);

        blnAgu.setFont(new java.awt.Font("Square721 Cn BT", 0, 18)); // NOI18N
        blnAgu.setForeground(new java.awt.Color(0, 0, 0));
        blnAgu.setText("Agustus");
        blnAgu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blnAguActionPerformed(evt);
            }
        });
        jPanel4.add(blnAgu);

        blnDes.setFont(new java.awt.Font("Square721 Cn BT", 0, 18)); // NOI18N
        blnDes.setForeground(new java.awt.Color(0, 0, 0));
        blnDes.setText("Desember");
        jPanel4.add(blnDes);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Bulan", "Status", "Waktu Pembayaran"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setFont(new java.awt.Font("Square721 Cn BT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Riwayat Pembayaran");

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Square721 Cn BT", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Bayar SPP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Square721 Cn BT", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNamaActionPerformed

    private void blnMarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blnMarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blnMarActionPerformed

    private void blnAguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blnAguActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blnAguActionPerformed

    private void blnMeiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blnMeiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blnMeiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int spp = 500000;
        String nama = tfNama.getText();
        JCheckBox[] cbBulan = {blnJan, blnFeb, blnMar, blnApr, blnMei, blnJun, blnJul, blnAgu, blnSep, blnOkt, blnNov, blnDes};
        
        if(nama.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama harus diisi", "Input Nama", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        boolean isChecked = false;

        for (JCheckBox checkbox : cbBulan) {
            if (checkbox.isSelected()) {
                isChecked = true;
                break;
            }
        }
        
        if (!isChecked) {
            JOptionPane.showMessageDialog(this, "Silahkan pilih bulan yang ingin dibayar", "Pilih Bulan", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        int jumlahSpp = 0;
        int jumlahBulan = 0;
        for (int i = 0; i < cbBulan.length; i++) {
            if (cbBulan[i].isSelected()) {
                jumlahSpp += spp; 
                jumlahBulan++;
            }
        }
        
        int response = JOptionPane.showConfirmDialog(this, 
                        "Spp " + spp + " x " + jumlahBulan + " Bulan\n" + "Total : " + jumlahSpp,
                        "Konfirmasi Pembayaran SPP", 
                        JOptionPane.YES_NO_OPTION,  
                        JOptionPane.QUESTION_MESSAGE
                       );
        if(response == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(this, "Pembayaran SPP Berhasil", "Pembayaran SPP", JOptionPane.INFORMATION_MESSAGE);
     
            ZonedDateTime jamWib = ZonedDateTime.now(ZoneId.of("Asia/Jakarta"));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm, dd mm yyyy");
            
            for (int i = 0; i < cbBulan.length; i++) {
                if (cbBulan[i].isSelected()) {
                    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                    model.addRow(new Object[] {nama, cbBulan[i].getText(), "Lunas", jamWib.format(formatter)});
                    
                    cbBulan[i].setSelected(false);
                    cbBulan[i].setEnabled(false);
                }
            }
        }else if(response == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(this, "Pembayaran SPP Gagal", "Pembayaran SPP", JOptionPane.WARNING_MESSAGE);
        }

        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JCheckBox[] cbBulan = {blnJan, blnFeb, blnMar, blnApr, blnMei, blnJun, blnJul, blnAgu, blnSep, blnOkt, blnNov, blnDes};
        
        for (int i = 0; i < cbBulan.length; i++) {
                cbBulan[i].setSelected(false);
                cbBulan[i].setEnabled(true);
        }
        
        tfNama.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(sppNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sppNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sppNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sppNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sppNew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox blnAgu;
    private javax.swing.JCheckBox blnApr;
    private javax.swing.JCheckBox blnDes;
    private javax.swing.JCheckBox blnFeb;
    private javax.swing.JCheckBox blnJan;
    private javax.swing.JCheckBox blnJul;
    private javax.swing.JCheckBox blnJun;
    private javax.swing.JCheckBox blnMar;
    private javax.swing.JCheckBox blnMei;
    private javax.swing.JCheckBox blnNov;
    private javax.swing.JCheckBox blnOkt;
    private javax.swing.JCheckBox blnSep;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tfNama;
    // End of variables declaration//GEN-END:variables
}
