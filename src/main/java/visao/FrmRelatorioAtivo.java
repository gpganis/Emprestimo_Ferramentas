package visao;

import com.google.protobuf.TextFormat;
import dao.ConexaoDAO;
import dao.EmprestimoDAO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Emprestimo;
import modelo.Util;

public class FrmRelatorioAtivo extends javax.swing.JFrame {

    private ConexaoDAO connect;
    private Emprestimo objEmprestimo = new Emprestimo();
    private EmprestimoDAO dao = new EmprestimoDAO();

    public FrmRelatorioAtivo() {
        initComponents();
        carregaTabelaEmprestimos();
    }

    public void carregaTabelaEmprestimos() {
        DefaultTableModel modelo = (DefaultTableModel) this.jTable.getModel();
        modelo.setNumRows(0);
        for (Emprestimo a : dao.getEmprestimosAtivos()) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getIdAmg(),
                a.getDataEmprestimo(),
                a.getDataDevolucao(),
                a.isEntregue()});
        }
        jTable.getColumn("ID").setPreferredWidth(50);
        jTable.getColumn("ID_Amg").setPreferredWidth(50);
        jTable.getColumn("Data_Empréstimo").setPreferredWidth(140);
        jTable.getColumn("Data_Devolução").setPreferredWidth(140);
        jTable.getColumn("Entregue").setPreferredWidth(57);
    }

    public boolean alterarIdEmpFerramenta(int id) {
        String sql = "UPDATE tb_ferramentas SET id_emprestimo = null WHERE id_emprestimo = ?";
        try {
            PreparedStatement stmt = connect.getConexao().prepareStatement(sql);

            stmt.setInt(1, id);
            stmt.execute();

            stmt.close();

            return true;

        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            throw new RuntimeException(erro);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JCBEntregue = new javax.swing.JCheckBox();
        JTFDataEmp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTFDataDev = new javax.swing.JTextField();
        JBCancelar = new javax.swing.JButton();
        JBAlterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório de Empréstimos Ativos");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JCBEntregue.setBorder(null);
        JCBEntregue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JCBEntregue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBEntregueActionPerformed(evt);
            }
        });
        getContentPane().add(JCBEntregue, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        JTFDataEmp.setEditable(false);
        JTFDataEmp.setBackground(new java.awt.Color(166, 166, 166));
        JTFDataEmp.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        JTFDataEmp.setForeground(new java.awt.Color(255, 255, 255));
        JTFDataEmp.setBorder(null);
        getContentPane().add(JTFDataEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 290, -1));

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Empréstimo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 80, -1));

        JTFDataDev.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        JTFDataDev.setForeground(new java.awt.Color(255, 49, 49));
        JTFDataDev.setBorder(null);
        getContentPane().add(JTFDataDev, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 290, 10));

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
        getContentPane().add(JBCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 410, 120, 30));

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
        getContentPane().add(JBAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 410, 120, 30));

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
                "ID", "ID_Amg", "Data_Empréstimo", "Data_Devolução", "Entregue"
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

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 19, 19));
        jLabel1.setText("Devolução:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 80, 30));

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Clique Aqui Para Confimar Entrega");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 240, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Relatorio_Ativos.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 490));

        setSize(new java.awt.Dimension(514, 527));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JCBEntregueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBEntregueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBEntregueActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterarActionPerformed
        // TODO add your handling code here:
        try {
            int id = 0;
            if (this.jTable.getSelectedRow() == -1) {
                throw new Mensagem(
                        "Primeiro Selecione um Empréstimo para ALTERAR");
            } else {
                id = Integer.parseInt(this.jTable.getValueAt(this.jTable.getSelectedRow(), 0).toString());
            }

            String regex = "\\d{4}-\\d{2}-\\d{2}";
            Date dataDevolucao = null;
            Date dataEmprestimo = Util.stringParaDateSQL(JTFDataEmp.getText());
            boolean Entregue = false;

            if (this.JTFDataDev.getText().matches(regex)) {
                dataDevolucao = Util.stringParaDateSQL(JTFDataDev.getText());
                if (dataDevolucao.before(dataEmprestimo)) {
                    dataDevolucao = null;
                    throw new Mensagem("Data de Devolução não pode ser antes da Data do Empréstimo");

                } else if (dataDevolucao.after(dataEmprestimo)) {
                    dataDevolucao = Util.stringParaDateSQL(JTFDataDev.getText());
                } else {
                    dataDevolucao = null;
                    throw new Mensagem("Data de Devolução não pode ser igual a da Data do Empréstimo");
                }
            } else {
                throw new Mensagem("Data de Devolução deve conter o seguite formato:\nyyyy-MM-dd");
            }
            if (JCBEntregue.isSelected()) {
                int respostaUsuario = JOptionPane.showConfirmDialog(null, "Tem certeza que este Empréstimo foi finalizado?");

                if (respostaUsuario == 0) {
                    if (JCBEntregue.isSelected()) {
                        Entregue = true;
                        alterarIdEmpFerramenta(id);
                    }

                } else {
                    return;
                }
            }

            if (this.objEmprestimo.alterarEmprestimo(dataDevolucao, Entregue, id)) {
                this.JTFDataDev.setText("");
                this.JCBEntregue.setSelected(false);
                JOptionPane.showMessageDialog(rootPane, "Empréstimo Alterado com Sucesso!");
            }
            System.out.println(this.dao.getMinhaLista().toString());
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número válido.");
        } catch (TextFormat.ParseException | ParseException ex) {
            Logger.getLogger(FrmRelatorioEmprestimo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            carregaTabelaEmprestimos();
        }
    }//GEN-LAST:event_JBAlterarActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        // TODO add your handling code here:
        if (this.jTable.getSelectedRow() != -1) {
            String dataDev = this.jTable.getValueAt(this.jTable.getSelectedRow(), 3).toString();
            String dataEmp = this.jTable.getValueAt(this.jTable.getSelectedRow(), 2).toString();

            this.JTFDataDev.setText(dataDev);
            this.JTFDataEmp.setText(dataEmp);
        }
    }//GEN-LAST:event_jTableMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRelatorioAtivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAlterar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JCheckBox JCBEntregue;
    private javax.swing.JTextField JTFDataDev;
    private javax.swing.JTextField JTFDataEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
