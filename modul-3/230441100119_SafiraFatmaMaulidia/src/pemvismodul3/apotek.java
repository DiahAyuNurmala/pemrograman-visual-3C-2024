/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pemvismodul3;

/**
 *
 * @author Safira
 */
public class apotek extends javax.swing.JFrame {

    /**
     * Creates new form apotek
     */
    public apotek() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Paracetamol = new javax.swing.JButton();
        Ibuprofen = new javax.swing.JButton();
        Amoxicillin = new javax.swing.JButton();
        Ciprofloxacin = new javax.swing.JButton();
        Metformin = new javax.swing.JButton();
        Amlodipine = new javax.swing.JButton();
        Omeprazole = new javax.swing.JButton();
        Loratadine = new javax.swing.JButton();
        Simvastatin = new javax.swing.JButton();
        Salbutamol = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Detail = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        Reset = new javax.swing.JButton();
        Keluar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(252, 184, 218));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel2.setText("APOTEK");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Safira\\OneDrive\\Gambar\\pngwing.com.png")); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel3)
                .addGap(185, 185, 185)
                .addComponent(jLabel2)
                .addContainerGap(252, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34))))
        );

        jPanel5.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(248, 199, 223));

        jPanel4.setLayout(new java.awt.GridLayout(5, 2, 3, 0));

        Paracetamol.setIcon(new javax.swing.ImageIcon("C:\\Users\\Safira\\OneDrive\\Gambar\\pngwing.com (1).png")); // NOI18N
        Paracetamol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParacetamolActionPerformed(evt);
            }
        });
        jPanel4.add(Paracetamol);

        Ibuprofen.setIcon(new javax.swing.ImageIcon("C:\\Users\\Safira\\OneDrive\\Gambar\\ibuprofen.png")); // NOI18N
        Ibuprofen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IbuprofenActionPerformed(evt);
            }
        });
        jPanel4.add(Ibuprofen);

        Amoxicillin.setIcon(new javax.swing.ImageIcon("C:\\Users\\Safira\\OneDrive\\Gambar\\amoxicillin.png")); // NOI18N
        Amoxicillin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmoxicillinActionPerformed(evt);
            }
        });
        jPanel4.add(Amoxicillin);

        Ciprofloxacin.setIcon(new javax.swing.ImageIcon("C:\\Users\\Safira\\OneDrive\\Gambar\\Ciprofloxacin1.png")); // NOI18N
        Ciprofloxacin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CiprofloxacinActionPerformed(evt);
            }
        });
        jPanel4.add(Ciprofloxacin);

        Metformin.setIcon(new javax.swing.ImageIcon("C:\\Users\\Safira\\OneDrive\\Gambar\\Metformin.png")); // NOI18N
        Metformin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MetforminActionPerformed(evt);
            }
        });
        jPanel4.add(Metformin);

        Amlodipine.setIcon(new javax.swing.ImageIcon("C:\\Users\\Safira\\OneDrive\\Gambar\\Amlodipine1.png")); // NOI18N
        Amlodipine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmlodipineActionPerformed(evt);
            }
        });
        jPanel4.add(Amlodipine);

        Omeprazole.setIcon(new javax.swing.ImageIcon("C:\\Users\\Safira\\OneDrive\\Gambar\\Omeprazol.png")); // NOI18N
        Omeprazole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OmeprazoleActionPerformed(evt);
            }
        });
        jPanel4.add(Omeprazole);

        Loratadine.setIcon(new javax.swing.ImageIcon("C:\\Users\\Safira\\OneDrive\\Gambar\\Larotadine1.png")); // NOI18N
        Loratadine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoratadineActionPerformed(evt);
            }
        });
        jPanel4.add(Loratadine);

        Simvastatin.setIcon(new javax.swing.ImageIcon("C:\\Users\\Safira\\OneDrive\\Gambar\\Simvastatina1.png")); // NOI18N
        Simvastatin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimvastatinActionPerformed(evt);
            }
        });
        jPanel4.add(Simvastatin);

        Salbutamol.setIcon(new javax.swing.ImageIcon("C:\\Users\\Safira\\OneDrive\\Gambar\\Salbutamol.jpg")); // NOI18N
        Salbutamol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalbutamolActionPerformed(evt);
            }
        });
        jPanel4.add(Salbutamol);

        jPanel7.setBackground(new java.awt.Color(248, 199, 223));

        Detail.setColumns(20);
        Detail.setRows(5);
        jScrollPane1.setViewportView(Detail);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel1.setText("Detail obat");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(new java.awt.Color(255, 220, 237));

        jPanel8.setBackground(new java.awt.Color(255, 220, 237));
        jPanel8.setLayout(new java.awt.GridBagLayout());

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 14);
        jPanel8.add(Reset, gridBagConstraints);

        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.insets = new java.awt.Insets(0, 16, 0, 0);
        jPanel8.add(Keluar, gridBagConstraints);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setBackground(new java.awt.Color(248, 199, 223));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel3, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ParacetamolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParacetamolActionPerformed
        Detail.setText("Nama: Paracetamol\n" +
                   "Fungsi: Analgesik dan antipiretik\n" +
                   "Digunakan untuk: Mengatasi nyeri ringan hingga sedang dan demam\n" +
                   "Efek samping: Risiko kerusakan hati jika dosis berlebihan");
    }//GEN-LAST:event_ParacetamolActionPerformed

    private void IbuprofenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IbuprofenActionPerformed
        Detail.setText("Nama: Ibuprofen\n" +
                    "Fungsi: Anti-inflamasi, analgesik, dan antipiretik\n" +
                    "Digunakan untuk: Mengatasi peradangan, nyeri, dan demam\n" +
                    "Efek samping: Risiko gangguan lambung dan pendarahan gastrointestinal");
    }//GEN-LAST:event_IbuprofenActionPerformed

    private void AmoxicillinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmoxicillinActionPerformed
    Detail.setText("Nama: Amoxicillin\n" +
                    "Fungsi: Antibiotik golongan penicillin\n" +
                    "Digunakan untuk: Mengobati infeksi bakteri\n" +
                    "Efek samping: Reaksi alergi, mual, dan diare");
    }//GEN-LAST:event_AmoxicillinActionPerformed

    private void CiprofloxacinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CiprofloxacinActionPerformed
    Detail.setText("Nama: Ciprofloxacin\n" +
                    "Fungsi: Antibiotik golongan fluoroquinolone\n" +
                    "Digunakan untuk: Mengobati infeksi bakteri\n" +
                    "Efek samping: Nyeri sendi, pusing, gangguan pencernaan");
    }//GEN-LAST:event_CiprofloxacinActionPerformed

    private void MetforminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MetforminActionPerformed
    Detail.setText("Nama: Metformin\n" +
                    "Fungsi: Obat antidiabetes\n" +
                    "Digunakan untuk: Mengontrol kadar gula darah\n" +
                    "Efek samping: Masalah pencernaan, asidosis laktat");
    }//GEN-LAST:event_MetforminActionPerformed

    private void AmlodipineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmlodipineActionPerformed
    Detail.setText("Nama: Amlodipine\n" +
                    "Fungsi: Penghambat saluran kalsium\n" +
                    "Digunakan untuk: Mengatasi hipertensi dan angina\n" +
                    "Efek samping: Pusing, edema, kelelahan");
    }//GEN-LAST:event_AmlodipineActionPerformed

    private void OmeprazoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OmeprazoleActionPerformed
    Detail.setText("Nama: Omeprazole\n" +
                    "Fungsi: Penghambat pompa proton\n" +
                    "Digunakan untuk: Mengatasi GERD dan refluks asam\n" +
                    "Efek samping: Sakit kepala, sakit perut, diare");
    }//GEN-LAST:event_OmeprazoleActionPerformed

    private void LoratadineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoratadineActionPerformed
    Detail.setText("Nama: Loratadine\n" +
                    "Fungsi: Antihistamin\n" +
                    "Digunakan untuk: Mengatasi gejala alergi\n" +
                    "Efek samping: Kantuk ringan, sakit kepala, kelelahan");
    }//GEN-LAST:event_LoratadineActionPerformed

    private void SimvastatinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimvastatinActionPerformed
    Detail.setText("Nama: Simvastatin\n" +
                    "Fungsi: Statin (penurun kolesterol)\n" +
                    "Digunakan untuk: Menurunkan kadar kolesterol\n" +
                    "Efek samping: Nyeri otot, peningkatan enzim hati");
    }//GEN-LAST:event_SimvastatinActionPerformed

    private void SalbutamolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalbutamolActionPerformed
    Detail.setText("Nama: Salbutamol\n" +
                    "Fungsi: Bronkodilator\n" +
                    "Digunakan untuk: Mengatasi asma dan PPOK\n" +
                    "Efek samping: Tremor, detak jantung cepat, gelisah");
    }//GEN-LAST:event_SalbutamolActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
    Detail.setText("");
    }//GEN-LAST:event_ResetActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
    dispose();
    }//GEN-LAST:event_KeluarActionPerformed

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
            java.util.logging.Logger.getLogger(apotek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(apotek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(apotek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(apotek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new apotek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Amlodipine;
    private javax.swing.JButton Amoxicillin;
    private javax.swing.JButton Ciprofloxacin;
    private javax.swing.JTextArea Detail;
    private javax.swing.JButton Ibuprofen;
    private javax.swing.JButton Keluar;
    private javax.swing.JButton Loratadine;
    private javax.swing.JButton Metformin;
    private javax.swing.JButton Omeprazole;
    private javax.swing.JButton Paracetamol;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Salbutamol;
    private javax.swing.JButton Simvastatin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}