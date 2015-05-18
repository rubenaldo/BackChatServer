/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import comunicacao.Cliente;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import main.Main;
import modelo.DAO;
import modelo.Listagens;
import modelo.Usuario;

/**
 *
 * @author Rubenaldo
 */
public class jF_cliente extends javax.swing.JFrame {

    /**
     * Creates new form jF_cliente
     */
    private static DefaultComboBoxModel listaUsuarios = new DefaultComboBoxModel();
    Listagens listagens = new Listagens();
    Cliente c;
    Usuario usuario;
    
    public jF_cliente() {
        initComponents();
        jCB_usuarios.setModel(listagens.carregarComboxCategoria());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gBG_conexao = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTF_ip = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTF_porta = new javax.swing.JTextField();
        jB_conecta = new javax.swing.JButton();
        jB_sair = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCB_usuarios = new javax.swing.JComboBox();
        jPasswordField1 = new javax.swing.JPasswordField();
        jRB_criarServidor = new javax.swing.JRadioButton();
        jRB_conectarServidor = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("IP");

        jLabel2.setText("Porta:");

        jB_conecta.setText("Conectar");
        jB_conecta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_conectaActionPerformed(evt);
            }
        });

        jB_sair.setText("Sair");
        jB_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_sairActionPerformed(evt);
            }
        });

        jLabel4.setText("Usuario");

        jLabel5.setText("Senha");

        jCB_usuarios.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Usuario" }));

        gBG_conexao.add(jRB_criarServidor);
        jRB_criarServidor.setText("Conectar local");
        jRB_criarServidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB_criarServidorActionPerformed(evt);
            }
        });

        gBG_conexao.add(jRB_conectarServidor);
        jRB_conectarServidor.setText("Conectar ao Servidor");
        jRB_conectarServidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB_conectarServidorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTF_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTF_porta, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jB_conecta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jB_sair, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCB_usuarios, 0, 104, Short.MAX_VALUE)
                                    .addComponent(jPasswordField1)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jRB_criarServidor)
                        .addGap(16, 16, 16)
                        .addComponent(jRB_conectarServidor)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRB_criarServidor)
                    .addComponent(jRB_conectarServidor))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCB_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTF_ip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTF_porta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jB_conecta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Conexao do Cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void preencherListUsuarios(){
//        jCB_usuarios.removeAllItems();
//        List<Usuario> usuarios = DAO.buscarTodosUsuarios();
//        System.out.println("passei por aqui");
//        for (Usuario usuario : usuarios) {
//            
//           jCB_usuarios.addItem(usuario.getNome());
//           
//        }

    }
    
    private void jB_conectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_conectaActionPerformed
        if ((jTF_ip.getText().equals(""))||(jTF_porta.getText().equals(""))||(jCB_usuarios.getSelectedItem().equals("TODAS..."))) {
            System.out.println("Preencher campos vazios");
        } else {
            String nome = jCB_usuarios.getSelectedItem().toString();
            usuario = DAO.buscarIdUsuario(nome);
            
//            Main.mostrarMensagem(String.valueOf(usuario.getId()));
            JF_principal.inserirUsuario(usuario);
//            Main.mostrarMensagem(jCB_usuarios.getSelectedItem().toString());
            int porta = Integer.parseInt(jTF_porta.getText());
            
            c = new Cliente(jTF_ip.getText(), Integer.parseInt(jTF_porta.getText()));
            
            c.start();  
        }

    }//GEN-LAST:event_jB_conectaActionPerformed

    private void jB_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_sairActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_jB_sairActionPerformed

    private void jRB_criarServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB_criarServidorActionPerformed
        try {
            jTF_ip.setText("127.0.0.1");
            jTF_ip.setEnabled(false);
            jTF_porta.setText("1515");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jRB_criarServidorActionPerformed

    private void jRB_conectarServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB_conectarServidorActionPerformed

        jTF_ip.setText(null);
        jTF_ip.setEnabled(true);

    }//GEN-LAST:event_jRB_conectarServidorActionPerformed

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
            java.util.logging.Logger.getLogger(jF_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jF_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jF_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jF_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jF_cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup gBG_conexao;
    private javax.swing.JButton jB_conecta;
    private javax.swing.JButton jB_sair;
    private javax.swing.JComboBox jCB_usuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRB_conectarServidor;
    private javax.swing.JRadioButton jRB_criarServidor;
    private javax.swing.JTextField jTF_ip;
    private javax.swing.JTextField jTF_porta;
    // End of variables declaration//GEN-END:variables
}