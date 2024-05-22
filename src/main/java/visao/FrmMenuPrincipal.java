package visao;

public class FrmMenuPrincipal extends javax.swing.JFrame {

    public FrmMenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBSair = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMEmprestimo = new javax.swing.JMenu();
        CadastroAmigo = new javax.swing.JMenuItem();
        CadastroFerramenta = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        RelatorioAmigos = new javax.swing.JMenuItem();
        RelatorioFerramentas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        JBSair.setText("Sair");
        JBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSairActionPerformed(evt);
            }
        });

        JMEmprestimo.setText("Cadastros");
        JMEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMEmprestimoActionPerformed(evt);
            }
        });

        CadastroAmigo.setText("Amigo");
        CadastroAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroAmigoActionPerformed(evt);
            }
        });
        JMEmprestimo.add(CadastroAmigo);

        CadastroFerramenta.setText("Ferramenta");
        CadastroFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroFerramentaActionPerformed(evt);
            }
        });
        JMEmprestimo.add(CadastroFerramenta);

        jMenuItem1.setText("Empréstimo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        JMEmprestimo.add(jMenuItem1);

        jMenuBar1.add(JMEmprestimo);

        jMenu2.setText("Relatórios");

        RelatorioAmigos.setText("Amigos");
        RelatorioAmigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelatorioAmigosActionPerformed(evt);
            }
        });
        jMenu2.add(RelatorioAmigos);

        RelatorioFerramentas.setText("Ferramentas");
        RelatorioFerramentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelatorioFerramentasActionPerformed(evt);
            }
        });
        jMenu2.add(RelatorioFerramentas);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(JBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addComponent(JBSair)
                .addGap(50, 50, 50))
        );

        setSize(new java.awt.Dimension(314, 307));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_JBSairActionPerformed

    private void CadastroAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroAmigoActionPerformed
        // TODO add your handling code here:
        FrmCadastroAmigo objTela = new FrmCadastroAmigo();
        objTela.setVisible(true);
    }//GEN-LAST:event_CadastroAmigoActionPerformed

    private void JMEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMEmprestimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JMEmprestimoActionPerformed

    private void CadastroFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroFerramentaActionPerformed
        // TODO add your handling code here:
        FrmCadastroFerramenta objTela = new FrmCadastroFerramenta();
        objTela.setVisible(true);
    }//GEN-LAST:event_CadastroFerramentaActionPerformed

    private void RelatorioAmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelatorioAmigosActionPerformed
        // TODO add your handling code here:
        FrmRelatorioAmigo objTela = new FrmRelatorioAmigo();
        objTela.setVisible(true);
    }//GEN-LAST:event_RelatorioAmigosActionPerformed

    private void RelatorioFerramentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelatorioFerramentasActionPerformed
        // TODO add your handling code here:
        FrmRelatorioFerramenta objTela = new FrmRelatorioFerramenta();
        objTela.setVisible(true);
    }//GEN-LAST:event_RelatorioFerramentasActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        FrmCadastroEmprestimo objTela = new FrmCadastroEmprestimo();
        objTela.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
    private javax.swing.JButton JBSair;
    private javax.swing.JMenu JMEmprestimo;
    private javax.swing.JMenuItem RelatorioAmigos;
    private javax.swing.JMenuItem RelatorioFerramentas;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
