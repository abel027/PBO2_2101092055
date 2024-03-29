/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_b.view;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import uts_b.controller.PenjualanController;

/**
 *
 * @author User
 */
public class FormPenjualan extends javax.swing.JFrame {

    /**
     * Creates new form FormPenjualan
     */
   PenjualanController controller;
    public FormPenjualan() throws Exception {
        initComponents();
        controller = new PenjualanController(this);
        controller.clearForm();
        controller.tampil();
    }

    public JButton getBtncancel() {
        return btncancel;
    }

    public void setBtncancel(JButton btncancel) {
        this.btncancel = btncancel;
    }

    public JButton getBtndelete() {
        return btndelete;
    }

    public void setBtndelete(JButton btndelete) {
        this.btndelete = btndelete;
    }

    public JButton getBtnexit() {
        return btnexit;
    }

    public void setBtnexit(JButton btnexit) {
        this.btnexit = btnexit;
    }

    public JButton getBtninsert() {
        return btninsert;
    }

    public void setBtninsert(JButton btninsert) {
        this.btninsert = btninsert;
    }

    public JTable getTblpenjualan() {
        return tblpenjualan;
    }

    public void setTblpenjualan(JTable tblpenjualan) {
        this.tblpenjualan = tblpenjualan;
    }

    public JTextField getTxtdiskon() {
        return txtdiskon;
    }

    public void setTxtdiskon(JTextField txtdiskon) {
        this.txtdiskon = txtdiskon;
    }

    public JTextField getTxtkodepesanan() {
        return txtkodepesanan;
    }

    public void setTxtkodepesanan(JTextField txtkodepesanan) {
        this.txtkodepesanan = txtkodepesanan;
    }

    public JTextField getTxtnamapemesan() {
        return txtnamapemesan;
    }

    public void setTxtnamapemesan(JTextField txtnamapemesan) {
        this.txtnamapemesan = txtnamapemesan;
    }

    public JTextField getTxtongkir() {
        return txtongkir;
    }

    public void setTxtongkir(JTextField txtongkir) {
        this.txtongkir = txtongkir;
    }

    public JTextField getTxttgl() {
        return txttgl;
    }

    public void setTxttgl(JTextField txttgl) {
        this.txttgl = txttgl;
    }

    public JTextField getTxttotalbayar() {
        return txttotalbayar;
    }

    public void setTxttotalbayar(JTextField txttotalbayar) {
        this.txttotalbayar = txttotalbayar;
    }

    public JButton getBtncari() {
        return btncari;
    }

    public void setBtncari(JButton btncari) {
        this.btncari = btncari;
    }

    public JButton getBtnupdate() {
        return btnupdate;
    }

    public void setBtnupdate(JButton btnupdate) {
        this.btnupdate = btnupdate;
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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtkodepesanan = new javax.swing.JTextField();
        txttgl = new javax.swing.JTextField();
        txtnamapemesan = new javax.swing.JTextField();
        txttotalbayar = new javax.swing.JTextField();
        txtongkir = new javax.swing.JTextField();
        txtdiskon = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblpenjualan = new javax.swing.JTable();
        btninsert = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        btncari = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kode Pesanan ");

        jLabel2.setText("Tanggal");

        jLabel3.setText("Nama Pemesan");

        jLabel4.setText("Total Bayar");

        jLabel5.setText("Ongkos Kirim");

        jLabel6.setText("Diskon");

        txtkodepesanan.setText("jTextField1");
        txtkodepesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkodepesananActionPerformed(evt);
            }
        });

        txttgl.setText("jTextField2");
        txttgl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttglActionPerformed(evt);
            }
        });

        txtnamapemesan.setText("jTextField3");
        txtnamapemesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamapemesanActionPerformed(evt);
            }
        });

        txttotalbayar.setText("jTextField4");
        txttotalbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalbayarActionPerformed(evt);
            }
        });

        txtongkir.setText("jTextField5");
        txtongkir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtongkirActionPerformed(evt);
            }
        });

        txtdiskon.setText("jTextField6");
        txtdiskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiskonActionPerformed(evt);
            }
        });

        tblpenjualan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Kode Pesanan", "Tanggal", "Nama Pemesan", "Total Bayar", "Ongkos Kirim", "Diskon", "Total"
            }
        ));
        jScrollPane2.setViewportView(tblpenjualan);

        btninsert.setText("Insert");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });

        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        btncari.setText("Cari");
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtongkir)
                            .addComponent(txttotalbayar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnamapemesan, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttgl, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdiskon)
                            .addComponent(txtkodepesanan, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addComponent(btncari)
                        .addGap(225, 225, 225))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btninsert, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 138, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtkodepesanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btncari)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txttgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtnamapemesan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txttotalbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtongkir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtdiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btninsert)
                    .addComponent(btnupdate)
                    .addComponent(btndelete)
                    .addComponent(btncancel)
                    .addComponent(btnexit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
        // TODO add your handling code here:
        controller.insert();
        controller.clearForm();
    }//GEN-LAST:event_btninsertActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        controller.insert();
        controller.clearForm();
        controller.tampil();
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncancelActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnexitActionPerformed

    private void txtkodepesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkodepesananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkodepesananActionPerformed

    private void txttglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttglActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttglActionPerformed

    private void txtnamapemesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamapemesanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamapemesanActionPerformed

    private void txttotalbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalbayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalbayarActionPerformed

    private void txtongkirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtongkirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtongkirActionPerformed

    private void txtdiskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiskonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiskonActionPerformed

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
        // TODO add your handling code here:
        controller.cari();
    }//GEN-LAST:event_btncariActionPerformed

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
            java.util.logging.Logger.getLogger(FormPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FormPenjualan().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(FormPenjualan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btncari;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblpenjualan;
    private javax.swing.JTextField txtdiskon;
    private javax.swing.JTextField txtkodepesanan;
    private javax.swing.JTextField txtnamapemesan;
    private javax.swing.JTextField txtongkir;
    private javax.swing.JTextField txttgl;
    private javax.swing.JTextField txttotalbayar;
    // End of variables declaration//GEN-END:variables



}
