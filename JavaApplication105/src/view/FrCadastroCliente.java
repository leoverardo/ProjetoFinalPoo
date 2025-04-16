
package view;

import Controller.ClienteController;
import Model.Clientes;
import utils.Utils;
import java.awt.event.KeyEvent;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno.saolucas
 */
public class FrCadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form FrCadastroCliente
     */
    public FrCadastroCliente() {
        initComponents();

        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        edtConfirmSenha = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        edtCpf = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblConfirmSenha = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        edtEmail = new javax.swing.JTextField();
        edtSenha = new javax.swing.JPasswordField();
        btnCadastrar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(edtConfirmSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 440, 446, 43));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel1.setText("Cadastrar Cliente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 400, -1));

        jLabel2.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel2.setText("NeuroMarket");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LoginCliente.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        edtCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtCpfKeyPressed(evt);
            }
        });
        getContentPane().add(edtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 526, 446, 47));

        lblNome.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNome.setText("Nome:");
        getContentPane().add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 169, -1, -1));

        lblEmail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblEmail.setText("E-mail:");
        getContentPane().add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 255, -1, -1));

        lblSenha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblSenha.setText("Senha:");
        getContentPane().add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 329, -1, -1));

        lblConfirmSenha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblConfirmSenha.setText("Confirmar Senha:");
        getContentPane().add(lblConfirmSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 415, -1, -1));

        lblCPF.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCPF.setText("CPF:");
        getContentPane().add(lblCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 495, -1, -1));
        getContentPane().add(edtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 194, 446, 43));

        edtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(edtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 280, 446, 43));
        getContentPane().add(edtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 354, 446, 43));

        btnCadastrar.setBackground(new java.awt.Color(51, 153, 255));
        btnCadastrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseClicked(evt);
            }
        });
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        btnCadastrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCadastrarKeyPressed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 595, 134, 39));

        btnVoltar.setBackground(new java.awt.Color(255, 0, 51));
        btnVoltar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarMouseClicked(evt);
            }
        });
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 595, 134, 39));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtEmailActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarActionPerformed

   
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        URL caminhoImagem = getClass().getResource("/images/logoMercado2.png");

        ImageIcon icon = new ImageIcon(caminhoImagem);

        
        this.setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowOpened

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnVoltarMouseClicked

    private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseClicked
        if (verificarCampos()) {

            gravar();
        }
    }//GEN-LAST:event_btnCadastrarMouseClicked

    private void btnCadastrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCadastrarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
      
      gravar();
    }
    }//GEN-LAST:event_btnCadastrarKeyPressed

    private void edtCpfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtCpfKeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            gravar();
        }
    }//GEN-LAST:event_edtCpfKeyPressed
    
    
    public void gravar() {
      
        Clientes clientes = new Clientes();

        String lSenha = new String(edtSenha.getPassword());
        String lHashSenha = Utils.calcularHash(lSenha);

        clientes.setNome(edtNome.getText());
        clientes.setEmail(edtEmail.getText());
        clientes.setSenha(lHashSenha);
        clientes.setCpf(edtCpf.getText());

        ClienteController controller = new ClienteController();

        if (controller.inserirCliente(clientes)) {
            JOptionPane.showMessageDialog(null,
                    "Usuário gravado com sucesso");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null,
                    "O cadastro não foi gravado");
        }
    }
    
    public boolean verificarCampos() {
       
        if (!edtNome.getText().matches("^[\\p{L} ]+$")) {
            JOptionPane.showMessageDialog(null,
                    "O campo 'Nome' possui formato inválido");
            return false;
        }

        if (!edtEmail.getText().matches("^[a-z0-9._-]+@[a-z0-9._-]+.[a-z._]+$")) {
            JOptionPane.showMessageDialog(null,
                    "O campo 'Email' possui formato inválido");
            return false;
        }

        if (new String(edtSenha.getPassword()).equals("")) {
            JOptionPane.showMessageDialog(null, "O campo 'Senha' em branco");
            return false;
        }

        String lSenha = new String(edtSenha.getPassword());
        String lConfirmaSenha = new String(edtConfirmSenha.getPassword());

        if (!lSenha.equals(lConfirmaSenha)) {
            JOptionPane.showMessageDialog(null, "As senhas não são iguais");
            return false;
        }

        if (lSenha.length() < 6) {
            JOptionPane.showMessageDialog(null,
                    "O campo 'Senha' deve ter mais de 6 caracteres");
            return false;
        }

        if (!edtCpf.getText().matches("^[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}")) {//a-
            JOptionPane.showMessageDialog(null,
                    "O campo 'Nome' possui formato inválido");
            return false;
        }

        return true;
    }

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
            java.util.logging.Logger.getLogger(FrCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrCadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPasswordField edtConfirmSenha;
    private javax.swing.JTextField edtCpf;
    private javax.swing.JTextField edtEmail;
    private javax.swing.JTextField edtNome;
    private javax.swing.JPasswordField edtSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblConfirmSenha;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    // End of variables declaration//GEN-END:variables
}
