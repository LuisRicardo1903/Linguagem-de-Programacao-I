import java.util.ArrayList;
import javax.swing.JOptionPane;
//import javax.swing.table.DefaultTableModel;

public class JFrame_CadastrarAluno extends javax.swing.JFrame {

    //DefaultTableModel model;
    
    ArrayList<Aluno> listaAlunos = new ArrayList<>();
    Dados dados = new Dados();

    public JFrame_CadastrarAluno() {
        initComponents();
    }

    public void limparCampos() {
        jTFMatricula.setText(""); //Limpar   
        jTFNome.setText(""); //Limpar
        jTFDataNascimento.setText(""); //Limpar
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTFMatricula = new javax.swing.JTextField();
        jTFNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTFDataNascimento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTBInserirAluno = new javax.swing.JToggleButton();
        jLBAunosCadastrados = new javax.swing.JLabel();
        jBListarAlunos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_resultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Matricula:");

        jTFMatricula.setText("Matricula");
        jTFMatricula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTFMatriculaMousePressed(evt);
            }
        });

        jTFNome.setText("Nome");
        jTFNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTFNomeMousePressed(evt);
            }
        });

        jLabel3.setText("Nome:");

        jLabel4.setText("Data de Nascimento:");

        jTFDataNascimento.setText("dd/mm/aa");
        jTFDataNascimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTFDataNascimentoMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cadastro de Alunos");

        jTBInserirAluno.setText("Inserir Aluno");
        jTBInserirAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBInserirAlunoActionPerformed(evt);
            }
        });

        jLBAunosCadastrados.setText("0 Alunos Cadastrados");

        jBListarAlunos.setText("Listar Alunos");
        jBListarAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBListarAlunosActionPerformed(evt);
            }
        });

        jTextArea_resultado.setColumns(20);
        jTextArea_resultado.setRows(5);
        jScrollPane1.setViewportView(jTextArea_resultado);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLBAunosCadastrados))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTFDataNascimento))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(20, 20, 20)
                                        .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTBInserirAluno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBListarAlunos)))
                        .addGap(136, 136, 136)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTFMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTFDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTBInserirAluno)
                    .addComponent(jBListarAlunos))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jLBAunosCadastrados))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFMatriculaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFMatriculaMousePressed
        jTFMatricula.setText(""); //Limpar
    }//GEN-LAST:event_jTFMatriculaMousePressed

    private void jTFDataNascimentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFDataNascimentoMousePressed
        jTFDataNascimento.setText(""); //Limpar
    }//GEN-LAST:event_jTFDataNascimentoMousePressed

    private void jTFNomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFNomeMousePressed
        jTFNome.setText(""); //Limpar
    }//GEN-LAST:event_jTFNomeMousePressed

    private void jTBInserirAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBInserirAlunoActionPerformed


        
        String matricula = jTFMatricula.getText();
        String nome = jTFNome.getText();
        String Datanasc = jTFDataNascimento.getText();

        aluno = new Aluno(matricula, nome, Datanasc);

        dados.cadastraAluno(aluno);

        setText(dados.numeroDeAlunos());
        JOptionPane.showMessageDialog(this, "Aluno " + nome + " Cadastrado com Sucesso");
        dados.exibirAlunos(aluno, jTextArea_resultado);
        //System.out.println(aluno);
       limparCampos();
        //jTextArea_resultado.append(dados.listarAlunos(aluno, jTextArea_resultado));

    }//GEN-LAST:event_jTBInserirAlunoActionPerformed

    private void jBListarAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListarAlunosActionPerformed

        
         
        //dados.listarAlunos(aluno, jTextArea_resultado);
        //Aluno aluno = new Aluno();
        //dados.listarAlunos(aluno, jTextArea_resultado);
//        jTextArea_resultado.setText(dados.exibirLista(aluno, jTextArea_resultado));
    }//GEN-LAST:event_jBListarAlunosActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_CadastrarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_CadastrarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_CadastrarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_CadastrarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_CadastrarAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBListarAlunos;
    private javax.swing.JLabel jLBAunosCadastrados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jTBInserirAluno;
    private javax.swing.JTextField jTFDataNascimento;
    private javax.swing.JTextField jTFMatricula;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextArea jTextArea_resultado;
    // End of variables declaration//GEN-END:variables
}
