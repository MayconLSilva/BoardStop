/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ModeloParticipante;
import util.ConectaBanco;

/**
 *
 * @author Maycon Silva
 */
public class ControleParticipante {
    
    ModeloParticipante modParticipante = new ModeloParticipante();
    ConectaBanco conecta = new ConectaBanco();
    
    public void salvar(ModeloParticipante modParticante){
        conecta.conexao();;
        try{
            java.sql.PreparedStatement pst = conecta.conn.prepareStatement("insert into tblparticipante (`nomeParticipante`,`cpfCnpjParticipante`,`enderecoParticipante`,`numeroParticipante`,`bairroParticipante`,`cidadeParticipante`,`ufParticipante`,\n" +
            "`ieRgParticipante`,\n" +
            "`telefoneParticipante`,\n" +
            "`celular1Participante`,\n" +
            "`celular2Participante`,\n" +
            "`emailParticipante`,\n" +
            "`dataCadParticipante`,\n" +
            "`userCadParticipante`,\n" +
            "`ativoParticipante`,\n" +
            "`clienteParticipante`,\n" +
            "`vendedorParticipante`,\n" +
            "`fornecedorParticipante`,\n" +
            "`transportadoraParticipante`)\n" +
            "VALUES\n" +
            "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
            pst.setString(1, modParticipante.getNomeParticipante());
            pst.setString(2, modParticipante.getCpfCnpjParticipante());
            pst.setString(3, modParticipante.getEnderecoParticipante());
            pst.setString(4, modParticipante.getNumeroParticipante());
            pst.setString(5, modParticipante.getBairroParticipante());
            pst.setString(6, modParticipante.getCidadeParticipante());
            pst.setString(7, modParticipante.getUfParticipante());
            pst.setString(8, modParticipante.getIeRgParticipante());
            pst.setString(9, modParticipante.getTelefoneParticipante());
            pst.setString(10, modParticipante.getCelular1Participante());
            pst.setString(11, modParticipante.getCelular2Participante());
            pst.setString(12, modParticipante.getEmailParticipante());
            pst.setString(13, modParticipante.getDataCadastroParticipante());
            pst.setString(14, modParticipante.getUsuarioCadastroParticipante());
            pst.setBoolean(15, modParticipante.isAtivoParticipante());
            pst.setBoolean(16, modParticipante.isClienteParticipante());
            pst.setBoolean(17, modParticipante.isVendedorParticipante());
            pst.setBoolean(18, modParticipante.isFornecedorParticipante());
            pst.setBoolean(19, modParticipante.isTransportadoraParticipante());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Participante cadastrado com sucesso");
            
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao inserir participante! " + erro);
        }
    }
}
