/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_b.controller;

import abel.dao.Koneksi;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import uts_b.dao.PenjualanDao;
import uts_b.dao.PenjualanDaoImpl;
import uts_b.model.Penjualan;
import uts_b.view.FormPenjualan;

/**
 *
 * @author User
 */
public class PenjualanController {
    private FormPenjualan formPenjualan;
    private Penjualan penjualan;
    private PenjualanDao penjualanDao;
    private Connection con;
    private Koneksi koneksi;
    
    public PenjualanController(FormPenjualan formpenjualan) {
        try {
            this.formPenjualan = formpenjualan;
           penjualanDao = (PenjualanDao) new PenjualanDaoImpl();
            koneksi = new Koneksi();
           con = koneksi.getKoneksi();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PenjualanController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PenjualanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void clearForm(){
        formPenjualan.getTxtkodepesanan().setText("");
        formPenjualan.getTxttgl().setText("");
        formPenjualan.getTxttotalbayar().setText("");
        formPenjualan.getTxtongkir().setText("");
        formPenjualan.getTxtdiskon().setText("");
    }
   
    public void insert(){
        try {
            penjualan = new Penjualan();
            penjualan.setKodepesanan(
                    formPenjualan.getTxtkodepesanan().getText());
            penjualan.setTgl(
                    formPenjualan.getTxttgl().getText());
            penjualan.setNamapemesan(
                    formPenjualan.getTxtnamapemesan().getText());
            penjualan.setTotalbayar(
                    formPenjualan.getTxttotalbayar().getText());
            penjualan.setOngkir(
                    formPenjualan.getTxtongkir().getText());
            
            penjualan.setDiskon(
                    formPenjualan.getTxtdiskon().getText());

            JOptionPane.showMessageDialog(formPenjualan, "Entri Ok");
        } catch (Exception ex) {
            Logger.getLogger(PenjualanController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    } 
   
   public void update(){
       
        try {
            penjualan = new Penjualan();
            penjualan.setKodepesanan(
                    formPenjualan.getTxtkodepesanan().getText());
            penjualan.setTgl(
                    formPenjualan.getTxttgl().getText());
            penjualan.setNamapemesan(
                    formPenjualan.getTxtnamapemesan().getText());
            penjualan.setTotalbayar(
                    formPenjualan.getTxttotalbayar().getText());
            penjualan.setOngkir(
                    formPenjualan.getTxtongkir().getText());
            
            penjualan.setDiskon(
                    formPenjualan.getTxtdiskon().getText());
            JOptionPane.showMessageDialog(formPenjualan, "Update Ok");
        } catch (Exception ex) {
            Logger.getLogger(PenjualanController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
   
   public void delete(){
     
        try {
            penjualanDao.delete(con, penjualan);
            JOptionPane.showMessageDialog(formPenjualan, "Delete Ok");
        } catch (Exception ex) {
            Logger.getLogger(PenjualanController.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
     public void cari(){
        try {
            String kode = formPenjualan.getTxtkodepesanan().getText();
            penjualan = penjualanDao.getPenjualan(con,kode);
            if(penjualan != null){
                formPenjualan.getTxttgl().setText(penjualan.getTgl());
                formPenjualan.getTxtnamapemesan().setText(penjualan.getNamapemesan());
                formPenjualan.getTxttotalbayar().setText(penjualan.getTotalbayar());
                formPenjualan.getTxtongkir().setText(penjualan.getOngkir());
                formPenjualan.getTxtdiskon().setText(penjualan.getDiskon());


            }else{
                JOptionPane.showMessageDialog(formPenjualan, "Data Tidak Ada");
            }
        } catch (Exception ex) {
            Logger.getLogger(PenjualanController.class.getName()).log(Level.SEVERE, null, ex);
        }
     }

        public void tampil(){
        try {
            DefaultTableModel tabel = (DefaultTableModel) formPenjualan.getTblpenjualan().getModel();
            tabel.setRowCount(0);
            List<Penjualan> list = penjualanDao.getAllPenjualan(con);
            for (Penjualan penjualan1 : list) {
                Object[] row = {
                    penjualan1.getKodepesanan(),
                    penjualan1.getTgl(),
                    penjualan1.getTotalbayar(),
                    penjualan1.getOngkir(),
                    penjualan1.getDiskon()
                };
                tabel.addRow(row);
            }
        } catch (Exception ex) {
            Logger.getLogger(PenjualanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 }

    

