package visao;

import com.google.protobuf.TextFormat;
import dao.AmigoDAO;
import dao.ConexaoDAO;
import dao.EmprestimoDAO;
import dao.FerramentaDAO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Emprestimo;
import modelo.Ferramenta;
import modelo.Util;

public class FrmCadastroEmprestimo extends javax.swing.JFrame {

    private AmigoDAO daoAmg = new AmigoDAO();
    private FerramentaDAO dao = new FerramentaDAO();
    private EmprestimoDAO daoEmp = new EmprestimoDAO();
    private boolean countData = true;
    private Emprestimo objEmprestimo;
    private ConexaoDAO connect;
    public ArrayList<String> FerSelect = new ArrayList<>();

    public FrmCadastroEmprestimo() {
        initComponents();
        preencherComboBox();
        this.objEmprestimo = new Emprestimo();
        connect = new ConexaoDAO();
        String data = Util.dataAtual().toString();
        JTFDataEmp.setText(data);
        this.carregaTabelaFerramentas();
    }

    private void preencherComboBox() {
        try {
            String query = "SELECT nome FROM tb_amigos";
            PreparedStatement statement = connect.getConexao().prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String nome = resultSet.getString("nome");
                JCBAmigo.addItem(nome);
            }

        } catch (SQLException ex) {
            System.out.println("Erro:" + ex);
            // Lidar com exceções adequadamente
        }
    }

    public void carregaTabelaFerramentas() {
        DefaultTableModel modelo = (DefaultTableModel) this.jTable.getModel();
        modelo.setNumRows(0);
        for (Ferramenta a : dao.getFerramentasDisponiveis()) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome()});
        }
    }

    public boolean alterarIdEmpFerramenta() {
        String sql = "UPDATE tb_ferramentas SET id_emprestimo = ? WHERE id_ferramenta = ?";
        try {
            PreparedStatement stmt = connect.getConexao().prepareStatement(sql);

            for (String id : FerSelect) {
                stmt.setInt(1, daoEmp.maiorId());
                stmt.setInt(2, Integer.parseInt(id));
                stmt.execute();
            }
            FerSelect.clear();

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

        jLabel2 = new javax.swing.JLabel();
        JTFDataEmp = new javax.swing.JTextField();
        JCBAmigo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        JTFDataDev = new javax.swing.JTextField();
        JBCadastrar = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();
        JTFFerramenta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JBAdicionar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JTFAmigo = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Empréstimos");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Data do Empréstimo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, 30));

        JTFDataEmp.setEditable(false);
        JTFDataEmp.setBackground(new java.awt.Color(166, 166, 166));
        JTFDataEmp.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        JTFDataEmp.setForeground(new java.awt.Color(255, 255, 255));
        JTFDataEmp.setBorder(null);
        getContentPane().add(JTFDataEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 280, 20));

        JCBAmigo.setBackground(new java.awt.Color(255, 255, 255));
        JCBAmigo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JCBAmigo.setForeground(new java.awt.Color(255, 19, 19));
        JCBAmigo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));
        JCBAmigo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JCBAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBAmigoActionPerformed(evt);
            }
        });
        getContentPane().add(JCBAmigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 270, 30));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Data de Devolução:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, -1, 20));

        JTFDataDev.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        JTFDataDev.setForeground(new java.awt.Color(255, 49, 49));
        JTFDataDev.setText("yyyy-MM-dd");
        JTFDataDev.setBorder(null);
        JTFDataDev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTFDataDevMouseClicked(evt);
            }
        });
        JTFDataDev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFDataDevActionPerformed(evt);
            }
        });
        JTFDataDev.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFDataDevKeyPressed(evt);
            }
        });
        getContentPane().add(JTFDataDev, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 280, 20));

        JBCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        JBCadastrar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
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
        getContentPane().add(JBCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 580, 130, 30));

        JBCancelar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
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
        getContentPane().add(JBCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 140, 30));

        JTFFerramenta.setEditable(false);
        JTFFerramenta.setBackground(new java.awt.Color(166, 166, 166));
        JTFFerramenta.setForeground(new java.awt.Color(255, 255, 255));
        JTFFerramenta.setBorder(null);
        JTFFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFFerramentaActionPerformed(evt);
            }
        });
        getContentPane().add(JTFFerramenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 170, 20));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ferramentas:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 20));

        JBAdicionar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JBAdicionar.setForeground(new java.awt.Color(255, 49, 49));
        JBAdicionar.setText("Adicionar");
        JBAdicionar.setBorder(null);
        JBAdicionar.setContentAreaFilled(false);
        JBAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(JBAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 110, 40));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Amigo:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 30));

        JTFAmigo.setEditable(false);
        JTFAmigo.setBackground(new java.awt.Color(166, 166, 166));
        JTFAmigo.setForeground(new java.awt.Color(255, 255, 255));
        JTFAmigo.setBorder(null);
        JTFAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFAmigoActionPerformed(evt);
            }
        });
        getContentPane().add(JTFAmigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 300, 30));

        jScrollPane3.setBorder(null);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Ferramenta"
            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 340, 120));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Cadastro_Emprestimo.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 700));

        setSize(new java.awt.Dimension(414, 697));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JCBAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBAmigoActionPerformed
        // TODO add your handling code here
        String nomeSelecionado = (String) JCBAmigo.getSelectedItem();
        JTFAmigo.setText(nomeSelecionado);
    }//GEN-LAST:event_JCBAmigoActionPerformed

    private void JTFDataDevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFDataDevMouseClicked
        // TODO add your handling code here:
        if (countData == true) {
            JTFDataDev.setText("");
            countData = false;
        }
    }//GEN-LAST:event_JTFDataDevMouseClicked

    private void JTFDataDevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFDataDevActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFDataDevActionPerformed

    private void JTFDataDevKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFDataDevKeyPressed
        // TODO add your handling code here:
        if (countData == true) {
            JTFDataDev.setText("");
            countData = false;
        }
    }//GEN-LAST:event_JTFDataDevKeyPressed

    private void JBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastrarActionPerformed
        // TODO add your handling code here:
        try {
            String regex = "\\d{4}-\\d{2}-\\d{2}";
            int idAmg = 0;
            Date dataEmprestimo = Util.dataAtual();
            boolean entregue = false;
            Date dataDevolucao = null;

            if ("".equals(this.JTFAmigo.getText())) {
                throw new Mensagens("Primeiro selecione um Amigo.");
            } else {
                idAmg = AmigoDAO.getIdPeloNome(JTFAmigo.getText());
                boolean Ver = daoAmg.verificarPendencia(idAmg);
                if (Ver == true) {
                    int respostaUsuario = JOptionPane.showConfirmDialog(null, "Esse amigo tem empréstimos pendentes deseja continuar?");

                    if (respostaUsuario != 0) {
                        return;
                    }
                }
            }

            if (FerSelect.size() == 0) {
                throw new Mensagens("Primeiro selecione pelo menos uma Ferramenta");
            }

            if (this.JTFDataDev.getText().matches(regex)) {
                dataDevolucao = Util.stringParaDateSQL(JTFDataDev.getText());
                if (dataDevolucao.before(dataEmprestimo)) {
                    dataDevolucao = null;
                    throw new Mensagens("Data de Devolução não pode ser antes da Data do Empréstimo");

                } else if (dataDevolucao.after(dataEmprestimo)) {
                    dataDevolucao = Util.stringParaDateSQL(JTFDataDev.getText());
                } else {
                    dataDevolucao = null;
                    throw new Mensagens("Data de Devolução não pode ser igual a da Data do Empréstimo");
                }
            } else {
                throw new Mensagens("Data de Devolução deve conter o seguite formato:\nyyyy-MM-dd");
            }

            if (this.objEmprestimo.inserirEmprestimo(dataEmprestimo, dataDevolucao, entregue, idAmg)) {
                JOptionPane.showMessageDialog(rootPane, "Empréstimo Cadastrado com Sucesso!");
                this.JTFAmigo.setText("");
                this.JTFFerramenta.setText("");
                this.JTFDataDev.setText("");

            }

            alterarIdEmpFerramenta();
            //System.out.println(this.objEmprestimo.getListaFerramentas().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (TextFormat.ParseException ex) {
            Logger.getLogger(FrmCadastroEmprestimo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (java.text.ParseException ex) {
            Logger.getLogger(FrmCadastroEmprestimo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            carregaTabelaFerramentas();
        }

    }//GEN-LAST:event_JBCadastrarActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAdicionarActionPerformed
        // TODO add your handling code here:
        if (this.jTable.getSelectedRow() != -1) {
            String id = this.jTable.getValueAt(this.jTable.getSelectedRow(), 0).toString();
            if (!FerSelect.contains(id)) { // Verifica se o número já está na lista
                FerSelect.add(id);
                System.out.println("Selecionados: " + FerSelect);
                JOptionPane.showMessageDialog(null, "Ferramenta adicionada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Essa Ferramenta já foi adicionada!");
            }
        }
    }//GEN-LAST:event_JBAdicionarActionPerformed

    private void JTFAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFAmigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFAmigoActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        // TODO add your handling code here:
        if (this.jTable.getSelectedRow() != -1) {
            String nome = this.jTable.getValueAt(this.jTable.getSelectedRow(), 1).toString();
            this.JTFFerramenta.setText(nome);
        }
    }//GEN-LAST:event_jTableMouseClicked

    private void JTFFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFFerramentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFFerramentaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastroEmprestimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAdicionar;
    private javax.swing.JButton JBCadastrar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JComboBox<String> JCBAmigo;
    private javax.swing.JTextField JTFAmigo;
    private javax.swing.JTextField JTFDataDev;
    private javax.swing.JTextField JTFDataEmp;
    private javax.swing.JTextField JTFFerramenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
