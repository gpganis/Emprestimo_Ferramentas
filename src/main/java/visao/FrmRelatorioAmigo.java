package visao;

import dao.AmigoDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Amigo;

public class FrmRelatorioAmigo extends javax.swing.JFrame {

    private AmigoDAO dao = new AmigoDAO();
    private Amigo objAmigo = new Amigo();

    public FrmRelatorioAmigo() {
        initComponents();
        carregaTabelaAmigos();
    }

    public void carregaTabelaAmigos() {
        DefaultTableModel modelo = (DefaultTableModel) this.jTable.getModel();
        modelo.setNumRows(0);
        for (Amigo a : dao.getMinhaLista()) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome(),
                a.getTelefone(),});
        }
        jTable.getColumn("ID").setPreferredWidth(37);
        jTable.getColumn("Nome").setPreferredWidth(200);
        jTable.getColumn("Telefone").setPreferredWidth(200);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        JTFNome = new javax.swing.JTextField();
        JTFTelefone = new javax.swing.JTextField();
        JBCancelar = new javax.swing.JButton();
        JBAlterar = new javax.swing.JButton();
        JBApagar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório de Amigos");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 19, 19));
        jLabel1.setText("    Nome:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 281, 60, 20));

        jLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel.setForeground(new java.awt.Color(255, 19, 19));
        jLabel.setText("Telefone:");
        getContentPane().add(jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 322, 60, 30));

        JTFNome.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        JTFNome.setForeground(new java.awt.Color(255, 49, 49));
        JTFNome.setBorder(null);
        getContentPane().add(JTFNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 283, 300, 20));

        JTFTelefone.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        JTFTelefone.setForeground(new java.awt.Color(255, 49, 49));
        JTFTelefone.setAlignmentY(0.25F);
        JTFTelefone.setBorder(null);
        JTFTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(JTFTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 328, 300, -1));

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
        getContentPane().add(JBCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 385, 100, 40));

        JBAlterar.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        JBAlterar.setForeground(new java.awt.Color(255, 49, 49));
        JBAlterar.setText("Alterar");
        JBAlterar.setBorder(null);
        JBAlterar.setContentAreaFilled(false);
        JBAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(JBAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 385, 100, 40));

        JBApagar.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        JBApagar.setForeground(new java.awt.Color(255, 49, 49));
        JBApagar.setText("Apagar");
        JBApagar.setBorder(null);
        JBApagar.setContentAreaFilled(false);
        JBApagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBApagarActionPerformed(evt);
            }
        });
        getContentPane().add(JBApagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 385, 100, 40));

        jTable.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Telefone"
            }
        ));
        jTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable.setShowGrid(true);
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 440, 210));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Relatorio_Amigo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        setSize(new java.awt.Dimension(514, 507));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JTFTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFTelefoneActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterarActionPerformed
        // TODO add your handling code here:
        try {
            int id = 0;
            String nome, telefone = "";
            String regex = "\\(\\d{2}\\)\\d{5}-\\d{4}";
            
            if (this.jTable.getSelectedRow() == -1) {
                throw new Mensagem(
                        "Primeiro Selecione um Amigo para ALTERAR");
            } else {
                id = Integer.parseInt(this.jTable.
                        getValueAt(this.jTable.getSelectedRow(), 0).
                        toString());
            }

            if (this.JTFNome.getText().length() < 2) {
                throw new Mensagem("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.JTFNome.getText();
            }
                     
            if (this.JTFTelefone.getText().matches(regex)) {
                telefone = this.JTFTelefone.getText();
            } else {
                throw new Mensagem("Telefone deve conter o seguinte formato: "
                                + "\n             (XX)XXXXX-XXXX");
            }

            if (this.objAmigo.alterarAmigo(id, nome, telefone)) {
                this.JTFNome.setText("");
                this.JTFTelefone.setText("");
                JOptionPane.showMessageDialog(rootPane, "Amigo Alterado com Sucesso!");
            }
            System.out.println(this.dao.getMinhaLista().toString());
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número válido.");
        } finally {
            carregaTabelaAmigos();
        }
    }//GEN-LAST:event_JBAlterarActionPerformed

    private void JBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBApagarActionPerformed
        // TODO add your handling code here:
        try {
            int id = 0;

            if (this.jTable.getSelectedRow() == -1) {
                throw new Mensagem(
                        "Primeiro Selecione um Amigo para APAGAR");
            } else {
                id = Integer.parseInt(this.jTable.getValueAt(this.jTable.getSelectedRow(), 0).toString());

                boolean Ver = dao.verificarPendencia(id);
                if (Ver == true) {
                    JOptionPane.showMessageDialog(null, "Primeiro exclua os empréstimos "
                                                    + "\n  cadastrado para esse amigo");
                    return;
                } else {
                    int respostaUsuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja apagar este Amigo?");

                    if (respostaUsuario == 0) {
                        if (this.objAmigo.apagarAmigo(id)) {
                            this.JTFNome.setText("");
                            this.JTFTelefone.setText("");
                            JOptionPane.showMessageDialog(rootPane, "Amigo Apagado com Sucesso!");
                        }
                    }
                }
            }
            System.out.println(this.dao.getMinhaLista().toString());
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            carregaTabelaAmigos();
        }
    }//GEN-LAST:event_JBApagarActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        // TODO add your handling code here:
        if (this.jTable.getSelectedRow() != -1) {
            String nome = this.jTable.getValueAt(this.jTable.getSelectedRow(), 1).toString();
            String telefone = this.jTable.getValueAt(this.jTable.getSelectedRow(), 2).toString();

            this.JTFNome.setText(nome);
            this.JTFTelefone.setText(telefone);
        }
    }//GEN-LAST:event_jTableMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRelatorioAmigo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAlterar;
    private javax.swing.JButton JBApagar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JTextField JTFTelefone;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
