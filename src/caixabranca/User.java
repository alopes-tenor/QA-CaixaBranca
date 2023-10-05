

package caixabranca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {
   5. public Connection conectarBD(){
        Connection conn = null;
    6.    try{
          6.  Class.forName("com.mysql.Driver.Manager").newInstance(); //ForName deve chamar a String ("com.mysql.jdbc.Driver") para carregar o driver;
          6.  String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
          6.  conn = DriverManager.getConnection(url);
      7.  }catch (Exception e){}
      8.  return conn;}
      1. public String nome="";
      2. public boolean result = false;
      3. public boolean verificarUsuario(String login, String senha){
         String sql = "";
        4. Connection conn = conectarBD();
         //Instrução SQL
         sql += "select nome from usuarios";
         sql += "where login = " + "'" + login + "'";
         sql += "and senha = " + "'" + senha + "',";
        9. try{
          9.   Statement st = conn.createStatement();
           9.  ResultSet rs = st.executeQuery(sql);
            10. if(rs.next()){
              10.   result = true;
               10.  nome = rs.getString("nome");}
            11. }catch (Exception e){}
        12. return result;}
         }

