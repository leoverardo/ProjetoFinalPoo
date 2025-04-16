/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author aluno.saolucas
 */
public class FrMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrMenu
     */
    public FrMenu() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miCadastrarProd = new javax.swing.JMenu();
        miConProd = new javax.swing.JMenuItem();
        miCadastro = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        miCadCli = new javax.swing.JMenuItem();
        miListarCli = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        miCadFun = new javax.swing.JMenuItem();
        miListarFun = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoMercado (1).jpg"))); // NOI18N

        jMenu1.setText("Inicio");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        miCadastrarProd.setText("Produtos");
        miCadastrarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastrarProdActionPerformed(evt);
            }
        });

        miConProd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        miConProd.setText("Consultar");
        miConProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConProdActionPerformed(evt);
            }
        });
        miCadastrarProd.add(miConProd);

        miCadastro.setText("Cadastrar");
        miCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastroActionPerformed(evt);
            }
        });
        miCadastrarProd.add(miCadastro);

        jMenuBar1.add(miCadastrarProd);

        jMenu3.setText("Clientes");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        miCadCli.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        miCadCli.setText("Cadastrar");
        jMenu3.add(miCadCli);

        miListarCli.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        miListarCli.setText("Listar");
        miListarCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miListarCliMouseClicked(evt);
            }
        });
        miListarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarCliActionPerformed(evt);
            }
        });
        jMenu3.add(miListarCli);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Funcionarios");

        miCadFun.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        miCadFun.setText("Cadrastrar");
        miCadFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadFunActionPerformed(evt);
            }
        });
        jMenu4.add(miCadFun);

        miListarFun.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        miListarFun.setText("Listar");
        miListarFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarFunActionPerformed(evt);
            }
        });
        jMenu4.add(miListarFun);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miConProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConProdActionPerformed
        FrConsultarProduto telaConProduto = new FrConsultarProduto(this, rootPaneCheckingEnabled);
        telaConProduto.setVisible(true);
    }//GEN-LAST:event_miConProdActionPerformed

    private void miListarCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miListarCliMouseClicked
          
    }//GEN-LAST:event_miListarCliMouseClicked

    private void miListarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarCliActionPerformed
       FrConsultarCliente telaConCli = new FrConsultarCliente(this,rootPaneCheckingEnabled);
           telaConCli.setVisible(true);
    }//GEN-LAST:event_miListarCliActionPerformed

    private void miListarFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarFunActionPerformed
      FrConsultarFuncionarios telaConFun = new FrConsultarFuncionarios(this,rootPaneCheckingEnabled);
           telaConFun.setVisible(true);
    }//GEN-LAST:event_miListarFunActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        this.dispose();
        FrTelaPrincipal telaPrincipal = new FrTelaPrincipal();
        
        telaPrincipal.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void miCadFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadFunActionPerformed
        FrCadastroFuncionario telaCadFun = new FrCadastroFuncionario();
        telaCadFun.setVisible(true);
    }//GEN-LAST:event_miCadFunActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        FrCadastroCliente telaCadCli = new FrCadastroCliente();
        telaCadCli.setVisible(true);
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void miCadastrarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastrarProdActionPerformed
        FrCadastroProduto telaCadProd = new FrCadastroProduto(this, rootPaneCheckingEnabled);
        telaCadProd.setVisible(true);
    }//GEN-LAST:event_miCadastrarProdActionPerformed

    private void miCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastroActionPerformed
       FrCadastroProduto telaCadProd = new FrCadastroProduto(this, rootPaneCheckingEnabled);
        telaCadProd.setVisible(true);
    }//GEN-LAST:event_miCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(FrMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem miCadCli;
    private javax.swing.JMenuItem miCadFun;
    private javax.swing.JMenu miCadastrarProd;
    private javax.swing.JMenuItem miCadastro;
    private javax.swing.JMenuItem miConProd;
    private javax.swing.JMenuItem miListarCli;
    private javax.swing.JMenuItem miListarFun;
    // End of variables declaration//GEN-END:variables
}
