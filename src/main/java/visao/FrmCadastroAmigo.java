package visao;

import javax.swing.JOptionPane;
import modelo.Amigo;

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
        JLTitulo = new javax.swing.JLabel();
        JBCancelar = new javax.swing.JButton();
        JBCadastrar = new javax.swing.JButton();
        JLNome = new javax.swing.JLabel();
        JTFAmigoNome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Amigos");
        setResizable(false);

        JLTelefone.setText("Telefone:");

        JTFAmigoTelefone.setText("Digite o Telefone do Amigo");
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

        JLTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLTitulo.setText("Cadastro de Amigos");

        JBCancelar.setText("Fechar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        JBCadastrar.setText("Cadastrar");
        JBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastrarActionPerformed(evt);
            }
        });

        JLNome.setText("Nome:");

        JTFAmigoNome.setText("Digite o Nome do Amigo");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(JBCadastrar)
                        .addGap(80, 80, 80))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JLNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFAmigoNome)
                            .addComponent(JLTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFAmigoTelefone)
                            .addComponent(JLTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(JLTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(JLNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFAmigoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(JLTelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFAmigoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCadastrar)
                    .addComponent(JBCancelar))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(376, 283));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JTFAmigoTelefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFAmigoTelefoneFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFAmigoTelefoneFocusGained

    private void JTFAmigoTelefoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFAmigoTelefoneMouseClicked
        // TODO add your handling code here:
        if (countTelefone == true){
            JTFAmigoTelefone.setText("");
            countTelefone = false;
        }
    }//GEN-LAST:event_JTFAmigoTelefoneMouseClicked

    private void JTFAmigoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFAmigoTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFAmigoTelefoneActionPerformed

    private void JTFAmigoTelefoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFAmigoTelefoneKeyPressed
        // TODO add your handling code here:
        if (countTelefone == true){
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
            
            if (this.JTFAmigoNome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.JTFAmigoNome.getText();
            }
            if (this.JTFAmigoTelefone.getText().length() == 11 && Long.parseLong(this.JTFAmigoTelefone.getText()) > 0) {
                telefone = this.JTFAmigoTelefone.getText();
            } else {             
                throw new Mensagens("Telefone deve conter somente 11 números");
            }

            if (this.objAmigos.inserirAmigo(nome, telefone)) {
                JOptionPane.showMessageDialog(rootPane, "Amigo Cadastrado com Sucesso!");
                this.JTFAmigoNome.setText("");
                this.JTFAmigoTelefone.setText("");

            }
            System.out.println(this.objAmigos.getListaAmigos().toString());
        } catch (Mensagens erro) {
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
        if (countNome == true){
            JTFAmigoNome.setText("");
            countNome = false;
        }
    }//GEN-LAST:event_JTFAmigoNomeMouseClicked

    private void JTFAmigoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFAmigoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFAmigoNomeActionPerformed

    private void JTFAmigoNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFAmigoNomeKeyPressed
        // TODO add your handling code here:
        if (countNome == true){
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
    private javax.swing.JLabel JLTitulo;
    private javax.swing.JTextField JTFAmigoNome;
    private javax.swing.JTextField JTFAmigoTelefone;
    // End of variables declaration//GEN-END:variables
}
