
package View;

import com.toedter.calendar.JDateChooser;
import java.awt.Dimension;
import java.awt.Frame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TreinoInfo extends javax.swing.JDialog {

    public TreinoInfo(java.awt.Frame parent, boolean modal) {
        super((Frame) null, modal);
        initComponents();
    }

    public JButton getjButtonCancelarTreino() {
        return jButtonCancelarTreino;
    }

    public JButton getjButtonPesquisarTreinoCli() {
        return jButtonPesquisarTreinoCli;
    }

    public JButton getjButtonSalvarTreino() {
        return jButtonSalvarTreino;
    }

    public JComboBox<String> getjComboBoxInstrutorTreino() {
        return jComboBoxInstrutorTreino;
    }

    public JComboBox<String> getjComboBoxOrdem() {
        return jComboBoxOrdem;
    }

    public JComboBox<String> getjComboBoxTreinoExercicios() {
        return jComboBoxTreinoExercicios;
    }

    public JDateChooser getjDateChooserTrocaTreino() {
        return jDateChooserTrocaTreinoEdit;
    }

    public JTable getjTableTreinoClientes() {
        return jTableTreinoClientes;
    }

    public JTextArea getjTextAreaObservacaoTreino() {
        return jTextAreaObservacaoTreino;
    }

    public JTextField getjTextFieldCargaTreino() {
        return jTextFieldCargaTreino;
    }

    public JTextField getjTextFieldPesquisarTreinoCli() {
        return jTextFieldPesquisarTreinoCli;
    }

    public JTextField getjTextFieldRepeticaoTreino() {
        return jTextFieldRepeticaoTreino;
    }

    public JTextField getjTextFieldSeriesTreino() {
        return jTextFieldSeriesTreino;
    }

    public JTextField getjTextFieldTipoTreino() {
        return jTextFieldTipoTreino;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldPesquisarTreinoCli = new javax.swing.JTextField();
        jButtonPesquisarTreinoCli = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableTreinoClientes = new javax.swing.JTable();
        jTableTreinoClientes.getTableHeader().setEnabled(false);
        jLabel37 = new javax.swing.JLabel();
        jComboBoxTreinoExercicios = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        jComboBoxOrdem = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        jTextFieldCargaTreino = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jTextFieldSeriesTreino = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jTextFieldRepeticaoTreino = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jTextFieldTipoTreino = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaObservacaoTreino = new javax.swing.JTextArea();
        jLabel42 = new javax.swing.JLabel();
        jComboBoxInstrutorTreino = new javax.swing.JComboBox<>();
        jLabel56 = new javax.swing.JLabel();
        jDateChooserTrocaTreinoEdit = new JDateChooser("dd/MM/yyyy", "##/##/####" , ' ');
        jDateChooserTrocaTreinoEdit.getJCalendar().setPreferredSize(new Dimension(250, 200));
        jDateChooserTrocaTreinoEdit.getJCalendar().setWeekOfYearVisible(false);
        jDateChooserTrocaTreinoEdit.getJCalendar().setTodayButtonVisible(true); 
        jDateChooserTrocaTreinoEdit.getJCalendar().getDayChooser().setDayBordersVisible(true);
        jButtonSalvarTreino = new javax.swing.JButton();
        jButtonCancelarTreino = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Editar Treino"));

        jButtonPesquisarTreinoCli.setText("Pesquisar");

        jLabel20.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel20.setText("Selecione o Cliente:");

        jTableTreinoClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nome", "Peso", "Altura", "Idade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableTreinoClientes);

        jLabel37.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel37.setText("Exercício:");

        jComboBoxTreinoExercicios.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jComboBoxTreinoExercicios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Item 2", "Item 3", "Item 4" }));

        jLabel38.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel38.setText("Ordem de execução:");

        jComboBoxOrdem.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jComboBoxOrdem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "1", "2", "3", "4", "5" }));

        jLabel40.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel40.setText("Carga (Kg ou Unid):");

        jTextFieldCargaTreino.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N

        jLabel39.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel39.setText("Número de Séries:");

        jTextFieldSeriesTreino.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N

        jLabel41.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel41.setText("Número de Repetição:");

        jTextFieldRepeticaoTreino.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N

        jLabel43.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel43.setText("Tipo de Treino:");

        jTextFieldTipoTreino.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N

        jLabel44.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel44.setText("Observação:");

        jTextAreaObservacaoTreino.setColumns(20);
        jTextAreaObservacaoTreino.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jTextAreaObservacaoTreino.setRows(5);
        jScrollPane3.setViewportView(jTextAreaObservacaoTreino);

        jLabel42.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel42.setText("Instrutor responsável pelo treino:");

        jComboBoxInstrutorTreino.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jComboBoxInstrutorTreino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Item 2", "Item 3", "Item 4" }));

        jLabel56.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel56.setText("Previsão troca de treino:");

        jDateChooserTrocaTreinoEdit.setDateFormatString("dd '/' MM '/' yyyy");

        jButtonSalvarTreino.setBackground(new java.awt.Color(102, 102, 102));
        jButtonSalvarTreino.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonSalvarTreino.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvarTreino.setText("Salvar");

        jButtonCancelarTreino.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCancelarTreino.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonCancelarTreino.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelarTreino.setText("Cancelar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldPesquisarTreinoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPesquisarTreinoCli))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTipoTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxInstrutorTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jButtonCancelarTreino)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSalvarTreino))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldCargaTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel40)))
                                .addComponent(jComboBoxTreinoExercicios, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel37))
                            .addGap(14, 14, 14)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel39)
                                        .addComponent(jTextFieldSeriesTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextFieldRepeticaoTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel56)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jDateChooserTrocaTreinoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(83, 83, 83))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisarTreinoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisarTreinoCli))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxTreinoExercicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(jLabel41)
                            .addComponent(jLabel39))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCargaTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldSeriesTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRepeticaoTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldTipoTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxInstrutorTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooserTrocaTreinoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvarTreino)
                    .addComponent(jButtonCancelarTreino))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarTreino;
    private javax.swing.JButton jButtonPesquisarTreinoCli;
    private javax.swing.JButton jButtonSalvarTreino;
    private javax.swing.JComboBox<String> jComboBoxInstrutorTreino;
    private javax.swing.JComboBox<String> jComboBoxOrdem;
    private javax.swing.JComboBox<String> jComboBoxTreinoExercicios;
    private com.toedter.calendar.JDateChooser jDateChooserTrocaTreinoEdit;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableTreinoClientes;
    private javax.swing.JTextArea jTextAreaObservacaoTreino;
    private javax.swing.JTextField jTextFieldCargaTreino;
    private javax.swing.JTextField jTextFieldPesquisarTreinoCli;
    private javax.swing.JTextField jTextFieldRepeticaoTreino;
    private javax.swing.JTextField jTextFieldSeriesTreino;
    private javax.swing.JTextField jTextFieldTipoTreino;
    // End of variables declaration//GEN-END:variables
}
