package visao;

import javax.swing.JOptionPane;
import modelo.Amigo;
import modelo.Util;

public class FrmCadastroAmigo extends javax.swing.JFrame {

    private boolean countNome = true, countTelefone = true;
    private Amigo objAmigos;

    public FrmCadastroAmigo() {
        initComponents();
        this.objAmigos = new Amigo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLTelefone = new javax.swing.JLabel();
        JTFAmigoTelefone = new javax.swing.JTextField();
        JBCancelar = new javax.swing.JButton();
        JBCadastrar = new javax.swing.JButton();
        JLNome = new javax.swing.JLabel();
        JTFAmigoNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Amigos");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLTelefone.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        JLTelefone.setForeground(new java.awt.Color(255, 255, 255));
        JLTelefone.setText("Telefone:");
        getContentPane().add(JLTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 70, 40));

        JTFAmigoTelefone.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        JTFAmigoTelefone.setForeground(new java.awt.Color(255, 49, 49));
        JTFAmigoTelefone.setText("Digite o Telefone do Amigo");
        JTFAmigoTelefone.setBorder(null);
        JTFAmigoTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JTFAmigoTelefoneFocusGained(evt);
            }
        });
        JTFAmigoTelefone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTFAmigoTelefoneMouseClicked(evt);
            }
        });
        JTFAmigoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFAmigoTelefoneActionPerformed(evt);
            }
        });
        JTFAmigoTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFAmigoTelefoneKeyPressed(evt);
            }
        });
        getContentPane().add(JTFAmigoTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 141, 280, 20));

        JBCancelar.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        JBCancelar.setForeground(new java.awt.Color(255, 49, 49));
        JBCancelar.setText("Fechar");
        JBCancelar.setBorder(null);
        JBCancelar.setContentAreaFilled(false);
        JBCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(JBCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 218, 140, 40));

        JBCadastrar.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        JBCadastrar.setForeground(new java.awt.Color(255, 49, 49));
        JBCadastrar.setText("Cadastrar");
        JBCadastrar.setBorder(null);
        JBCadastrar.setContentAreaFilled(false);
        JBCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(JBCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 218, 130, 40));

        JLNome.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        JLNome.setForeground(new java.awt.Color(255, 255, 255));
        JLNome.setText("Nome:");
        getContentPane().add(JLNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 50, 20));

        JTFAmigoNome.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        JTFAmigoNome.setForeground(new java.awt.Color(255, 49, 49));
        JTFAmigoNome.setText("Digite o Nome do Amigo");
        JTFAmigoNome.setBorder(null);
        JTFAmigoNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JTFAmigoNomeFocusGained(evt);
            }
        });
        JTFAmigoNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTFAmigoNomeMouseClicked(evt);
            }
        });
        JTFAmigoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFAmigoNomeActionPerformed(evt);
            }
        });
        JTFAmigoNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFAmigoNomeKeyPressed(evt);
            }
        });
        getContentPane().add(JTFAmigoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 52, 280, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Cadastro_Amigo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        setSize(new java.awt.Dimension(414, 337));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JTFAmigoTelefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFAmigoTelefoneFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFAmigoTelefoneFocusGained

    private void JTFAmigoTelefoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFAmigoTelefoneMouseClicked
        // TODO add your handling code here:
        if (countTelefone == true) {
            JTFAmigoTelefone.setText("");
            countTelefone = false;
        }
    }//GEN-LAST:event_JTFAmigoTelefoneMouseClicked

    private void JTFAmigoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFAmigoTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFAmigoTelefoneActionPerformed

    private void JTFAmigoTelefoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFAmigoTelefoneKeyPressed
        // TODO add your handling code here:
        if (countTelefone == true) {
            JTFAmigoTelefone.setText("");
            countTelefone = false;
        }
    }//GEN-LAST:event_JTFAmigoTelefoneKeyPressed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastrarActionPerformed
        // TODO add your handling code here:
        try {
            String nome, telefone = "";

            if ("Digite o Nome do Amigo".equals(JTFAmigoNome.getText())) {
                throw new Mensagem("Primeiro escreva o nome do Amigo.");
            }

            if (this.JTFAmigoNome.getText().length() < 2) {
                throw new Mensagem("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.JTFAmigoNome.getText();
            }
            if (this.JTFAmigoTelefone.getText().length() == 11 && Long.parseLong(this.JTFAmigoTelefone.getText()) > 0) {
                telefone = Util.formatarNumero(this.JTFAmigoTelefone.getText());
            } else {
                throw new Mensagem("Telefone deve conter exatamente 11 digitos numéricos");
            }

            if (this.objAmigos.inserirAmigo(nome, telefone)) {
                JOptionPane.showMessageDialog(rootPane, "Amigo Cadastrado com Sucesso!");
                this.JTFAmigoNome.setText("");
                this.JTFAmigoTelefone.setText("");

            }
            System.out.println(this.objAmigos.getListaAmigos().toString());
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número válido.");
        }
    }//GEN-LAST:event_JBCadastrarActionPerformed

    private void JTFAmigoNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFAmigoNomeFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFAmigoNomeFocusGained

    private void JTFAmigoNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFAmigoNomeMouseClicked
        // TODO add your handling code here:
        if (countNome == true) {
            JTFAmigoNome.setText("");
            countNome = false;
        }
    }//GEN-LAST:event_JTFAmigoNomeMouseClicked

    private void JTFAmigoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFAmigoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFAmigoNomeActionPerformed

    private void JTFAmigoNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFAmigoNomeKeyPressed
        // TODO add your handling code here:
        if (countNome == true) {
            JTFAmigoNome.setText("");
            countNome = false;
        }
    }//GEN-LAST:event_JTFAmigoNomeKeyPressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastroAmigo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCadastrar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JLabel JLNome;
    private javax.swing.JLabel JLTelefone;
    private javax.swing.JTextField JTFAmigoNome;
    private javax.swing.JTextField JTFAmigoTelefone;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
