package visao;

import dao.ConexaoDAO;
import dao.EmprestimoDAO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Emprestimo;

public class FrmRelatorioEmprestimo extends javax.swing.JFrame {

    private ConexaoDAO connect;
    private EmprestimoDAO dao = new EmprestimoDAO();
    private Emprestimo objEmprestimo = new Emprestimo();

    public FrmRelatorioEmprestimo() {
        initComponents();
        carregaTabelaEmprestimos();
    }

    public void carregaTabelaEmprestimos() {
        DefaultTableModel modelo = (DefaultTableModel) this.jTable.getModel();
        modelo.setNumRows(0);
        for (Emprestimo a : dao.getMinhaLista()) {
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

        JBCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        JBApagar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro Geral de Empréstimos");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBCancelar.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        JBCancelar.setForeground(new java.awt.Color(255, 19, 19));
        JBCancelar.setText("Fechar");
        JBCancelar.setBorder(null);
        JBCancelar.setContentAreaFilled(false);
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(JBCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 419, 150, 30));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 440, 350));

        JBApagar.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        JBApagar.setForeground(new java.awt.Color(255, 49, 49));
        JBApagar.setText("Apagar");
        JBApagar.setBorder(null);
        JBApagar.setContentAreaFilled(false);
        JBApagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBApagar.setDefaultCapable(false);
        JBApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBApagarActionPerformed(evt);
            }
        });
        getContentPane().add(JBApagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 419, 150, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Registro_Emprestimo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        setSize(new java.awt.Dimension(516, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableMouseClicked

    private void JBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBApagarActionPerformed
        // TODO add your handling code here:
        try {
            int id = 0;
            if (this.jTable.getSelectedRow() == -1) {
                throw new Mensagens(
                        "Primeiro Selecione um Empréstimo para APAGAR");
            } else {
                id = Integer.parseInt(this.jTable.getValueAt(this.jTable.getSelectedRow(), 0).toString());

                boolean Ver = dao.verificarPendencia(id);
                if (Ver == true) {
                    JOptionPane.showMessageDialog(null, "Esse Empréstimo está pendente "
                                                    + "\n   e não pode ser excluido");
                } else {
                    int respostaUsuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja apagar este Empréstimo?");

                    if (respostaUsuario == 0) {
                        if (alterarIdEmpFerramenta(id) && this.objEmprestimo.apagarEmprestimo(id)) {
                            JOptionPane.showMessageDialog(rootPane, "Empréstimo Apagado com Sucesso!");
                        }
                    }
                }
            }
            System.out.println(this.dao.getMinhaLista().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            carregaTabelaEmprestimos();
        }
    }//GEN-LAST:event_JBApagarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRelatorioEmprestimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBApagar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
