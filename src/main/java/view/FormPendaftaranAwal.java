package view;

import model.Kursus;
import javax.swing.JOptionPane;

public class FormPendaftaranAwal extends javax.swing.JFrame {

public FormPendaftaranAwal() {
    initComponents();

    cmbKursus.setModel(new javax.swing.DefaultComboBoxModel<>(
    new String[] {
        "-- Pilih Kursus --",
        "Java",
        "Data Science",
        "UI/UX"
    }
));
cmbKursus.setSelectedIndex(0);
}

private double hitungTotal(double biaya, int jumlah) {
    return biaya * jumlah;
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNamaPendaftar = new javax.swing.JTextField();
        txtBiaya = new javax.swing.JTextField();
        txtJumlah = new javax.swing.JTextField();
        cmbKursus = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtKodeKursus = new javax.swing.JTextField();
        cmbLevel = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtDiskon = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nama Pendaftar");

        txtNamaPendaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaPendaftarActionPerformed(evt);
            }
        });

        cmbKursus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Java Desktop Fundamental", "Data Science", "UI/UX" }));
        cmbKursus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKursusActionPerformed(evt);
            }
        });

        jButton1.setText("Proses");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setText("Biaya");

        jLabel3.setText("Jumlah");

        jLabel4.setText("Nama Kursus");

        jLabel5.setText("PENDAFTARAN KURSUS");

        jLabel6.setText("Kode Kursus");

        txtKodeKursus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeKursusActionPerformed(evt);
            }
        });

        cmbLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BASIC", "INTERMEDIATE", "ADVANCED" }));
        cmbLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLevelActionPerformed(evt);
            }
        });

        jLabel7.setText("Level");

        txtDiskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiskonActionPerformed(evt);
            }
        });

        jLabel8.setText("Diskon(%)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(129, 129, 129))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtBiaya, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                        .addComponent(cmbLevel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDiskon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbKursus, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1))
                                    .addComponent(txtNamaPendaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtKodeKursus, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2))))
                    .addComponent(jLabel3))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel5)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKodeKursus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamaPendaftar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbKursus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbKursusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKursusActionPerformed
    String namaKursus = (String) cmbKursus.getSelectedItem();
    System.out.println("Kursus dipilih: " + namaKursus);
    }//GEN-LAST:event_cmbKursusActionPerformed

    private void txtNamaPendaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaPendaftarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaPendaftarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 int pilihan = JOptionPane.showConfirmDialog(
        this,
        "Kosongkan seluruh input?",
        "Konfirmasi Reset",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE
    );

    if (pilihan == JOptionPane.YES_OPTION) {
        txtKodeKursus.setText("");
        txtNamaPendaftar.setText("");
        txtBiaya.setText("");
        txtJumlah.setText("");
        txtDiskon.setText("");

        cmbKursus.setSelectedIndex(0);
        cmbLevel.setSelectedIndex(0);

        jTextArea1.setText("");

        txtKodeKursus.requestFocus();
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // 1. Mengambil data teks dari form
    String kode = txtKodeKursus.getText().trim();
    String namaPendaftar = txtNamaPendaftar.getText().trim();

    // 2. Validasi nama pendaftar
    if (namaPendaftar.isEmpty()) {
        JOptionPane.showMessageDialog(
            this,
            "Nama peserta wajib diisi.",
            "Validasi",
            JOptionPane.WARNING_MESSAGE
        );
        txtNamaPendaftar.requestFocus();
        return;
    }

    // 3. Validasi kode kursus
    if (kode.isEmpty()) {
        JOptionPane.showMessageDialog(
            this,
            "Kode kursus wajib diisi.",
            "Validasi",
            JOptionPane.WARNING_MESSAGE
        );
        txtKodeKursus.requestFocus();
        return;
    }

    // 4. Validasi pilihan kursus
    if (cmbKursus.getSelectedIndex() == 0) {
        JOptionPane.showMessageDialog(
            this,
            "Silakan pilih kursus terlebih dahulu.",
            "Validasi",
            JOptionPane.WARNING_MESSAGE
        );
        cmbKursus.requestFocus();
        return;
    }

    // 5. Validasi biaya dan diskon
    try {
        String namaKursus =
            cmbKursus.getSelectedItem().toString();
        String level =
            cmbLevel.getSelectedItem().toString();

        String teksBiaya = txtBiaya.getText().trim();
        String teksDiskon = txtDiskon.getText().trim();

        if (teksBiaya.isEmpty()) {
            JOptionPane.showMessageDialog(
                this,
                "Biaya wajib diisi.",
                "Validasi",
                JOptionPane.WARNING_MESSAGE
            );
            txtBiaya.requestFocus();
            return;
        }

        if (teksDiskon.isEmpty()) {
            JOptionPane.showMessageDialog(
                this,
                "Diskon wajib diisi.",
                "Validasi",
                JOptionPane.WARNING_MESSAGE
            );
            txtDiskon.requestFocus();
            return;
        }

        double biaya = Double.parseDouble(teksBiaya);
        double diskon = Double.parseDouble(teksDiskon);

        if (biaya < 0) {
            JOptionPane.showMessageDialog(
                this,
                "Biaya tidak boleh negatif.",
                "Validasi",
                JOptionPane.WARNING_MESSAGE
            );
            txtBiaya.requestFocus();
            return;
        }

        if (diskon < 0 || diskon > 100) {
            JOptionPane.showMessageDialog(
                this,
                "Diskon harus antara 0 sampai 100 persen.",
                "Validasi",
                JOptionPane.WARNING_MESSAGE
            );
            txtDiskon.requestFocus();
            return;
        }

        // 6. Membuat objek Kursus
        Kursus kursus = new Kursus(
            kode, namaKursus, level, biaya
        );

        // 7. Menghitung biaya setelah diskon
        double total =
            kursus.hitungBiayaSetelahDiskon(diskon);

        // 8. Menyusun bukti pendaftaran
        String pesan = "--- BUKTI PENDAFTARAN ---\n"
            + "Nama Pendaftar: " + namaPendaftar + "\n"
            + "Kode Kursus: " + kode + "\n"
            + "Nama Kursus: " + namaKursus + "\n"
            + "Level: " + level + "\n"
            + "Biaya Awal: Rp"
            + String.format("%,.0f", biaya) + "\n"
            + "Diskon: " + diskon + "%\n"
            + "Biaya Akhir: Rp"
            + String.format("%,.0f", total);

        // 9. Menampilkan hasil
        jTextArea1.setText(pesan);

        JOptionPane.showMessageDialog(
            this,
            pesan,
            "Pendaftaran Berhasil",
            JOptionPane.INFORMATION_MESSAGE
        );

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(
            this,
            "Biaya dan diskon harus berupa angka yang valid!",
            "Error",
            JOptionPane.ERROR_MESSAGE
        );
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtKodeKursusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeKursusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeKursusActionPerformed

    private void cmbLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbLevelActionPerformed

    private void txtDiskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiskonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiskonActionPerformed

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
            java.util.logging.Logger.getLogger(FormPendaftaranAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPendaftaranAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPendaftaranAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPendaftaranAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPendaftaranAwal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbKursus;
    private javax.swing.JComboBox<String> cmbLevel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtBiaya;
    private javax.swing.JTextField txtDiskon;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtKodeKursus;
    private javax.swing.JTextField txtNamaPendaftar;
    // End of variables declaration//GEN-END:variables
}
