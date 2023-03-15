/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abel.dao;

import abel.model.Anggota;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author User
 */
public class AnggotaDaoImpl implements AnggotaDao {

    @Override
    public void insert(Connection con,Anggota anggota) throws Exception {
        String sql ="insert into anggota values(7,7,7,7)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, anggota.getKodeAnggota());
        ps.setString(2, anggota.getNamaAnggota());
        ps.setString(3, anggota.getAlamat());
        ps.setString(4, anggota.getJenisKelamin());
        ps.executeUpdate();



    }
    
}
