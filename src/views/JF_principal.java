/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import comunicacao.Cliente;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import threads.AtualizarListas;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import modelo.DAO;
import modelo.Sala;
import modelo.Usuario;

/**
 *
 * @author adm
 */
public class JF_principal extends javax.swing.JFrame {

    /**
     * Creates new form JF_principal
     */
    
    private static DefaultListModel listaSalas = new DefaultListModel();
    ScheduledThreadPoolExecutor stpe = new ScheduledThreadPoolExecutor(1);
    AtualizarListas atList;
    jF_servidor telaServidor;
    jF_cadUsuario cadUsuarios;
    jF_cadSala cadSalas;
    jF_cliente telaCliente;
    Sala sala;
    private static Usuario usuario;
    
    public String nome;
    
    public JF_principal() {
        initComponents();
        atList = new AtualizarListas("salas",jL_listaSalas);
        stpe.scheduleAtFixedRate(atList, 1, 5, TimeUnit.SECONDS);
        
        jL_listaSalas.addMouseListener(new MouseAdapter() {   
            public void mouseReleased(MouseEvent e) {  
                 int count = e.getClickCount();  

                    String nomeSala = String.valueOf(jL_listaSalas.getSelectedValue());
                    String[] param = nomeSala.split(" ");

                    nomeSala = param[0];
                    sala = DAO.buscarIdSala(nomeSala);
//                    JOptionPane.showMessageDialog(null, DAO.buscarIdSala(nomeSala).getNome());
                    if (count == 2) {  
                        abrirChat(sala, usuario);
                    }  
            }   
            });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jP_principal = new javax.swing.JPanel();
        jL_status = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jL_listaSalas = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jMB_principal = new javax.swing.JMenuBar();
        jM_cadastro = new javax.swing.JMenu();
        jMI_cadastroSala = new javax.swing.JMenuItem();
        jMI_cadastroUsuario = new javax.swing.JMenuItem();
        jMI_cadastroSair = new javax.swing.JMenuItem();
        jM_cliente = new javax.swing.JMenu();
        jMI_clienteUsuario = new javax.swing.JMenuItem();
        jMI_clienteConecta = new javax.swing.JMenuItem();
        jM_desconectaServidor = new javax.swing.JMenu();
        jMI_conectarSevidor = new javax.swing.JMenuItem();
        jMI_desconectarServidor = new javax.swing.JMenuItem();
        jM_sair = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jP_principal.setBackground(new java.awt.Color(255, 255, 255));

        jL_status.setText("Servidor desconectado!");

        jScrollPane1.setViewportView(jL_listaSalas);

        jLabel1.setText("Salas:");

        javax.swing.GroupLayout jP_principalLayout = new javax.swing.GroupLayout(jP_principal);
        jP_principal.setLayout(jP_principalLayout);
        jP_principalLayout.setHorizontalGroup(
            jP_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL_status)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(676, Short.MAX_VALUE))
        );
        jP_principalLayout.setVerticalGroup(
            jP_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_status)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        jDesktopPane1.add(jP_principal);
        jP_principal.setBounds(0, 0, 800, 380);

        jM_cadastro.setMnemonic('C');
        jM_cadastro.setText("Cadastro");

        jMI_cadastroSala.setMnemonic('S');
        jMI_cadastroSala.setText("Sala");
        jMI_cadastroSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_cadastroSalaActionPerformed(evt);
            }
        });
        jM_cadastro.add(jMI_cadastroSala);

        jMI_cadastroUsuario.setMnemonic('U');
        jMI_cadastroUsuario.setText("Usuario");
        jMI_cadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_cadastroUsuarioActionPerformed(evt);
            }
        });
        jM_cadastro.add(jMI_cadastroUsuario);

        jMI_cadastroSair.setMnemonic('r');
        jMI_cadastroSair.setText("Sair");
        jMI_cadastroSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_cadastroSairActionPerformed(evt);
            }
        });
        jM_cadastro.add(jMI_cadastroSair);

        jMB_principal.add(jM_cadastro);

        jM_cliente.setMnemonic('l');
        jM_cliente.setText("Cliente");

        jMI_clienteUsuario.setText("Cadastro de Usuario");
        jM_cliente.add(jMI_clienteUsuario);

        jMI_clienteConecta.setText("Conectar");
        jMI_clienteConecta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_clienteConectaActionPerformed(evt);
            }
        });
        jM_cliente.add(jMI_clienteConecta);

        jMB_principal.add(jM_cliente);

        jM_desconectaServidor.setMnemonic('S');
        jM_desconectaServidor.setText("Servidor");

        jMI_conectarSevidor.setText("Conectar Servidor");
        jMI_conectarSevidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_conectarSevidorActionPerformed(evt);
            }
        });
        jM_desconectaServidor.add(jMI_conectarSevidor);

        jMI_desconectarServidor.setText("Desconectar Servidor");
        jMI_desconectarServidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_desconectarServidorActionPerformed(evt);
            }
        });
        jM_desconectaServidor.add(jMI_desconectarServidor);

        jMB_principal.add(jM_desconectaServidor);

        jM_sair.setMnemonic('r');
        jM_sair.setText("Sair");
        jM_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jM_sairMouseClicked(evt);
            }
        });
        jM_sair.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jM_sairMenuSelected(evt);
            }
        });
        jMB_principal.add(jM_sair);

        setJMenuBar(jMB_principal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static DefaultListModel preencherListSalas(){
        listaSalas.clear();
        List<Sala> salas = DAO.buscarTodasSalas();
        
        for (Sala sala : salas) {
            listaSalas.addElement(sala.getNome()+" ("+sala.totalUsuario()+")");
        }
        return listaSalas;
    }
    
    public static void inserirUsuario(Usuario u){
        usuario = u;
    }
    
    private void abrirChat(Sala s, Usuario u){
        jF_chat chat = new jF_chat(s, u);
        chat.setVisible(true);
        
    }
    
    
    private void jMI_clienteConectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_clienteConectaActionPerformed
        telaCliente = new jF_cliente();
        telaCliente.setVisible(true);
    }//GEN-LAST:event_jMI_clienteConectaActionPerformed
    
    private void jMI_conectarSevidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_conectarSevidorActionPerformed
        telaServidor = new jF_servidor();
        telaServidor.setVisible(true);
        
        jMI_conectarSevidor.setEnabled(false);
        
    }//GEN-LAST:event_jMI_conectarSevidorActionPerformed

    private void jMI_desconectarServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_desconectarServidorActionPerformed
        
        telaServidor.s.desativar();
    }//GEN-LAST:event_jMI_desconectarServidorActionPerformed

    private void jMI_cadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_cadastroUsuarioActionPerformed
        cadUsuarios = new jF_cadUsuario();
        cadUsuarios.setVisible(true);
        
    }//GEN-LAST:event_jMI_cadastroUsuarioActionPerformed

    private void jMI_cadastroSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_cadastroSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMI_cadastroSairActionPerformed

    private void jM_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jM_sairMouseClicked
        
    }//GEN-LAST:event_jM_sairMouseClicked

    private void jM_sairMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jM_sairMenuSelected
        this.dispose();
    }//GEN-LAST:event_jM_sairMenuSelected

    private void jMI_cadastroSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_cadastroSalaActionPerformed
        cadSalas = new jF_cadSala();
        cadSalas.setVisible(true);
        
    }//GEN-LAST:event_jMI_cadastroSalaActionPerformed
    public void mudarStatusUsuario(Usuario u){
        jL_status.setText("Usuario conectado: "+u.getNome());
    }
    public void mudarStatus(String porta){
        jL_status.setText("Servidor conectado. Porta: "+porta);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JF_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JList jL_listaSalas;
    private javax.swing.JLabel jL_status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMB_principal;
    private javax.swing.JMenuItem jMI_cadastroSair;
    private javax.swing.JMenuItem jMI_cadastroSala;
    private javax.swing.JMenuItem jMI_cadastroUsuario;
    private javax.swing.JMenuItem jMI_clienteConecta;
    private javax.swing.JMenuItem jMI_clienteUsuario;
    private javax.swing.JMenuItem jMI_conectarSevidor;
    private javax.swing.JMenuItem jMI_desconectarServidor;
    private javax.swing.JMenu jM_cadastro;
    private javax.swing.JMenu jM_cliente;
    private javax.swing.JMenu jM_desconectaServidor;
    private javax.swing.JMenu jM_sair;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jP_principal;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
