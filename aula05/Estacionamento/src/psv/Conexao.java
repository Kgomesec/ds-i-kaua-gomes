package psv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * responsável
 * por abrir e fechar as conexões
 */

public class Conexao {
    public static Connection abrirConexao() {
     Connection con = null;
     
     try {
         Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
         
         String url = "";
         url += "jdbc:mysql://127.0.0.1/estacionamento?";
         url += "user=root&password=root";
         
         con = DriverManager.getConnection(url);
         System.out.println("Conexão aberta.");
         
        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
     
     return con;
    }
    
    public static void fecharConexao(Connection con) {
        try {
            con.close();
            System.out.println("Conexão fechada.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
    }
}
