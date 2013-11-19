/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leilao;

import java.awt.Component;
import java.util.Date;
import java.util.*;
import java.net.*;
import java.io.*;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 631220414
 */
public class MultiTab extends javax.swing.JFrame {

    public static Usuario Uaux;
    String n, c, e, s;
    String nome = "";
    String cpf = "";
    String email = "";
    String senha = "";

    /**
     * Creates new form MultiTab
     */
    public MultiTab() {

        initComponents();

        //Uaux = new Usuario("teste", "teste", "teste", "teste");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        multitab = new javax.swing.JTabbedPane();
        Principal = new javax.swing.JPanel();
        LabelUser = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Logar = new javax.swing.JButton();
        Femail = new javax.swing.JTextField();
        Fsenha = new javax.swing.JPasswordField();
        Bcad = new javax.swing.JButton();
        leilao = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        Lance = new javax.swing.JButton();
        Flance = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Bpesquisar = new javax.swing.JButton();
        Fpesquisar = new javax.swing.JTextField();
        Btodos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cadastralivro = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        Ftitulo = new javax.swing.JTextField();
        jLabelAutor = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jLabelValor = new javax.swing.JLabel();
        Fvalor = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();
        Festado = new javax.swing.JComboBox();
        Fautor = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        Ajuda = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        Sobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Leilão");
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        if(Uaux != null){
            LabelUser.setText("Olá "+Uaux.getNome());
            LabelUser.repaint();
        }
        else
        LabelUser.setText("faça login ou cadastre-se");
        LabelUser.repaint();
        LabelUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelUserMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 263, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Login"));

        jLabel3.setText("Email");

        jLabel4.setText("Senha");

        Logar.setText("Logar");
        Logar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Logar)
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel4)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Fsenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(Femail))))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(11, 11, 11)
                .addComponent(Femail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Logar)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        Bcad.setText("Cadastre-se aqui");
        Bcad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                .addContainerGap(222, Short.MAX_VALUE)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Bcad, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bcad)
                        .addGap(47, 47, 47))))
        );

        multitab.addTab("Principal", Principal);

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabela.setColumnSelectionAllowed(true);
        Tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaMouseClicked(evt);
            }
        });
        Tabela.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TabelaFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela);
        Tabela.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        Lance.setText("Lance");
        Lance.setEnabled(false);
        Lance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LanceActionPerformed(evt);
            }
        });

        jLabel1.setText("R$");

        Bpesquisar.setText("pesquisar");
        Bpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BpesquisarActionPerformed(evt);
            }
        });

        Btodos.setText("Todos");
        Btodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtodosActionPerformed(evt);
            }
        });

        jLabel2.setText("Selecione o nome do livro que deseja comprar e de seu");

        jLabel5.setText("no valor de");

        javax.swing.GroupLayout leilaoLayout = new javax.swing.GroupLayout(leilao);
        leilao.setLayout(leilaoLayout);
        leilaoLayout.setHorizontalGroup(
            leilaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leilaoLayout.createSequentialGroup()
                .addGroup(leilaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(leilaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE))
                    .addGroup(leilaoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lance)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Flance, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)))
                .addContainerGap())
            .addGroup(leilaoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Btodos)
                .addGap(260, 260, 260)
                .addComponent(Bpesquisar)
                .addGap(18, 18, 18)
                .addComponent(Fpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leilaoLayout.setVerticalGroup(
            leilaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leilaoLayout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(leilaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bpesquisar)
                    .addComponent(Fpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btodos))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leilaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lance)
                    .addComponent(Flance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        multitab.addTab("leilão", leilao);

        jLabelTitulo.setText("Título:");

        Ftitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FtituloActionPerformed(evt);
            }
        });

        jLabelAutor.setText("Autor:");

        jLabelEstado.setText("Estado:");

        jLabelValor.setText("Valor:");

        Fvalor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FvalorActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Limpar Dados");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        Festado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "novo", "pouco danificado", "danificado", "muito danificado" }));

        Fautor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FautorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cadastralivroLayout = new javax.swing.GroupLayout(cadastralivro);
        cadastralivro.setLayout(cadastralivroLayout);
        cadastralivroLayout.setHorizontalGroup(
            cadastralivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastralivroLayout.createSequentialGroup()
                .addGroup(cadastralivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastralivroLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(cadastralivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cadastralivroLayout.createSequentialGroup()
                                .addComponent(jLabelAutor)
                                .addGap(18, 18, 18)
                                .addComponent(Fautor, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cadastralivroLayout.createSequentialGroup()
                                .addComponent(jLabelTitulo)
                                .addGap(18, 18, 18)
                                .addComponent(Ftitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cadastralivroLayout.createSequentialGroup()
                                .addGroup(cadastralivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelValor)
                                    .addComponent(jLabelEstado))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(cadastralivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Festado, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Fvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(cadastralivroLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jButtonCancelar)
                        .addGap(57, 57, 57)
                        .addComponent(jButtonCadastrar)))
                .addContainerGap())
        );
        cadastralivroLayout.setVerticalGroup(
            cadastralivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastralivroLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(cadastralivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ftitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTitulo))
                .addGap(18, 18, 18)
                .addGroup(cadastralivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAutor)
                    .addComponent(Fautor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastralivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEstado)
                    .addComponent(Festado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastralivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValor)
                    .addComponent(Fvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(cadastralivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonCadastrar))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        multitab.addTab("cadastrar livros", cadastralivro);

        jMenu1.setText("Arquivo");

        jMenuItem5.setText("Sair");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Logar");
        jMenuItem6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem6MouseClicked(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        Ajuda.setText("Ajuda");

        jMenuItem1.setText("clique aqui para receber ajuda");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Ajuda.add(jMenuItem1);

        jMenuBar1.add(Ajuda);

        Sobre.setText("Sobre");
        Sobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SobreMouseClicked(evt);
            }
        });
        jMenuBar1.add(Sobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(multitab, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(multitab)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FtituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FtituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FtituloActionPerformed

    private void FvalorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FvalorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FvalorActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        try {
            Date date = new Date();
            Connection con = Conectar.conn();
            int x = 0;
            Statement statement = con.createStatement();
            statement.executeUpdate("insert into livro(titulo, estado, autor, valor, data, vencendo) values('" + Ftitulo.getText() + "','"
                    + String.valueOf(Festado.getSelectedItem()) + "','" + Fautor.getText() + "','" + Fvalor.getText()
                    + "','" + dateFormat.format(date)+"','');");
            Ftitulo.setText("");
            Fautor.setText("");
            Fvalor.setText("");
            con.close();  // fecha conexão com BD
        } catch (SQLException ex) {
            Logger.getLogger(MultiTab.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Uaux = null;
        LabelUser.setText("faça login ou cadastre-se");
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        Ftitulo.setText("");
        Fautor.setText("");
        Fvalor.setText("");
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void FautorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FautorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FautorActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            java.awt.Desktop.getDesktop().browse(new java.net.URI("http://www.google.com"));
        } catch (IOException ex) {
            Logger.getLogger(MultiTab.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(MultiTab.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void TabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMouseClicked
        if (Tabela.getSelectedRow() == -1) {
            Lance.setEnabled(false);
        } else {
            Lance.setEnabled(true);
        }
    }//GEN-LAST:event_TabelaMouseClicked

    private void BpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BpesquisarActionPerformed
        // TODO add your handling code here:
        try {

            Connection con = Conectar.conn();
            PreparedStatement ps = con.prepareStatement("select * from livro where titulo = '" + Fpesquisar.getText() + "';");
            ResultSet rs = ps.executeQuery();

            Tabela.setModel(new ResultSetTableModel(rs));
            Tabela.repaint();

            con.close();  // fecha conexão com BD

        } catch (SQLException ex) {
            Logger.getLogger(MultiTab.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MultiTab.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BpesquisarActionPerformed

    private void LogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogarActionPerformed

        System.out.println("teste 0 " + Femail.getText());
        System.out.printf("teste 0{%s}\n ", Fsenha.getPassword().toString());
        try {
            Connection con = Conectar.conn();
            //PreparedStatement login = con.prepareStatement("select * from usuario where email = '" + Femail.getText() + "' and senha = '" + Fsenha.getPassword().toString() + "';");
            //PreparedStatement login = con.prepareStatement("select * from usuario where email = ? and senha = ?");
            PreparedStatement login = con.prepareStatement("select * from usuario where email= ?");
            login.setString(1, Femail.getText());
            //login.setString(2, Fsenha.getPassword().toString());
            ResultSet rs = login.executeQuery();

            System.out.println("teste  ");
            while (rs.next()) {
                System.out.println("teste 2");
                n = (rs.getString("nome"));
                c = (rs.getString("cpf"));
                e = (rs.getString("email"));
                System.out.println("teste 3 " + n);
                s = (rs.getString("senha"));;
            }

            Uaux = new Usuario(n, c, e, s);
            
            n = null;
            c = null;
            e = null;
            s = null;

            System.out.println(Uaux.toString());

            //Uaux = new Usuario(rs.getString("nome"),rs.getString("cpf"),rs.getString("email"),rs.getString("senha"));
            con.close();  // fecha conexão com BD
        } catch (SQLException ex) {
            Logger.getLogger(MultiTab.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (Uaux != null) {
            System.out.println(Uaux.getNome());
            LabelUser.setText("olá " + Uaux.getNome());
        } else {
            LabelUser.setText("faça login ou cadastre-se");
        }

    }//GEN-LAST:event_LogarActionPerformed

    private void LabelUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelUserMouseEntered
//        if(Uaux != null){
//                System.out.println(Uaux.getNome());
//        LabelUser.setText("olá "+Uaux.getNome());
//        }
//        else 
//            LabelUser.setText("faça login ou cadastre-se");
    }//GEN-LAST:event_LabelUserMouseEntered

    private void BcadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcadActionPerformed
        new CadUsuario().setVisible(true);
    }//GEN-LAST:event_BcadActionPerformed

    private void BtodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtodosActionPerformed
        
        try {

            Connection con = Conectar.conn();
            PreparedStatement ps = con.prepareStatement("select * from livro;");
            ResultSet rs = ps.executeQuery();

            Tabela.setModel(new ResultSetTableModel(rs));
            Lance.setEnabled(false);
            Tabela.repaint();

            con.close();  // fecha conexão com BD

        } catch (SQLException ex) {
            Logger.getLogger(MultiTab.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MultiTab.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtodosActionPerformed

    private void LanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LanceActionPerformed

//        double tab = Tabela.getSelectedColumn();
//        System.out.println(tab);

        String n = Tabela.getValueAt(Tabela.getSelectedRow(), 0).toString();
        System.out.println(n);
        if (Uaux != null) {
            if(isUp()==true){
                if (Double.parseDouble(Tabela.getValueAt(Tabela.getSelectedRow(), 3).toString()) < Double.parseDouble(Flance.getText())) {
                    try {
                        Connection con = Conectar.conn();
                        PreparedStatement ps = con.prepareStatement("update livro set valor = '"+Double.parseDouble(Flance.getText())+"', vencendo='"+Uaux.getNome()+"' where titulo ='" + n + "';");
                        int r = ps.executeUpdate();
                        if(r != 1){
                            JOptionPane.showMessageDialog(rootPane, "Não foi possível completar o lance");
                        }     
                        PreparedStatement ps2 = con.prepareStatement("select * from livro;");
                        ResultSet rs = ps2.executeQuery();
                        Tabela.setModel(new ResultSetTableModel(rs));
                        Lance.setEnabled(false);
                        Tabela.repaint();
                        con.close();  // fecha conexão com BD                    

                    } catch (SQLException ex) {
                        Logger.getLogger(MultiTab.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(MultiTab.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ArrayIndexOutOfBoundsException ex) {
                        Logger.getLogger(MultiTab.class.getName()).log(Level.SEVERE, null, ex);
                        //JOptionPane.showMessageDialog(rootPane, "Selecione (com o mouse) o nome do livro que deseja comprar, após isso de seu lance");
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Valor do lance deve ser maior que o valor atual");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Leilão encerrado");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "para dar lances faça login ou cadastre-se");
        }
        
        
    }//GEN-LAST:event_LanceActionPerformed

    private boolean isUp(){   
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        Date hoje = Calendar.getInstance().getTime();
        
        String h = df.format(hoje);
        CharSequence csHoje = h.subSequence(9, 10);
        
        String livro = df.format(Tabela.getValueAt(Tabela.getSelectedRow(), 4));
        CharSequence csLivro = livro.subSequence(9, 10);
        
        System.out.println(csHoje.toString() + "  "+csLivro.toString());
        if(csHoje.equals(csLivro))
            return true;
        else return false;
    }
    
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved

    }//GEN-LAST:event_formMouseMoved

    private void TabelaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TabelaFocusLost
//         java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                Lance.setEnabled(false);
//            }
//        });
        
    }//GEN-LAST:event_TabelaFocusLost

    private void jMenuItem6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem6MouseClicked
        new CadUsuario().setVisible(true);
    }//GEN-LAST:event_jMenuItem6MouseClicked

    private void SobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SobreMouseClicked
        JOptionPane.showMessageDialog(rootPane, "Engenharia de Software III @ SENACRS - Professor: Marco Mangan - Alunos: Gabriel Ortiz e Gisela Lucena");
    }//GEN-LAST:event_SobreMouseClicked

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
            java.util.logging.Logger.getLogger(MultiTab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MultiTab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MultiTab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MultiTab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MultiTab().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Ajuda;
    private javax.swing.JButton Bcad;
    private javax.swing.JButton Bpesquisar;
    private javax.swing.JButton Btodos;
    private javax.swing.JTextField Fautor;
    private javax.swing.JTextField Femail;
    private javax.swing.JComboBox Festado;
    private javax.swing.JTextField Flance;
    private javax.swing.JTextField Fpesquisar;
    private javax.swing.JPasswordField Fsenha;
    private javax.swing.JTextField Ftitulo;
    private javax.swing.JTextField Fvalor;
    private javax.swing.JLabel LabelUser;
    private javax.swing.JButton Lance;
    private javax.swing.JButton Logar;
    private javax.swing.JPanel Principal;
    private javax.swing.JMenu Sobre;
    private javax.swing.JTable Tabela;
    private javax.swing.JPanel cadastralivro;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelAutor;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel leilao;
    private javax.swing.JTabbedPane multitab;
    // End of variables declaration//GEN-END:variables
}
