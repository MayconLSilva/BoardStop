/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Maycon Silva
 */
public class ConectaBanco {
    
    public Statement stm;
    public ResultSet rs;
    private String driver ="org.mysql.driver"; 
    
    private String caminhojdbc1= "jdbc:mysql://";
    private String caminhojdbc2= ":3306/";
    
    private String servidormysql;
    private String bancodadosmysql;
    private String usuariomysql;
    private String senhamysql;
    
    public Connection conn;
    
    private String nomeCaminhoFinal;
    
    public void conexao(){
        LerXML();
        System.out.println("servidormysql --> "+servidormysql);
            try {
                System.setProperty("jdbc.Drivers",driver);
                conn=DriverManager.getConnection(caminhojdbc1+servidormysql+caminhojdbc2 + bancodadosmysql, usuariomysql,senhamysql);
            System.out.println("Conectado");
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro de conexão!\n Erro:" + ex.getMessage());
            }
            
        }
    
    public void executaSQL(String sql){
        LerXML();
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de ExecutaSQL!\n Erro:" + ex.getMessage());
        }
        
    }
    
    public void desconecta(){
        try{
            conn.close();
            //JOptionPane.showMessageDialog(null,"Desconectado com sucesso!");
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro ao fechar a conexão!\n Erro:" + ex.getMessage());
        }
    }
    
     public void LerXML(){
        System.out.println("Inicio leu XML");
        
        //Ler Caminho do executavel
        String nomeArquivoConfig = "\\configBoardStop.xml";
        try {
            File file = new File(".");
            String nomeCaminhoSistema = file.getCanonicalPath();            
            nomeCaminhoFinal = nomeCaminhoSistema + nomeArquivoConfig;  
            System.out.println("Leu caminho final do arquivo XML --> "+nomeCaminhoFinal);
        } catch (Exception erro) {
        }
        //Fim do ler Caminho do executavel
        
        File arq = new File(nomeCaminhoFinal);
        
        //Arquivo existe
        if (arq.exists()) {
            //tentando ler arquivo
            try {
                
                //abrindo arquivo para leitura
                FileReader reader = new FileReader(nomeCaminhoFinal);
                //leitor do arquivo texto (ponteiro)
                BufferedReader leitor = new BufferedReader(reader);
                leitor.readLine(); //<xml
                leitor.readLine(); //<cadastro
                while (servidormysql == null) {
                    System.out.println("while");
                    System.out.println("servidor 6 "+servidormysql);
                    leitor.readLine(); //<pessoa 
                    System.out.println("servidor 7 "+servidormysql);
                    servidormysql = leitor.readLine();
                   System.out.println("servidor 8 "+servidormysql);
                    if (servidormysql == null) {
                        break;
                    }
                    System.out.println("servidor 9 "+servidormysql);
                    
                    
                    bancodadosmysql = leitor.readLine(); //System.out.println("if bancodadosmysql "+bancodadosmysql);
                    usuariomysql = leitor.readLine(); //System.out.println("if usuariomysql "+usuariomysql);
                    senhamysql = leitor.readLine(); //System.out.println("if senhamysql "+senhamysql);
                    
                    //Para pegar entre as Tags, foi preciso criar uma lógica para quebrar a String
                    servidormysql = servidormysql.substring(servidormysql.indexOf(">") + 1, servidormysql.indexOf("</") - 0); 
                    System.out.println("tag servidor mysql--> "+ servidormysql);
                    
                    bancodadosmysql = bancodadosmysql.substring(bancodadosmysql.indexOf(">") + 1, bancodadosmysql.indexOf("</") - 0); //pegando entre as tags
                    System.out.println("tag bancodadosmysql mysql--> "+ bancodadosmysql);
                    
                    usuariomysql = usuariomysql.substring(usuariomysql.indexOf(">") + 1, usuariomysql.indexOf("/") - 1);
                    System.out.println("tag usuariomysql mysql--> "+ usuariomysql);
                    
                    senhamysql = senhamysql.substring(senhamysql.indexOf(">") + 1, senhamysql.indexOf("/") - 1);
                    System.out.println("tag senhamysql mysql--> "+ senhamysql);
                    
                    System.out.println("tag servidor 2 mysql--> "+ servidormysql);

                    leitor.readLine();
                    
                    System.out.println("tag servidor 3 mysql--> "+ servidormysql);
                    
                }
                System.out.println("tag servidor 4 mysql--> "+ servidormysql);
            } catch (Exception erro) {
                System.out.println("erro aqui");
            }
            System.out.println("tag servidor 5 mysql--> "+ servidormysql);
        } //Se nao existir
        else {
            JOptionPane.showMessageDialog(null, "Arquivo nao existe!", "Erro", 0);
        }
        
    }
     
     

}
