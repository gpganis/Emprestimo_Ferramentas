package visao;

public class FrmMenuPrincipal extends javax.swing.JFrame {

    public FrmMenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMEmprestimo = new javax.swing.JMenu();
        CadastroAmigo = new javax.swing.JMenuItem();
        CadastroFerramenta = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        RelatorioAmigos = new javax.swing.JMenuItem();
        RelatorioFerramentas = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setResizable(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menu_Principal.png"))); // NOI18N

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(255, 49, 49));

        JMEmprestimo.setBorder(null);
        JMEmprestimo.setForeground(new java.awt.Color(255, 49, 49));
        JMEmprestimo.setText("Cadastros");
        JMEmprestimo.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N

        CadastroAmigo.setBackground(new java.awt.Color(255, 255, 255));
        CadastroAmigo.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        CadastroAmigo.setForeground(new java.awt.Color(255, 49, 49));
        CadastroAmigo.setText("Amigo");
        CadastroAmigo.setBorder(null);
        CadastroAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroAmigoActionPerformed(evt);
            }
        });
        JMEmprestimo.add(CadastroAmigo);

        CadastroFerramenta.setBackground(new java.awt.Color(255, 255, 255));
        CadastroFerramenta.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        CadastroFerramenta.setForeground(new java.awt.Color(255, 49, 49));
        CadastroFerramenta.setText("Ferramenta");
        CadastroFerramenta.setBorder(null);
        CadastroFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroFerramentaActionPerformed(evt);
            }
        });
        JMEmprestimo.add(CadastroFerramenta);

        jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(255, 49, 49));
        jMenuItem1.setText("Empréstimo");
        jMenuItem1.setBorder(null);
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        JMEmprestimo.add(jMenuItem1);

        jMenuBar1.add(JMEmprestimo);

        jMenu2.setForeground(new java.awt.Color(255, 49, 49));
        jMenu2.setText("Relatórios");
        jMenu2.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N

        RelatorioAmigos.setBackground(new java.awt.Color(255, 255, 255));
        RelatorioAmigos.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        RelatorioAmigos.setForeground(new java.awt.Color(255, 49, 49));
        RelatorioAmigos.setText("Amigos");
        RelatorioAmigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelatorioAmigosActionPerformed(evt);
            }
        });
        jMenu2.add(RelatorioAmigos);

        RelatorioFerramentas.setBackground(new java.awt.Color(255, 255, 255));
        RelatorioFerramentas.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        RelatorioFerramentas.setForeground(new java.awt.Color(255, 49, 49));
        RelatorioFerramentas.setText("Ferramentas");
        RelatorioFerramentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelatorioFerramentasActionPerformed(evt);
            }
        });
        jMenu2.add(RelatorioFerramentas);

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setForeground(new java.awt.Color(255, 49, 49));
        jMenu1.setText("Empréstimos");
        jMenu1.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N

        jMenuItem3.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem3.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(255, 49, 49));
        jMenuItem3.setText("Todos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem2.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem2.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(255, 49, 49));
        jMenuItem2.setText("Ativos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenu2.add(jMenu1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 477, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(514, 507));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CadastroAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroAmigoActionPerformed
        /**
         * TODO add your handling code here:
         */
        FrmCadastroAmigo objTela = new FrmCadastroAmigo();
        objTela.setVisible(true);
    }//GEN-LAST:event_CadastroAmigoActionPerformed

    private void CadastroFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroFerramentaActionPerformed
        /**
         * TODO add your handling code here:
         */
        FrmCadastroFerramenta objTela = new FrmCadastroFerramenta();
        objTela.setVisible(true);
    }//GEN-LAST:event_CadastroFerramentaActionPerformed

    private void RelatorioAmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelatorioAmigosActionPerformed
        /**
         * TODO add your handling code here:
         */
        FrmRelatorioAmigo objTela = new FrmRelatorioAmigo();
        objTela.setVisible(true);
    }//GEN-LAST:event_RelatorioAmigosActionPerformed

    private void RelatorioFerramentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelatorioFerramentasActionPerformed
        /**
         * TODO add your handling code here:
         */
        FrmRelatorioFerramenta objTela = new FrmRelatorioFerramenta();
        objTela.setVisible(true);
    }//GEN-LAST:event_RelatorioFerramentasActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        /**
         * TODO add your handling code here:
         */
        FrmCadastroEmprestimo objTela = new FrmCadastroEmprestimo();
        objTela.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        /**
         * TODO add your handling code here:
         */
        FrmRelatorioEmprestimo objTela = new FrmRelatorioEmprestimo();
        objTela.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        /**
         * TODO add your handling code here:
         */
        FrmRelatorioAtivo objTela = new FrmRelatorioAtivo();
        objTela.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadastroAmigo;
    private javax.swing.JMenuItem CadastroFerramenta;
    private javax.swing.JMenu JMEmprestimo;
    private javax.swing.JMenuItem RelatorioAmigos;
    private javax.swing.JMenuItem RelatorioFerramentas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}
