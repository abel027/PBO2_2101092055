/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_b.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import uts_b.model.Penjualan;

/**
 *
 * @author User
 */
public class PenjualanDaoImpl {



    
    public void insert(Connection con, Penjualan penjualan) throws Exception {
        String sql = "insert into penjualan values(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, penjualan.getKodepesanan());
        ps.setString(2, penjualan.getTgl());
        ps.setString(3, penjualan.getNamapemesan());
        ps.setString(4, penjualan.getTotalbayar());
        ps.setString(5, penjualan.getOngkir());
        ps.setString(6, penjualan.getDiskon());
        ps.executeUpdate();
    }
    
    public void update(Connection con, Penjualan penjualan) throws Exception {
            String sql = 
                "update penjualan set namapenjualan=?, alamat=?,"
                + "jeniskelamin=? where kodepenjualan=?";
            PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, penjualan.getKodepesanan());
        ps.setString(2, penjualan.getTgl());
        ps.setString(3, penjualan.getNamapemesan());
        ps.setString(4, penjualan.getTotalbayar());
        ps.setString(5, penjualan.getOngkir());
        ps.setString(6, penjualan.getDiskon());
        ps.executeUpdate();
            
    }
    
    public void delete(Connection con, Penjualan penjualan) throws Exception {
        String sql = 
                "delete from penjualan"
                +"where kodepenjualan = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, penjualan.getKodepesanan());
        ps.setString(2, penjualan.getTgl());
        ps.setString(3, penjualan.getNamapemesan());
        ps.setString(4, penjualan.getTotalbayar());
        ps.setString(5, penjualan.getOngkir());
        ps.setString(6, penjualan.getDiskon());
        ps.executeUpdate();
        
    }
    
    public Penjualan getPenjualan(Connection con, String kode) throws Exception {
        String sql = "select * from penjualan "
                + "where kodepenjualan = ?" ; 
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kode);
        ResultSet rs = ps.executeQuery();
        Penjualan penjualan = null;
        if (rs.next()) {
            penjualan = new Penjualan();
            penjualan.setKodepesanan(rs.getString(1));
            penjualan.setTgl(rs.getString(2));
            penjualan.setNamapemesan(rs.getString(3));
            penjualan.setTotalbayar(rs.getString(4));
            penjualan.setOngkir(rs.getString(4));
            penjualan.setDiskon(rs.getString(4));

        }
        return penjualan; 
    }
    
    public List<Penjualan> getAllPenjualan(Connection con) throws Exception {
        String sql = "select * from penjualan";
        PreparedStatement ps = con.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        List<Penjualan> list = new ArrayList<>();
        Penjualan penjualan = null;
        while (rs.next()){
            penjualan = new Penjualan();
            penjualan.setKodepesanan(rs.getString(1));
            penjualan.setTgl(rs.getString(2));
            penjualan.setNamapemesan(rs.getString(3));
            penjualan.setTotalbayar(rs.getString(4));
            penjualan.setOngkir(rs.getString(4));
            penjualan.setDiskon(rs.getString(4));
        }
        return list;
    }
    
    
}
