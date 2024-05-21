package visao;

import javax.swing.JOptionPane;
import modelo.Ferramenta;

public class FrmCadastroFerramenta extends javax.swing.JFrame {

    private Ferramenta objFerramenta;

    public FrmCadastroFerramenta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTFFerramentaMarca = new javax.swing.JTextField();
        JLTitulo = new javax.swing.JLabel();
        JLCustoAquisicao = new javax.swing.JLabel();
        JTFFerramentaCusto = new javax.swing.JTextField();
        JBCancelar = new javax.swing.JButton();
        JBCadastrar = new javax.swing.JButton();
        JLNome = new javax.swing.JLabel();
        JTFFerramentaNome = new javax.swing.JTextField();
        JLMarca = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTFFerramentaMarca.setText("Digite o Nome da Marca");
        JTFFerramentaMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTFFerramentaMarcaMouseClicked(evt);
            }
        });
        JTFFerramentaMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFFerramentaMarcaActionPerformed(evt);
            }
        });
        JTFFerramentaMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFFerramentaMarcaKeyPressed(evt);
            }
        });

        JLTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLTitulo.setText("Cadastro de Ferramentas");

        JLCustoAquisicao.setText("Custo da Aquisição:");

        JTFFerramentaCusto.setText("Digite o Preço da Ferramenta");
        JTFFerramentaCusto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTFFerramentaCustoFocusLost(evt);
            }
        });
        JTFFerramentaCusto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTFFerramentaCustoMouseClicked(evt);
            }
        });
        JTFFerramentaCusto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFFerramentaCustoActionPerformed(evt);
            }
        });
        JTFFerramentaCusto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFFerramentaCustoKeyPressed(evt);
            }
        });

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

        JTFFerramentaNome.setText("Digite o Nome da Ferramenta");
        JTFFerramentaNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTFFerramentaNomeMouseClicked(evt);
            }
        });
        JTFFerramentaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFFerramentaNomeActionPerformed(evt);
            }
        });
        JTFFerramentaNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFFerramentaNomeKeyPressed(evt);
            }
        });

        JLMarca.setText("Marca:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTFFerramentaCusto)
                            .addComponent(JLNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFFerramentaNome)
                            .addComponent(JLMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFFerramentaMarca)
                            .addComponent(JLTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addComponent(JLCustoAquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(JBCancelar)
                        .addGap(84, 84, 84)
                        .addComponent(JBCadastrar)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(JLTitulo)
                .addGap(20, 20, 20)
                .addComponent(JLNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFFerramentaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(JLMarca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFFerramentaMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(JLCustoAquisicao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFFerramentaCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCancelar)
                    .addComponent(JBCadastrar))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFFerramentaMarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFFerramentaMarcaMouseClicked

    }//GEN-LAST:event_JTFFerramentaMarcaMouseClicked

    private void JTFFerramentaMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFFerramentaMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFFerramentaMarcaActionPerformed

    private void JTFFerramentaMarcaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFFerramentaMarcaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFFerramentaMarcaKeyPressed

    private void JTFFerramentaCustoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFFerramentaCustoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFFerramentaCustoFocusLost

    private void JTFFerramentaCustoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFFerramentaCustoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFFerramentaCustoMouseClicked

    private void JTFFerramentaCustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFFerramentaCustoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFFerramentaCustoActionPerformed

    private void JTFFerramentaCustoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFFerramentaCustoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFFerramentaCustoKeyPressed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastrarActionPerformed
        // TODO add your handling code here:
                try {
            String nome, marca = "";
            double custoAquisicao = 0.0;
            int id = 0;

            if (this.JTFFerramentaNome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.JTFFerramentaNome.getText();
            }

            if (this.JTFFerramentaMarca.getText().length() < 2) {
                throw new Mensagens("Marca deve conter ao menos 2 caracteres.");
            } else {
                marca = this.JTFFerramentaMarca.getText();
            }

            if (this.JTFFerramentaCusto.getText().length() <= 0) {
                throw new Mensagens("Custo da Aquisicao deve ser maior que zero.");
            } else {
                custoAquisicao = Double.parseDouble(this.JTFFerramentaCusto.getText());
            }

            if (this.objFerramenta.inserirFerramenta(nome, marca, custoAquisicao)) {
                JOptionPane.showMessageDialog(rootPane, "Ferramenta Cadastrada com Sucesso!");
                this.JTFFerramentaNome.setText("");
                this.JTFFerramentaMarca.setText("");
                this.JTFFerramentaCusto.setText("");

            }
            System.out.println(this.objFerramenta.getListaFerramentas().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número válido.");
        }
    }//GEN-LAST:event_JBCadastrarActionPerformed

    private void JTFFerramentaNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFFerramentaNomeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFFerramentaNomeMouseClicked

    private void JTFFerramentaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFFerramentaNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFFerramentaNomeActionPerformed

    private void JTFFerramentaNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFFerramentaNomeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFFerramentaNomeKeyPressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastroFerramenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCadastrar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JLabel JLCustoAquisicao;
    private javax.swing.JLabel JLMarca;
    private javax.swing.JLabel JLNome;
    private javax.swing.JLabel JLTitulo;
    private javax.swing.JTextField JTFFerramentaCusto;
    private javax.swing.JTextField JTFFerramentaMarca;
    private javax.swing.JTextField JTFFerramentaNome;
    // End of variables declaration//GEN-END:variables
}
