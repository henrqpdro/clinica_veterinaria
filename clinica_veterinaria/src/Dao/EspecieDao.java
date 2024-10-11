package Dao;

import domain.Especie;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class EspecieDao {

    public void inserir(Especie especie) throws Exception {

        String sql = "INSERT INTO TB_ESPECIE(NOM_ESPECIE) VALUES (?)";
        Connection conexao =  ConexaoMysql.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, especie.getNome());
        stmt.executeUpdate();
        stmt.close();
        conexao.close();
        
    }

}
