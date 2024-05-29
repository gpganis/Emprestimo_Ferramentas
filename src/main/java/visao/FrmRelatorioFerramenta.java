package visao;

import dao.ConexaoDAO;
import dao.FerramentaDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Ferramenta;

public class FrmRelatorioFerramenta extends javax.swing.JFrame {

    private Ferramenta objFerramenta;
    private FerramentaDAO dao;

    public FrmRelatorioFerramenta() {
        initComponents();
        carregaTabelaFerramentas();
        JTFValorTotal.setText("R$" + valorTotal());
        this.objFerramenta = new Ferramenta();
        this.dao = new FerramentaDAO();
    }

    private void carregaTabelaFerramentas() {
        DefaultTableModel modelo = (DefaultTableModel) this.jTable.getModel();
        modelo.setNumRows(0);
        for (Ferramenta a : dao.getMinhaLista()) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getIdEmp(),
                a.getNome(),
                a.getMarca(),
                a.getCustoAquisicao()});
        }
        jTable.getColumn("ID").setPreferredWidth(40);
        jTable.getColumn("ID_Emp").setPreferredWidth(50);
        jTable.getColumn("Nome").setPreferredWidth(140);
        jTable.getColumn("Marca").setPreferredWidth(140);
        jTable.getColumn("Custo").setPreferredWidth(67);
    }

    private String valorTotal() {
        double soma = 0;

        try {
            String query = "SELECT SUM(custo_aquisicao) FROM tb_ferramentas";
            PreparedStatement statement = ConexaoDAO.getConexao().prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                soma = resultSet.getDouble(1);
            }
        } catch (SQLException ex) {
            System.out.println("Erro:" + ex);
        }
        String format = String.format("%.2f", soma);
        return format;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTFNome = new javax.swing.JTextField();
        JTFMarca = new javax.swing.JTextField();
        JBCancelar = new javax.swing.JButton();
        JBAlterar = new javax.swing.JButton();
        JBApagar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        JTFCusto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTFValorTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório de Ferramentas");
        setBackground(new java.awt.Color(255, 19, 19));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTFNome.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        JTFNome.setForeground(new java.awt.Color(255, 49, 49));
        JTFNome.setBorder(null);
        getContentPane().add(JTFNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 335, 310, 20));

        JTFMarca.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        JTFMarca.setForeground(new java.awt.Color(255, 49, 49));
        JTFMarca.setBorder(null);
        JTFMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFMarcaActionPerformed(evt);
            }
        });
        getContentPane().add(JTFMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 382, 310, 20));

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
        getContentPane().add(JBCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 100, 30));

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
        getContentPane().add(JBAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 100, 30));

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
        getContentPane().add(JBApagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 100, 30));

        jTable.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "ID_Emp", "Nome", "Marca", "Custo"
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 440, 240));

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 19, 19));
        jLabel2.setText("Custo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 421, 50, 30));

        JTFCusto.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        JTFCusto.setForeground(new java.awt.Color(255, 49, 49));
        JTFCusto.setBorder(null);
        getContentPane().add(JTFCusto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 427, 310, 20));

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 19, 19));
        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 334, 50, 20));

        jLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel.setForeground(new java.awt.Color(255, 19, 19));
        jLabel.setText("Marca:");
        getContentPane().add(jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 382, 50, -1));

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gasto Total:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 288, -1, 20));

        JTFValorTotal.setEditable(false);
        JTFValorTotal.setBackground(new java.awt.Color(166, 166, 166));
        JTFValorTotal.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        JTFValorTotal.setForeground(new java.awt.Color(255, 255, 255));
        JTFValorTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        JTFValorTotal.setBorder(null);
        JTFValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFValorTotalActionPerformed(evt);
            }
        });
        getContentPane().add(JTFValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 289, 80, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Relatorio_Ferramenta.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 540));

        setSize(new java.awt.Dimension(514, 577));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JTFMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFMarcaActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterarActionPerformed
        // TODO add your handling code here: 
        try {
            int id = 0;
            String nome, marca = "";
            double custoAquisicao = 0.0;

            if (this.jTable.getSelectedRow() == -1) {
                throw new Mensagem(
                        "Primeiro Selecione uma Ferramenta para ALTERAR");
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

            if (this.JTFMarca.getText().length() < 2) {
                throw new Mensagem("Marca deve conter ao menos 2 caracteres.");
            } else {
                marca = this.JTFMarca.getText();
            }

            if (Double.parseDouble(this.JTFCusto.getText()) <= 0) {
                throw new Mensagem("Custo da Aquisição deve ser maior que zero.");
            } else {
                custoAquisicao = Double.parseDouble(this.JTFCusto.getText());
            }

            if (this.objFerramenta.alterarFerramenta(id, nome, marca, custoAquisicao)) {
                this.JTFNome.setText("");
                this.JTFMarca.setText("");
                this.JTFCusto.setText("");
                JOptionPane.showMessageDialog(rootPane, "Ferramenta Alterada com Sucesso!");
            }
            System.out.println(this.dao.getMinhaLista().toString());
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número válido.");
        } finally {
            carregaTabelaFerramentas();
            JTFValorTotal.setText("R$" + valorTotal());
        }

    }//GEN-LAST:event_JBAlterarActionPerformed

    private void JBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBApagarActionPerformed
        // TODO add your handling code here: 
        try {
            int id = 0;
            if (this.jTable.getSelectedRow() == -1) {
                throw new Mensagem(
                        "Primeiro Selecione uma Ferramenta para APAGAR");
            } else {
                id = Integer.parseInt(this.jTable.getValueAt(this.jTable.getSelectedRow(), 0).toString());

                if (dao.verificarPendencia(id) == true) {
                        JOptionPane.showMessageDialog(null, "Essa Ferramenta está sendo emprestada "
                                                        + "\n     e não pode ser excluida");
                } else {
                    int respostaUsuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja apagar esta Ferramenta?");

                    if (respostaUsuario == 0) {
                        if (this.objFerramenta.apagarFerramenta(id)) {
                            this.JTFNome.setText("");
                            this.JTFMarca.setText("");
                            this.JTFCusto.setText("");
                            JOptionPane.showMessageDialog(rootPane, "Ferramenta Apagada com Sucesso!");
                        }
                    }
                }
            }

            // System.out.println(this.dao.getMinhaLista().toString());
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            carregaTabelaFerramentas();
        }

    }//GEN-LAST:event_JBApagarActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        // TODO add your handling code here: 
        if (this.jTable.getSelectedRow() != -1) {
            String nome = this.jTable.getValueAt(this.jTable.getSelectedRow(), 2).toString();
            String marca = this.jTable.getValueAt(this.jTable.getSelectedRow(), 3).toString();
            String custoAquisicao = this.jTable.getValueAt(this.jTable.getSelectedRow(), 4).toString();

            this.JTFNome.setText(nome);
            this.JTFMarca.setText(marca);
            this.JTFCusto.setText(custoAquisicao);

        }

    }//GEN-LAST:event_jTableMouseClicked

    private void JTFValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFValorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFValorTotalActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRelatorioFerramenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAlterar;
    private javax.swing.JButton JBApagar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JTextField JTFCusto;
    private javax.swing.JTextField JTFMarca;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JTextField JTFValorTotal;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
