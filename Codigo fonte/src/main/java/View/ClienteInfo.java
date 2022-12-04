
package View;

import com.toedter.calendar.JDateChooser;
import java.awt.Dimension;
import java.awt.Frame;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClienteInfo extends javax.swing.JDialog {

    public ClienteInfo(java.awt.Frame parent, boolean modal) {
        super((Frame) null, modal);
        initComponents();
        jLabelStoreID.setVisible(false);
        jDateChooserDataMatricula.setEnabled(false);
        jTextFieldClienteMatricula.setEditable(false);
        
    }

    public JButton getjButtonSalvar() {
        return jButtonSalvar;
    }

    public JDateChooser getjDateChooserDataNasc() {
        return jDateChooserDataNascEdit;
    }

    public JDateChooser getjDateChooserEncerraMatricula() {
        return jDateChooserEncerraMatricula;
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

    public JLabel getjLabelClienteFoto() {
        return jLabelClienteFotoEdit;
    }

    public JTextArea getjTextAreaObservacoes() {
        return jTextAreaObservacoes;
    }

    public JTextField getjTextFieldClienteAltura() {
        return jTextFieldClienteAltura;
    }

    public JTextField getjTextFieldClienteEmail() {
        return jTextFieldClienteEmail;
    }

    public JTextField getjTextFieldClienteMatricula() {
        return jTextFieldClienteMatricula;
    }

    public JTextField getjTextFieldClienteNome() {
        return jTextFieldClienteNome;
    }

    public JTextField getjTextFieldClienteObjetivo() {
        return jTextFieldClienteObjetivo;
    }

    public JTextField getjTextFieldClientePeso() {
        return jTextFieldClientePeso;
    }

    public JDateChooser getjDateChooserDataNascEdit() {
        return jDateChooserDataNascEdit;
    }

    public JDateChooser getjDateChooserDataMatricula() {
        return jDateChooserDataMatricula;
    }  

    public JRadioButton getjRadioButtonAtivo() {
        return jRadioButtonAtivo;
    }

    public JRadioButton getjRadioButtonInativo() {
        return jRadioButtonInativo;
    }    

    public JButton getjButtonAdicionarFotoCliEdit() {
        return jButtonAdicionarFotoCliEdit;
    }

    public JButton getjButtonRemoverFotoCliEdit() {
        return jButtonRemoverFotoCliEdit;
    }  

    public JLabel getjLabelClienteFotoEdit() {
        return jLabelClienteFotoEdit;
    }

    public JLabel getjLabelStoreID() {
        return jLabelStoreID;
    }  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupAtivo = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldClienteNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldClienteEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldClientePeso = new javax.swing.JTextField();
        jTextFieldClienteAltura = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabelClienteFotoEdit = new javax.swing.JLabel();
        jFormattedTextFieldTel = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCel = new javax.swing.JFormattedTextField();
        jDateChooserDataNascEdit = new JDateChooser("dd/MM/yyyy", "##/##/####" , ' ');
        jDateChooserDataNascEdit.getJCalendar().setPreferredSize(new Dimension(250, 200));
        jDateChooserDataNascEdit.getJCalendar().setWeekOfYearVisible(false);
        jDateChooserDataNascEdit.getJCalendar().setTodayButtonVisible(true);
        jDateChooserDataNascEdit.getJCalendar().getDayChooser().setDayBordersVisible(true);
        jButtonAdicionarFotoCliEdit = new javax.swing.JButton();
        jButtonRemoverFotoCliEdit = new javax.swing.JButton();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldClienteMatricula = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldClienteObjetivo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaObservacoes = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jRadioButtonAtivo = new javax.swing.JRadioButton();
        jRadioButtonInativo = new javax.swing.JRadioButton();
        jDateChooserEncerraMatricula = new JDateChooser("dd/MM/yyyy", "##/##/####" , ' ');
        jDateChooserEncerraMatricula.getJCalendar().setPreferredSize(new Dimension(250, 200));
        jDateChooserEncerraMatricula.getJCalendar().setWeekOfYearVisible(false);
        jDateChooserEncerraMatricula.getJCalendar().setTodayButtonVisible(true);
        jDateChooserEncerraMatricula.getJCalendar().getDayChooser().setDayBordersVisible(true);
        jDateChooserDataMatricula = new JDateChooser("dd/MM/yyyy", "##/##/####" , ' ');
        jDateChooserDataMatricula.getJCalendar().setPreferredSize(new Dimension(250, 200));
        jDateChooserDataMatricula.getJCalendar().setWeekOfYearVisible(false);
        jDateChooserDataMatricula.getJCalendar().setTodayButtonVisible(true);
        jDateChooserDataMatricula.getJCalendar().getDayChooser().setDayBordersVisible(true);
        jLabelStoreID = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Cliente");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));

        jLabel3.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel3.setText("Nome:");

        jTextFieldClienteNome.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel4.setText("CPF:");

        jLabel9.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel9.setText("Data de Nascimento:");

        jLabel6.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel6.setText("Telefone:");

        jLabel7.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel7.setText("Celular:");

        jTextFieldClienteEmail.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel8.setText("Email:");

        jLabel10.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel10.setText("Peso:");

        jLabel11.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel11.setText("Altura:");

        jTextFieldClientePeso.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N

        jTextFieldClienteAltura.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel2.setText("Foto:");

        jLabelClienteFotoEdit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        try {
            jFormattedTextFieldTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFormattedTextFieldTelMouseClicked(evt);
            }
        });

        try {
            jFormattedTextFieldCel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFormattedTextFieldCelMouseClicked(evt);
            }
        });

        jDateChooserDataNascEdit.setDateFormatString("dd '/' MM '/' yyyy");
        jDateChooserDataNascEdit.setMinimumSize(new java.awt.Dimension(130, 28));
        jDateChooserDataNascEdit.setPreferredSize(new java.awt.Dimension(130, 28));

        jButtonAdicionarFotoCliEdit.setText("Adicionar");

        jButtonRemoverFotoCliEdit.setText("Remover");

        try {
            jFormattedTextFieldCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCpf.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jFormattedTextFieldCpf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFormattedTextFieldCpfMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabelClienteFotoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonAdicionarFotoCliEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRemoverFotoCliEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jLabel8)
                        .addComponent(jTextFieldClienteEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                        .addComponent(jTextFieldClientePeso, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel4)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(148, 148, 148)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldClienteAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)))
                        .addComponent(jTextFieldClienteNome))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jFormattedTextFieldCel, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jFormattedTextFieldTel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                    .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jDateChooserDataNascEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelClienteFotoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonAdicionarFotoCliEdit)
                                .addComponent(jButtonRemoverFotoCliEdit)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooserDataNascEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldClienteNome))
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4)
                        .addGap(2, 2, 2)
                        .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldClientePeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldClienteAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldClienteEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldCel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados da Matricula"));

        jLabel5.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel5.setText("Matricula:");

        jTextFieldClienteMatricula.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jTextFieldClienteMatricula.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel12.setText("Data da Matricula:");

        jLabel13.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel13.setText("Data encerramento da Matricula:");

        jLabel15.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel15.setText("Objetivo:");

        jTextFieldClienteObjetivo.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel14.setText("Observações:");

        jTextAreaObservacoes.setColumns(20);
        jTextAreaObservacoes.setLineWrap(true);
        jTextAreaObservacoes.setRows(5);
        jScrollPane1.setViewportView(jTextAreaObservacoes);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Desativar Cliente"));

        buttonGroupAtivo.add(jRadioButtonAtivo);
        jRadioButtonAtivo.setText("Ativo");

        buttonGroupAtivo.add(jRadioButtonInativo);
        jRadioButtonInativo.setText("Inativo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonInativo)
                    .addComponent(jRadioButtonAtivo))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jRadioButtonAtivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonInativo)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jDateChooserEncerraMatricula.setDateFormatString("dd '/' MM '/' yyyy");
        jDateChooserEncerraMatricula.setPreferredSize(new java.awt.Dimension(130, 28));

        jDateChooserDataMatricula.setDateFormatString("dd '/' MM '/' yyyy");
        jDateChooserDataMatricula.setMinimumSize(new java.awt.Dimension(130, 28));
        jDateChooserDataMatricula.setPreferredSize(new java.awt.Dimension(130, 28));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextFieldClienteMatricula)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelStoreID, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jDateChooserDataMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jDateChooserEncerraMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldClienteObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelStoreID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldClienteObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldClienteMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel13))
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooserEncerraMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooserDataMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonSalvar.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jButtonSalvar.setText("Salvar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalvar)
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSalvar)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextFieldTelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFormattedTextFieldTelMouseClicked
        jFormattedTextFieldTel.setValue(null);
    }//GEN-LAST:event_jFormattedTextFieldTelMouseClicked

    private void jFormattedTextFieldCelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCelMouseClicked
        jFormattedTextFieldCel.setValue(null);
    }//GEN-LAST:event_jFormattedTextFieldCelMouseClicked

    private void jFormattedTextFieldCpfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCpfMouseClicked
        jFormattedTextFieldCpf.setValue(null);
    }//GEN-LAST:event_jFormattedTextFieldCpfMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupAtivo;
    private javax.swing.JButton jButtonAdicionarFotoCliEdit;
    private javax.swing.JButton jButtonRemoverFotoCliEdit;
    private javax.swing.JButton jButtonSalvar;
    private com.toedter.calendar.JDateChooser jDateChooserDataMatricula;
    private com.toedter.calendar.JDateChooser jDateChooserDataNascEdit;
    private com.toedter.calendar.JDateChooser jDateChooserEncerraMatricula;
    private javax.swing.JFormattedTextField jFormattedTextFieldCel;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldTel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClienteFotoEdit;
    private javax.swing.JLabel jLabelStoreID;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButtonAtivo;
    private javax.swing.JRadioButton jRadioButtonInativo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaObservacoes;
    private javax.swing.JTextField jTextFieldClienteAltura;
    private javax.swing.JTextField jTextFieldClienteEmail;
    private javax.swing.JTextField jTextFieldClienteMatricula;
    private javax.swing.JTextField jTextFieldClienteNome;
    private javax.swing.JTextField jTextFieldClienteObjetivo;
    private javax.swing.JTextField jTextFieldClientePeso;
    // End of variables declaration//GEN-END:variables
}
