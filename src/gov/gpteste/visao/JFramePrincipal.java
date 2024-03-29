/*
 * JFramePrincipal.java
 *
 * Created on May 14, 2009, 4:28 PM
 */

package gov.gpteste.visao;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author  User
 */
public class JFramePrincipal extends javax.swing.JFrame {

    private static JFramePrincipal instance = null;

    public static JFramePrincipal getInstance() {
        if(instance == null) {
            instance = new JFramePrincipal();
        }
        return instance;
    }
    
    // public JProjetoPanel projetoPanelCadastro = new JProjetoPanel();
    public JPanelEquipeConsulta projetoPanelConsulta = new JPanelEquipeConsulta();
    
    /** Creates new form JFramePrincipal */
    public JFramePrincipal() {
        initComponents();
        theDesktop.setSize(800, 600);
        theDesktop.repaint();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        theDesktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenu1 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        mnuItemIncluir = new javax.swing.JMenuItem();
        mnuItemConsultar = new javax.swing.JMenuItem();
        jmnuConsultaEsp = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JMenu1.setText("Cadastro");

        jMenu1.setText("Equipe");

        mnuItemIncluir.setText("Incluir");
        mnuItemIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemIncluirActionPerformed(evt);
            }
        });
        jMenu1.add(mnuItemIncluir);

        mnuItemConsultar.setText("Consultar");
        mnuItemConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemConsultarActionPerformed(evt);
            }
        });
        jMenu1.add(mnuItemConsultar);

        JMenu1.add(jMenu1);

        jMenuBar1.add(JMenu1);

        jmnuConsultaEsp.setText("Consultas Especiais");
        jMenuBar1.add(jmnuConsultaEsp);

        jMenu8.setText("Ajuda");
        jMenu8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu8ActionPerformed(evt);
            }
        });

        jMenuItem7.setText("Sobre o sistema");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem7);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(theDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(theDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void mnuItemIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemIncluirActionPerformed
    // mostrarJanelaCadastro(0, true, projetoPanelConsulta);
    // projetoPanelConsulta.preencheComboCliente();
}//GEN-LAST:event_mnuItemIncluirActionPerformed

public void mostrarJanelaCadastro(int id, boolean incluir, JInternalFrame jiframe)
{
    boolean openWindow = true;
    if(jiframe != null) {
        theDesktop.remove(jiframe);
    }
    if(! incluir)
    {
//        if(jiframe instanceof JProjetoPanel)
//            openWindow = ((JProjetoPanel)jiframe).preencheCampos(id);
//        else if (jiframe instanceof JClientePanel)
//            openWindow = ((JClientePanel)jiframe).preencheCampos(id);
//        else if (jiframe instanceof JFuncionarioPanel)
//            openWindow = ((JFuncionarioPanel)jiframe).preencheCampos(id);
//        else if (jiframe instanceof JAtividadePanel)
//            openWindow = ((JAtividadePanel)jiframe).preencheCampos(id);
    }
    if(openWindow) {
        theDesktop.add(jiframe);
        theDesktop.moveToFront(jiframe);
        jiframe.setVisible(true);
    }
}

public void mostrarJanelaConsulta(JInternalFrame jiframe)
{
    if(jiframe != null) {
        theDesktop.remove(jiframe);
    }
    if(jiframe instanceof JPanelEquipeConsulta) {
        ((JPanelEquipeConsulta)jiframe).preencheTabela();
    }

    theDesktop.add(jiframe);
    theDesktop.moveToFront(jiframe);
    jiframe.setVisible(true);
}
    
private void mnuItemConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemConsultarActionPerformed
    mostrarJanelaConsulta(projetoPanelConsulta);
}//GEN-LAST:event_mnuItemConsultarActionPerformed

private void jMenu8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu8ActionPerformed

}//GEN-LAST:event_jMenu8ActionPerformed

private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        JOptionPane alert = new JOptionPane();
    alert.showMessageDialog (null, "TODO: Criar uma janela com o help do sistema");
}//GEN-LAST:event_jMenuItem7ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMenu1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenu jmnuConsultaEsp;
    private javax.swing.JMenuItem mnuItemConsultar;
    private javax.swing.JMenuItem mnuItemIncluir;
    private javax.swing.JDesktopPane theDesktop;
    // End of variables declaration//GEN-END:variables

}
