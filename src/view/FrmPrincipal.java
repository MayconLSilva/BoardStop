/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import util.CriarTabelas;

/**
 *
 * @author Maycon Silva
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    FrmPrincipal(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jDesktopPanePrincipal = new javax.swing.JDesktopPane();
        jMenuBarPrincipal = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItemCadastroParticipante = new javax.swing.JMenuItem();
        jMenuProdutoItem = new javax.swing.JMenu();
        jMenuItemProduto = new javax.swing.JMenuItem();
        jMenuItemCategoria = new javax.swing.JMenuItem();
        jMenuItemSubCategoria = new javax.swing.JMenuItem();
        jMenuItemMarca = new javax.swing.JMenuItem();
        jMenuMovimento = new javax.swing.JMenu();
        jMenuManutencao = new javax.swing.JMenu();
        jMenuItemAtualizarBD = new javax.swing.JMenuItem();
        jMenuItemBackupBD = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GESTOR DE JOGOS");
        setFocusable(false);

        javax.swing.GroupLayout jDesktopPanePrincipalLayout = new javax.swing.GroupLayout(jDesktopPanePrincipal);
        jDesktopPanePrincipal.setLayout(jDesktopPanePrincipalLayout);
        jDesktopPanePrincipalLayout.setHorizontalGroup(
            jDesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPanePrincipalLayout.setVerticalGroup(
            jDesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenuCadastros.setText("CADASTROS");

        jMenuItemCadastroParticipante.setText("Participante");
        jMenuItemCadastroParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroParticipanteActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadastroParticipante);

        jMenuProdutoItem.setText("Produto");

        jMenuItemProduto.setText("Produto");
        jMenuItemProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProdutoActionPerformed(evt);
            }
        });
        jMenuProdutoItem.add(jMenuItemProduto);

        jMenuItemCategoria.setText("Categoria");
        jMenuItemCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCategoriaActionPerformed(evt);
            }
        });
        jMenuProdutoItem.add(jMenuItemCategoria);

        jMenuItemSubCategoria.setText("Sub-Categoria");
        jMenuItemSubCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSubCategoriaActionPerformed(evt);
            }
        });
        jMenuProdutoItem.add(jMenuItemSubCategoria);

        jMenuItemMarca.setText("Marca");
        jMenuItemMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMarcaActionPerformed(evt);
            }
        });
        jMenuProdutoItem.add(jMenuItemMarca);

        jMenuCadastros.add(jMenuProdutoItem);

        jMenuBarPrincipal.add(jMenuCadastros);

        jMenuMovimento.setText("MOVIMENTO");
        jMenuBarPrincipal.add(jMenuMovimento);

        jMenuManutencao.setText("MANUTENÇÃO");
        jMenuManutencao.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        jMenuItemAtualizarBD.setText("Atualizar BD");
        jMenuItemAtualizarBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAtualizarBDActionPerformed(evt);
            }
        });
        jMenuManutencao.add(jMenuItemAtualizarBD);

        jMenuItemBackupBD.setText("Backup BD");
        jMenuItemBackupBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBackupBDActionPerformed(evt);
            }
        });
        jMenuManutencao.add(jMenuItemBackupBD);

        jMenuBarPrincipal.add(jMenuManutencao);

        setJMenuBar(jMenuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPanePrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPanePrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadastroParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroParticipanteActionPerformed
        FrmParticipante form = null;
        form = new FrmParticipante();
        form.setVisible(true);
        jDesktopPanePrincipal.add(form);
    }//GEN-LAST:event_jMenuItemCadastroParticipanteActionPerformed

    private void jMenuItemProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProdutoActionPerformed
        FrmProduto form = null;
        form = new FrmProduto();
        form.setVisible(true);
        jDesktopPanePrincipal.add(form);
    }//GEN-LAST:event_jMenuItemProdutoActionPerformed

    private void jMenuItemCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCategoriaActionPerformed
        FrmCategoria form = null;
        form = new FrmCategoria();
        form.setVisible(true);
        jDesktopPanePrincipal.add(form);
    }//GEN-LAST:event_jMenuItemCategoriaActionPerformed

    private void jMenuItemSubCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSubCategoriaActionPerformed
        FrmSubCategoria form = null;
        form = new FrmSubCategoria();
        form.setVisible(true);
        jDesktopPanePrincipal.add(form);
    }//GEN-LAST:event_jMenuItemSubCategoriaActionPerformed

    private void jMenuItemMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMarcaActionPerformed
        FrmMarca form = null;
        form = new FrmMarca();
        form.setVisible(true);
        jDesktopPanePrincipal.add(form);
    }//GEN-LAST:event_jMenuItemMarcaActionPerformed

    private void jMenuItemAtualizarBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAtualizarBDActionPerformed
        CriarTabelas tabela = new CriarTabelas();
        tabela.OnCreateOnUpdateCategoria();
        tabela.OnCreateOnUpdateMarca();
        tabela.OnCreateOnUpdateProduto();
        tabela.OnCreateOnUpdateSubCategoria();
        tabela.OnCreateOnUpdateUsuario();
        tabela.OnCreateOnUpdateParticipante();
        
    }//GEN-LAST:event_jMenuItemAtualizarBDActionPerformed

    private void jMenuItemBackupBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBackupBDActionPerformed
        FrmBackup form = null;
        form = new FrmBackup();
        form.setVisible(true);
        jDesktopPanePrincipal.add(form);
    }//GEN-LAST:event_jMenuItemBackupBDActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPanePrincipal;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JMenuBar jMenuBarPrincipal;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenuItem jMenuItemAtualizarBD;
    private javax.swing.JMenuItem jMenuItemBackupBD;
    private javax.swing.JMenuItem jMenuItemCadastroParticipante;
    private javax.swing.JMenuItem jMenuItemCategoria;
    private javax.swing.JMenuItem jMenuItemMarca;
    private javax.swing.JMenuItem jMenuItemProduto;
    private javax.swing.JMenuItem jMenuItemSubCategoria;
    private javax.swing.JMenu jMenuManutencao;
    private javax.swing.JMenu jMenuMovimento;
    private javax.swing.JMenu jMenuProdutoItem;
    // End of variables declaration//GEN-END:variables
}
