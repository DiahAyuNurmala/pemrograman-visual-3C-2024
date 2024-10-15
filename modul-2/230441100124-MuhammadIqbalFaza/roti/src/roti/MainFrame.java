/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package roti;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author faza
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    int jumlahPesanan = 0;
    public MainFrame() {
        initComponents();
        
    }
    
    public void resetInput() {
        GroupMenu.clearSelection();           
        checkKacangAlmond.setSelected(false);  
        checkKejuCheddar.setSelected(false);
        checkKrimVanilla.setSelected(false);
        checkTanpaTopping.setSelected(false);
        txtJumlahPesanan.setText("");          
        txtTotal.setText("");                  
        txtCash.setText("");                  
        txtKembalian.setText(""); 
        jumlahPesanan = 0; 
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GroupMenu = new javax.swing.ButtonGroup();
        GroupTopping = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        roundedPanel1 = new Custom.RoundedPanel();
        lblMenu = new javax.swing.JLabel();
        menu1 = new javax.swing.JRadioButton();
        menu2 = new javax.swing.JRadioButton();
        menu3 = new javax.swing.JRadioButton();
        menu4 = new javax.swing.JRadioButton();
        menu5 = new javax.swing.JRadioButton();
        menu6 = new javax.swing.JRadioButton();
        lblTopping = new javax.swing.JLabel();
        jmlPesanan = new javax.swing.JLabel();
        txtJumlahPesanan = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnKurang = new javax.swing.JButton();
        lblPembayaran = new javax.swing.JLabel();
        lblCash = new javax.swing.JLabel();
        txtCash = new javax.swing.JTextField();
        lblKembalian = new javax.swing.JLabel();
        txtKembalian = new javax.swing.JTextField();
        btnTotal = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        checkKacangAlmond = new javax.swing.JCheckBox();
        checkKejuCheddar = new javax.swing.JCheckBox();
        checkKrimVanilla = new javax.swing.JCheckBox();
        checkTanpaTopping = new javax.swing.JCheckBox();
        img1 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        namaToko = new javax.swing.JLabel();
        tagline = new javax.swing.JLabel();
        alamatToko = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(250, 112, 112));

        roundedPanel1.setForeground(new java.awt.Color(254, 253, 237));
        roundedPanel1.setRoundBottomLeft(25);
        roundedPanel1.setRoundBottomRight(25);
        roundedPanel1.setRoundTopLeft(90);
        roundedPanel1.setRoundTopRight(90);

        lblMenu.setText("Menu");

        GroupMenu.add(menu1);
        menu1.setText("Croissant - Rp 15,000");

        GroupMenu.add(menu2);
        menu2.setText("Baguette - Rp 20,000");

        GroupMenu.add(menu3);
        menu3.setText("Cinnamon Roll - Rp 22,000");

        GroupMenu.add(menu4);
        menu4.setText("Donat Gula - Rp 10,000");

        GroupMenu.add(menu5);
        menu5.setText("Tart Buah - Rp 35,000");

        GroupMenu.add(menu6);
        menu6.setText("Pain au Chocolat - Rp 18,000");
        menu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu6ActionPerformed(evt);
            }
        });

        lblTopping.setText("Topping");

        jmlPesanan.setText("Jumlah Pesanan");

        txtJumlahPesanan.setEditable(false);
        txtJumlahPesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahPesananActionPerformed(evt);
            }
        });

        btnTambah.setText("+");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnKurang.setText("_");
        btnKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKurangActionPerformed(evt);
            }
        });

        lblPembayaran.setText("Pembayaran");

        lblCash.setText("Cash");

        txtCash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtCashMouseReleased(evt);
            }
        });
        txtCash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCashKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCashKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCashKeyTyped(evt);
            }
        });

        lblKembalian.setText("Kembalian");

        txtKembalian.setEditable(false);

        btnTotal.setText("Total");
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(250, 112, 112));

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(btnReset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnKeluar)
                .addGap(155, 155, 155))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btnKeluar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtTotal.setEditable(false);

        checkKacangAlmond.setText("Kacang Almond - Rp 8,000");

        checkKejuCheddar.setText("Keju Cheddar Parut - Rp 5,000");

        checkKrimVanilla.setText("Krim Vanilla - Rp 6,000");
        checkKrimVanilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkKrimVanillaActionPerformed(evt);
            }
        });

        checkTanpaTopping.setText("Tanpa Topping - Rp.0");

        javax.swing.GroupLayout roundedPanel1Layout = new javax.swing.GroupLayout(roundedPanel1);
        roundedPanel1.setLayout(roundedPanel1Layout);
        roundedPanel1Layout.setHorizontalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(lblMenu))
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(lblTopping))
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roundedPanel1Layout.createSequentialGroup()
                                .addComponent(lblCash)
                                .addGap(18, 18, 18)
                                .addComponent(txtCash, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(roundedPanel1Layout.createSequentialGroup()
                                .addComponent(btnKurang)
                                .addGap(18, 18, 18)
                                .addComponent(txtJumlahPesanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTambah)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel1Layout.createSequentialGroup()
                                        .addComponent(menu4)
                                        .addGap(87, 87, 87)
                                        .addComponent(menu5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(menu3)
                                            .addComponent(menu6)))
                                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                                        .addComponent(menu1)
                                        .addGap(97, 97, 97)
                                        .addComponent(menu2)
                                        .addGap(28, 28, 28)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                                        .addGap(251, 251, 251)
                                        .addComponent(jmlPesanan))
                                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                                        .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(roundedPanel1Layout.createSequentialGroup()
                                                .addGap(257, 257, 257)
                                                .addComponent(lblPembayaran))
                                            .addComponent(btnTotal, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(19, 19, 19)
                                        .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(roundedPanel1Layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(lblKembalian)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(roundedPanel1Layout.createSequentialGroup()
                                                .addGap(83, 83, 83)
                                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(roundedPanel1Layout.createSequentialGroup()
                                .addComponent(checkKacangAlmond)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(checkKejuCheddar)
                                .addGap(40, 40, 40)
                                .addComponent(checkKrimVanilla)
                                .addGap(8, 8, 8))))
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(checkTanpaTopping)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundedPanel1Layout.setVerticalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenu)
                .addGap(18, 18, 18)
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menu1)
                    .addComponent(menu2)
                    .addComponent(menu3))
                .addGap(18, 18, 18)
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menu4)
                    .addComponent(menu5)
                    .addComponent(menu6))
                .addGap(18, 18, 18)
                .addComponent(lblTopping)
                .addGap(16, 16, 16)
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkKacangAlmond)
                    .addComponent(checkKejuCheddar)
                    .addComponent(checkKrimVanilla))
                .addGap(18, 18, 18)
                .addComponent(checkTanpaTopping)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jmlPesanan)
                .addGap(28, 28, 28)
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKurang)
                    .addComponent(txtJumlahPesanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambah)
                    .addComponent(btnTotal)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(lblPembayaran)
                .addGap(14, 14, 14)
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCash)
                        .addComponent(txtCash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblKembalian)
                        .addComponent(txtKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        img1.setIcon(new javax.swing.ImageIcon("C:\\Users\\faza\\Downloads\\Teks paragraf Anda (150 x 100 piksel) (4).png")); // NOI18N

        img2.setIcon(new javax.swing.ImageIcon("C:\\Users\\faza\\Downloads\\Teks paragraf Anda (150 x 100 piksel) (4).png")); // NOI18N

        namaToko.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        namaToko.setForeground(new java.awt.Color(198, 235, 197));
        namaToko.setText("Nama Toko");

        tagline.setForeground(new java.awt.Color(198, 235, 197));
        tagline.setText("Tagline");

        alamatToko.setForeground(new java.awt.Color(198, 235, 197));
        alamatToko.setText("Alamat Toko");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(namaToko))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(alamatToko)
                                .addGap(62, 62, 62)))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tagline)
                        .addGap(128, 128, 128)))
                .addComponent(img2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(roundedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(img1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(namaToko)
                        .addGap(9, 9, 9)
                        .addComponent(tagline)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(alamatToko))
                    .addComponent(img2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(roundedPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -11, 630, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        jumlahPesanan++;  // Tambah pesanan
        txtJumlahPesanan.setText(String.valueOf(jumlahPesanan));
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKurangActionPerformed
        // TODO add your handling code here:
        if (jumlahPesanan > 0) {  // Pastikan jumlah pesanan tidak kurang dari 1
            jumlahPesanan--;  // Kurangi pesanan
        }else{
            JOptionPane.showMessageDialog(null, "Jumlah Tidak boleh kurang dari 0","Peringatan",JOptionPane.ERROR_MESSAGE);
        }
        txtJumlahPesanan.setText(String.valueOf(jumlahPesanan));
    }//GEN-LAST:event_btnKurangActionPerformed

    private void txtJumlahPesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahPesananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahPesananActionPerformed

    private void menu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu6ActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        int konfirmasi = JOptionPane.showConfirmDialog(null,"Apakah anda yakin ingin reset?","Reset",JOptionPane.YES_NO_CANCEL_OPTION );
        if(konfirmasi== JOptionPane.YES_OPTION){
           resetInput();
        }
        
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        int konfirmasi = JOptionPane.showConfirmDialog(null, "Apakah anda yakin keluar","Keluar",JOptionPane.YES_NO_CANCEL_OPTION);
        if(konfirmasi == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
        // TODO add your handling code here:
        // Cek apakah menu sudah dipilih
        if (GroupMenu.getSelection() == null) {
            JOptionPane.showMessageDialog(null, "Pilih menu dulu coy!");
            resetInput();
            return;
        }

        // Cek apakah ada topping selain "Tanpa Topping" yang dipilih
        boolean isAnyToppingSelected = checkKacangAlmond.isSelected() || checkKejuCheddar.isSelected() || checkKrimVanilla.isSelected();

        // Kondisi untuk memastikan "Tanpa Topping" tidak dapat dipilih bersamaan dengan topping lain
        if (checkTanpaTopping.isSelected() && isAnyToppingSelected) {
            checkTanpaTopping.setSelected(false);
            JOptionPane.showMessageDialog(null, "Anda tidak dapat memilih 'Tanpa Topping' bersama dengan topping lain.", "Error", JOptionPane.ERROR_MESSAGE);
            resetInput();
            return;
        }

        // Kondisi untuk memastikan setidaknya satu topping dipilih
        if (!isAnyToppingSelected && !checkTanpaTopping.isSelected()) {
            JOptionPane.showMessageDialog(null, "Silakan pilih minimal satu topping.", "Error", JOptionPane.ERROR_MESSAGE);
            resetInput();
            return;
        }

        // Cek apakah jumlah pesanan telah diisi dan valid
        if (txtJumlahPesanan.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Isikan jumlah pesanan dulu coy!");
            resetInput();
            return;
        } else if (jumlahPesanan == 0) {
            JOptionPane.showMessageDialog(null, "Jangan diisi 0 coy!");
            resetInput();
            return;
        }

        // Mengambil harga menu dan topping yang dipilih
        int hargaMenu = 0;
        int hargaTopping = 0;

        // Pilih harga menu
        if (menu1.isSelected()) {
            hargaMenu = 15000;
        } else if (menu2.isSelected()) {
            hargaMenu = 10000;
        } else if (menu3.isSelected()) {
            hargaMenu = 20000;
        } else if (menu4.isSelected()) {
            hargaMenu = 22000;
        } else if (menu5.isSelected()) {
            hargaMenu = 35000;
        } else if (menu6.isSelected()) {
            hargaMenu = 18000;
        }

        // Cek topping yang dipilih
        if (checkKacangAlmond.isSelected()) hargaTopping += 8000;
        if (checkKejuCheddar.isSelected()) hargaTopping += 5000;
        if (checkKrimVanilla.isSelected()) hargaTopping += 6000;
        if (checkTanpaTopping.isSelected()) hargaTopping += 0;

        // Menghitung total harga
        int totalHarga = (hargaMenu + hargaTopping) * jumlahPesanan;

        // Terapkan diskon jika total lebih dari Rp 100.000
        if (totalHarga >= 100000) {
            double diskon = 0.05 * totalHarga;
            totalHarga -= diskon;
        }

        txtTotal.setText(String.valueOf(totalHarga));

    }//GEN-LAST:event_btnTotalActionPerformed

    private void txtCashKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCashKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtCashKeyTyped

    private void checkKrimVanillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkKrimVanillaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkKrimVanillaActionPerformed

    private void txtCashKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCashKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtCashKeyReleased

    private void txtCashKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCashKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtCashKeyPressed

    private void txtCashMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCashMouseReleased
        // TODO add your handling code here:
        try {
            int totalHarga = Integer.parseInt(txtTotal.getText());  
            int cash = Integer.parseInt(txtCash.getText());         
            int kembalian = cash - totalHarga;                       

            if (kembalian < 0) {
                // Tampilkan pesan error jika kembalian negatif
                JOptionPane.showMessageDialog(null, "Uang yang Anda masukkan kurang.", "Peringatan", JOptionPane.WARNING_MESSAGE);
                txtKembalian.setText(""); 
            } else {
                txtKembalian.setText(String.valueOf(kembalian)); 
            }
        } catch (NumberFormatException ex) {
            txtKembalian.setText(""); 
        }
    }//GEN-LAST:event_txtCashMouseReleased

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
        FlatMacLightLaf.setup(); 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GroupMenu;
    private javax.swing.ButtonGroup GroupTopping;
    private javax.swing.JLabel alamatToko;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnKurang;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTotal;
    private javax.swing.JCheckBox checkKacangAlmond;
    private javax.swing.JCheckBox checkKejuCheddar;
    private javax.swing.JCheckBox checkKrimVanilla;
    private javax.swing.JCheckBox checkTanpaTopping;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jmlPesanan;
    private javax.swing.JLabel lblCash;
    private javax.swing.JLabel lblKembalian;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblPembayaran;
    private javax.swing.JLabel lblTopping;
    private javax.swing.JRadioButton menu1;
    private javax.swing.JRadioButton menu2;
    private javax.swing.JRadioButton menu3;
    private javax.swing.JRadioButton menu4;
    private javax.swing.JRadioButton menu5;
    private javax.swing.JRadioButton menu6;
    private javax.swing.JLabel namaToko;
    private Custom.RoundedPanel roundedPanel1;
    private javax.swing.JLabel tagline;
    private javax.swing.JTextField txtCash;
    private javax.swing.JTextField txtJumlahPesanan;
    private javax.swing.JTextField txtKembalian;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
