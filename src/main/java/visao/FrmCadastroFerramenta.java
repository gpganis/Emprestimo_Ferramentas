package visao;

import javax.swing.JOptionPane;
import modelo.Ferramenta;

public class FrmCadastroFerramenta extends javax.swing.JFrame {

    private boolean countNome = true, countMarca = true, countCusto = true;
    private Ferramenta objFerramenta;

    public FrmCadastroFerramenta() {
        initComponents();
        this.objFerramenta = new Ferramenta();
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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Ferramentas");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTFFerramentaMarca.setBackground(new java.awt.Color(255, 255, 255));
        JTFFerramentaMarca.setForeground(new java.awt.Color(255, 49, 49));
        JTFFerramentaMarca.setText("Digite o Nome da Marca");
        JTFFerramentaMarca.setBorder(null);
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
        getContentPane().add(JTFFerramentaMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 206, 300, 20));

        JLTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLTitulo.setForeground(new java.awt.Color(255, 255, 255));
        JLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLTitulo.setText("Cadastro de Ferramentas");
        getContentPane().add(JLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 320, -1));

        JLCustoAquisicao.setForeground(new java.awt.Color(255, 255, 255));
        JLCustoAquisicao.setText("Custo da Aquisição:");
        getContentPane().add(JLCustoAquisicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 115, -1));

        JTFFerramentaCusto.setBackground(new java.awt.Color(255, 255, 255));
        JTFFerramentaCusto.setForeground(new java.awt.Color(255, 49, 49));
        JTFFerramentaCusto.setText("Digite o Preço da Ferramenta");
        JTFFerramentaCusto.setBorder(null);
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
        getContentPane().add(JTFFerramentaCusto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 290, 30));

        JBCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        getContentPane().add(JBCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 140, 40));

        JBCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        getContentPane().add(JBCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 140, 40));

        JLNome.setForeground(new java.awt.Color(255, 255, 255));
        JLNome.setText("Nome:");
        getContentPane().add(JLNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 50, 30));

        JTFFerramentaNome.setBackground(new java.awt.Color(255, 255, 255));
        JTFFerramentaNome.setForeground(new java.awt.Color(255, 49, 49));
        JTFFerramentaNome.setText("Digite o Nome da Ferramenta");
        JTFFerramentaNome.setBorder(null);
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
        getContentPane().add(JTFFerramentaNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 300, -1));

        JLMarca.setForeground(new java.awt.Color(255, 255, 255));
        JLMarca.setText("Marca:");
        getContentPane().add(JLMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 176, 59, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Cadastro_Ferramentas.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(414, 440));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JTFFerramentaMarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFFerramentaMarcaMouseClicked
        if (countMarca == true) {
            JTFFerramentaMarca.setText("");
            countMarca = false;
        }
    }//GEN-LAST:event_JTFFerramentaMarcaMouseClicked

    private void JTFFerramentaMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFFerramentaMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFFerramentaMarcaActionPerformed

    private void JTFFerramentaMarcaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFFerramentaMarcaKeyPressed
        // TODO add your handling code here: 
        if (countMarca == true) {
            JTFFerramentaMarca.setText("");
            countMarca = false;
        }
    }//GEN-LAST:event_JTFFerramentaMarcaKeyPressed

    private void JTFFerramentaCustoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFFerramentaCustoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFFerramentaCustoFocusLost

    private void JTFFerramentaCustoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFFerramentaCustoMouseClicked
        // TODO add your handling code here:    
        if (countCusto == true) {
            JTFFerramentaCusto.setText("");
            countCusto = false;
        }
    }//GEN-LAST:event_JTFFerramentaCustoMouseClicked

    private void JTFFerramentaCustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFFerramentaCustoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFFerramentaCustoActionPerformed

    private void JTFFerramentaCustoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFFerramentaCustoKeyPressed
        // TODO add your handling code here:    
        if (countCusto == true) {
            JTFFerramentaCusto.setText("");
            countCusto = false;
        }
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

            if (Double.parseDouble(this.JTFFerramentaCusto.getText()) <= 0) {
                throw new Mensagens("Custo da Aquisição deve ser maior que zero.");
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
        if (countNome == true) {
            JTFFerramentaNome.setText("");
            countNome = false;
        }
    }//GEN-LAST:event_JTFFerramentaNomeMouseClicked

    private void JTFFerramentaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFFerramentaNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFFerramentaNomeActionPerformed

    private void JTFFerramentaNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFFerramentaNomeKeyPressed
        // TODO add your handling code here:            
        if (countNome == true) {
            JTFFerramentaNome.setText("");
            countNome = false;
        }
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
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
