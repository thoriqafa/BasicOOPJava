/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thoriqafafaisalm_tugas3;

import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class main2 extends javax.swing.JFrame {

    /**
     * Creates new form main2
     */
    public main2() {
     // setIcon();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblTampil = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBhnBakar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtJarakTempuh = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnHitung = new javax.swing.JButton();
        txtJarakTempuhAwal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtTipe = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtKapMesin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnHapus = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cbJenis = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Keefektivitasan Mesin");
        setBackground(new java.awt.Color(204, 255, 204));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblTampil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Ken", "Nama", "Tipe", "Kap. Mesin", "Bahan Bakar", "Jarak Tempuh Awal", "Jarak Tempuh", "Total Jarak", "Efektivitas", "Keefektivitasan"
            }
        ));
        jScrollPane1.setViewportView(tblTampil);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));

        jLabel8.setFont(new java.awt.Font("DFPOP1-W9", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 0));
        jLabel8.setText("DATA KENDARAAN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 255, 204), null, null));

        txtNama.setFont(new java.awt.Font("DeVinne Txt BT", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("DeVinne Txt BT", 1, 18)); // NOI18N
        jLabel4.setText("Tipe Kendaraan");

        txtBhnBakar.setFont(new java.awt.Font("DeVinne Txt BT", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("DeVinne Txt BT", 1, 18)); // NOI18N
        jLabel5.setText("Bahan Bakar");

        txtJarakTempuh.setFont(new java.awt.Font("DeVinne Txt BT", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("DeVinne Txt BT", 1, 18)); // NOI18N
        jLabel6.setText("Jarak Tempuh");

        btnHitung.setBackground(new java.awt.Color(255, 255, 204));
        btnHitung.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        btnHitung.setText("hitung");
        btnHitung.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        txtJarakTempuhAwal.setFont(new java.awt.Font("DeVinne Txt BT", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("DeVinne Txt BT", 1, 18)); // NOI18N
        jLabel7.setText("Jarak Tempuh Awal");

        jLabel1.setFont(new java.awt.Font("DeVinne Txt BT", 1, 18)); // NOI18N
        jLabel1.setText("Id Kendaraan");

        txtId.setFont(new java.awt.Font("DeVinne Txt BT", 0, 14)); // NOI18N

        txtTipe.setFont(new java.awt.Font("DeVinne Txt BT", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("DeVinne Txt BT", 1, 18)); // NOI18N
        jLabel2.setText("Nama Kendaraan");

        txtKapMesin.setFont(new java.awt.Font("DeVinne Txt BT", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("DeVinne Txt BT", 1, 18)); // NOI18N
        jLabel3.setText("Kapasitas Mesin");

        btnHapus.setBackground(new java.awt.Color(255, 255, 204));
        btnHapus.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        btnHapus.setText("hapus");
        btnHapus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(255, 255, 204));
        btnReset.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("DeVinne Txt BT", 1, 18)); // NOI18N
        jLabel9.setText("Jenis Kendaraan");

        cbJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mobil", "Sepeda Motor"}));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
                            .addComponent(txtNama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTipe, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKapMesin, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBhnBakar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJarakTempuhAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJarakTempuh, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtKapMesin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBhnBakar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJarakTempuhAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJarakTempuh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHitung)
                    .addComponent(btnHapus)
                    .addComponent(btnReset))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed

        String id = txtId.getText();
        String nk = txtNama.getText();
        String tk = txtTipe.getText();
        String km = txtKapMesin.getText();
        String bb = txtBhnBakar.getText();
        String jta = txtJarakTempuhAwal.getText();
        String jt = txtJarakTempuh.getText();

        int iid = Integer.parseInt(id);
        float fkm = Float.parseFloat(km);
        float fbb = Float.parseFloat(bb);
        float fjta = Float.parseFloat(jta);
        float fjt = Float.parseFloat(jt);
           if (cbJenis.getSelectedItem().equals("Mobil")) {
            ml.setIdKendaraan(iid);
            ml.setNamaKendaraan(nk);
            ml.setTypeKendaraan(tk);
            ml.setKapasitasMesin(fkm);

            kn.setBahanBakar(fbb);
            kn.setJarakTempuh(fjt);
            kn.setJarakTempuhAwal(fjta);
            kn.totalJarak(fjt, fjta);
            kn.efektivitas();

            mdl.addRow(new Object[]{"Mobil",String.valueOf(ml.getIdKendaraan()),
                ml.getNamaKendaraan(), ml.getTypeKendaraan(),
                String.valueOf(ml.getKapasitasMesin()),
                String.valueOf(kn.getBahanBakar()),
                String.valueOf(kn.getJarakTempuhAwal()),
                String.valueOf(kn.getJarakTempuh()),
                String.valueOf(kn.totalJarak(fjt, fjta)),
                String.valueOf(kn.efektivitas()), kn.keefektivitasan()});
            tblTampil.setModel(mdl);
        } else if(cbJenis.getSelectedItem().equals("Sepeda Motor")){
            sm.setIdKendaraan(iid);
            sm.setNamaKendaraan(nk);
            sm.setTypeKendaraan(tk);
            sm.setKapasitasMesin(fkm);

            kn.setBahanBakar(fbb);
            kn.setJarakTempuh(fjt);
            kn.setJarakTempuhAwal(fjta);
            kn.totalJarak(fjt, fjta);
            kn.efektivitas();

            mdl.addRow(new Object[]{"Sepeda Motor",String.valueOf(ml.getIdKendaraan()),
                ml.getNamaKendaraan(), ml.getTypeKendaraan(),
                String.valueOf(ml.getKapasitasMesin()),
                String.valueOf(kn.getBahanBakar()),
                String.valueOf(kn.getJarakTempuhAwal()),
                String.valueOf(kn.getJarakTempuh()),
                String.valueOf(kn.totalJarak(fjt, fjta)),
                String.valueOf(kn.efektivitas()), kn.keefektivitasan()});
            tblTampil.setModel(mdl);
        }
            
            
            
        


    }//GEN-LAST:event_btnHitungActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        tblTampil.setModel(mdl);
    }//GEN-LAST:event_formComponentShown

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int brs = tblTampil.getSelectedRow();
        if (brs >= 0) {
            int konfir = JOptionPane.showConfirmDialog(null, "Yakin? ",
                    "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
            if (konfir == 0) {
                mdl.removeRow(brs);
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        mdl.setRowCount(0);
    }//GEN-LAST:event_btnResetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cbJenis;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTampil;
    private javax.swing.JTextField txtBhnBakar;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtJarakTempuh;
    private javax.swing.JTextField txtJarakTempuhAwal;
    private javax.swing.JTextField txtKapMesin;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTipe;
    // End of variables declaration//GEN-END:variables
    Kendaraan kn = new Kendaraan();
    Mobil ml = new Mobil();
    SepedaMotor sm = new SepedaMotor();
    int baris = 0;
    static Object kolom[] = {"Jenis kendaraan","Id Kendaraan", "Nama ", "Tipe", "Kapasitas Mesin",
        "Bahan Bakar", "Jarak Tempuh Awal", "Jarak Tempuh",
        "Total Jarak", "Efektivitas", "Keefektivitasan"};
    DefaultTableModel mdl = new DefaultTableModel(kolom, baris++);
/*
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("op.png")));
    }*/
}
