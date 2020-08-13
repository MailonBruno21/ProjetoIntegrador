/*
 * Classe para testar o Banco de Dados
 */
package br.edu.ifmt.cba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Mailon Bruno
 */
public class TesteBancoDAO {
    
    public static void main(String[] args) {
        
        Connection con = Conexao.IniciarConexao();
        PreparedStatement stmt = null;
        
        try {}
         
        finally {
            Conexao.FecharConexao(con, stmt);
        }
        
    }
}
