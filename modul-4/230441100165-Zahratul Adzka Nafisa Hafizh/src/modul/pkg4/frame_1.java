/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package modul.pkg4;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author SMK_BIM
 */
public class frame_1 extends javax.swing.JFrame {
        int kesempatan = 10;
        int maxrandom = 10;
        String[][] data_score = new String[10][2];
        int index = 0;
        StringBuilder score_border = new StringBuilder();
        Random angka1 = new Random();
        int tebakan = angka1.nextInt(maxrandom+1); 
//        index 0-99 biar jadi 100 + 1
    /**
     * Creates new form frame_1
     */
    public frame_1() {
        initComponents();
        btnreset.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txttebakan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtjawaban = new javax.swing.JTextField();
        txtscore = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btntebak = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areascore = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("TEBAK ANGKA");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(141, 0, 248, 48);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("ANGKA TEBAKAN");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(43, 89, 99, 16);

        txttebakan.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.add(txttebakan);
        txttebakan.setBounds(170, 86, 219, 22);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("JAWABAN TEBAKAN");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(43, 138, 115, 16);

        txtjawaban.setEditable(false);
        txtjawaban.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.add(txtjawaban);
        txtjawaban.setBounds(170, 138, 219, 22);

        txtscore.setBackground(new java.awt.Color(204, 255, 255));
        txtscore.setText("0");
        jPanel1.add(txtscore);
        txtscore.setBounds(170, 184, 219, 22);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("SCORE TEBAKAN");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(43, 187, 94, 16);

        btntebak.setBackground(new java.awt.Color(204, 255, 255));
        btntebak.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btntebak.setText("TEBAK(10)");
        btntebak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntebakActionPerformed(evt);
            }
        });
        jPanel1.add(btntebak);
        btntebak.setBounds(170, 244, 89, 22);

        btnreset.setBackground(new java.awt.Color(204, 255, 255));
        btnreset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnreset.setText("RESET");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        jPanel1.add(btnreset);
        btnreset.setBounds(285, 244, 72, 22);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("1 SAMPAI 100");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(207, 54, 94, 20);

        jTabbedPane1.addTab("permainan", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        areascore.setBackground(new java.awt.Color(204, 255, 255));
        areascore.setColumns(20);
        areascore.setRows(5);
        jScrollPane1.setViewportView(areascore);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setText("SCORE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("score", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btntebakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntebakActionPerformed
        // TODO add your handling code here:
      try{
            int angka2 = Integer.parseInt(txttebakan.getText());
            if (tebakan > angka2)   
            {
                kesempatan -=1;
                btntebak.setText("Tebak ("+kesempatan+")");
                txtjawaban.setText("Angka Tebakan Lebih Besar dari"+angka2);
                if (kesempatan == 0){
                    
                    btnreset.setEnabled(true);
                    txttebakan.setEnabled(false);
                    btntebak.setText("Tebak ("+kesempatan+")");
                    JOptionPane.showMessageDialog(this, "KESEMPATAN ANDA HABIS"); 
                    txttebakan.setText("");
                    txtjawaban.setText("");
                    txtscore.setText("0");
                    
                }
            }else if (tebakan < angka2)
            {
                kesempatan -=1;
                btntebak.setText("Tebak ("+kesempatan+")");
                txtjawaban.setText("Angka Tebakan Lebih Kecil dari"+angka2);
                if (kesempatan == 0){
                   
                    btnreset.setEnabled(true);
                    txttebakan.setEnabled(false);
                    btntebak.setText("Tebak ("+kesempatan+")");
                    JOptionPane.showMessageDialog(this, "KESEMPATAN ANDA HABIS");
                    txttebakan.setText("");
                    txtjawaban.setText("");
                    txtscore.setText("0");
                    
                }   
            }else if (tebakan == angka2)
            {
                txtjawaban.setText(String.valueOf(tebakan));
                int hasil = kesempatan * 10;
                areascore.setText("");
                txtscore.setText(String.valueOf(hasil));
                JOptionPane.showMessageDialog(this, "SELAMAT TEBAKAN ANDA BENAR");
                String nama = JOptionPane.showInputDialog(this, "SILAKAN MASUKAN NAMA");
                    if (index < data_score.length){
                            data_score[index][0]= nama;
                            data_score[index][1]= String.valueOf(hasil);
                            index++; //Increment index setelah data ditambahkan
                    }
                   
                    txttebakan.setText("");
                    txtjawaban.setText("");
                    txtscore.setText("0");
                    btntebak.setText("Tebak(10)");
                    kesempatan = 10;
                    score_border.setLength(0);
                    
                    for (int i = 0; i < index; i++){
                            score_border.append("Name: ").append(data_score[i][0]).append(", Score: ").append(data_score[i][1]).append("\n");
                    }   
                    areascore.setText(score_border.toString());
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "TEBAKAN HARUS BERUPA ANGKA");
        }
    
    }//GEN-LAST:event_btntebakActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        
        btntebak.setText("Tebak(10)");
        kesempatan = 10;
        tebakan = angka1.nextInt(maxrandom + 1);
        txttebakan.setEnabled(true);
        btntebak.setEnabled(true);
        btnreset.setEnabled(false);
        
         txttebakan.setText("");
         txtjawaban.setText("");
         txtscore.setText("");
         areascore.setText("");
    }//GEN-LAST:event_btnresetActionPerformed

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
            java.util.logging.Logger.getLogger(frame_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame_1().setVisible(true);
            }
        });

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areascore;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btntebak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtjawaban;
    private javax.swing.JTextField txtscore;
    public javax.swing.JTextField txttebakan;
    // End of variables declaration//GEN-END:variables
}