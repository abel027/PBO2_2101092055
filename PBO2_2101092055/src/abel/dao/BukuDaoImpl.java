/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abel.dao;

import abel.model.Buku;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author User
 */
 public class BukuDaoImpl implements BukuDao {

    @Override
    public void insert(Connection con, Buku buku) throws Exception {
        String sql = "insert into buku values(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, buku.getKodebuku());
        ps.setString(2, buku.getJudul());
        ps.setString(3, buku.getPengarang());
        ps.setString(4, buku.getPenerbit());
        ps.executeUpdate();
    }

    
    @Override
    public void update(Connection con, Buku buku) throws Exception {
            String sql = 
                "update buku set judul=?, pengarang=?,"
                + "penerbit=? where kodebuku=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, buku.getKodebuku());
        ps.setString(2, buku.getJudul());
        ps.setString(3, buku.getPengarang());
        ps.setString(4, buku.getPenerbit());
        ps.executeUpdate();
    }        

    @Override
    public void delete(Connection con, Buku buku) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Buku getAnggota(Connection con, String Kode) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Buku> getAllBuku(Connection con) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
    
    @Override
    public void delete(Connection con, Buku buku) throws Exception {
        String sql = 
                "delete from buku"
                +"where kodebuku = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, buku.getKodebuku());
        ps.setString(2, buku.getJudul());
        ps.setString(3, buku.getPengarang());
        ps.setString(4, buku.getPenerbit());
        ps.executeUpdate();
    }
    
    @Override
    public Buku getBuku(Connection con, String kode) throws Exception {
        String sql = "select * from buku "
                + "where kodebuku = ?" ; 
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kode);
        ResultSet rs = ps.executeQuery();
        Anggota anggota = null;
        if (rs.next()) {
            buku = new Anggota();
            buku.setKodebuku(rs.getString(1));
            buku.setjudulrs.getString(2));
            buku.setPengarang(rs.getString(3));
            buku.setPenerbit(rs.getString(4));
        }
        return anggota; 
    }
    
    @Override
    public List<Anggota> getAllAnggota(Connection con) throws Exception {
        String sql = "select * from anggota";
        PreparedStatement ps = con.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        List<Anggota> list = new ArrayList<>();
        Anggota anggota = null;
        while (rs.next()){
            anggota = new Anggota();
            anggota.setKodeanggota(rs.getString(1));
            anggota.setNamaanggota(rs.getString(2));
            anggota.setAlamat(rs.getString(3));
            anggota.setJeniskelamin(rs.getString(4));
            list.add(anggota);
        }
        return list;
    }
}
}
