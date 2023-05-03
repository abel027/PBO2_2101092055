/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abel.dao;

import abel.model.Buku;
import java.sql.Connection;
import java.util.List;


/**
 *
 * @author User
 */
public interface BukuDao {
    
    void insert(Connection con, Buku buku) throws Exception;
    void update(Connection con, Buku buku) throws Exception;
    void delete(Connection con, Buku buku) throws Exception;
    public Buku getAnggota(Connection con, String Kode) throws Exception;
    public List<Buku> getAllBuku(Connection con) throws Exception;
}
