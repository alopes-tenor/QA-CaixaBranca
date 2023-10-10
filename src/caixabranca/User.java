
package caixabranca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Amanda Lopes 
 */
public class User {

    /**Classe para objetos do tipo User.
     *
     * 
     */
    public Connection conectarBD(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.Driver.Manager").newInstance(); 
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriverManager.getConnection(url);
        }catch (Exception e){}
        return conn;}

    /** Método que cria string de conexão com o banco e inicie a conexão.
     * @param url - String que recebe valores para conexão com o banco de dados
     * @return objeto Connection conn.
     * 
     */
    public String nome="";

    public boolean result = false;


    public boolean verificarUsuario(String login, String senha){
         String sql = "";
         Connection conn = conectarBD();
         //Instrução SQL
         sql += "select nome from usuarios";
         sql += "where login = " + "'" + login + "'";
         sql += "and senha = " + "'" + senha + "',";
         try{
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql);
             if(rs.next()){
                 result = true;
                 nome = rs.getString("nome");}
             }catch (Exception e){}
         return result;}
         }

    /**Método que faz a verificação do usuário na base de dados.
     *
     * @param login - String que recebe o valor do login do User
     * @param senha - String que recebe o valor da senha do User
     * @param sql - String que armazena a query que será passada ao banco de dados
     * @return boolean result - booleano que armazena o resultado da conexão com o banco de dados.
     */


