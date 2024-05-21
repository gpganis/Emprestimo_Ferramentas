package visao;

import javax.swing.JOptionPane;
import modelo.Amigo;

public class FrmCadastroAmigo extends javax.swing.JFrame {
    private boolean countNome = true, countTelefone = true;
    private Amigo objAmigos;
    
    public FrmCadastroAmigo() {
        initComponents();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        JLTelefone.setText("Telefone:");

        JTFAmigoTelefone.setText("XX XXXXX XXXX");
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
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JLNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFAmigoNome)
                    .addComponent(JLTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFAmigoTelefone)
                    .addComponent(JLTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(JBCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBCadastrar)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(JLTitulo)
                .addGap(20, 20, 20)
                .addComponent(JLNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFAmigoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(JLTelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFAmigoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCancelar)
                    .addComponent(JBCadastrar))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(414, 320));
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
            String regex = "^\\d{2} 9\\d{4} \\d{4}$";
            String nome, telefone = "";
            int id = 0;
            
            if (this.JTFAmigoNome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.JTFAmigoNome.getText();
            }
            if (this.JTFAmigoTelefone.getText().matches(regex)) {
                telefone = this.JTFAmigoTelefone.getText();
            } else {             
                throw new Mensagens("""
                                    Telefone deve conter o seguite formato: 
                                               XX 9XXXX XXXX
                                    """);
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
