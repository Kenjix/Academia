package View;

import java.awt.Frame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class TreinoCliente extends javax.swing.JDialog {

    public TreinoCliente(java.awt.Frame parent, boolean modal) {
        super((Frame) null, modal);
        initComponents();
        jLabelGetStoredMatricula.setVisible(false);
    }

    public JButton getjButtonListTreinoCancel() {
        return jButtonListTreinoCancel;
    }

    public JTable getjTableListTreinosInativos() {
        return jTableListTreinosInativos;
    }

    public JTable getjTableListTreinosAtivos() {
        return jTableListTreinosAtivos;
    }

    public JButton getjButtonDesativaTreino() {
        return jButtonDesativaTreino;
    }

    public JButton getjButtonEditarTreino() {
        return jButtonEditarTreino;
    }

    public JButton getjButtonAtivarTreino() {
        return jButtonAtivarTreino;
    }

    public JButton getjButtonPesquisarTreinoAtivo() {
        return jButtonPesquisarTreinoAtivo;
    }

    public JTextField getjTextFieldPesquisarTreinoAtivo() {
        return jTextFieldPesquisarTreinoAtivo;
    }

    public JButton getjButtonEditarTreinoPDF() {
        return jButtonEditarTreinoPDF;
    }

    public JLabel getjLabelGetStoredMatricula() {
        return jLabelGetStoredMatricula;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listTreino = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        treinosAtivos = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTableListTreinosAtivos = new javax.swing.JTable();
        jTableListTreinosAtivos.getTableHeader().setEnabled(false);
        jButtonEditarTreinoPDF = new javax.swing.JButton();
        jButtonDesativaTreino = new javax.swing.JButton();
        jButtonEditarTreino = new javax.swing.JButton();
        jButtonListTreinoCancel = new javax.swing.JButton();
        treinosInativos = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTableListTreinosInativos = new javax.swing.JTable();
        jTableListTreinosInativos.getTableHeader().setEnabled(false);
        jButtonAtivarTreino = new javax.swing.JButton();
        jTextFieldPesquisarTreinoAtivo = new javax.swing.JTextField();
        jButtonPesquisarTreinoAtivo = new javax.swing.JButton();
        jLabelGetStoredMatricula = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listagem de treinos");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));

        listTreino.setBorder(javax.swing.BorderFactory.createTitledBorder("Listar Treinos"));

        jTableListTreinosAtivos.getTableHeader().setEnabled(false);

        jTableListTreinosAtivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id:", "Nome:", "Exercicio:", "Ordem:", "Carga:", "Series:", "Repetições:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(jTableListTreinosAtivos);

        jButtonEditarTreinoPDF.setBackground(new java.awt.Color(102, 102, 102));
        jButtonEditarTreinoPDF.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonEditarTreinoPDF.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditarTreinoPDF.setText("Gerar PDF");
        jButtonEditarTreinoPDF.setMaximumSize(new java.awt.Dimension(111, 29));
        jButtonEditarTreinoPDF.setMinimumSize(new java.awt.Dimension(111, 29));
        jButtonEditarTreinoPDF.setPreferredSize(new java.awt.Dimension(111, 29));

        jButtonDesativaTreino.setBackground(new java.awt.Color(102, 102, 102));
        jButtonDesativaTreino.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonDesativaTreino.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDesativaTreino.setText("Desativar");

        jButtonEditarTreino.setBackground(new java.awt.Color(102, 102, 102));
        jButtonEditarTreino.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonEditarTreino.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditarTreino.setText("Editar");
        jButtonEditarTreino.setMaximumSize(new java.awt.Dimension(111, 29));
        jButtonEditarTreino.setMinimumSize(new java.awt.Dimension(111, 29));
        jButtonEditarTreino.setPreferredSize(new java.awt.Dimension(111, 29));

        jButtonListTreinoCancel.setBackground(new java.awt.Color(102, 102, 102));
        jButtonListTreinoCancel.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonListTreinoCancel.setForeground(new java.awt.Color(255, 255, 255));
        jButtonListTreinoCancel.setText("Cancelar");
        jButtonListTreinoCancel.setMaximumSize(new java.awt.Dimension(111, 29));
        jButtonListTreinoCancel.setMinimumSize(new java.awt.Dimension(111, 29));
        jButtonListTreinoCancel.setPreferredSize(new java.awt.Dimension(111, 29));

        javax.swing.GroupLayout treinosAtivosLayout = new javax.swing.GroupLayout(treinosAtivos);
        treinosAtivos.setLayout(treinosAtivosLayout);
        treinosAtivosLayout.setHorizontalGroup(
            treinosAtivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, treinosAtivosLayout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addComponent(jButtonListTreinoCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEditarTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDesativaTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEditarTreinoPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );
        treinosAtivosLayout.setVerticalGroup(
            treinosAtivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(treinosAtivosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(treinosAtivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDesativaTreino)
                    .addComponent(jButtonEditarTreinoPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditarTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonListTreinoCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Treinos Ativos", treinosAtivos);

        jTableListTreinosInativos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id:", "Nome:", "Exercicio:", "Ordem:", "Carga:", "Series:", "Repetições:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(jTableListTreinosInativos);

        jButtonAtivarTreino.setBackground(new java.awt.Color(102, 102, 102));
        jButtonAtivarTreino.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonAtivarTreino.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtivarTreino.setText("Ativar");
        jButtonAtivarTreino.setMaximumSize(new java.awt.Dimension(111, 29));
        jButtonAtivarTreino.setMinimumSize(new java.awt.Dimension(111, 29));
        jButtonAtivarTreino.setPreferredSize(new java.awt.Dimension(111, 29));

        javax.swing.GroupLayout treinosInativosLayout = new javax.swing.GroupLayout(treinosInativos);
        treinosInativos.setLayout(treinosInativosLayout);
        treinosInativosLayout.setHorizontalGroup(
            treinosInativosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, treinosInativosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAtivarTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(322, 322, 322))
        );
        treinosInativosLayout.setVerticalGroup(
            treinosInativosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(treinosInativosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAtivarTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Treinos Inativos", treinosInativos);

        jButtonPesquisarTreinoAtivo.setText("Pesquisar");

        javax.swing.GroupLayout listTreinoLayout = new javax.swing.GroupLayout(listTreino);
        listTreino.setLayout(listTreinoLayout);
        listTreinoLayout.setHorizontalGroup(
            listTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listTreinoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane3)
                    .addGroup(listTreinoLayout.createSequentialGroup()
                        .addComponent(jTextFieldPesquisarTreinoAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPesquisarTreinoAtivo)
                        .addGap(70, 70, 70)
                        .addComponent(jLabelGetStoredMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        listTreinoLayout.setVerticalGroup(
            listTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listTreinoLayout.createSequentialGroup()
                .addGroup(listTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(listTreinoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(listTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPesquisarTreinoAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonPesquisarTreinoAtivo)))
                    .addComponent(jLabelGetStoredMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listTreino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listTreino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtivarTreino;
    private javax.swing.JButton jButtonDesativaTreino;
    private javax.swing.JButton jButtonEditarTreino;
    private javax.swing.JButton jButtonEditarTreinoPDF;
    private javax.swing.JButton jButtonListTreinoCancel;
    private javax.swing.JButton jButtonPesquisarTreinoAtivo;
    private javax.swing.JLabel jLabelGetStoredMatricula;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTableListTreinosAtivos;
    private javax.swing.JTable jTableListTreinosInativos;
    private javax.swing.JTextField jTextFieldPesquisarTreinoAtivo;
    private javax.swing.JPanel listTreino;
    private javax.swing.JPanel treinosAtivos;
    private javax.swing.JPanel treinosInativos;
    // End of variables declaration//GEN-END:variables
}
