package View;

import com.toedter.calendar.JDateChooser;
import java.awt.Dimension;
import java.awt.Frame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EquipInfo extends javax.swing.JDialog {

    public EquipInfo(java.awt.Frame parent, boolean modal) {
        super((Frame) null, modal);
        initComponents();
        jLabelStoreEquipID.setVisible(false);
    }

    public JDateChooser getjDateChooserAquisicaoEquip() {
        return jDateChooserAquisicaoEquip;
    }

    public JLabel getjLabelStoreEquipID() {
        return jLabelStoreEquipID;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JTextArea getjTextAreaEquip() {
        return jTextAreaEquip;
    }

    public JTextField getjTextFieldNomeEquip() {
        return jTextFieldNomeEquip;
    }

    public JButton getjButtonCancelarFuncionario() {
        return jButtonCancelarFuncionario;
    }

    public JButton getjButtonSalvarEditarFunc() {
        return jButtonSalvarEditarFunc;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaEquip = new javax.swing.JTextArea();
        jDateChooserAquisicaoEquip = new JDateChooser("dd/MM/yyyy", "##/##/####" , ' ');
        jDateChooserAquisicaoEquip.getJCalendar().setPreferredSize(new Dimension(250, 200));
        jDateChooserAquisicaoEquip.getJCalendar().setWeekOfYearVisible(false);
        jDateChooserAquisicaoEquip.getJCalendar().setTodayButtonVisible(true);
        jDateChooserAquisicaoEquip.getJCalendar().getDayChooser().setDayBordersVisible(true);
        jTextFieldNomeEquip = new javax.swing.JTextField();
        jLabelStoreEquipID = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButtonSalvarEditarFunc = new javax.swing.JButton();
        jButtonCancelarFuncionario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Equpamento");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Editar informações de Equipamentos"));

        jTextAreaEquip.setColumns(20);
        jTextAreaEquip.setRows(5);
        jScrollPane1.setViewportView(jTextAreaEquip);

        jDateChooserAquisicaoEquip.setDateFormatString("dd '/' MM '/' yyyy");

        jTextFieldNomeEquip.setPreferredSize(new java.awt.Dimension(64, 24));

        jLabel22.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel22.setText("Nome:");

        jLabel23.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel23.setText("Data de Aquisição");

        jLabel24.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel24.setText("Observações");

        jButtonSalvarEditarFunc.setBackground(new java.awt.Color(102, 102, 102));
        jButtonSalvarEditarFunc.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonSalvarEditarFunc.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvarEditarFunc.setText("Salvar");
        jButtonSalvarEditarFunc.setMaximumSize(new java.awt.Dimension(104, 29));
        jButtonSalvarEditarFunc.setMinimumSize(new java.awt.Dimension(104, 29));
        jButtonSalvarEditarFunc.setPreferredSize(new java.awt.Dimension(104, 29));

        jButtonCancelarFuncionario.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCancelarFuncionario.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonCancelarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelarFuncionario.setText("Cancelar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonCancelarFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalvarEditarFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                    .addComponent(jTextFieldNomeEquip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(104, 104, 104)
                                .addComponent(jLabelStoreEquipID, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel24)
                            .addComponent(jLabel23)
                            .addComponent(jDateChooserAquisicaoEquip, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(205, 205, 205))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStoreEquipID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldNomeEquip, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooserAquisicaoEquip, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelarFuncionario)
                    .addComponent(jButtonSalvarEditarFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(144, 144, 144))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarFuncionario;
    private javax.swing.JButton jButtonSalvarEditarFunc;
    private com.toedter.calendar.JDateChooser jDateChooserAquisicaoEquip;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabelStoreEquipID;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaEquip;
    private javax.swing.JTextField jTextFieldNomeEquip;
    // End of variables declaration//GEN-END:variables
}
