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

    public void limparCamposCliente() {
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

    public void limparCamposFunc() {
        jTextFieldNomeFuncionario.setText("");
        jFormattedTextFieldCpfFuncionario.setValue(null);
        jTextFieldPesoFuncionario.setText("");
        jTextFieldAlturaFuncionario.setText("");
        jFormattedTextFieldTelFuncionario.setValue(null);
        jFormattedTextFieldCelFuncionario.setValue(null);
        jTextFieldEmailFuncionario.setText("");
        jTextFieldEspecialidadeFuncionario.setText("");
        jComboBoxTurnoFuncionario.setSelectedIndex(0);
        jComboBoxCargaHorariaFuncionario.setSelectedIndex(0);
        jTextAreaObservaFuncionario.setText("");
        jDateChooserDataNascFuncionario.setCalendar(null);
    }

    public void limparCamposEquip() {
        jTextFieldNomeEquipamento.setText("");
        jDateChooserDataAquisicao.setCalendar(null);
        jTextAreaCadastroEquip.setText("");
    }

    public void limparCamposExerc() {
        jTextFieldNomeExercicio.setText("");
        jComboBoxGrupoMuscExercicio.setSelectedIndex(0);
    }

    public void limparCamposTreinos() {
        jComboBoxTreinoExercicios.setSelectedIndex(0);
        jComboBoxOrdem.setSelectedIndex(0);
        jComboBoxInstrutorTreino.setSelectedIndex(0);
        jTextFieldCargaTreino.setText("");
        jTextFieldSeriesTreino.setText("");
        jTextFieldRepeticaoTreino.setText("");
        jTextFieldTipoTreino.setText("");
        jTextAreaObservacaoTreino.setText("");
        jDateChooserTrocaTreino.setCalendar(null);

    }

    //EST
    public JLabel getjLabelLogo() {
        return jLabelLogo;
    }

    public JLabel getjLabelEstDesc() {
        return jLabelEstDesc;
    }

    public JLabel getjLabelEstNome() {
        return jLabelEstNome;
    }

    public JTextField getjTextFieldDescEst() {
        return jTextFieldDescEst;
    }

    public JButton getjButtonCarregarLogo() {
        return jButtonCarregarLogo;
    }

    public JButton getjButtonEnviarDados() {
        return jButtonEnviarDados;
    }

    public JTextField getjTextFieldLogoEst() {
        return jTextFieldLogoEst;
    }

    public JTextField getjTextFieldNomeEst() {
        return jTextFieldNomeEst;
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

    public JButton getjButtonPesquisarClienteDel() {
        return jButtonPesquisarClienteDel;
    }

    public JTextField getjTextFieldPesquisarClienteDel() {
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

    public JPanel getCRUDFuncio() {
        return CRUDFuncio;
    }

    public JPanel getCadFuncio() {
        return cadFuncio;
    }

    public JPanel getListFuncio() {
        return listFuncio;
    }

    public JButton getjButtonCancelarFuncionario() {
        return jButtonCancelarFuncionario;
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

    public JPanel getCadEquipa() {
        return cadEquipa;
    }

    public JPanel getListEquipa() {
        return listEquipa;
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

    public JPanel getCadExerc() {
        return cadExerc;
    }

    public JPanel getListExerc() {
        return listExerc;
    }

    public JPanel getDelExerc() {
        return delExerc;
    }

    public JButton getjButtonSalvarExercicio() {
        return jButtonSalvarExercicio;
    }

    public JComboBox<String> getjComboBoxGrupoMuscExercicio() {
        return jComboBoxGrupoMuscExercicio;
    }

    public JTextField getjTextFieldNomeExercicio() {
        return jTextFieldNomeExercicio;
    }

    public JTable getjTableExercicio() {
        return jTableExercicio;
    }

    public JButton getjButtonPesquisarExerc() {
        return jButtonPesquisarExerc;
    }

    public JTextField getjTextFieldPesquisarExerc() {
        return jTextFieldPesquisarExerc;
    }

    public JButton getjButtonEditarExerc() {
        return jButtonEditarExerc;
    }

    public JButton getjButtonDeletarExerc() {
        return jButtonDeletarExerc;
    }

    //Treino
    public JButton getjButtonGetTreinos() {
        return jButtonGetTreinos;
    }

    public JPanel getCRUDTreino() {
        return CRUDTreino;
    }

    public JButton getjButtonCadastrarTreino() {
        return jButtonCadastrarTreino;
    }

    public JButton getjButtonListarTreino() {
        return jButtonListarTreino;
    }

    public JPanel getCadTreino() {
        return cadTreino;
    }

    public JPanel getListTreino() {
        return listTreino;
    }

    public JTabbedPane getjTabbedPaneClientes() {
        return jTabbedPaneClientes;
    }

    public JButton getjButtonAtualizar() {
        return jButtonAtualizar;
    }

    public JButton getjButtonPesquisarFunc() {
        return jButtonPesquisarFunc;
    }

    public JTextField getjTextFieldPesquisarFunc() {
        return jTextFieldPesquisarFunc;
    }

    public JButton getjButtonDeletarFunc() {
        return jButtonDeletarFunc;
    }

    public JButton getjButtonEditarFunc() {
        return jButtonEditarFunc;
    }

    public JComboBox<String> getjComboBoxTreinoExercicios() {
        return jComboBoxTreinoExercicios;
    }

    public JComboBox<String> getjComboBoxInstrutorTreino() {
        return jComboBoxInstrutorTreino;
    }

    public JComboBox<String> getjComboBoxOrdem() {
        return jComboBoxOrdem;
    }

    public JTextField getjTextFieldCargaTreino() {
        return jTextFieldCargaTreino;
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

    public JDateChooser getjDateChooserTrocaTreino() {
        return jDateChooserTrocaTreino;
    }

    public JButton getjButtonPesquisarTreinoCli() {
        return jButtonPesquisarTreinoCli;
    }

    public JTextField getjTextFieldPesquisarTreinoCli() {
        return jTextFieldPesquisarTreinoCli;
    }

    public JButton getjButtonCancelarTreino() {
        return jButtonCancelarTreino;
    }

    public JButton getjButtonSalvarTreino() {
        return jButtonSalvarTreino;
    }

    public JButton getjButtonPesquisarTreinoListCli() {
        return jButtonPesquisarTreinoListCli;
    }

    public JTextField getjTextFieldPesquisarTreinoListCli() {
        return jTextFieldPesquisarTreinoListCli;
    }

    //Equipamento
    public JButton getjButtonSalvarEquipamento() {
        return jButtonSalvarEquipamento;
    }

    public JTextField getjTextFieldNomeEquipamento() {
        return jTextFieldNomeEquipamento;
    }

    public JDateChooser getjDateChooserDataAquisicao() {
        return jDateChooserDataAquisicao;
    }

    public JTable getjTableAtivosEquipamento() {
        return jTableAtivosEquipamento;
    }

    public JTable getjTableInativosEquipamento() {
        return jTableInativosEquipamento;
    }

    public JButton getjButtonPesquisarEquip() {
        return jButtonPesquisarEquip;
    }

    public JTextField getjTextFieldPesquisarEquip() {
        return jTextFieldPesquisarEquip;
    }

    public JButton getjButtonEditarEquip() {
        return jButtonEditarEquip;
    }

    public JButton getjButtonAtivarEquipament() {
        return jButtonAtivarEquipament;
    }

    public JButton getjButtonDesativaEquip() {
        return jButtonDesativaEquip;
    }

    public JTextArea getjTextAreaCadastroEquip() {
        return jTextAreaCadastroEquip;
    }

    public JTextArea getjTextAreaObservacaoTreino() {
        return jTextAreaObservacaoTreino;
    }

    //Treino
    public JTable getjTableTreinoClientes() {
        return jTableTreinoClientes;
    }

    public JTable getjTableListTreinoClientes() {
        return jTableListTreinoClientes;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelInicio = new javax.swing.JPanel();
        jPanelInfo = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelEstNome = new javax.swing.JLabel();
        jLabelEstDesc = new javax.swing.JLabel();
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
        jTableDeletar.getTableHeader().setEnabled(false);
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
        jTableListarFuncionario.getTableHeader().setEnabled(false);
        jButtonDeletarFunc = new javax.swing.JButton();
        jTextFieldPesquisarFunc = new javax.swing.JTextField();
        jButtonPesquisarFunc = new javax.swing.JButton();
        jButtonEditarFunc = new javax.swing.JButton();
        jPanelEquip = new javax.swing.JPanel();
        jPanelMenuEquipa = new javax.swing.JPanel();
        jButtonCadastrarEquipamento = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jButtonListarEquipamento = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        CRUDEquipa = new javax.swing.JPanel();
        inicioEquipa = new javax.swing.JPanel();
        cadEquipa = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNomeEquipamento = new javax.swing.JTextField();
        jButtonSalvarEquipamento = new javax.swing.JButton();
        jDateChooserDataAquisicao = new JDateChooser("dd/MM/yyyy", "##/##/####" , ' ');
        jDateChooserDataAquisicao.getJCalendar().setPreferredSize(new Dimension(250, 200));
        jDateChooserDataAquisicao.getJCalendar().setWeekOfYearVisible(false);
        jDateChooserDataAquisicao.getJCalendar().setTodayButtonVisible(true);
        jDateChooserDataAquisicao.getJCalendar().getDayChooser().setDayBordersVisible(true);
        jLabel21 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextAreaCadastroEquip = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        listEquipa = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        equipamentoAtivo = new javax.swing.JPanel();
        jScrollPaneAtivos2 = new javax.swing.JScrollPane();
        jTableAtivosEquipamento = new javax.swing.JTable();
        jTableAtivosEquipamento.getTableHeader().setEnabled(false);
        jButtonEditarEquip = new javax.swing.JButton();
        jButtonDesativaEquip = new javax.swing.JButton();
        equipamentoInativo = new javax.swing.JPanel();
        jScrollPaneInativos1 = new javax.swing.JScrollPane();
        jTableInativosEquipamento = new javax.swing.JTable();
        jTableInativosEquipamento.getTableHeader().setEnabled(false);
        jButtonAtivarEquipament = new javax.swing.JButton();
        jTextFieldPesquisarEquip = new javax.swing.JTextField();
        jButtonPesquisarEquip = new javax.swing.JButton();
        jPanelExerc = new javax.swing.JPanel();
        jPanelMenuExerc = new javax.swing.JPanel();
        jButtonCadastrarExercicio = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jButtonListarExercicio = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        CRUDExerc = new javax.swing.JPanel();
        inicioExerc = new javax.swing.JPanel();
        cadExerc = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jTextFieldNomeExercicio = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jButtonSalvarExercicio = new javax.swing.JButton();
        jComboBoxGrupoMuscExercicio = new javax.swing.JComboBox<>();
        listExerc = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableExercicio = new javax.swing.JTable();
        jTableExercicio.getTableHeader().setEnabled(false);
        jTextFieldPesquisarExerc = new javax.swing.JTextField();
        jButtonPesquisarExerc = new javax.swing.JButton();
        jButtonEditarExerc = new javax.swing.JButton();
        jButtonDeletarExerc = new javax.swing.JButton();
        delExerc = new javax.swing.JPanel();
        jPanelTreino = new javax.swing.JPanel();
        jPanelMenuTreino = new javax.swing.JPanel();
        jButtonCadastrarTreino = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jButtonListarTreino = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        CRUDTreino = new javax.swing.JPanel();
        inicioTreino = new javax.swing.JPanel();
        listarTreino = new javax.swing.JPanel();
        listTreino = new javax.swing.JPanel();
        jTextFieldPesquisarTreinoListCli = new javax.swing.JTextField();
        jButtonPesquisarTreinoListCli = new javax.swing.JButton();
        jButtonGetTreinos = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTableListTreinoClientes = new javax.swing.JTable();
        jTableListTreinoClientes.getTableHeader().setEnabled(false);
        cadTreino = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableTreinoClientes = new javax.swing.JTable();
        jTableTreinoClientes.getTableHeader().setEnabled(false);
        jLabel37 = new javax.swing.JLabel();
        jComboBoxTreinoExercicios = new javax.swing.JComboBox<>();
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
        jButtonCancelarTreino = new javax.swing.JButton();
        jButtonSalvarTreino = new javax.swing.JButton();
        jTextFieldPesquisarTreinoCli = new javax.swing.JTextField();
        jButtonPesquisarTreinoCli = new javax.swing.JButton();
        jDateChooserTrocaTreino = new JDateChooser("dd/MM/yyyy", "##/##/####" , ' ');
        jDateChooserTrocaTreino.getJCalendar().setPreferredSize(new Dimension(250, 200));
        jDateChooserTrocaTreino.getJCalendar().setWeekOfYearVisible(false);
        jDateChooserTrocaTreino.getJCalendar().setTodayButtonVisible(true); 
        jDateChooserTrocaTreino.getJCalendar().getDayChooser().setDayBordersVisible(true);
        jLabel56 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaObservacaoTreino = new javax.swing.JTextArea();
        jPanelConfig = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jTextFieldNomeEst = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jTextFieldLogoEst = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jButtonCarregarLogo = new javax.swing.JButton();
        jButtonEnviarDados = new javax.swing.JButton();
        jLabel58 = new javax.swing.JLabel();
        jTextFieldDescEst = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setResizable(false);

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(800, 600));

        jPanelInicio.setPreferredSize(new java.awt.Dimension(1024, 768));
        jPanelInicio.setLayout(null);

        jPanelInfo.setBackground(new java.awt.Color(0, 0, 0));
        jPanelInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelInfo.setMinimumSize(new java.awt.Dimension(450, 450));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo acad.png"))); // NOI18N

        jLabelEstNome.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18)); // NOI18N
        jLabelEstNome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEstNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEstNome.setText("BEM - VINDO À ACADEMIA");

        jLabelEstDesc.setFont(new java.awt.Font("Nirmala UI Semilight", 2, 18)); // NOI18N
        jLabelEstDesc.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEstDesc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEstDesc.setText("\"Só os fortes sobrevivem...\"");

        javax.swing.GroupLayout jPanelInfoLayout = new javax.swing.GroupLayout(jPanelInfo);
        jPanelInfo.setLayout(jPanelInfoLayout);
        jPanelInfoLayout.setHorizontalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabelLogo)
                .addContainerGap(72, Short.MAX_VALUE))
            .addComponent(jLabelEstNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelEstDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelInfoLayout.setVerticalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelEstNome)
                .addGap(42, 42, 42)
                .addComponent(jLabelLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEstDesc)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanelInicio.add(jPanelInfo);
        jPanelInfo.setBounds(520, 50, 450, 450);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundo.jpg"))); // NOI18N
        jPanelInicio.add(jLabel2);
        jLabel2.setBounds(0, 0, 1020, 730);

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
                .addGap(215, 215, 215)
                .addGroup(jPanelMenuClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(160, 160, 160)
                .addGroup(jPanelMenuClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonListarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(160, 160, 160)
                .addGroup(jPanelMenuClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDeletarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(215, Short.MAX_VALUE))
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
                        .addGroup(jPanelMenuClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                            .addGroup(cadClienteLayout.createSequentialGroup()
                                .addGroup(cadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel9)
                                    .addComponent(jFormattedTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(cadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel48)
                                    .addComponent(jFormattedTextFieldCel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(cadClienteLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
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
                            .addComponent(jTextFieldObjetivo))
                        .addGap(33, 33, 33)
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
                .addContainerGap(46, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jPanelMenuFuncioLayout = new javax.swing.GroupLayout(jPanelMenuFuncio);
        jPanelMenuFuncio.setLayout(jPanelMenuFuncioLayout);
        jPanelMenuFuncioLayout.setHorizontalGroup(
            jPanelMenuFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuFuncioLayout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addGroup(jPanelMenuFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCadastrarFuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(161, 161, 161)
                .addGroup(jPanelMenuFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonListarFuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMenuFuncioLayout.setVerticalGroup(
            jPanelMenuFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuFuncioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelMenuFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCadastrarFuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonListarFuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelMenuFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel23))
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
        jTextAreaObservaFuncionario.setLineWrap(true);
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
                .addGap(243, 243, 243)
                .addGroup(cadFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadFuncioLayout.createSequentialGroup()
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadFuncioLayout.createSequentialGroup()
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(399, 399, 399))
                    .addComponent(jLabel46)
                    .addComponent(jFormattedTextFieldCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadFuncioLayout.createSequentialGroup()
                        .addComponent(jButtonCancelarFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalvarFuncio))
                    .addComponent(jScrollPane4)
                    .addGroup(cadFuncioLayout.createSequentialGroup()
                        .addComponent(jTextFieldEspecialidadeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(cadFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxTurnoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(cadFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(jComboBoxCargaHorariaFuncionario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(cadFuncioLayout.createSequentialGroup()
                        .addGroup(cadFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47)
                            .addComponent(jFormattedTextFieldTelFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(cadFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadFuncioLayout.createSequentialGroup()
                                .addComponent(jLabel49)
                                .addGap(127, 127, 127))
                            .addComponent(jFormattedTextFieldCelFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextFieldEmailFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNomeFuncionario))
                .addGap(0, 244, Short.MAX_VALUE))
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
                .addContainerGap(39, Short.MAX_VALUE))
        );

        CRUDFuncio.add(cadFuncio, "card5");

        listFuncio.setBorder(javax.swing.BorderFactory.createTitledBorder("Listar Funcionários"));

        jTableListarFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Contato", "Especialidade"
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

        jButtonDeletarFunc.setBackground(new java.awt.Color(102, 102, 102));
        jButtonDeletarFunc.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonDeletarFunc.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDeletarFunc.setText("Excluir");

        jButtonPesquisarFunc.setText("Pesquisar");

        jButtonEditarFunc.setBackground(new java.awt.Color(102, 102, 102));
        jButtonEditarFunc.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonEditarFunc.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditarFunc.setText("Editar");
        jButtonEditarFunc.setMaximumSize(new java.awt.Dimension(89, 29));
        jButtonEditarFunc.setMinimumSize(new java.awt.Dimension(89, 29));
        jButtonEditarFunc.setPreferredSize(new java.awt.Dimension(89, 29));

        javax.swing.GroupLayout listFuncioLayout = new javax.swing.GroupLayout(listFuncio);
        listFuncio.setLayout(listFuncioLayout);
        listFuncioLayout.setHorizontalGroup(
            listFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listFuncioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(listFuncioLayout.createSequentialGroup()
                        .addComponent(jTextFieldPesquisarFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPesquisarFunc)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listFuncioLayout.createSequentialGroup()
                .addContainerGap(414, Short.MAX_VALUE)
                .addComponent(jButtonEditarFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDeletarFunc)
                .addGap(413, 413, 413))
        );
        listFuncioLayout.setVerticalGroup(
            listFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listFuncioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisarFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisarFunc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(listFuncioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDeletarFunc)
                    .addComponent(jButtonEditarFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        CRUDFuncio.add(listFuncio, "card3");

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
        jLabel27.setText("Visualizar e Editar");

        javax.swing.GroupLayout jPanelMenuEquipaLayout = new javax.swing.GroupLayout(jPanelMenuEquipa);
        jPanelMenuEquipa.setLayout(jPanelMenuEquipaLayout);
        jPanelMenuEquipaLayout.setHorizontalGroup(
            jPanelMenuEquipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuEquipaLayout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addGroup(jPanelMenuEquipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCadastrarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(161, 161, 161)
                .addGroup(jPanelMenuEquipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonListarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMenuEquipaLayout.setVerticalGroup(
            jPanelMenuEquipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuEquipaLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanelMenuEquipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCadastrarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonListarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMenuEquipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel27))
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

        jDateChooserDataAquisicao.setDateFormatString("dd '/' MM '/' yyyy");

        jLabel21.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel21.setText("Observações:");

        jTextAreaCadastroEquip.setColumns(20);
        jTextAreaCadastroEquip.setLineWrap(true);
        jTextAreaCadastroEquip.setRows(5);
        jScrollPane6.setViewportView(jTextAreaCadastroEquip);

        jLabel25.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel25.setText("Data de Aquisição:");

        javax.swing.GroupLayout cadEquipaLayout = new javax.swing.GroupLayout(cadEquipa);
        cadEquipa.setLayout(cadEquipaLayout);
        cadEquipaLayout.setHorizontalGroup(
            cadEquipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadEquipaLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(cadEquipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21)
                    .addComponent(jDateChooserDataAquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNomeEquipamento, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addComponent(jLabel25)
                    .addComponent(jScrollPane6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadEquipaLayout.createSequentialGroup()
                .addContainerGap(450, Short.MAX_VALUE)
                .addComponent(jButtonSalvarEquipamento)
                .addGap(450, 450, 450))
        );
        cadEquipaLayout.setVerticalGroup(
            cadEquipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadEquipaLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNomeEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooserDataAquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(jButtonSalvarEquipamento)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        CRUDEquipa.add(cadEquipa, "card6");

        listEquipa.setBorder(javax.swing.BorderFactory.createTitledBorder("Listar Equipamentos"));

        jTableAtivosEquipamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Aquisição", "Patrimônio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneAtivos2.setViewportView(jTableAtivosEquipamento);

        jButtonEditarEquip.setBackground(new java.awt.Color(102, 102, 102));
        jButtonEditarEquip.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonEditarEquip.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditarEquip.setText("Editar");
        jButtonEditarEquip.setMaximumSize(new java.awt.Dimension(111, 29));
        jButtonEditarEquip.setMinimumSize(new java.awt.Dimension(111, 29));
        jButtonEditarEquip.setPreferredSize(new java.awt.Dimension(111, 29));

        jButtonDesativaEquip.setBackground(new java.awt.Color(102, 102, 102));
        jButtonDesativaEquip.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonDesativaEquip.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDesativaEquip.setText("Desativar");

        javax.swing.GroupLayout equipamentoAtivoLayout = new javax.swing.GroupLayout(equipamentoAtivo);
        equipamentoAtivo.setLayout(equipamentoAtivoLayout);
        equipamentoAtivoLayout.setHorizontalGroup(
            equipamentoAtivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneAtivos2, javax.swing.GroupLayout.DEFAULT_SIZE, 999, Short.MAX_VALUE)
            .addGroup(equipamentoAtivoLayout.createSequentialGroup()
                .addGap(386, 386, 386)
                .addComponent(jButtonEditarEquip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDesativaEquip)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        equipamentoAtivoLayout.setVerticalGroup(
            equipamentoAtivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(equipamentoAtivoLayout.createSequentialGroup()
                .addComponent(jScrollPaneAtivos2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(equipamentoAtivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDesativaEquip)
                    .addComponent(jButtonEditarEquip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Equipamentos em Funcionamento", equipamentoAtivo);

        jTableInativosEquipamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Aquisição", "Patrimônio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
            .addGroup(equipamentoInativoLayout.createSequentialGroup()
                .addGap(458, 458, 458)
                .addComponent(jButtonAtivarEquipament)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        equipamentoInativoLayout.setVerticalGroup(
            equipamentoInativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, equipamentoInativoLayout.createSequentialGroup()
                .addComponent(jScrollPaneInativos1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAtivarEquipament)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Equipamentos Desativados", equipamentoInativo);

        jButtonPesquisarEquip.setText("Pesquisar");

        javax.swing.GroupLayout listEquipaLayout = new javax.swing.GroupLayout(listEquipa);
        listEquipa.setLayout(listEquipaLayout);
        listEquipaLayout.setHorizontalGroup(
            listEquipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listEquipaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listEquipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane4)
                    .addGroup(listEquipaLayout.createSequentialGroup()
                        .addComponent(jTextFieldPesquisarEquip, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPesquisarEquip)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        listEquipaLayout.setVerticalGroup(
            listEquipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listEquipaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listEquipaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisarEquip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisarEquip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane4)
                .addContainerGap())
        );

        CRUDEquipa.add(listEquipa, "card5");

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
        jLabel30.setText("Visualizar e Editar");

        javax.swing.GroupLayout jPanelMenuExercLayout = new javax.swing.GroupLayout(jPanelMenuExerc);
        jPanelMenuExerc.setLayout(jPanelMenuExercLayout);
        jPanelMenuExercLayout.setHorizontalGroup(
            jPanelMenuExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuExercLayout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addGroup(jPanelMenuExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCadastrarExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(161, 161, 161)
                .addGroup(jPanelMenuExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonListarExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMenuExercLayout.setVerticalGroup(
            jPanelMenuExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuExercLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanelMenuExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCadastrarExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonListarExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMenuExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30))
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
        jLabel54.setText("Nome do exercício:");

        jTextFieldNomeExercicio.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N

        jLabel55.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel55.setText("Grupo Muscular:");

        jButtonSalvarExercicio.setBackground(new java.awt.Color(102, 102, 102));
        jButtonSalvarExercicio.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonSalvarExercicio.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvarExercicio.setText("Salvar");

        jComboBoxGrupoMuscExercicio.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jComboBoxGrupoMuscExercicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Membros Inferiores", "Peitorais", "Dorsais", "Deltóides/Trapézio", "Bíceps", "Tríceps" }));

        javax.swing.GroupLayout cadExercLayout = new javax.swing.GroupLayout(cadExerc);
        cadExerc.setLayout(cadExercLayout);
        cadExercLayout.setHorizontalGroup(
            cadExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadExercLayout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addGroup(cadExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonSalvarExercicio)
                    .addGroup(cadExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jComboBoxGrupoMuscExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(cadExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldNomeExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(384, Short.MAX_VALUE))
        );
        cadExercLayout.setVerticalGroup(
            cadExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadExercLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNomeExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxGrupoMuscExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButtonSalvarExercicio)
                .addContainerGap(331, Short.MAX_VALUE))
        );

        CRUDExerc.add(cadExerc, "card3");

        listExerc.setBorder(javax.swing.BorderFactory.createTitledBorder("Listar Exercícios"));

        jTableExercicio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Grupo Muscular", "Equipamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(jTableExercicio);

        jButtonPesquisarExerc.setText("Pesquisar");

        jButtonEditarExerc.setBackground(new java.awt.Color(102, 102, 102));
        jButtonEditarExerc.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonEditarExerc.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditarExerc.setText("Editar");
        jButtonEditarExerc.setMaximumSize(new java.awt.Dimension(111, 29));
        jButtonEditarExerc.setMinimumSize(new java.awt.Dimension(111, 29));
        jButtonEditarExerc.setPreferredSize(new java.awt.Dimension(111, 29));

        jButtonDeletarExerc.setBackground(new java.awt.Color(102, 102, 102));
        jButtonDeletarExerc.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonDeletarExerc.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDeletarExerc.setText("Deletar");
        jButtonDeletarExerc.setMaximumSize(new java.awt.Dimension(111, 29));
        jButtonDeletarExerc.setMinimumSize(new java.awt.Dimension(111, 29));
        jButtonDeletarExerc.setPreferredSize(new java.awt.Dimension(111, 29));

        javax.swing.GroupLayout listExercLayout = new javax.swing.GroupLayout(listExerc);
        listExerc.setLayout(listExercLayout);
        listExercLayout.setHorizontalGroup(
            listExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1011, Short.MAX_VALUE)
            .addGroup(listExercLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listExercLayout.createSequentialGroup()
                        .addComponent(jTextFieldPesquisarExerc, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPesquisarExerc)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(listExercLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonEditarExerc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDeletarExerc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(340, 340, 340))))
        );
        listExercLayout.setVerticalGroup(
            listExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listExercLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(listExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisarExerc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisarExerc))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(listExercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditarExerc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDeletarExerc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jPanelMenuTreinoLayout = new javax.swing.GroupLayout(jPanelMenuTreino);
        jPanelMenuTreino.setLayout(jPanelMenuTreinoLayout);
        jPanelMenuTreinoLayout.setHorizontalGroup(
            jPanelMenuTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuTreinoLayout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addGroup(jPanelMenuTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCadastrarTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(161, 161, 161)
                .addGroup(jPanelMenuTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonListarTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMenuTreinoLayout.setVerticalGroup(
            jPanelMenuTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuTreinoLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanelMenuTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCadastrarTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonListarTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMenuTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34))
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
            .addGap(0, 607, Short.MAX_VALUE)
        );

        CRUDTreino.add(inicioTreino, "card2");

        listTreino.setBorder(javax.swing.BorderFactory.createTitledBorder("Listar Treinos"));

        jButtonPesquisarTreinoListCli.setText("Pesquisar");

        jButtonGetTreinos.setBackground(new java.awt.Color(102, 102, 102));
        jButtonGetTreinos.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonGetTreinos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGetTreinos.setText("Listar Treinos");
        jButtonGetTreinos.setMaximumSize(new java.awt.Dimension(111, 29));
        jButtonGetTreinos.setMinimumSize(new java.awt.Dimension(111, 29));
        jButtonGetTreinos.setPreferredSize(new java.awt.Dimension(111, 29));

        jTableListTreinoClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane8.setViewportView(jTableListTreinoClientes);

        javax.swing.GroupLayout listTreinoLayout = new javax.swing.GroupLayout(listTreino);
        listTreino.setLayout(listTreinoLayout);
        listTreinoLayout.setHorizontalGroup(
            listTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listTreinoLayout.createSequentialGroup()
                .addContainerGap(430, Short.MAX_VALUE)
                .addComponent(jButtonGetTreinos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(431, 431, 431))
            .addGroup(listTreinoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8)
                    .addGroup(listTreinoLayout.createSequentialGroup()
                        .addComponent(jTextFieldPesquisarTreinoListCli, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPesquisarTreinoListCli)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        listTreinoLayout.setVerticalGroup(
            listTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listTreinoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisarTreinoListCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisarTreinoListCli))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonGetTreinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout listarTreinoLayout = new javax.swing.GroupLayout(listarTreino);
        listarTreino.setLayout(listarTreinoLayout);
        listarTreinoLayout.setHorizontalGroup(
            listarTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listarTreinoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(listTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        listarTreinoLayout.setVerticalGroup(
            listarTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listarTreinoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(listTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        CRUDTreino.add(listarTreino, "card2");

        cadTreino.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar Treino"));

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

        jButtonCancelarTreino.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCancelarTreino.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonCancelarTreino.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelarTreino.setText("Cancelar");

        jButtonSalvarTreino.setBackground(new java.awt.Color(102, 102, 102));
        jButtonSalvarTreino.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jButtonSalvarTreino.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvarTreino.setText("Salvar");

        jButtonPesquisarTreinoCli.setText("Pesquisar");

        jDateChooserTrocaTreino.setDateFormatString("dd '/' MM '/' yyyy");

        jLabel56.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel56.setText("Previsão troca de treino:");

        jLabel44.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel44.setText("Observação:");

        jTextAreaObservacaoTreino.setColumns(20);
        jTextAreaObservacaoTreino.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jTextAreaObservacaoTreino.setRows(5);
        jScrollPane3.setViewportView(jTextAreaObservacaoTreino);

        javax.swing.GroupLayout cadTreinoLayout = new javax.swing.GroupLayout(cadTreino);
        cadTreino.setLayout(cadTreinoLayout);
        cadTreinoLayout.setHorizontalGroup(
            cadTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadTreinoLayout.createSequentialGroup()
                .addGroup(cadTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadTreinoLayout.createSequentialGroup()
                        .addGroup(cadTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cadTreinoLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel20))
                            .addGroup(cadTreinoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTextFieldPesquisarTreinoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPesquisarTreinoCli)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(cadTreinoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(cadTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadTreinoLayout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addGroup(cadTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(cadTreinoLayout.createSequentialGroup()
                                        .addComponent(jButtonCancelarTreino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonSalvarTreino))
                                    .addGroup(cadTreinoLayout.createSequentialGroup()
                                        .addGroup(cadTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(cadTreinoLayout.createSequentialGroup()
                                                .addGroup(cadTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jComboBoxOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(cadTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextFieldCargaTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel40)))
                                            .addComponent(jComboBoxTreinoExercicios, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel37))
                                        .addGap(14, 14, 14)
                                        .addGroup(cadTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(cadTreinoLayout.createSequentialGroup()
                                                .addGroup(cadTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel39)
                                                    .addComponent(jTextFieldSeriesTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(cadTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jTextFieldRepeticaoTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(cadTreinoLayout.createSequentialGroup()
                                                .addComponent(jLabel56)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jDateChooserTrocaTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(cadTreinoLayout.createSequentialGroup()
                                        .addGroup(cadTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldTipoTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBoxInstrutorTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel42))
                                        .addGap(25, 25, 25)
                                        .addGroup(cadTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel44)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(128, 128, 128)))))
                .addContainerGap())
        );
        cadTreinoLayout.setVerticalGroup(
            cadTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadTreinoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisarTreinoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisarTreinoCli))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxTreinoExercicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cadTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cadTreinoLayout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cadTreinoLayout.createSequentialGroup()
                        .addGroup(cadTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(jLabel41)
                            .addComponent(jLabel39))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cadTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCargaTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldSeriesTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRepeticaoTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cadTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cadTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadTreinoLayout.createSequentialGroup()
                        .addComponent(jTextFieldTipoTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxInstrutorTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(cadTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooserTrocaTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56))
                .addGap(18, 18, 18)
                .addGroup(cadTreinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvarTreino)
                    .addComponent(jButtonCancelarTreino))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        CRUDTreino.add(cadTreino, "card6");

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

        jPanelConfig.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Configurações de exibição"));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setText("Nome:");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel36.setText("Logo: ");

        jLabel57.setText("(300x300 pixels)");

        jButtonCarregarLogo.setText("Carregar");

        jButtonEnviarDados.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonEnviarDados.setText("Enviar");

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel58.setText("Descrição:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonEnviarDados)
                    .addComponent(jLabel57)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNomeEst, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldLogoEst, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDescEst, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCarregarLogo)
                .addContainerGap(322, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNomeEst, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDescEst, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLogoEst, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCarregarLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel57)
                .addGap(18, 18, 18)
                .addComponent(jButtonEnviarDados)
                .addContainerGap(423, Short.MAX_VALUE))
        );

        jPanelConfig.add(jPanel2);
        jPanel2.setBounds(10, 10, 1000, 710);

        jTabbedPane1.addTab("Configurações", jPanelConfig);

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

    private void jFormattedTextFieldCelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCelMouseClicked
        jFormattedTextFieldCel.setValue(null);
    }//GEN-LAST:event_jFormattedTextFieldCelMouseClicked

    private void jFormattedTextFieldTelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFormattedTextFieldTelMouseClicked
        jFormattedTextFieldTel.setValue(null);
    }//GEN-LAST:event_jFormattedTextFieldTelMouseClicked

    private void jButtonCancelarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarClienteActionPerformed
        limparCamposCliente();
    }//GEN-LAST:event_jButtonCancelarClienteActionPerformed

    private void jFormattedTextFieldCpfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCpfMouseClicked
        jFormattedTextFieldCpf.setValue(null);
    }//GEN-LAST:event_jFormattedTextFieldCpfMouseClicked

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
    private javax.swing.JPanel delExerc;
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
    private javax.swing.JButton jButtonCarregarLogo;
    private javax.swing.JButton jButtonDelCliente;
    private javax.swing.JButton jButtonDeletarCliente;
    private javax.swing.JButton jButtonDeletarExerc;
    private javax.swing.JButton jButtonDeletarFunc;
    private javax.swing.JButton jButtonDesativaEquip;
    private javax.swing.JButton jButtonEditarCliente;
    private javax.swing.JButton jButtonEditarEquip;
    private javax.swing.JButton jButtonEditarExerc;
    private javax.swing.JButton jButtonEditarFunc;
    private javax.swing.JButton jButtonEnviarDados;
    private javax.swing.JButton jButtonGetTreinos;
    private javax.swing.JButton jButtonListarCliente;
    private javax.swing.JButton jButtonListarEquipamento;
    private javax.swing.JButton jButtonListarExercicio;
    private javax.swing.JButton jButtonListarFuncio;
    private javax.swing.JButton jButtonListarTreino;
    private javax.swing.JButton jButtonPesquisarCliente;
    private javax.swing.JButton jButtonPesquisarClienteDel;
    private javax.swing.JButton jButtonPesquisarEquip;
    private javax.swing.JButton jButtonPesquisarExerc;
    private javax.swing.JButton jButtonPesquisarFunc;
    private javax.swing.JButton jButtonPesquisarTreinoCli;
    private javax.swing.JButton jButtonPesquisarTreinoListCli;
    private javax.swing.JButton jButtonRemoverFoto;
    private javax.swing.JButton jButtonSalvarCliente;
    private javax.swing.JButton jButtonSalvarEquipamento;
    private javax.swing.JButton jButtonSalvarExercicio;
    private javax.swing.JButton jButtonSalvarFuncio;
    private javax.swing.JButton jButtonSalvarTreino;
    private javax.swing.JComboBox<String> jComboBoxCargaHorariaFuncionario;
    private javax.swing.JComboBox<String> jComboBoxGrupoMuscExercicio;
    private javax.swing.JComboBox<String> jComboBoxInstrutorTreino;
    private javax.swing.JComboBox<String> jComboBoxOrdem;
    private javax.swing.JComboBox<String> jComboBoxTreinoExercicios;
    private javax.swing.JComboBox<String> jComboBoxTurnoFuncionario;
    private com.toedter.calendar.JDateChooser jDateChooserDataAquisicao;
    private com.toedter.calendar.JDateChooser jDateChooserDataNasc;
    private com.toedter.calendar.JDateChooser jDateChooserDataNascFuncionario;
    private com.toedter.calendar.JDateChooser jDateChooserMatricula;
    private com.toedter.calendar.JDateChooser jDateChooserTrocaTreino;
    private javax.swing.JFormattedTextField jFormattedTextFieldCel;
    private javax.swing.JFormattedTextField jFormattedTextFieldCelFuncionario;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpfFuncionario;
    private javax.swing.JFormattedTextField jFormattedTextFieldTel;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelEstDesc;
    private javax.swing.JLabel jLabelEstNome;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelCliente;
    private javax.swing.JPanel jPanelConfig;
    private javax.swing.JPanel jPanelEquip;
    private javax.swing.JPanel jPanelExerc;
    private javax.swing.JPanel jPanelFunc;
    private javax.swing.JPanel jPanelInfo;
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
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPaneAtivos;
    private javax.swing.JScrollPane jScrollPaneAtivos1;
    private javax.swing.JScrollPane jScrollPaneAtivos2;
    private javax.swing.JScrollPane jScrollPaneInativos;
    private javax.swing.JScrollPane jScrollPaneInativos1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPaneClientes;
    private javax.swing.JTabbedPane jTabbedPessoa;
    private javax.swing.JTable jTableAtivosCliente;
    private javax.swing.JTable jTableAtivosEquipamento;
    private javax.swing.JTable jTableDeletar;
    private javax.swing.JTable jTableExercicio;
    private javax.swing.JTable jTableInativosCliente;
    private javax.swing.JTable jTableInativosEquipamento;
    private javax.swing.JTable jTableListTreinoClientes;
    private javax.swing.JTable jTableListarFuncionario;
    private javax.swing.JTable jTableTreinoClientes;
    private javax.swing.JTextArea jTextAreaCadastroEquip;
    private javax.swing.JTextArea jTextAreaObserv;
    private javax.swing.JTextArea jTextAreaObservaFuncionario;
    private javax.swing.JTextArea jTextAreaObservacaoTreino;
    private javax.swing.JTextField jTextFieldAltura;
    private javax.swing.JTextField jTextFieldAlturaFuncionario;
    private javax.swing.JTextField jTextFieldCargaTreino;
    private javax.swing.JTextField jTextFieldDescEst;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEmailFuncionario;
    private javax.swing.JTextField jTextFieldEspecialidadeFuncionario;
    private javax.swing.JTextField jTextFieldLogoEst;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNomeEquipamento;
    private javax.swing.JTextField jTextFieldNomeEst;
    private javax.swing.JTextField jTextFieldNomeExercicio;
    private javax.swing.JTextField jTextFieldNomeFuncionario;
    private javax.swing.JTextField jTextFieldObjetivo;
    private javax.swing.JTextField jTextFieldPeso;
    private javax.swing.JTextField jTextFieldPesoFuncionario;
    private javax.swing.JTextField jTextFieldPesquisarCliente;
    private javax.swing.JTextField jTextFieldPesquisarClienteDel;
    private javax.swing.JTextField jTextFieldPesquisarEquip;
    private javax.swing.JTextField jTextFieldPesquisarExerc;
    private javax.swing.JTextField jTextFieldPesquisarFunc;
    private javax.swing.JTextField jTextFieldPesquisarTreinoCli;
    private javax.swing.JTextField jTextFieldPesquisarTreinoListCli;
    private javax.swing.JTextField jTextFieldRepeticaoTreino;
    private javax.swing.JTextField jTextFieldSeriesTreino;
    private javax.swing.JTextField jTextFieldTipoTreino;
    private javax.swing.JPanel listCliente;
    private javax.swing.JPanel listEquipa;
    private javax.swing.JPanel listExerc;
    private javax.swing.JPanel listFuncio;
    private javax.swing.JPanel listTreino;
    private javax.swing.JPanel listarTreino;
    // End of variables declaration//GEN-END:variables
}
