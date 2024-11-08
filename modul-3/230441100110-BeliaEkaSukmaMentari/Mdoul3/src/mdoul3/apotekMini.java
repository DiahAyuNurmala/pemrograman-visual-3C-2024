/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mdoul3;

import javax.swing.JOptionPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JCheckBox;

/**
 *
 * @author asus
 */
public class apotekMini extends javax.swing.JFrame {
    
    public apotekMini() {
        initComponents();
        
        tfCash.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                penghitungan();
            }
        });
          tfJumlah.setText("0");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void penghitungan() {
        try {
            double hargasetelahdiskon = Double.parseDouble(tfTotal.getText()); // Total harga yang baru
            double uangmasuk = Double.parseDouble(tfCash.getText()); // Uang yang sudah dimasukkan
            double kembalian = uangmasuk - hargasetelahdiskon;

            if (kembalian >= 0) {
                tfKembali.setText(String.valueOf(kembalian));
            } else {
                tfKembali.setText("Uang Tidak Cukup");
            }
        } catch (NumberFormatException e) {
            tfKembali.setText("");
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnObatDemam = new javax.swing.JButton();
        btnObatNyeri = new javax.swing.JButton();
        btnAntibiotik = new javax.swing.JButton();
        btnObatMabuk = new javax.swing.JButton();
        btnObatLambung = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cbParacetamol = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        cbIbuprofen = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        cbAmoxicillin = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        cbBodrex = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        cbAntimo = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        cbPromag = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        cbPanadol = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        cbMixagrip = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        cbParamex = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        cbUltraflu = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        btnKurang = new javax.swing.JButton();
        tfJumlah = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tfTotal = new javax.swing.JTextField();
        btnTotal = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        tfCash = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        tfKembali = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setLayout(new java.awt.BorderLayout(35, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\tugas\\semester3\\1000369182-removebg-preview.png")); // NOI18N
        jPanel1.add(jLabel1, java.awt.BorderLayout.LINE_START);

        jLabel2.setFont(new java.awt.Font("Lucida Handwriting", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 51, 0));
        jLabel2.setText("-- APOTEK MINI --");
        jPanel1.add(jLabel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 88));

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Ebrima", 3, 14)); // NOI18N
        jLabel3.setText("DAFTAR OBAT");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 105, 0, 105);
        jPanel3.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Ebrima", 3, 14)); // NOI18N
        jLabel4.setText("PEMESANAN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 32;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(2, 117, 2, 118);
        jPanel3.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Ebrima", 3, 14)); // NOI18N
        jLabel5.setText("REKOMENDASI OBAT");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.insets = new java.awt.Insets(0, 29, 0, 29);
        jPanel3.add(jLabel5, gridBagConstraints);

        jPanel4.setBackground(new java.awt.Color(255, 153, 153));
        jPanel4.setLayout(new java.awt.GridLayout(5, 0));

        btnObatDemam.setBackground(new java.awt.Color(255, 204, 204));
        btnObatDemam.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        btnObatDemam.setText("Obat demam dan nyeri");
        btnObatDemam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObatDemamActionPerformed(evt);
            }
        });
        jPanel4.add(btnObatDemam);

        btnObatNyeri.setBackground(new java.awt.Color(255, 204, 204));
        btnObatNyeri.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        btnObatNyeri.setText("Obat nyeri dan peradangan");
        btnObatNyeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObatNyeriActionPerformed(evt);
            }
        });
        jPanel4.add(btnObatNyeri);

        btnAntibiotik.setBackground(new java.awt.Color(255, 204, 204));
        btnAntibiotik.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        btnAntibiotik.setText("Antibiotik");
        btnAntibiotik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAntibiotikActionPerformed(evt);
            }
        });
        jPanel4.add(btnAntibiotik);

        btnObatMabuk.setBackground(new java.awt.Color(255, 204, 204));
        btnObatMabuk.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        btnObatMabuk.setText("Obat mabuk perjalanan");
        btnObatMabuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObatMabukActionPerformed(evt);
            }
        });
        jPanel4.add(btnObatMabuk);

        btnObatLambung.setBackground(new java.awt.Color(255, 204, 204));
        btnObatLambung.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        btnObatLambung.setText("Obat asam lambung");
        btnObatLambung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObatLambungActionPerformed(evt);
            }
        });
        jPanel4.add(btnObatLambung);

        jPanel5.setBackground(new java.awt.Color(255, 153, 153));
        jPanel5.setLayout(new java.awt.GridLayout(10, 2));

        jLabel6.setIcon(new javax.swing.ImageIcon("E:\\tugas\\semester3\\capsule_drug_medicine_pill_tablet_icon_140097.png")); // NOI18N
        jLabel6.setText("-Paracetamol - Rp. 5.000");
        jPanel5.add(jLabel6);

        cbParacetamol.setText("Paracetamol");
        jPanel5.add(cbParacetamol);

        jLabel8.setIcon(new javax.swing.ImageIcon("E:\\tugas\\semester3\\medicine_pill_tablet_care_icon_143450.png")); // NOI18N
        jLabel8.setText("-Ibuprofen - Rp. 10.000");
        jPanel5.add(jLabel8);

        cbIbuprofen.setText("Ibuprofen");
        jPanel5.add(cbIbuprofen);

        jLabel10.setIcon(new javax.swing.ImageIcon("E:\\tugas\\semester3\\drug_medication_meds_capsules_drugs_medicine_pill_capsule_pills_icon_210683.png")); // NOI18N
        jLabel10.setText("-Amoxicillin - Rp. 15.000");
        jPanel5.add(jLabel10);

        cbAmoxicillin.setText("Amoxicillin");
        jPanel5.add(cbAmoxicillin);

        jLabel13.setIcon(new javax.swing.ImageIcon("E:\\tugas\\semester3\\medical-05_icon-icons.com_73942.png")); // NOI18N
        jLabel13.setText("-Bodrex - Rp. 5.000");
        jPanel5.add(jLabel13);

        cbBodrex.setText("Bodrex");
        jPanel5.add(cbBodrex);

        jLabel15.setIcon(new javax.swing.ImageIcon("E:\\tugas\\semester3\\pills_pill_bottle_healthcare_pharmacy_drug_icon_210957.png")); // NOI18N
        jLabel15.setText("-Antimo - Rp. 5.000");
        jPanel5.add(jLabel15);

        cbAntimo.setText("Antimo");
        jPanel5.add(cbAntimo);

        jLabel12.setIcon(new javax.swing.ImageIcon("E:\\tugas\\semester3\\pills_pill_bottle_medicine_medical_healthcare_icon_141993.png")); // NOI18N
        jLabel12.setText("-Promag - Rp. 10.000");
        jPanel5.add(jLabel12);

        cbPromag.setText("Promag");
        jPanel5.add(cbPromag);

        jLabel9.setIcon(new javax.swing.ImageIcon("E:\\tugas\\semester3\\tablet_pill_pills_drug_icon_210970.png")); // NOI18N
        jLabel9.setText("-Panadol - Rp. 8.000");
        jPanel5.add(jLabel9);

        cbPanadol.setText("Panadol");
        jPanel5.add(cbPanadol);

        jLabel11.setIcon(new javax.swing.ImageIcon("E:\\tugas\\semester3\\drugs_pharmacy_pills_drug_medicine_pill_tablet_tablets_icon_210691.png")); // NOI18N
        jLabel11.setText("-Mixagrip - Rp. 6.000");
        jPanel5.add(jLabel11);

        cbMixagrip.setText("Mixagrip");
        jPanel5.add(cbMixagrip);

        jLabel14.setIcon(new javax.swing.ImageIcon("E:\\tugas\\semester3\\pills_tablet_medicine_medical_icon_233097.png")); // NOI18N
        jLabel14.setText("-Paramex - Rp. 6.000");
        jPanel5.add(jLabel14);

        cbParamex.setText("Paramex");
        jPanel5.add(cbParamex);

        jLabel16.setIcon(new javax.swing.ImageIcon("E:\\tugas\\semester3\\drugs_pharmacy_pills_drug_medicine_pill_tablet_tablets_icon_210681.png")); // NOI18N
        jLabel16.setText("-Ultraflu - Rp. 5.000");
        jPanel5.add(jLabel16);

        cbUltraflu.setText("Ultraflu");
        jPanel5.add(cbUltraflu);

        jPanel6.setBackground(new java.awt.Color(255, 153, 153));

        btnKurang.setText("-");
        btnKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKurangActionPerformed(evt);
            }
        });

        btnTambah.setText("+");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setText("JUMLAH");

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel17.setText("TOTAL");

        tfTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTotalActionPerformed(evt);
            }
        });

        btnTotal.setBackground(new java.awt.Color(255, 204, 255));
        btnTotal.setForeground(new java.awt.Color(153, 51, 0));
        btnTotal.setText("TOTAL");
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnKurang, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTotal)
                    .addComponent(tfJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel17))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel7))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKurang)
                    .addComponent(tfJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambah))
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 153, 153));

        jLabel18.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel18.setText("CASH");

        jLabel19.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel19.setText("KEMBALI");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 33, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCash, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(46, 46, 46))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        btnClear.setBackground(new java.awt.Color(255, 204, 255));
        btnClear.setForeground(new java.awt.Color(153, 51, 0));
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 204, 255));
        btnCancel.setForeground(new java.awt.Color(153, 51, 0));
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnClear)
                            .addComponent(btnCancel))
                        .addGap(31, 31, 31)))
                .addGap(185, 185, 185))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 88, 770, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTotalActionPerformed

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
        // Pengecekan jika tidak ada obat yang dipilih
        if (!cbParacetamol.isSelected() && !cbAmoxicillin.isSelected() && !cbAntimo.isSelected() &&
        !cbBodrex.isSelected() && !cbIbuprofen.isSelected() && !cbMixagrip.isSelected() &&
        !cbPanadol.isSelected() && !cbParamex.isSelected() && !cbPromag.isSelected() &&
        !cbUltraflu.isSelected()) {

        JOptionPane.showMessageDialog(null, "Anda harus memilih obat terlebih dahulu!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
        }
        
        // Pengecekan jika jumlah pesanan tidak valid
        String jumlahpesanan = tfJumlah.getText();
        if (jumlahpesanan.isEmpty() || Integer.parseInt(jumlahpesanan) <= 0) {
            JOptionPane.showMessageDialog(null, "Jumlah pembelian harus lebih dari 0!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // Mulai penghitungan harga total
        double harga = 0;

        // Menampilkan detail obat berdasarkan yang dipilih
        if (cbParacetamol.isSelected()) {
            harga += 5000 * Integer.parseInt(jumlahpesanan);
        }
        tfTotal.setText(String.valueOf(harga));

                    
        penghitungan();
        

        if (cbAmoxicillin.isSelected()) {
            harga += 15000 * Integer.parseInt(jumlahpesanan);
        }
        tfTotal.setText(String.valueOf(harga));

                    
        penghitungan();

        if (cbAntimo.isSelected()) {
            harga += 5000 * Integer.parseInt(jumlahpesanan);
        }
        tfTotal.setText(String.valueOf(harga));

                    
        penghitungan();

        if (cbBodrex.isSelected()) {
            harga += 5000 * Integer.parseInt(jumlahpesanan);
        }
        tfTotal.setText(String.valueOf(harga));

                    
        penghitungan();

        if (cbIbuprofen.isSelected()) {
            harga += 10000 * Integer.parseInt(jumlahpesanan);
        }
        tfTotal.setText(String.valueOf(harga));

                    
        penghitungan();

        if (cbMixagrip.isSelected()) {
            harga += 6000 * Integer.parseInt(jumlahpesanan);
        }
        tfTotal.setText(String.valueOf(harga));

                    
        penghitungan();

        if (cbPanadol.isSelected()) {
            harga += 8000 * Integer.parseInt(jumlahpesanan);
        }
        tfTotal.setText(String.valueOf(harga));

                    
        penghitungan();

        if (cbParamex.isSelected()) {
            harga += 6000 * Integer.parseInt(jumlahpesanan);
        }

        if (cbUltraflu.isSelected()) {
            harga += 5000 * Integer.parseInt(jumlahpesanan);
        }
        tfTotal.setText(String.valueOf(harga));

                    
        penghitungan();

        if (cbPromag.isSelected()) {
            harga += 10000 * Integer.parseInt(jumlahpesanan);
        }
        tfTotal.setText(String.valueOf(harga));

                    
        penghitungan();
    }//GEN-LAST:event_btnTotalActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        int jumlah = Integer.parseInt(tfJumlah.getText());
        jumlah += 1;
        tfJumlah.setText(String.valueOf(jumlah));
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKurangActionPerformed
        if(Integer.parseInt(tfJumlah.getText())>0)
        {
        int jumlah = Integer.parseInt(tfJumlah.getText());
            jumlah -= 1;
            tfJumlah.setText(String.valueOf(jumlah));
        }else{
            tfJumlah.setText("0");
        }
    }//GEN-LAST:event_btnKurangActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        cbParacetamol.setSelected(false);
        cbAmoxicillin.setSelected(false);
        cbAntimo.setSelected(false);
        cbBodrex.setSelected(false);
        cbIbuprofen.setSelected(false);
        cbMixagrip.setSelected(false);
        cbPanadol.setSelected(false);
        cbParamex.setSelected(false);
        cbPromag.setSelected(false);
        cbUltraflu.setSelected(false);

        tfJumlah.setText("0");
        tfTotal.setText("0");
        tfCash.setText("");
        tfKembali.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnObatDemamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObatDemamActionPerformed
    String detailObat = "Paracetamol: \nHarga: 5.000\nDeskripsi: Menurunkan demam dan meredakan nyeri ringan hingga sedang\nDosis: 500-1000 mg setiap 4-6 jam, max 4000 mg/hari\n\n"
               + "Bodrex: \nHarga: 5.000\nDeskripsi: Meredakan sakit kepala dan demam\nDosis:1-2 tablet setiap 4-6 jam, max 8 tablet/hari.\n\n"
               + "Panadol: \nHarga: 8.000\nDeskripsi: Mengurangi demam dan nyeri ringan\nDosis:500-1000 mg setiap 4-6 jam, max 4000 mg/hari.\n\n"
               + "Paramex: \nHarga: 6.000\nDeskripsi: Meredakan sakit kepala, flu, dan demam\nDosis:1-2 tablet setiap 4-6 jam, max 8 tablet/hari.\n\n"
               + "Ultraflu: \nHarga: 5.000\nDeskripsi: Mengatasi gejala flu, demam, dan sakit kepala\nDosis:1-2 tablet setiap 4-6 jam, max 8 tablet/hari.\n\n"
               + "Mixagrip: \nHarga: 6.000\nDeskripsi: Mengurangi demam, pilek, dan sakit kepala\nDosis:1-2 tablet setiap 4-6 jam, max 8 tablet/hari.";
    
    JOptionPane.showMessageDialog(null, detailObat, "Detail Obat:", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnObatDemamActionPerformed

    private void btnObatNyeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObatNyeriActionPerformed
    String detailObat = "Ibuprofen: \nHarga: 10.000\nDeskripsi: Obat antiinflamasi untuk mengatasi nyeri dan peradangan\nDosis: 200 mg hingga 400 mg setiap 4-6 jam sesuai kebutuhan. Dosis maksimal per hari adalah 1200 mg (tanpa resep dokter).\n\n";
    
    JOptionPane.showMessageDialog(null, detailObat, "Detail Obat:", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnObatNyeriActionPerformed

    private void btnAntibiotikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAntibiotikActionPerformed
    String detailObat = "Amoxicillin: \nHarga: 15.000\nDeskripsi: Mengobati infeksi bakteri\nDosis: 500 mg setiap 8 jam atau 875 mg setiap 12 jam.\n\n";
    
    JOptionPane.showMessageDialog(null, detailObat, "Detail Obat:", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAntibiotikActionPerformed

    private void btnObatMabukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObatMabukActionPerformed
    String detailObat = "Antimo: \nHarga: 5.000\nDeskripsi: Mencegah mabuk perjalanan dan mual\nDosis: 1 tablet (50 mg) sebelum bepergian.\n\n";
    
    JOptionPane.showMessageDialog(null, detailObat, "Detail Obat:", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnObatMabukActionPerformed

    private void btnObatLambungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObatLambungActionPerformed
    String detailObat = "Promag: \nHarga: 10.000\nDeskripsi: Obat maag yang digunakan untuk mengurangi gejala asam lambung seperti perut kembung dan nyeri ulu hati\nDosis: 1-2 tablet kunyah setiap 4 jam sesuai kebutuhan\n\n";
    
    JOptionPane.showMessageDialog(null, detailObat, "Detail Obat:", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnObatLambungActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        int keluar = JOptionPane.showConfirmDialog(null, "Anda Yakin Ingin Keluar Program?", 
                                                   "Keluar", JOptionPane.YES_NO_OPTION, 
                                                   JOptionPane.QUESTION_MESSAGE);
        if (keluar == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(apotekMini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(apotekMini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(apotekMini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(apotekMini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new apotekMini().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAntibiotik;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnKurang;
    private javax.swing.JButton btnObatDemam;
    private javax.swing.JButton btnObatLambung;
    private javax.swing.JButton btnObatMabuk;
    private javax.swing.JButton btnObatNyeri;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTotal;
    private javax.swing.JCheckBox cbAmoxicillin;
    private javax.swing.JCheckBox cbAntimo;
    private javax.swing.JCheckBox cbBodrex;
    private javax.swing.JCheckBox cbIbuprofen;
    private javax.swing.JCheckBox cbMixagrip;
    private javax.swing.JCheckBox cbPanadol;
    private javax.swing.JCheckBox cbParacetamol;
    private javax.swing.JCheckBox cbParamex;
    private javax.swing.JCheckBox cbPromag;
    private javax.swing.JCheckBox cbUltraflu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField tfCash;
    private javax.swing.JTextField tfJumlah;
    private javax.swing.JTextField tfKembali;
    private javax.swing.JTextField tfTotal;
    // End of variables declaration//GEN-END:variables
}
