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

    private Ferramenta objFerramenta = new Ferramenta();
    private FerramentaDAO dao = new FerramentaDAO();

    public FrmRelatorioFerramenta() {
        initComponents();
        carregaTabelaFerramentas();
        JTFValorTotal.setText("R$" + valorTotal());
    }

    public void carregaTabelaFerramentas() {
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
    }
    
    public String valorTotal() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório de Ferramentas");
        setResizable(false);

        JTFMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFMarcaActionPerformed(evt);
            }
        });

        JBCancelar.setText("Fechar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        JBAlterar.setText("Alterar");
        JBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAlterarActionPerformed(evt);
            }
        });

        JBApagar.setText("Apagar");
        JBApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBApagarActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "ID Emprestimo", "Nome", "Marca", "Custo Aquisição"
            }
        ));
        jTable.setShowGrid(true);
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        jLabel2.setText("Custo Aquisição:");

        jLabel1.setText("Nome:");

        jLabel.setText("Marca:");

        jLabel3.setText("Gasto Total:");

        JTFValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFValorTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(JBCancelar)
                                .addGap(40, 40, 40)
                                .addComponent(JBAlterar)
                                .addGap(40, 40, 40)
                                .addComponent(JBApagar)
                                .addGap(71, 71, 71))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFCusto))
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTFMarca)
                                    .addComponent(JTFNome))))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTFValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel)
                    .addComponent(JTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTFCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBApagar)
                    .addComponent(JBAlterar)
                    .addComponent(JBCancelar))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(512, 421));
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
                throw new Mensagens(
                        "Primeiro Selecione uma Ferramenta para ALTERAR");
            } else {
                id = Integer.parseInt(this.jTable.
                        getValueAt(this.jTable.getSelectedRow(), 0).
                        toString());
            }
            
            if (this.JTFNome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.JTFNome.getText();
            }

            if (this.JTFMarca.getText().length() < 2) {
                throw new Mensagens("Marca deve conter ao menos 2 caracteres.");
            } else {
                marca = this.JTFMarca.getText();
            }

            if (Double.parseDouble(this.JTFCusto.getText()) <= 0) {
                throw new Mensagens("Custo da Aquisição deve ser maior que zero.");
            } else {
                custoAquisicao = Double.parseDouble(this.JTFCusto.getText());
            }

            if (this.objFerramenta.alterarFerramenta(id, nome, marca, custoAquisicao)) {
                this.JTFNome.setText("");
                this.JTFMarca.setText("");
                this.JTFCusto.setText("");
                JOptionPane.showMessageDialog(rootPane, "Ferramenta Alterada com Sucesso!");
            }
            // System.out.println(this.dao.getMinhaLista().toString());
        } catch (Mensagens erro) {
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
                throw new Mensagens(
                        "Primeiro Selecione uma Ferramenta para APAGAR");
            } else {
                id = Integer.parseInt(this.jTable.
                        getValueAt(this.jTable.getSelectedRow(), 0).
                        toString());
            }
            int respostaUsuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja apagar esta Ferramenta?");

            if (respostaUsuario == 0) {
                if (this.objFerramenta.apagarFerramenta(id)) {
                    this.JTFNome.setText("");
                    this.JTFMarca.setText("");
                    this.JTFCusto.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Ferramenta Apagada com Sucesso!");
                }
            }
            // System.out.println(this.dao.getMinhaLista().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            carregaTabelaFerramentas();
        }

    }//GEN-LAST:event_JBApagarActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        // TODO add your handling code here: 
        if (this.jTable.getSelectedRow() != -1) {
            String nome = this.jTable.getValueAt(this.jTable.getSelectedRow(), 1).toString();
            String marca = this.jTable.getValueAt(this.jTable.getSelectedRow(), 2).toString();
            String custoAquisicao = this.jTable.getValueAt(this.jTable.getSelectedRow(), 3).toString();

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
