package View;

import java.awt.Frame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ExercicioInfo extends javax.swing.JDialog {

    public ExercicioInfo(java.awt.Frame parent, boolean modal) {
        super((Frame) null, modal);
        initComponents();
        jLabelStoreExercID.setVisible(false);
    }

    public JButton getjButtonCancelarExerc() {
        return jButtonCancelarExerc;
    }

    public JButton getjButtonSalvarExerc() {
        return jButtonSalvarExerc;
    }

    public JComboBox<String> getjComboBoxEquipamentoExercicio() {
        return jComboBoxEquipamentoExercicio;
    }

    public JComboBox<String> getjComboBoxGrupoMuscExercicio() {
        return jComboBoxGrupoMuscExercicio;
    }

    public JLabel getjLabelStoreExercID() {
        return jLabelStoreExercID;
    }

    public JTextField getjTextFieldNomeExerc() {
        return jTextFieldNomeExerc;
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldNomeExerc = new javax.swing.JTextField();
        jLabelStoreExercID = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButtonSalvarExerc = new javax.swing.JButton();
        jButtonCancelarExerc = new javax.swing.JButton();
        jComboBoxGrupoMuscExercicio = new javax.swing.JComboBox<>();
        jComboBoxEquipamentoExercicio = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Equpamento");
        setMinimumSize(new java.awt.Dimension(800, 600));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Editar informações de Exercícios"));

        jTextFieldNomeExerc.setPreferredSize(new java.awt.Dimension(64, 24));

        jLabel22.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel22.setText("Nome:");

        jLabel23.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel23.setText("Grupo Muscular:");

        jLabel24.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel24.setText("Equipamento:");

        jButtonSalvarExerc.setBackground(new java.awt.Color(102, 102, 102));
        jButtonSalvarExerc.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonSalvarExerc.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvarExerc.setText("Salvar");
        jButtonSalvarExerc.setMaximumSize(new java.awt.Dimension(104, 29));
        jButtonSalvarExerc.setMinimumSize(new java.awt.Dimension(104, 29));
        jButtonSalvarExerc.setPreferredSize(new java.awt.Dimension(104, 29));

        jButtonCancelarExerc.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCancelarExerc.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonCancelarExerc.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelarExerc.setText("Cancelar");

        jComboBoxGrupoMuscExercicio.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jComboBoxGrupoMuscExercicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Membros Inferiores", "Peitorais", "Dorsais", "Deltóides/Trapézio", "Bíceps", "Tríceps" }));

        jComboBoxEquipamentoExercicio.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jComboBoxEquipamentoExercicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(jLabelStoreExercID, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonCancelarExerc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSalvarExerc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldNomeExerc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxGrupoMuscExercicio, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxEquipamentoExercicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING))))))
                .addGap(205, 275, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabelStoreExercID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldNomeExerc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxGrupoMuscExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxEquipamentoExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvarExerc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelarExerc))
                .addGap(191, 191, 191))
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
    private javax.swing.JButton jButtonCancelarExerc;
    private javax.swing.JButton jButtonSalvarExerc;
    private javax.swing.JComboBox<String> jComboBoxEquipamentoExercicio;
    private javax.swing.JComboBox<String> jComboBoxGrupoMuscExercicio;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabelStoreExercID;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldNomeExerc;
    // End of variables declaration//GEN-END:variables
}
