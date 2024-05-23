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
            FerSelect = null;

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
        JLTitulo = new javax.swing.JLabel();
        JTFAmigo = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Empréstimos");
        setResizable(false);

        jLabel2.setText("Data do Empréstimo:");

        JTFDataEmp.setEditable(false);

        JCBAmigo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));
        JCBAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBAmigoActionPerformed(evt);
            }
        });

        jLabel3.setText("Data de Devolução:");

        JTFDataDev.setText("yyyy-MM-dd");
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

        JBCadastrar.setText("Cadastrar");
        JBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastrarActionPerformed(evt);
            }
        });

        JBCancelar.setText("Fechar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        JTFFerramenta.setEditable(false);

        jLabel4.setText("Ferramentas:");

        JBAdicionar.setText("Adicionar");
        JBAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAdicionarActionPerformed(evt);
            }
        });

        jLabel1.setText("Amigo:");

        JLTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLTitulo.setText("Cadastro de Empréstimos");

        JTFAmigo.setEditable(false);
        JTFAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFAmigoActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(JTFFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JBAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(JLTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JTFDataEmp)
                            .addComponent(JTFAmigo)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JCBAmigo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(JTFDataDev)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(20, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(JBCadastrar)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(JLTitulo)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JCBAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBAdicionar))
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFDataEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFDataDev, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCancelar)
                    .addComponent(JBCadastrar))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(388, 556));
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
            }

            if (FerSelect.size() == 0) {
                throw new Mensagens("""
                    Primeiro selecione pelo menos uma Ferramenta
                    """);
                }

                if (this.JTFDataDev.getText().matches(regex)) {
                    dataDevolucao = Util.stringParaDateSQL(JTFDataDev.getText());

                } else {
                    throw new Mensagens("""
                        Data de Devolução deve conter o seguite formato:
                        yyyy-MM-dd
                        """);
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
                }
                carregaTabelaFerramentas();

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
                JOptionPane.showMessageDialog(null,"Ferramenta adicionada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null,"Essa Ferramenta já foi adicionada!");
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
    private javax.swing.JLabel JLTitulo;
    private javax.swing.JTextField JTFAmigo;
    private javax.swing.JTextField JTFDataDev;
    private javax.swing.JTextField JTFDataEmp;
    private javax.swing.JTextField JTFFerramenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
