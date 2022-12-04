package View;

import com.toedter.calendar.JDateChooser;
import java.awt.Dimension;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }

    public void limparCampos() {
        jTextFieldNome.setText("");
        jFormattedTextFieldCpf.setValue("");
        jDateChooserDataNasc.setCalendar(null);
        jTextFieldPeso.setText("");
        jTextFieldAltura.setText("");
        jTextFieldEmail.setText("");
        jFormattedTextFieldTel.setValue(null);
        jFormattedTextFieldCel.setValue(null);
        jTextFieldObjetivo.setText("");
        jTextAreaObserv.setText("");
    }

    //Cliente
    public JPanel getCRUDClient() {
        return CRUDClient;
    }

    public JButton getjButtonPesquisarCliente() {
        return jButtonPesquisarCliente;
    }

    public JTextField getjTextFieldPesquisarCliente() {
        return jTextFieldPesquisarCliente;
    }

    public JButton getjButtonCadastrarCliente() {
        return jButtonCadastrarCliente;
    }

    public JButton getjButtonListarCliente() {
        return jButtonListarCliente;
    }

    public JButton getjButtonDeletarCliente() {
        return jButtonDeletarCliente;
    }

    public JPanel getCadCliente() {
        return cadCliente;
    }

    public JPanel getListCliente() {
        return listCliente;
    }

    public JPanel getDelCliente() {
        return delCliente;
    }

    public JButton getjButtonAtivarCliente() {
        return jButtonAtivarCliente;
    }

    public JButton getjButtonCancelarCliente() {
        return jButtonCancelarCliente;
    }

    public JButton getjButtonDelCliente() {
        return jButtonDelCliente;
    }

    public JTable getjTableDeletar() {
        return jTableDeletar;
    }
    public JButton getjButtonPesquisarClienteDel(){
        return jButtonPesquisarClienteDel;
    }
    
    public JTextField getjTextFieldPesquisarClienteDel(){
        return jTextFieldPesquisarClienteDel;
    }
    
    public JButton getjButtonEditarCliente() {
        return jButtonEditarCliente;
    }

    public JTable getjTableAtivosCliente() {
        return jTableAtivosCliente;
    }

    public JTable getjTableInativosCliente() {
        return jTableInativosCliente;
    }

    public JButton getjButtonAdicionarFoto() {
        return jButtonAdicionarFoto;
    }

    public JButton getjButtonRemoverFoto() {
        return jButtonRemoverFoto;
    }

    public JLabel getjLabelFoto() {
        return jLabelFoto;
    }

    public JButton getjButtonSalvarCliente() {
        return jButtonSalvarCliente;
    }

    public JDateChooser getjDateChooserDataNasc() {
        return jDateChooserDataNasc;
    }

    public JDateChooser getjDateChooserMatricula() {
        return jDateChooserMatricula;
    }

    public JFormattedTextField getjFormattedTextFieldCpf() {
        return jFormattedTextFieldCpf;
    }

    public JFormattedTextField getjFormattedTextFieldTel() {
        return jFormattedTextFieldTel;
    }

    public JTextArea getjTextAreaObserv() {
        return jTextAreaObserv;
    }

    public JTextField getjTextFieldAltura() {
        return jTextFieldAltura;
    }

    public JTextField getjTextFieldEmail() {
        return jTextFieldEmail;
    }

    public JTextField getjTextFieldNome() {
        return jTextFieldNome;
    }

    public JTextField getjTextFieldObjetivo() {
        return jTextFieldObjetivo;
    }

    public JTextField getjTextFieldPeso() {
        return jTextFieldPeso;
    }

    public JFormattedTextField getjFormattedTextFieldCel() {
        return jFormattedTextFieldCel;
    }

    //Funcionario
    public JButton getjButtonCadastrarFuncio() {
        return jButtonCadastrarFuncio;
    }

    public JButton getjButtonListarFuncio() {
        return jButtonListarFuncio;
    }

    public JButton getjButtonDeletarFuncio() {
        return jButtonDeletarFuncio;
    }

    public JPanel getCRUDFuncio() {
        return CRUDFuncio;
    }

    public JPanel getCadFuncio() {
        return cadFuncio;
    }

    public JPanel getListFuncio() {
        return listFuncio;
    }

    public JPanel getDelFuncio() {
        return delFuncio;
    }

    public JButton getjButtonCancelarFuncionario() {
        return jButtonCancelarFuncionario;
    }

    public JButton getjButtonDesativarFuncionario() {
        return jButtonDeletarFuncionario;
    }

    public JButton getjButtonSalvarFuncio() {
        return jButtonSalvarFuncio;
    }
    
    public JComboBox<String> getjComboBoxCargaHorariaFuncionario() {
        return jComboBoxCargaHorariaFuncionario;
    }

    public JComboBox<String> getjComboBoxTurnoFuncionario() {
        return jComboBoxTurnoFuncionario;
    }

    public JDateChooser getjDateChooserDataNascFuncionario() {
        return jDateChooserDataNascFuncionario;
    }

    public JFormattedTextField getjFormattedTextFieldCpfFuncionario() {
        return jFormattedTextFieldCpfFuncionario;
    }

    public JFormattedTextField getjFormattedTextFieldTelFuncionario() {
        return jFormattedTextFieldTelFuncionario;
    }

    public JTable getjTableAtivosFuncionario() {
        return jTableListarFuncionario;
    }

    public JTextArea getjTextAreaObservaFuncionario() {
        return jTextAreaObservaFuncionario;
    }

    public JTextField getjTextFieldAlturaFuncionario() {
        return jTextFieldAlturaFuncionario;
    }

    public JTextField getjTextFieldEmailFuncionario() {
        return jTextFieldEmailFuncionario;
    }

    public JTextField getjTextFieldEspecialidadeFuncionario() {
        return jTextFieldEspecialidadeFuncionario;
    }

    public JTextField getjTextFieldNomeFuncionario() {
        return jTextFieldNomeFuncionario;
    }

    public JTextField getjTextFieldPesoFuncionario() {
        return jTextFieldPesoFuncionario;
    }

    public JButton getjButtonDeletarFuncionario() {
        return jButtonDeletarFuncionario;
    }

    public JButton getjButtonVisuCompleFuncionario() {
        return jButtonVisuCompleFuncionario;
    }

    public JTable getjTableFuncionarioDeletar() {
        return jTableFuncionarioDeletar;
    }

    public JTable getjTableListarFuncionario() {
        return jTableListarFuncionario;
    }

    public JFormattedTextField getjFormattedTextFieldCelFuncionario() {
        return jFormattedTextFieldCelFuncionario;
    }

    //Equipamento    
    public JPanel getCRUDEquipa() {
        return CRUDEquipa;
    }

    public JButton getjButtonCadastrarEquipamento() {
        return jButtonCadastrarEquipamento;
    }

    public JButton getjButtonListarEquipamento() {
        return jButtonListarEquipamento;
    }

    public JButton getjButtonDeletarEquipamento() {
        return jButtonDeletarEquipamento;
    }

    public JPanel getCadEquipa() {
        return cadEquipa;
    }

    public JPanel getListEquipa() {
        return listEquipa;
    }

    public JPanel getDelEquipa() {
        return delEquipa;
    }

    //Exercicio
    public JPanel getCRUDExerc() {
        return CRUDExerc;
    }

    public JButton getjButtonCadastrarExercicio() {
        return jButtonCadastrarExercicio;
    }

    public JButton getjButtonListarExercicio() {
        return jButtonListarExercicio;
    }

    public JButton getjButtonDeletarExercicio() {
        return jButtonDeletarExercicio;
    }

    public JPanel getCadExerc() {
        return cadExerc;
    }

    public JPanel getListExerc() {
        return listExerc;
    }

    public JPanel getDelExerc() {
        return delExerc;
    }

    //Treino
    public JPanel getCRUDTreino() {
        return CRUDTreino;
    }

    public JButton getjButtonCadastrarTreino() {
        return jButtonCadastrarTreino;
    }

    public JButton getjButtonListarTreino() {
        return jButtonListarTreino;
    }

    public JButton getjButtonDeletarTreino() {
        return jButtonDeletarTreino;
    }

    public JPanel getCadTreino() {
        return cadTreino;
    }

    public JPanel getListTreino() {
        return listTreino;
    }

    public JPanel getDelTreino() {
        return delTreino;
    }

    public JTabbedPane getjTabbedPaneClientes() {
        return jTabbedPaneClientes;
    }

    public JButton getjButtonAtualizar() {
        return jButtonAtualizar;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelInicio = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanelPessoa = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPessoa = new javax.swing.JTabbedPane();
        jPanelCliente = new javax.swing.JPanel();
        jPanelMenuClient = new javax.swing.JPanel();
        jButtonCadastrarCliente = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButtonListarCliente = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButtonDeletarCliente = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        CRUDClient = new javax.swing.JPanel();
        inicioCliente = new javax.swing.JPanel();
        delCliente = new javax.swing.JPanel();
        jScrollPaneAtivos1 = new javax.swing.JScrollPane();
        jTableDeletar = new javax.swing.JTable();
        jButtonDelCliente = new javax.swing.JButton();
        jTextFieldPesquisarClienteDel = new javax.swing.JTextField();
        jButtonPesquisarClienteDel = new javax.swing.JButton();
        listCliente = new javax.swing.JPanel();
        jTabbedPaneClientes = new javax.swing.JTabbedPane();
        clienteAtivo = new javax.swing.JPanel();
        jScrollPaneAtivos = new javax.swing.JScrollPane();
        jTableAtivosCliente = new javax.swing.JTable();
        jTableAtivosCliente.getTableHeader().setEnabled(false);
        jButtonEditarCliente = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        clienteInativo = new javax.swing.JPanel();
        jScrollPaneInativos = new javax.swing.JScrollPane();
        jTableInativosCliente = new javax.swing.JTable();
        jTableInativosCliente.getTableHeader().setEnabled(false);
        jButtonAtivarCliente = new javax.swing.JButton();
        jTextFieldPesquisarCliente = new javax.swing.JTextField();
        jButtonPesquisarCliente = new javax.swing.JButton();
        cadCliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPeso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldAltura = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldObjetivo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaObserv = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jLabelFoto = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButtonAdicionarFoto = new javax.swing.JButton();
        jButtonRemoverFoto = new javax.swing.JButton();
        jDateChooserDataNasc = new JDateChooser("dd/MM/yyyy", "##/##/####" , ' ');
        jDateChooserDataNasc.getJCalendar().setPreferredSize(new Dimension(250, 200));
        jDateChooserDataNasc.getJCalendar().setWeekOfYearVisible(false);
        jDateChooserDataNasc.getJCalendar().setTodayButtonVisible(true);
        jDateChooserDataNasc.getJCalendar().getDayChooser().setDayBordersVisible(true);
        jDateChooserMatricula = new JDateChooser("dd/MM/yyyy", "##/##/####" , ' ');
        jDateChooserMatricula.setDate(new Date());
        jDateChooserMatricula.getJCalendar().setPreferredSize(new Dimension(250, 200));
        jDateChooserMatricula.getJCalendar().setWeekOfYearVisible(false);
        jDateChooserMatricula.getJCalendar().setTodayButtonVisible(true);
        jDateChooserMatricula.getJCalendar().getDayChooser().setDayBordersVisible(true);
        jLabel13 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jButtonCancelarCliente = new javax.swing.JButton();
        jButtonSalvarCliente = new javax.swing.JButton();
        jFormattedTextFieldTel = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCel = new javax.swing.JFormattedTextField();
        jPanelFunc = new javax.swing.JPanel();
        jPanelMenuFuncio = new javax.swing.JPanel();
        jButtonCadastrarFuncio = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jButtonListarFuncio = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jButtonDeletarFuncio = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        CRUDFuncio = new javax.swing.JPanel();
        inicioFunc = new javax.swing.JPanel();
        cadFuncio = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jTextFieldNomeFuncionario = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jFormattedTextFieldCpfFuncionario = new javax.swing.JFormattedTextField();
        jLabel31 = new javax.swing.JLabel();
        jDateChooserDataNascFuncionario = new JDateChooser("dd/MM/yyyy", "##/##/####" , ' ');
        jDateChooserDataNascFuncionario.getJCalendar().setPreferredSize(new Dimension(250, 200));
        jDateChooserDataNascFuncionario.getJCalendar().setWeekOfYearVisible(false);
        jDateChooserDataNascFuncionario.getJCalendar().setTodayButtonVisible(true);
        jDateChooserDataNascFuncionario.getJCalendar().getDayChooser().setDayBordersVisible(true);
        jLabel35 = new javax.swing.JLabel();
        jTextFieldPesoFuncionario = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jTextFieldAlturaFuncionario = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jTextFieldEmailFuncionario = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jFormattedTextFieldTelFuncionario = new javax.swing.JFormattedTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaObservaFuncionario = new javax.swing.JTextArea();
        jComboBoxCargaHorariaFuncionario = new javax.swing.JComboBox<>();
        jComboBoxTurnoFuncionario = new javax.swing.JComboBox<>();
        jButtonCancelarFuncionario = new javax.swing.JButton();
        jButtonSalvarFuncio = new javax.swing.JButton();
        jTextFieldEspecialidadeFuncionario = new javax.swing.JTextField();
        jFormattedTextFieldCelFuncionario = new javax.swing.JFormattedTextField();
        jLabel49 = new javax.swing.JLabel();
        listFuncio = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableListarFuncionario = new javax.swing.JTable();
        jButtonVisuCompleFuncionario = new javax.swing.JButton();
        delFuncio = new javax.swing.JPanel();
        jScrollPaneAtivos3 = new javax.swing.JScrollPane();
        jTableFuncionarioDeletar = new javax.swing.JTable();
        jButtonDeletarFuncionario = new javax.swing.JButton();
        jPanelEquip = new javax.swing.JPanel();
        jPanelMenuEquipa = new javax.swing.JPanel();
        jButtonCadastrarEquipamento = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jButtonListarEquipamento = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jButtonDeletarEquipamento = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        CRUDEquipa = new javax.swing.JPanel();
        inicioEquipa = new javax.swing.JPanel();
        cadEquipa = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNomeEquipamento = new javax.swing.JTextField();
        jButtonSalvarEquipamento = new javax.swing.JButton();
        listEquipa = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        equipamentoAtivo = new javax.swing.JPanel();
        jScrollPaneAtivos2 = new javax.swing.JScrollPane();
        jTableAtivosEquipamento = new javax.swing.JTable();
        equipamentoInativo = new javax.swing.JPanel();
        jScrollPaneInativos1 = new javax.swing.JScrollPane();
        jTableInativosEquipamento = new javax.swing.JTable();
        jButtonAtivarEquipament = new javax.swing.JButton();
        delEquipa = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonDesativarEquipament = new javax.swing.JButton();
        jPanelExerc = new javax.swing.JPanel();
        jPanelMenuExerc = new javax.swing.JPanel();
        jButtonCadastrarExercicio = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jButtonListarExercicio = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jButtonDeletarExercicio = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        CRUDExerc = new javax.swing.JPanel();
        inicioExerc = new javax.swing.JPanel();
        cadExerc = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jTextFieldNomeExercicio = new javax.swing.JTextField();
        jTextFieldGrupoMuscExercicio = new javax.swing.JTextField();
        jButtonSalvarExercicio = new javax.swing.JButton();
        listExerc = new javax.swing.JPanel();
        delExerc = new javax.swing.JPanel();
        jPanelTreino = new javax.swing.JPanel();
        jPanelMenuTreino = new javax.swing.JPanel();
        jButtonCadastrarTreino = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jButtonListarTreino = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jButtonDeletarTreino = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        CRUDTreino = new javax.swing.JPanel();
        inicioTreino = new javax.swing.JPanel();
        cadTreino = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableTreinoClientes = new javax.swing.JTable();
        jLabel37 = new javax.swing.JLabel();
        jComboBoxExercicios = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        jComboBoxOrdem = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        jTextFieldSeriesTreino = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jTextFieldCargaTreino = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jTextFieldRepeticaoTreino = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jComboBoxInstrutorTreino = new javax.swing.JComboBox<>();
        jLabel43 = new javax.swing.JLabel();
        jTextFieldTipoTreino = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaObservacaoTreino = new javax.swing.JTextArea();
        jButtonCancelarTreino = new javax.swing.JButton();
        jButtonSalvarTreino = new javax.swing.JButton();
        listTreino = new javax.swing.JPanel();
        delTreino = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setResizable(false);

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(800, 600));

        jPanelInicio.setPreferredSize(new java.awt.Dimension(1024, 768));
        jPanelInicio.setLayout(null);

        jPanel2.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Nirmala UI Semilight", 2, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("\"Só os fortes sobrevivem...\"");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(50, 260, 240, 25);

        jLabel16.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("BEM - VINDO À ACADEMIA");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(30, 20, 240, 25);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo acad.png"))); // NOI18N
        jPanel2.add(jLabel8);
        jLabel8.setBounds(0, 0, 300, 300);

        jPanelInicio.add(jPanel2);
        jPanel2.setBounds(580, 130, 300, 300);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundo.jpg"))); // NOI18N
        jPanelInicio.add(jLabel2);
        jLabel2.setBounds(10, 30, 1000, 670);

        jTabbedPane1.addTab("Inicio", jPanelInicio);

        jPanelPessoa.setPreferredSize(new java.awt.Dimension(1024, 768));

        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 768));

        jPanelCliente.setPreferredSize(new java.awt.Dimension(1024, 768));

        jButtonCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/novoCliente.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Cadastrar");

        jButtonListarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/listar.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Visualizar e Editar");

        jButtonDeletarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/deletar.png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Excluir");

        javax.swing.GroupLayout jPanelMenuClientLayout = new javax.swing.GroupLayout(jPanelMenuClient);
        jPanelMenuClient.setLayout(jPanelMenuClientLayout);
        jPanelMenuClientLayout.setHorizontalGroup(
            jPanelMenuClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuClientLayout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addGroup(jPanelMenuClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelMenuClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMenuClientLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jButtonListarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuClientLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152)))
                .addGroup(jPanelMenuClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDeletarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMenuClientLayout.setVerticalGroup(
            jPanelMenuClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuClientLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelMenuClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMenuClientLayout.createSequentialGroup()
                        .addGroup(jPanelMenuClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonDeletarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonListarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelMenuClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel15)))
                    .addGroup(jPanelMenuClientLayout.createSequentialGroup()
                        .addComponent(jButtonCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CRUDClient.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout inicioClienteLayout = new javax.swing.GroupLayout(inicioCliente);
        inicioCliente.setLayout(inicioClienteLayout);
        inicioClienteLayout.setHorizontalGroup(
            inicioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1021, Short.MAX_VALUE)
        );
        inicioClienteLayout.setVerticalGroup(
            inicioClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );

        CRUDClient.add(inicioCliente, "card4");

        delCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Deletar Cliente"));

        jTableDeletar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nome", "CPF", "Telefone", "E-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneAtivos1.setViewportView(jTableDeletar);

        jButtonDelCliente.setBackground(new java.awt.Color(102, 102, 102));
        jButtonDelCliente.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonDelCliente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelCliente.setText("Excluir");

        jButtonPesquisarClienteDel.setText("Pesquisar");

        javax.swing.GroupLayout delClienteLayout = new javax.swing.GroupLayout(delCliente);
        delCliente.setLayout(delClienteLayout);
        delClienteLayout.setHorizontalGroup(
            delClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, delClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonDelCliente)
                .addGap(448, 448, 448))
            .addGroup(delClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(delClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneAtivos1)
                    .addGroup(delClienteLayout.createSequentialGroup()
                        .addComponent(jTextFieldPesquisarClienteDel, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPesquisarClienteDel)
                        .addGap(0, 639, Short.MAX_VALUE)))
                .addContainerGap())
        );
        delClienteLayout.setVerticalGroup(
            delClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(delClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisarClienteDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisarClienteDel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPaneAtivos1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDelCliente)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        CRUDClient.add(delCliente, "card6");

        listCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Listar Clientes"), "Listar Clientes"));

        jTableAtivosCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nome", "CPF", "Telefone", "E-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneAtivos.setViewportView(jTableAtivosCliente);

        jButtonEditarCliente.setBackground(new java.awt.Color(102, 102, 102));
        jButtonEditarCliente.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonEditarCliente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditarCliente.setText("Editar Cliente");

        jButtonAtualizar.setBackground(new java.awt.Color(102, 102, 102));
        jButtonAtualizar.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtualizar.setText("Atualizar");

        javax.swing.GroupLayout clienteAtivoLayout = new javax.swing.GroupLayout(clienteAtivo);
        clienteAtivo.setLayout(clienteAtivoLayout);
        clienteAtivoLayout.setHorizontalGroup(
            clienteAtivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clienteAtivoLayout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(jButtonEditarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAtualizar)
                .addContainerGap(323, Short.MAX_VALUE))
            .addComponent(jScrollPaneAtivos)
        );
        clienteAtivoLayout.setVerticalGroup(
            clienteAtivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clienteAtivoLayout.createSequentialGroup()
                .addComponent(jScrollPaneAtivos, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(clienteAtivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditarCliente)
                    .addComponent(jButtonAtualizar))
                .addContainerGap())
        );

        jTabbedPaneClientes.addTab("Clientes Ativos", clienteAtivo);

        jTableInativosCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nome", "CPF", "Telefone", "E-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneInativos.setViewportView(jTableInativosCliente);

        jButtonAtivarCliente.setBackground(new java.awt.Color(102, 102, 102));
        jButtonAtivarCliente.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonAtivarCliente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtivarCliente.setText("Ativar");

        javax.swing.GroupLayout clienteInativoLayout = new javax.swing.GroupLayout(clienteInativo);
        clienteInativo.setLayout(clienteInativoLayout);
        clienteInativoLayout.setHorizontalGroup(
            clienteInativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneInativos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 995, Short.MAX_VALUE)
            .addGroup(clienteInativoLayout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(jButtonAtivarCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        clienteInativoLayout.setVerticalGroup(
            clienteInativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clienteInativoLayout.createSequentialGroup()
                .addComponent(jScrollPaneInativos, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAtivarCliente)
                .addContainerGap())
        );

        jTabbedPaneClientes.addTab("Clientes Inativos", clienteInativo);

        jButtonPesquisarCliente.setText("Pesquisar");

        javax.swing.GroupLayout listClienteLayout = new javax.swing.GroupLayout(listCliente);
        listCliente.setLayout(listClienteLayout);
        listClienteLayout.setHorizontalGroup(
            listClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPaneClientes)
                    .addGroup(listClienteLayout.createSequentialGroup()
                        .addComponent(jTextFieldPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPesquisarCliente)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        listClienteLayout.setVerticalGroup(
            listClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPaneClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CRUDClient.add(listCliente, "card3");

        cadCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar Cliente"));
        cadCliente.setPreferredSize(new java.awt.Dimension(1024, 768));

        jLabel1.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel1.setText("Nome:");

        jTextFieldNome.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel4.setText("Data de Nascimento:");

        jLabel5.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel5.setText("CPF:");

        jTextFieldPeso.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel6.setText("Altura:");

        jTextFieldAltura.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel7.setText("Data de Matrícula:");

        jTextFieldObjetivo.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel9.setText("Objetivo do Treino:");

        jTextAreaObserv.setColumns(20);
        jTextAreaObserv.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jTextAreaObserv.setLineWrap(true);
        jTextAreaObserv.setRows(5);
        jScrollPane1.setViewportView(jTextAreaObserv);

        jLabel11.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel11.setText("Observações:");

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

        jLabelFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/userplaceholder.png"))); // NOI18N
        jLabelFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelFoto.setMaximumSize(new java.awt.Dimension(150, 200));
        jLabelFoto.setMinimumSize(new java.awt.Dimension(150, 200));
        jLabelFoto.setPreferredSize(new java.awt.Dimension(150, 200));

        jLabel14.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel14.setText("Foto:");

        jButtonAdicionarFoto.setText("Adicionar");

        jButtonRemoverFoto.setText("Remover");

        jDateChooserDataNasc.setDateFormatString("dd '/' MM '/' yyyy");

        jDateChooserMatricula.setDateFormatString("dd '/' MM '/' yyyy");

        jLabel13.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel13.setText("Peso:");

        jTextFieldEmail.setMinimumSize(new java.awt.Dimension(64, 24));

        jLabel18.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel18.setText("Email:");

        jLabel19.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel19.setText("Telefone:");

        jLabel48.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel48.setText("Celular:");

        jButtonCancelarCliente.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCancelarCliente.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonCancelarCliente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelarCliente.setText("Cancelar");
        jButtonCancelarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarClienteActionPerformed(evt);
            }
        });

        jButtonSalvarCliente.setBackground(new java.awt.Color(102, 102, 102));
        jButtonSalvarCliente.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonSalvarCliente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvarCliente.setText("Salvar");

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

        javax.swing.GroupLayout cadClienteLayout = new javax.swing.GroupLayout(cadCliente);
        cadCliente.setLayout(cadClienteLayout);
        cadClienteLayout.setHorizontalGroup(
            cadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadClienteLayout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addGroup(cadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadClienteLayout.createSequentialGroup()
                        .addComponent(jButtonCancelarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalvarCliente))
                    .addComponent(jScrollPane1)
                    .addGroup(cadClienteLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(cadClienteLayout.createSequentialGroup()
                        .addGroup(cadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldObjetivo)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cadClienteLayout.createSequentialGroup()
                                .addGroup(cadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(cadClienteLayout.createSequentialGroup()
                                        .addGroup(cadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel9)
                                            .addComponent(jFormattedTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(cadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel48)
                                            .addComponent(jFormattedTextFieldCel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(cadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel18)
                                        .addGroup(cadClienteLayout.createSequentialGroup()
                                            .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel1)
                                        .addGroup(cadClienteLayout.createSequentialGroup()
                                            .addGroup(cadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(cadClienteLayout.createSequentialGroup()
                                                    .addComponent(jLabel13)
                                                    .addGap(55, 55, 55)
                                                    .addComponent(jLabel6)
                                                    .addGap(63, 63, 63))
                                                .addGroup(cadClienteLayout.createSequentialGroup()
                                                    .addComponent(jFormattedTextFieldCpf)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cadClienteLayout.createSequentialGroup()
                                                    .addComponent(jLabel5)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                            .addGroup(cadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(cadClienteLayout.createSequentialGroup()
                                                    .addComponent(jLabel7)
                                                    .addGap(0, 0, Short.MAX_VALUE))
                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jDateChooserDataNasc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jDateChooserMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(7, 7, 7)))
                        .addGap(26, 26, 26)
                        .addGroup(cadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cadClienteLayout.createSequentialGroup()
                                .addComponent(jButtonAdicionarFoto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonRemoverFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cadClienteLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(cadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(218, 218, 218))
        );
        cadClienteLayout.setVerticalGroup(
            cadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadClienteLayout.createSequentialGroup()
                .addGroup(cadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(cadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAdicionarFoto)
                            .addComponent(jButtonRemoverFoto)))
                    .addGroup(cadClienteLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cadClienteLayout.createSequentialGroup()
                                .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(cadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)))
                            .addComponent(jDateChooserDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooserMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel48))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jFormattedTextFieldTel, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(jFormattedTextFieldCel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(4, 4, 4)
                .addComponent(jTextFieldObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSalvarCliente)
                    .addComponent(jButtonCancelarCliente))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        CRUDClient.add(cadCliente, "card2");

        javax.swing.GroupLayout jPanelClienteLayout = new javax.swing.GroupLayout(jPanelCliente);
        jPanelCliente.setLayout(jPanelClienteLayout);
        jPanelClienteLayout.setHorizontalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenuClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CRUDClient, javax.swing.GroupLayout.DEFAULT_SIZE, 1021, Short.MAX_VALUE)
        );
        jPanelClienteLayout.setVerticalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMenuClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CRUDClient, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE))
        );

        jTabbedPessoa.addTab("Cliente", jPanelCliente);

        jButtonCadastrarFuncio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/novoFuncionario.png"))); // NOI18N

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Cadastrar");

        jButtonListarFuncio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/listar.png"))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Visualizar e Editar");

        jButtonDeletarFuncio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/deletar.png"))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Deletar");

        javax.swing.GroupLayout jPanelMenuFuncioLayout = new javax.swing.GroupLayout(jPanelMenuFuncio);
        jPanelMenuFuncio.setLayout(jPanelMenuFuncioLayout);
        jPanelMenuFuncioLayout.setHorizontalGroup(
            jPanelMenuFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuFuncioLayout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addGroup(jPanelMenuFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCadastrarFuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelMenuFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMenuFuncioLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jButtonListarFuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuFuncioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149)))
                .addGroup(jPanelMenuFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDeletarFuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMenuFuncioLayout.setVerticalGroup(
            jPanelMenuFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuFuncioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelMenuFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCadastrarFuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonListarFuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDeletarFuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelMenuFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel23)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18))
        );

        CRUDFuncio.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout inicioFuncLayout = new javax.swing.GroupLayout(inicioFunc);
        inicioFunc.setLayout(inicioFuncLayout);
        inicioFuncLayout.setHorizontalGroup(
            inicioFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1021, Short.MAX_VALUE)
        );
        inicioFuncLayout.setVerticalGroup(
            inicioFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );

        CRUDFuncio.add(inicioFunc, "card2");

        cadFuncio.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar Funcionário"));

        jLabel22.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel22.setText("Nome:");

        jTextFieldNomeFuncionario.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel26.setText("CPF:");

        try {
            jFormattedTextFieldCpfFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCpfFuncionario.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N

        jLabel31.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel31.setText("Data de Nascimento:");

        jDateChooserDataNascFuncionario.setDateFormatString("dd '/' MM '/' yyyy");

        jLabel35.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel35.setText("Peso:");

        jTextFieldPesoFuncionario.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N

        jLabel45.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel45.setText("Altura:");

        jTextFieldAlturaFuncionario.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N

        jLabel46.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel46.setText("Email:");

        jTextFieldEmailFuncionario.setMinimumSize(new java.awt.Dimension(64, 24));

        jLabel47.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel47.setText("Telefone:");

        try {
            jFormattedTextFieldTelFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel50.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel50.setText("Especialidade:");

        jLabel51.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel51.setText("Turno:");

        jLabel52.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel52.setText("Carga Horária (h):");

        jLabel53.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel53.setText("Observação:");

        jTextAreaObservaFuncionario.setColumns(20);
        jTextAreaObservaFuncionario.setRows(5);
        jScrollPane4.setViewportView(jTextAreaObservaFuncionario);

        jComboBoxCargaHorariaFuncionario.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jComboBoxCargaHorariaFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "4", "8", "20", "40" }));

        jComboBoxTurnoFuncionario.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jComboBoxTurnoFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Manhã", "Tarde", "Noite" }));

        jButtonCancelarFuncionario.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCancelarFuncionario.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonCancelarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelarFuncionario.setText("Cancelar");

        jButtonSalvarFuncio.setBackground(new java.awt.Color(102, 102, 102));
        jButtonSalvarFuncio.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonSalvarFuncio.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvarFuncio.setText("Salvar");

        jTextFieldEspecialidadeFuncionario.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N

        try {
            jFormattedTextFieldCelFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel49.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel49.setText("Celular:");

        javax.swing.GroupLayout cadFuncioLayout = new javax.swing.GroupLayout(cadFuncio);
        cadFuncio.setLayout(cadFuncioLayout);
        cadFuncioLayout.setHorizontalGroup(
            cadFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadFuncioLayout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addGroup(cadFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cadFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(cadFuncioLayout.createSequentialGroup()
                            .addGroup(cadFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel31)
                                .addComponent(jDateChooserDataNascFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(cadFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(cadFuncioLayout.createSequentialGroup()
                                    .addComponent(jLabel35)
                                    .addGap(67, 67, 67)
                                    .addComponent(jLabel45))
                                .addGroup(cadFuncioLayout.createSequentialGroup()
                                    .addComponent(jTextFieldPesoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldAlturaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(cadFuncioLayout.createSequentialGroup()
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(399, 399, 399))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cadFuncioLayout.createSequentialGroup()
                            .addGroup(cadFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel47)
                                .addComponent(jFormattedTextFieldTelFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(cadFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadFuncioLayout.createSequentialGroup()
                                    .addComponent(jLabel49)
                                    .addGap(135, 135, 135))
                                .addComponent(jFormattedTextFieldCelFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldEmailFuncionario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jFormattedTextFieldCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addGroup(cadFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(cadFuncioLayout.createSequentialGroup()
                            .addComponent(jButtonCancelarFuncionario)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSalvarFuncio))
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cadFuncioLayout.createSequentialGroup()
                            .addComponent(jTextFieldEspecialidadeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)
                            .addGroup(cadFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxTurnoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(34, 34, 34)
                            .addGroup(cadFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBoxCargaHorariaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 249, Short.MAX_VALUE))
        );
        cadFuncioLayout.setVerticalGroup(
            cadFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadFuncioLayout.createSequentialGroup()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cadFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cadFuncioLayout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(34, 34, 34))
                    .addComponent(jFormattedTextFieldCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cadFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cadFuncioLayout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooserDataNascFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cadFuncioLayout.createSequentialGroup()
                        .addGroup(cadFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel45)
                            .addComponent(jLabel35))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cadFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPesoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAlturaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cadFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cadFuncioLayout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldTelFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cadFuncioLayout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldCelFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEmailFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cadFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cadFuncioLayout.createSequentialGroup()
                        .addGroup(cadFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel51)
                            .addComponent(jLabel52))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cadFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxTurnoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEspecialidadeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxCargaHorariaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(cadFuncioLayout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addGap(34, 34, 34)))
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(cadFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelarFuncionario)
                    .addComponent(jButtonSalvarFuncio))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        CRUDFuncio.add(cadFuncio, "card5");

        listFuncio.setBorder(javax.swing.BorderFactory.createTitledBorder("Listar Funcionários"));

        jTableListarFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Contato", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTableListarFuncionario);

        jButtonVisuCompleFuncionario.setBackground(new java.awt.Color(102, 102, 102));
        jButtonVisuCompleFuncionario.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonVisuCompleFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVisuCompleFuncionario.setText("Visualização Completa");

        javax.swing.GroupLayout listFuncioLayout = new javax.swing.GroupLayout(listFuncio);
        listFuncio.setLayout(listFuncioLayout);
        listFuncioLayout.setHorizontalGroup(
            listFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listFuncioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
            .addGroup(listFuncioLayout.createSequentialGroup()
                .addGap(371, 371, 371)
                .addComponent(jButtonVisuCompleFuncionario)
                .addContainerGap(415, Short.MAX_VALUE))
        );
        listFuncioLayout.setVerticalGroup(
            listFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listFuncioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonVisuCompleFuncionario)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        CRUDFuncio.add(listFuncio, "card3");

        delFuncio.setBorder(javax.swing.BorderFactory.createTitledBorder("Deletar Funcionários"));

        jTableFuncionarioDeletar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "E-mail", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneAtivos3.setViewportView(jTableFuncionarioDeletar);

        jButtonDeletarFuncionario.setBackground(new java.awt.Color(102, 102, 102));
        jButtonDeletarFuncionario.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonDeletarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDeletarFuncionario.setText("Excluir");

        javax.swing.GroupLayout delFuncioLayout = new javax.swing.GroupLayout(delFuncio);
        delFuncio.setLayout(delFuncioLayout);
        delFuncioLayout.setHorizontalGroup(
            delFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneAtivos3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1011, Short.MAX_VALUE)
            .addGroup(delFuncioLayout.createSequentialGroup()
                .addGap(459, 459, 459)
                .addComponent(jButtonDeletarFuncionario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        delFuncioLayout.setVerticalGroup(
            delFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delFuncioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneAtivos3, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButtonDeletarFuncionario)
                .addGap(43, 43, 43))
        );

        CRUDFuncio.add(delFuncio, "card4");

        javax.swing.GroupLayout jPanelFuncLayout = new javax.swing.GroupLayout(jPanelFunc);
        jPanelFunc.setLayout(jPanelFuncLayout);
        jPanelFuncLayout.setHorizontalGroup(
            jPanelFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenuFuncio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CRUDFuncio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelFuncLayout.setVerticalGroup(
            jPanelFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFuncLayout.createSequentialGroup()
                .addComponent(jPanelMenuFuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CRUDFuncio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPessoa.addTab("Funcionário", jPanelFunc);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, 1021, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelPessoaLayout = new javax.swing.GroupLayout(jPanelPessoa);
        jPanelPessoa.setLayout(jPanelPessoaLayout);
        jPanelPessoaLayout.setHorizontalGroup(
            jPanelPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1021, Short.MAX_VALUE)
        );
        jPanelPessoaLayout.setVerticalGroup(
            jPanelPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Pessoa", jPanelPessoa);

        jButtonCadastrarEquipamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/novoEquipa.png"))); // NOI18N

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Cadastrar");

        jButtonListarEquipamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/listar.png"))); // NOI18N

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Listar");

        jButtonDeletarEquipamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inativo.png"))); // NOI18N

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Desativar");

        javax.swing.GroupLayout jPanelMenuEquipaLayout = new javax.swing.GroupLayout(jPanelMenuEquipa);
        jPanelMenuEquipa.setLayout(jPanelMenuEquipaLayout);
        jPanelMenuEquipaLayout.setHorizontalGroup(
            jPanelMenuEquipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuEquipaLayout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addGroup(jPanelMenuEquipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCadastrarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(226, 226, 226)
                .addGroup(jPanelMenuEquipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonListarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(226, 226, 226)
                .addGroup(jPanelMenuEquipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonDeletarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMenuEquipaLayout.setVerticalGroup(
            jPanelMenuEquipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuEquipaLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanelMenuEquipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCadastrarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDeletarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonListarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMenuEquipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addGroup(jPanelMenuEquipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25)
                        .addComponent(jLabel27)))
                .addContainerGap())
        );

        CRUDEquipa.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout inicioEquipaLayout = new javax.swing.GroupLayout(inicioEquipa);
        inicioEquipa.setLayout(inicioEquipaLayout);
        inicioEquipaLayout.setHorizontalGroup(
            inicioEquipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1021, Short.MAX_VALUE)
        );
        inicioEquipaLayout.setVerticalGroup(
            inicioEquipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );

        CRUDEquipa.add(inicioEquipa, "card2");

        cadEquipa.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar Equipamento"));

        jLabel3.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel3.setText("Nome do Equipamento:");

        jTextFieldNomeEquipamento.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N

        jButtonSalvarEquipamento.setBackground(new java.awt.Color(102, 102, 102));
        jButtonSalvarEquipamento.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonSalvarEquipamento.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvarEquipamento.setText("Cadastrar");

        javax.swing.GroupLayout cadEquipaLayout = new javax.swing.GroupLayout(cadEquipa);
        cadEquipa.setLayout(cadEquipaLayout);
        cadEquipaLayout.setHorizontalGroup(
            cadEquipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadEquipaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(cadEquipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(cadEquipaLayout.createSequentialGroup()
                        .addComponent(jTextFieldNomeEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(jButtonSalvarEquipamento)))
                .addContainerGap(494, Short.MAX_VALUE))
        );
        cadEquipaLayout.setVerticalGroup(
            cadEquipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadEquipaLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cadEquipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomeEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvarEquipamento))
                .addContainerGap(472, Short.MAX_VALUE))
        );

        CRUDEquipa.add(cadEquipa, "card6");

        listEquipa.setBorder(javax.swing.BorderFactory.createTitledBorder("Listar Equipamentos"));

        jTableAtivosEquipamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneAtivos2.setViewportView(jTableAtivosEquipamento);

        javax.swing.GroupLayout equipamentoAtivoLayout = new javax.swing.GroupLayout(equipamentoAtivo);
        equipamentoAtivo.setLayout(equipamentoAtivoLayout);
        equipamentoAtivoLayout.setHorizontalGroup(
            equipamentoAtivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneAtivos2, javax.swing.GroupLayout.DEFAULT_SIZE, 999, Short.MAX_VALUE)
        );
        equipamentoAtivoLayout.setVerticalGroup(
            equipamentoAtivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(equipamentoAtivoLayout.createSequentialGroup()
                .addComponent(jScrollPaneAtivos2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Equipamentos em Funcionamento", equipamentoAtivo);

        jTableInativosEquipamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneInativos1.setViewportView(jTableInativosEquipamento);

        jButtonAtivarEquipament.setBackground(new java.awt.Color(102, 102, 102));
        jButtonAtivarEquipament.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonAtivarEquipament.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtivarEquipament.setText("Ativar");

        javax.swing.GroupLayout equipamentoInativoLayout = new javax.swing.GroupLayout(equipamentoInativo);
        equipamentoInativo.setLayout(equipamentoInativoLayout);
        equipamentoInativoLayout.setHorizontalGroup(
            equipamentoInativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneInativos1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 999, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, equipamentoInativoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAtivarEquipament)
                .addGap(544, 544, 544))
        );
        equipamentoInativoLayout.setVerticalGroup(
            equipamentoInativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, equipamentoInativoLayout.createSequentialGroup()
                .addComponent(jScrollPaneInativos1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButtonAtivarEquipament)
                .addGap(35, 35, 35))
        );

        jTabbedPane4.addTab("Equipamentos Desativados", equipamentoInativo);

        javax.swing.GroupLayout listEquipaLayout = new javax.swing.GroupLayout(listEquipa);
        listEquipa.setLayout(listEquipaLayout);
        listEquipaLayout.setHorizontalGroup(
            listEquipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listEquipaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4)
                .addContainerGap())
        );
        listEquipaLayout.setVerticalGroup(
            listEquipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listEquipaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jTabbedPane4)
                .addContainerGap())
        );

        CRUDEquipa.add(listEquipa, "card5");

        delEquipa.setBorder(javax.swing.BorderFactory.createTitledBorder("Desativar Equipamento"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable1);

        jButtonDesativarEquipament.setBackground(new java.awt.Color(102, 102, 102));
        jButtonDesativarEquipament.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonDesativarEquipament.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDesativarEquipament.setText("Desativar");

        javax.swing.GroupLayout delEquipaLayout = new javax.swing.GroupLayout(delEquipa);
        delEquipa.setLayout(delEquipaLayout);
        delEquipaLayout.setHorizontalGroup(
            delEquipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delEquipaLayout.createSequentialGroup()
                .addComponent(jScrollPane6)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, delEquipaLayout.createSequentialGroup()
                .addGap(0, 374, Short.MAX_VALUE)
                .addComponent(jButtonDesativarEquipament, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(513, 513, 513))
        );
        delEquipaLayout.setVerticalGroup(
            delEquipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delEquipaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jButtonDesativarEquipament)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        CRUDEquipa.add(delEquipa, "card3");

        javax.swing.GroupLayout jPanelEquipLayout = new javax.swing.GroupLayout(jPanelEquip);
        jPanelEquip.setLayout(jPanelEquipLayout);
        jPanelEquipLayout.setHorizontalGroup(
            jPanelEquipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenuEquipa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CRUDEquipa, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanelEquipLayout.setVerticalGroup(
            jPanelEquipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEquipLayout.createSequentialGroup()
                .addComponent(jPanelMenuEquipa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CRUDEquipa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Equipamento", jPanelEquip);

        jButtonCadastrarExercicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/novoExercicio.png"))); // NOI18N

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Cadastrar");

        jButtonListarExercicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/listar.png"))); // NOI18N

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Listar");

        jButtonDeletarExercicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/deletar.png"))); // NOI18N

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Deletar");

        javax.swing.GroupLayout jPanelMenuExercLayout = new javax.swing.GroupLayout(jPanelMenuExerc);
        jPanelMenuExerc.setLayout(jPanelMenuExercLayout);
        jPanelMenuExercLayout.setHorizontalGroup(
            jPanelMenuExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuExercLayout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addGroup(jPanelMenuExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCadastrarExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(164, 164, 164)
                .addGroup(jPanelMenuExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonListarExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(163, 163, 163)
                .addGroup(jPanelMenuExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonDeletarExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMenuExercLayout.setVerticalGroup(
            jPanelMenuExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuExercLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanelMenuExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCadastrarExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDeletarExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonListarExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMenuExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addGroup(jPanelMenuExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel32)
                        .addComponent(jLabel30)))
                .addContainerGap())
        );

        CRUDExerc.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout inicioExercLayout = new javax.swing.GroupLayout(inicioExerc);
        inicioExerc.setLayout(inicioExercLayout);
        inicioExercLayout.setHorizontalGroup(
            inicioExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1021, Short.MAX_VALUE)
        );
        inicioExercLayout.setVerticalGroup(
            inicioExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );

        CRUDExerc.add(inicioExerc, "card2");

        cadExerc.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar Exercício"));

        jLabel54.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel54.setText("Nome do Exercício:");

        jLabel55.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel55.setText("Grupo Muscular:");

        jTextFieldNomeExercicio.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N

        jTextFieldGrupoMuscExercicio.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N

        jButtonSalvarExercicio.setBackground(new java.awt.Color(125, 125, 125));
        jButtonSalvarExercicio.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonSalvarExercicio.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvarExercicio.setText("Salvar");

        javax.swing.GroupLayout cadExercLayout = new javax.swing.GroupLayout(cadExerc);
        cadExerc.setLayout(cadExercLayout);
        cadExercLayout.setHorizontalGroup(
            cadExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadExercLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(cadExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(cadExercLayout.createSequentialGroup()
                        .addComponent(jLabel55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldGrupoMuscExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cadExercLayout.createSequentialGroup()
                        .addComponent(jLabel54)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNomeExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cadExercLayout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(jButtonSalvarExercicio)))
                .addContainerGap(570, Short.MAX_VALUE))
        );
        cadExercLayout.setVerticalGroup(
            cadExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadExercLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(cadExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jTextFieldNomeExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(cadExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(jTextFieldGrupoMuscExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jButtonSalvarExercicio)
                .addContainerGap(338, Short.MAX_VALUE))
        );

        CRUDExerc.add(cadExerc, "card3");

        listExerc.setBorder(javax.swing.BorderFactory.createTitledBorder("Listar Exercícios"));

        javax.swing.GroupLayout listExercLayout = new javax.swing.GroupLayout(listExerc);
        listExerc.setLayout(listExercLayout);
        listExercLayout.setHorizontalGroup(
            listExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1011, Short.MAX_VALUE)
        );
        listExercLayout.setVerticalGroup(
            listExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        CRUDExerc.add(listExerc, "card4");

        delExerc.setBorder(javax.swing.BorderFactory.createTitledBorder("Deletar Exercício"));

        javax.swing.GroupLayout delExercLayout = new javax.swing.GroupLayout(delExerc);
        delExerc.setLayout(delExercLayout);
        delExercLayout.setHorizontalGroup(
            delExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1011, Short.MAX_VALUE)
        );
        delExercLayout.setVerticalGroup(
            delExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        CRUDExerc.add(delExerc, "card6");

        javax.swing.GroupLayout jPanelExercLayout = new javax.swing.GroupLayout(jPanelExerc);
        jPanelExerc.setLayout(jPanelExercLayout);
        jPanelExercLayout.setHorizontalGroup(
            jPanelExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenuExerc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CRUDExerc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelExercLayout.setVerticalGroup(
            jPanelExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExercLayout.createSequentialGroup()
                .addComponent(jPanelMenuExerc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CRUDExerc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Exercício", jPanelExerc);

        jButtonCadastrarTreino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/novoTreino.png"))); // NOI18N

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Cadastrar");

        jButtonListarTreino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/listar.png"))); // NOI18N

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Visualizar e Editar");

        jButtonDeletarTreino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/deletar.png"))); // NOI18N

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Deletar");

        javax.swing.GroupLayout jPanelMenuTreinoLayout = new javax.swing.GroupLayout(jPanelMenuTreino);
        jPanelMenuTreino.setLayout(jPanelMenuTreinoLayout);
        jPanelMenuTreinoLayout.setHorizontalGroup(
            jPanelMenuTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuTreinoLayout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addGroup(jPanelMenuTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCadastrarTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelMenuTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMenuTreinoLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jButtonListarTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuTreinoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149)))
                .addGroup(jPanelMenuTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonDeletarTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMenuTreinoLayout.setVerticalGroup(
            jPanelMenuTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuTreinoLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanelMenuTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCadastrarTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDeletarTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonListarTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMenuTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addGroup(jPanelMenuTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel36)
                        .addComponent(jLabel34)))
                .addContainerGap())
        );

        CRUDTreino.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout inicioTreinoLayout = new javax.swing.GroupLayout(inicioTreino);
        inicioTreino.setLayout(inicioTreinoLayout);
        inicioTreinoLayout.setHorizontalGroup(
            inicioTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1021, Short.MAX_VALUE)
        );
        inicioTreinoLayout.setVerticalGroup(
            inicioTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );

        CRUDTreino.add(inicioTreino, "card2");

        cadTreino.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar Treino"));

        jLabel20.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel20.setText("Selecione o Cliente:");

        jTableTreinoClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nome", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableTreinoClientes);

        jLabel37.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel37.setText("Exercício:");

        jComboBoxExercicios.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jComboBoxExercicios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Item 2", "Item 3", "Item 4" }));

        jLabel38.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel38.setText("Ordem de execução:");

        jComboBoxOrdem.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jComboBoxOrdem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "1", "2", "3", "4", "5" }));

        jLabel39.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel39.setText("Número de Séries:");

        jTextFieldSeriesTreino.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N

        jLabel40.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel40.setText("Carga (Kg ou Unid):");

        jTextFieldCargaTreino.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N

        jLabel41.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel41.setText("Número de Repetição:");

        jTextFieldRepeticaoTreino.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N

        jLabel42.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel42.setText("Instrutor responsável pelo treino:");

        jComboBoxInstrutorTreino.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jComboBoxInstrutorTreino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Item 2", "Item 3", "Item 4" }));

        jLabel43.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel43.setText("Tipo de Treino:");

        jTextFieldTipoTreino.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N

        jLabel44.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel44.setText("Observação:");

        jTextAreaObservacaoTreino.setColumns(20);
        jTextAreaObservacaoTreino.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jTextAreaObservacaoTreino.setRows(5);
        jScrollPane3.setViewportView(jTextAreaObservacaoTreino);

        jButtonCancelarTreino.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCancelarTreino.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonCancelarTreino.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelarTreino.setText("Cancelar");

        jButtonSalvarTreino.setBackground(new java.awt.Color(102, 102, 102));
        jButtonSalvarTreino.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonSalvarTreino.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvarTreino.setText("Salvar");

        javax.swing.GroupLayout cadTreinoLayout = new javax.swing.GroupLayout(cadTreino);
        cadTreino.setLayout(cadTreinoLayout);
        cadTreinoLayout.setHorizontalGroup(
            cadTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadTreinoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(cadTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxInstrutorTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cadTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel37)
                        .addComponent(jLabel20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
                        .addComponent(jComboBoxExercicios, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldTipoTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(cadTreinoLayout.createSequentialGroup()
                            .addGroup(cadTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel38)
                                .addComponent(jComboBoxOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(76, 76, 76)
                            .addGroup(cadTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldCargaTreino))
                            .addGap(39, 39, 39)
                            .addGroup(cadTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldSeriesTreino))
                            .addGap(84, 84, 84)
                            .addGroup(cadTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldRepeticaoTreino)))
                        .addComponent(jScrollPane3)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(cadTreinoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jButtonCancelarTreino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalvarTreino)
                .addGap(56, 56, 56))
        );
        cadTreinoLayout.setVerticalGroup(
            cadTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadTreinoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxExercicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cadTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jLabel40)
                    .addComponent(jLabel39)
                    .addComponent(jLabel41))
                .addGap(8, 8, 8)
                .addGroup(cadTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCargaTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSeriesTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRepeticaoTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxInstrutorTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTipoTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(cadTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelarTreino)
                    .addComponent(jButtonSalvarTreino))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CRUDTreino.add(cadTreino, "card6");

        listTreino.setBorder(javax.swing.BorderFactory.createTitledBorder("Listar Treinos"));

        javax.swing.GroupLayout listTreinoLayout = new javax.swing.GroupLayout(listTreino);
        listTreino.setLayout(listTreinoLayout);
        listTreinoLayout.setHorizontalGroup(
            listTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1011, Short.MAX_VALUE)
        );
        listTreinoLayout.setVerticalGroup(
            listTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
        );

        CRUDTreino.add(listTreino, "card5");

        delTreino.setBorder(javax.swing.BorderFactory.createTitledBorder("Deletar Treino"));

        javax.swing.GroupLayout delTreinoLayout = new javax.swing.GroupLayout(delTreino);
        delTreino.setLayout(delTreinoLayout);
        delTreinoLayout.setHorizontalGroup(
            delTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1011, Short.MAX_VALUE)
        );
        delTreinoLayout.setVerticalGroup(
            delTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
        );

        CRUDTreino.add(delTreino, "card3");

        javax.swing.GroupLayout jPanelTreinoLayout = new javax.swing.GroupLayout(jPanelTreino);
        jPanelTreino.setLayout(jPanelTreinoLayout);
        jPanelTreinoLayout.setHorizontalGroup(
            jPanelTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CRUDTreino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelMenuTreino, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelTreinoLayout.setVerticalGroup(
            jPanelTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTreinoLayout.createSequentialGroup()
                .addComponent(jPanelMenuTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CRUDTreino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Treino", jPanelTreino);
        jTabbedPane1.addTab("Configurações", jTabbedPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1021, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextFieldCpfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCpfMouseClicked
        jFormattedTextFieldCpf.setValue(null);
    }//GEN-LAST:event_jFormattedTextFieldCpfMouseClicked

    private void jFormattedTextFieldTelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFormattedTextFieldTelMouseClicked
        jFormattedTextFieldTel.setValue(null);
    }//GEN-LAST:event_jFormattedTextFieldTelMouseClicked

    private void jFormattedTextFieldCelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCelMouseClicked
        jFormattedTextFieldCel.setValue(null);
    }//GEN-LAST:event_jFormattedTextFieldCelMouseClicked

    private void jButtonCancelarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarClienteActionPerformed
        limparCampos();
    }//GEN-LAST:event_jButtonCancelarClienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CRUDClient;
    private javax.swing.JPanel CRUDEquipa;
    private javax.swing.JPanel CRUDExerc;
    private javax.swing.JPanel CRUDFuncio;
    private javax.swing.JPanel CRUDTreino;
    private javax.swing.JPanel cadCliente;
    private javax.swing.JPanel cadEquipa;
    private javax.swing.JPanel cadExerc;
    private javax.swing.JPanel cadFuncio;
    private javax.swing.JPanel cadTreino;
    private javax.swing.JPanel clienteAtivo;
    private javax.swing.JPanel clienteInativo;
    private javax.swing.JPanel delCliente;
    private javax.swing.JPanel delEquipa;
    private javax.swing.JPanel delExerc;
    private javax.swing.JPanel delFuncio;
    private javax.swing.JPanel delTreino;
    private javax.swing.JPanel equipamentoAtivo;
    private javax.swing.JPanel equipamentoInativo;
    private javax.swing.JPanel inicioCliente;
    private javax.swing.JPanel inicioEquipa;
    private javax.swing.JPanel inicioExerc;
    private javax.swing.JPanel inicioFunc;
    private javax.swing.JPanel inicioTreino;
    private javax.swing.JButton jButtonAdicionarFoto;
    private javax.swing.JButton jButtonAtivarCliente;
    private javax.swing.JButton jButtonAtivarEquipament;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonCadastrarCliente;
    private javax.swing.JButton jButtonCadastrarEquipamento;
    private javax.swing.JButton jButtonCadastrarExercicio;
    private javax.swing.JButton jButtonCadastrarFuncio;
    private javax.swing.JButton jButtonCadastrarTreino;
    private javax.swing.JButton jButtonCancelarCliente;
    private javax.swing.JButton jButtonCancelarFuncionario;
    private javax.swing.JButton jButtonCancelarTreino;
    private javax.swing.JButton jButtonDelCliente;
    private javax.swing.JButton jButtonDeletarCliente;
    private javax.swing.JButton jButtonDeletarEquipamento;
    private javax.swing.JButton jButtonDeletarExercicio;
    private javax.swing.JButton jButtonDeletarFuncio;
    private javax.swing.JButton jButtonDeletarFuncionario;
    private javax.swing.JButton jButtonDeletarTreino;
    private javax.swing.JButton jButtonDesativarEquipament;
    private javax.swing.JButton jButtonEditarCliente;
    private javax.swing.JButton jButtonListarCliente;
    private javax.swing.JButton jButtonListarEquipamento;
    private javax.swing.JButton jButtonListarExercicio;
    private javax.swing.JButton jButtonListarFuncio;
    private javax.swing.JButton jButtonListarTreino;
    private javax.swing.JButton jButtonPesquisarCliente;
    private javax.swing.JButton jButtonPesquisarClienteDel;
    private javax.swing.JButton jButtonRemoverFoto;
    private javax.swing.JButton jButtonSalvarCliente;
    private javax.swing.JButton jButtonSalvarEquipamento;
    private javax.swing.JButton jButtonSalvarExercicio;
    private javax.swing.JButton jButtonSalvarFuncio;
    private javax.swing.JButton jButtonSalvarTreino;
    private javax.swing.JButton jButtonVisuCompleFuncionario;
    private javax.swing.JComboBox<String> jComboBoxCargaHorariaFuncionario;
    private javax.swing.JComboBox<String> jComboBoxExercicios;
    private javax.swing.JComboBox<String> jComboBoxInstrutorTreino;
    private javax.swing.JComboBox<String> jComboBoxOrdem;
    private javax.swing.JComboBox<String> jComboBoxTurnoFuncionario;
    private com.toedter.calendar.JDateChooser jDateChooserDataNasc;
    private com.toedter.calendar.JDateChooser jDateChooserDataNascFuncionario;
    private com.toedter.calendar.JDateChooser jDateChooserMatricula;
    private javax.swing.JFormattedTextField jFormattedTextFieldCel;
    private javax.swing.JFormattedTextField jFormattedTextFieldCelFuncionario;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpfFuncionario;
    private javax.swing.JFormattedTextField jFormattedTextFieldTel;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelCliente;
    private javax.swing.JPanel jPanelEquip;
    private javax.swing.JPanel jPanelExerc;
    private javax.swing.JPanel jPanelFunc;
    private javax.swing.JPanel jPanelInicio;
    private javax.swing.JPanel jPanelMenuClient;
    private javax.swing.JPanel jPanelMenuEquipa;
    private javax.swing.JPanel jPanelMenuExerc;
    private javax.swing.JPanel jPanelMenuFuncio;
    private javax.swing.JPanel jPanelMenuTreino;
    private javax.swing.JPanel jPanelPessoa;
    private javax.swing.JPanel jPanelTreino;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPaneAtivos;
    private javax.swing.JScrollPane jScrollPaneAtivos1;
    private javax.swing.JScrollPane jScrollPaneAtivos2;
    private javax.swing.JScrollPane jScrollPaneAtivos3;
    private javax.swing.JScrollPane jScrollPaneInativos;
    private javax.swing.JScrollPane jScrollPaneInativos1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPaneClientes;
    private javax.swing.JTabbedPane jTabbedPessoa;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableAtivosCliente;
    private javax.swing.JTable jTableAtivosEquipamento;
    private javax.swing.JTable jTableDeletar;
    private javax.swing.JTable jTableFuncionarioDeletar;
    private javax.swing.JTable jTableInativosCliente;
    private javax.swing.JTable jTableInativosEquipamento;
    private javax.swing.JTable jTableListarFuncionario;
    private javax.swing.JTable jTableTreinoClientes;
    private javax.swing.JTextArea jTextAreaObserv;
    private javax.swing.JTextArea jTextAreaObservaFuncionario;
    private javax.swing.JTextArea jTextAreaObservacaoTreino;
    private javax.swing.JTextField jTextFieldAltura;
    private javax.swing.JTextField jTextFieldAlturaFuncionario;
    private javax.swing.JTextField jTextFieldCargaTreino;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEmailFuncionario;
    private javax.swing.JTextField jTextFieldEspecialidadeFuncionario;
    private javax.swing.JTextField jTextFieldGrupoMuscExercicio;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNomeEquipamento;
    private javax.swing.JTextField jTextFieldNomeExercicio;
    private javax.swing.JTextField jTextFieldNomeFuncionario;
    private javax.swing.JTextField jTextFieldObjetivo;
    private javax.swing.JTextField jTextFieldPeso;
    private javax.swing.JTextField jTextFieldPesoFuncionario;
    private javax.swing.JTextField jTextFieldPesquisarCliente;
    private javax.swing.JTextField jTextFieldPesquisarClienteDel;
    private javax.swing.JTextField jTextFieldRepeticaoTreino;
    private javax.swing.JTextField jTextFieldSeriesTreino;
    private javax.swing.JTextField jTextFieldTipoTreino;
    private javax.swing.JPanel listCliente;
    private javax.swing.JPanel listEquipa;
    private javax.swing.JPanel listExerc;
    private javax.swing.JPanel listFuncio;
    private javax.swing.JPanel listTreino;
    // End of variables declaration//GEN-END:variables
}
