
package View;

import com.toedter.calendar.JDateChooser;
import java.awt.Dimension;
import java.awt.Frame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FuncionarioInfo extends javax.swing.JDialog {

    public FuncionarioInfo(java.awt.Frame parent, boolean modal) {
        super((Frame) null, modal);
        initComponents();
    }

    public JButton getjButtonCancelarFuncionario() {
        return jButtonCancelarFuncionario;
    }

    public JButton getjButtonSalvarEditarFuncio() {
        return jButtonSalvarEditarFuncio;
    }

    public JComboBox<String> getjComboBoxCargaHoraria() {
        return jComboBoxCargaHoraria;
    }

    public JComboBox<String> getjComboBoxTurno() {
        return jComboBoxTurno;
    }

    public JDateChooser getjDateChooserDataNasc() {
        return jDateChooserDataNasc;
    }

    public JFormattedTextField getjFormattedTextFieldCel() {
        return jFormattedTextFieldCel;
    }

    public JFormattedTextField getjFormattedTextFieldCpf() {
        return jFormattedTextFieldCpf;
    }

    public JFormattedTextField getjFormattedTextFieldTel() {
        return jFormattedTextFieldTel;
    }

    public JTextArea getjTextAreaObserva() {
        return jTextAreaObserva;
    }

    public JTextField getjTextFieldAltura() {
        return jTextFieldAltura;
    }

    public JTextField getjTextFieldEmail() {
        return jTextFieldEmail;
    }

    public JTextField getjTextFieldEspecialidade() {
        return jTextFieldEspecialidade;
    }

    public JTextField getjTextFieldNome() {
        return jTextFieldNome;
    }

    public JTextField getjTextFieldPeso() {
        return jTextFieldPeso;
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jLabel31 = new javax.swing.JLabel();
        jDateChooserDataNasc = new JDateChooser("dd/MM/yyyy", "##/##/####" , ' ');
        jDateChooserDataNasc.getJCalendar().setPreferredSize(new Dimension(250, 200));
        jDateChooserDataNasc.getJCalendar().setWeekOfYearVisible(false);
        jDateChooserDataNasc.getJCalendar().setTodayButtonVisible(true);
        jDateChooserDataNasc.getJCalendar().getDayChooser().setDayBordersVisible(true);
        jLabel35 = new javax.swing.JLabel();
        jTextFieldPeso = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jTextFieldAltura = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jFormattedTextFieldTel = new javax.swing.JFormattedTextField();
        jLabel49 = new javax.swing.JLabel();
        jFormattedTextFieldCel = new javax.swing.JFormattedTextField();
        jLabel46 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jTextFieldEspecialidade = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jComboBoxTurno = new javax.swing.JComboBox<>();
        jLabel52 = new javax.swing.JLabel();
        jComboBoxCargaHoraria = new javax.swing.JComboBox<>();
        jLabel53 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaObserva = new javax.swing.JTextArea();
        jButtonCancelarFuncionario = new javax.swing.JButton();
        jButtonSalvarEditarFuncio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Editar Informações de Funcionário"));

        jLabel22.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel22.setText("Nome:");

        jTextFieldNome.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel26.setText("CPF:");

        try {
            jFormattedTextFieldCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCpf.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N

        jLabel31.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel31.setText("Data de Nascimento:");

        jDateChooserDataNasc.setDateFormatString("dd '/' MM '/' yyyy");

        jLabel35.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel35.setText("Peso:");

        jTextFieldPeso.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N

        jLabel45.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel45.setText("Altura:");

        jTextFieldAltura.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N

        jLabel47.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel47.setText("Telefone:");

        try {
            jFormattedTextFieldTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel49.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel49.setText("Celular:");

        try {
            jFormattedTextFieldCel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel46.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel46.setText("Email:");

        jTextFieldEmail.setMinimumSize(new java.awt.Dimension(64, 24));

        jLabel50.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel50.setText("Especialidade:");

        jTextFieldEspecialidade.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N

        jLabel51.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel51.setText("Turno:");

        jComboBoxTurno.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jComboBoxTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Manhã", "Tarde", "Noite" }));

        jLabel52.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel52.setText("Carga Horária (h):");

        jComboBoxCargaHoraria.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jComboBoxCargaHoraria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "4", "8", "20", "40" }));

        jLabel53.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel53.setText("Observação:");

        jTextAreaObserva.setColumns(20);
        jTextAreaObserva.setRows(5);
        jScrollPane4.setViewportView(jTextAreaObserva);

        jButtonCancelarFuncionario.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCancelarFuncionario.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonCancelarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelarFuncionario.setText("Cancelar");

        jButtonSalvarEditarFuncio.setBackground(new java.awt.Color(102, 102, 102));
        jButtonSalvarEditarFuncio.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonSalvarEditarFuncio.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvarEditarFuncio.setText("Salvar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel31)
                                .addComponent(jDateChooserDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel35)
                                    .addGap(67, 67, 67)
                                    .addComponent(jLabel45))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(399, 399, 399))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel47)
                                .addComponent(jFormattedTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel49)
                                    .addGap(135, 135, 135))
                                .addComponent(jFormattedTextFieldCel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButtonCancelarFuncionario)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSalvarEditarFuncio))
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jTextFieldEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(34, 34, 34)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBoxCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(34, 34, 34))
                    .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooserDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel45)
                            .addComponent(jLabel35))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldCel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel51)
                            .addComponent(jLabel52))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addGap(34, 34, 34)))
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelarFuncionario)
                    .addComponent(jButtonSalvarEditarFuncio))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarFuncionario;
    private javax.swing.JButton jButtonSalvarEditarFuncio;
    private javax.swing.JComboBox<String> jComboBoxCargaHoraria;
    private javax.swing.JComboBox<String> jComboBoxTurno;
    private com.toedter.calendar.JDateChooser jDateChooserDataNasc;
    private javax.swing.JFormattedTextField jFormattedTextFieldCel;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldTel;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextAreaObserva;
    private javax.swing.JTextField jTextFieldAltura;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEspecialidade;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPeso;
    // End of variables declaration//GEN-END:variables
}
