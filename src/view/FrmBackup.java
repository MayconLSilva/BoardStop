/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.Connection;
import util.ConectaBanco;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import util.StreamGobbler;



/**
 *
 * @author MAYCON
 */
public class FrmBackup extends javax.swing.JInternalFrame {
    
    Connection con = null;
    Process proc;
    
    ConectaBanco conn = new ConectaBanco();
    
    /**
     * Creates new form FrmBackup
     */
    public FrmBackup() {
        initComponents();
        this.setLocation(450, 100);
        
        try{
            conn.conexao();
            JFC_Salvar_Backup.setVisible(false);
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex, "Erro!",2);
        }
        
        try{
            conn.conexao();
            JFC_Restaurar_Backup.setVisible(false);
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex, "Erro!",2);
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JB_Backup = new javax.swing.JButton();
        JB_BT_Restaurar_Mysql = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        JFC_Salvar_Backup = new javax.swing.JFileChooser();
        JFC_Restaurar_Backup = new javax.swing.JFileChooser();

        setClosable(true);
        setIconifiable(true);
        setTitle("Backup e Restauração do Sistema");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JB_Backup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Backup Banco.png"))); // NOI18N
        JB_Backup.setText("Salvar Backup");
        JB_Backup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_BackupActionPerformed(evt);
            }
        });

        JB_BT_Restaurar_Mysql.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/restaurar.png"))); // NOI18N
        JB_BT_Restaurar_Mysql.setText("Restaurar Backup");
        JB_BT_Restaurar_Mysql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_BT_Restaurar_MysqlActionPerformed(evt);
            }
        });

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JB_Backup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JB_BT_Restaurar_Mysql)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {JB_Backup, jButtonCancelar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JB_Backup)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_BT_Restaurar_Mysql, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {JB_BT_Restaurar_Mysql, JB_Backup, jButtonCancelar});

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        JFC_Salvar_Backup.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        JFC_Salvar_Backup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFC_Salvar_BackupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JFC_Salvar_Backup, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JFC_Restaurar_Backup, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JFC_Restaurar_Backup, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JFC_Salvar_Backup, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_BackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_BackupActionPerformed
        // Botão Backup
        
        try{
            String arquivo = null;
            
            JFC_Salvar_Backup.setVisible(true);
            
            int result = JFC_Salvar_Backup.showSaveDialog(null);
            
            if(result == JFileChooser.APPROVE_OPTION){
                arquivo = JFC_Salvar_Backup.getSelectedFile().toString().concat(".sql");
                
                File file = new File(arquivo);
                
                if(file.exists()){
                    Object[] options = { "Sim", "Não" };
                    int opcao = JOptionPane.showOptionDialog(null, "Este arquivo já existe. Quer sobreescrever este arquivo?", "Atenção!!!",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,options, options[0]);
                        if (opcao == JOptionPane.YES_OPTION){
                            Runtime bck = Runtime.getRuntime();
                            //bck.exec("C:/xampp/mysql/bin/mysqldump.exe -v -v -v --host=localhost --user=root --password=123456 --port=3306 --protocol=tcp --force --allow-keywords --compress --add-drop-table --default-character-set=latin1 --hex-blob --result-file="+arquivo+" --databases gestor");
                            bck.exec("C:/Program Files (x86)/MySQL/MySQL Workbench 6.2 CE/mysqldump.exe -v -v -v --host=server2012 --user=sistema --password=M12345 --port=3306 --protocol=tcp --force --allow-keywords --compress --add-drop-table --default-character-set=latin1 --hex-blob --result-file="+arquivo+" --databases gestor");
                            
                            JOptionPane.showMessageDialog(null, "Backup realizado com sucesso.", "Tudo OK!", 1);
                            dispose();
                        }else{
                            JB_BackupActionPerformed(evt);
                        }
                }else{
                        Runtime bck = Runtime.getRuntime();
                        //bck.exec("C:/xampp/mysql/bin/mysqldump.exe -v -v -v --host=localhost --user=root --password=123456 --port=3306 --protocol=tcp --force --allow-keywords --compress --add-drop-table --default-character-set=latin1 --hex-blob --result-file="+arquivo+" --databases gestor");
                        bck.exec("C:/Program Files (x86)/MySQL/MySQL Workbench 6.2 CE/mysqldump.exe -v -v -v --host=server2012 --user=sistema --password=M12345 --port=3306 --protocol=tcp --force --allow-keywords --compress --add-drop-table --default-character-set=latin1 --hex-blob --result-file="+arquivo+" --databases gestor");
                            
                        JOptionPane.showMessageDialog(null, "Backup realizado com sucesso.", "Tudo OK!", 1);
                        dispose();
                    
                }
            }
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex, "Erro!", 2);
        }
    }//GEN-LAST:event_JB_BackupActionPerformed

    private void JFC_Salvar_BackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFC_Salvar_BackupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JFC_Salvar_BackupActionPerformed

    private void JB_BT_Restaurar_MysqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_BT_Restaurar_MysqlActionPerformed
        // TODO add your handling code here:
        /*
        
        try {
   JFC_Restaurar_Backup.setVisible(true);  
               String bd = "gestor";
  int result = JFC_Restaurar_Backup.showOpenDialog(null); 
 
  if(result == JFileChooser.OPEN_DIALOG){
  
                File bkp;  
            bkp = JFC_Restaurar_Backup.getSelectedFile();  
           String arq = bkp.getPath();  
           System.out.println("bd "+ bd);
           System.out.println("arq "+ arq); 
           
String[] cmd = new String[3];
               cmd[0] = "cmd.exe" ;
                cmd[1] = "/C" ;
                 //cmd[2] = "c:\\xampp\\mysql\\bin\\mysql -u root -pigc7gng -h localhost "+bd+" < "+arq ;
                 cmd[2] = "C:/ProCgram Files (x86)/MySQL/MySQL Workbench 6.2 CE/mysql -u root -p123456 -h localhost "+bd+" < "+arq ;
                      
                 
         Runtime rt = Runtime.getRuntime();
            System.out.println("Execing " + cmd[0] + " " + cmd[1]);
            proc = rt.exec(cmd);
            
                        // any error message?
            StreamGobbler errorGobbler = new 
            StreamGobbler(proc.getErrorStream(), "ERROR");            
            
            // any output?
            StreamGobbler outputGobbler = new 
            StreamGobbler(proc.getInputStream(), "OUTPUT");
                
            // kick them off
            errorGobbler.run();
            outputGobbler.run();
                                    
            // any error???
            int exitVal = proc.waitFor();
      
       
                        if (exitVal == 0){  
                JOptionPane.showMessageDialog(null, "Backup Restaurado com sucesso !");  
            }  
            else{  
                JOptionPane.showMessageDialog(null, "Falha ao restaurar backup. \n Verifique as configurações ou entre em contato com o suporte !");  
            }
}
           
  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Erro!", 2);            
        }

*/
    }//GEN-LAST:event_JB_BT_Restaurar_MysqlActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_BT_Restaurar_Mysql;
    private javax.swing.JButton JB_Backup;
    private javax.swing.JFileChooser JFC_Restaurar_Backup;
    private javax.swing.JFileChooser JFC_Salvar_Backup;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
