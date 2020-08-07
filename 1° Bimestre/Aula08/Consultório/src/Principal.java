import javax.swing.JOptionPane;
public class Principal {

    public static String matrizPacientes[][] = new String[1000][3]; // 3 colunas => nome, idade, cidade
    public static String matrizAgendamentos[][] = new String[5000][3]; // data, hora, nomePaciente
    static int numRegistroPaciente = 0;
    static int numRegistroConsulta = 0;

        
    public static void main(String[] args) {
        for (;;) {
            exibirMenu();
        }
    }

    // MENU DE OPÇÕES
    public static void exibirMenu() {

        String menu = "Escolha uma opção\n\n"
                + " P A C I E N T E S\n"
                + "(1) Cadastro de Pacientes\n"
                + "(2) Consulta ao Cadastro de Pacientes\n"
                + "(3) Alterar Cadastro de Pacientes\n"
                + "(4) Excluir Cadastro de Pacientes\n\n"
                + "C O N S U L T A S    M É D I C A S\n"
                + "(5) Agendar Consulta\n"
                + "(6) Cosultar Agendamentos\n"
                + "\nS A I R   D O   P R O G R A M A\n "
                + "(7) Sair do Programa";
        int op = Integer.parseInt(JOptionPane.showInputDialog(menu));
        switch (op) {
            case 1: {
                cadastrarPaciente();
                break;
            }
            case 2: {
                consultarPaciente();
                break;
            }
            case 3: {
                alterarPaciente();
                break;
            }
            case 5: {
                agendarConsulta();
                break;
            }
            case 6: {
                consultarAgendamentos();
                break;
            }
            case 7: {
                System.exit(0);
            }
            default: {
                break;
            }
        }

    }

    // GERENCIAMENTO DE PACIENTES
    
    public static void cadastrarPaciente() {
        matrizPacientes[numRegistroPaciente][0] = JOptionPane.showInputDialog("Digite o nome do paciente");
        matrizPacientes[numRegistroPaciente][1] = JOptionPane.showInputDialog("Digite a idade");
        matrizPacientes[numRegistroPaciente][2] = JOptionPane.showInputDialog("Digite a cidade do paciente");
        numRegistroPaciente++;
    }

    public static void consultarPaciente() {
        String nome = JOptionPane.showInputDialog("Qual o nome do paciente?");
        for (int linha = 0; linha < numRegistroPaciente; linha++) {
            if (nome.equals(matrizPacientes[linha][0])) {
                System.out.println("===========================================");
                System.out.println("Nome: " + matrizPacientes[linha][0]);
                System.out.println("Idade: " + matrizPacientes[linha][1]);
                System.out.println("Nome: " + matrizPacientes[linha][2]);
                System.out.println("===========================================");
                System.out.println("");
            }
            else {
                System.out.println("Paciente não encontrado");
            }
        }
    }

    // GERENCIAMENTO DE CONSULTAS

    public static void agendarConsulta(){
        matrizAgendamentos[numRegistroConsulta][0] = JOptionPane.showInputDialog("Digite a data");
        matrizAgendamentos[numRegistroConsulta][1] = JOptionPane.showInputDialog("Digite a hora");
        matrizAgendamentos[numRegistroConsulta][2] = JOptionPane.showInputDialog("Digite o nome do paciente");
        numRegistroConsulta++;       
    }
    
    
    public static void consultarAgendamentos() {
        String data = JOptionPane.showInputDialog("Qual a data?");
        for (int linha = 0; linha < numRegistroConsulta; linha++) {
            if (data.equals(matrizAgendamentos[linha][0])) {
                System.out.println("===========================================");
                System.out.println("Data: " + matrizAgendamentos[linha][0]);
                System.out.println("Hora: " + matrizAgendamentos[linha][1]);
                System.out.println("Nome do Paciente: " + matrizAgendamentos[linha][2]);
                System.out.println("===========================================");
                System.out.println("");
            }
            else {
                System.out.println("Data não localizada");
            }
        }
    }
    public static void alterarPaciente(){
        String nome = JOptionPane.showInputDialog("Digite o nome a ser alterado: ");
        for (int linha = 0; linha <numRegistroPaciente; linha++) {
            if (nome.equals(matrizPacientes[linha][0])) {
                System.out.println("");
                System.out.println("PACIENTE LOCALIZADO");
                System.out.println("Nome: " + matrizPacientes[linha][0]);
                System.out.println("Idade " + matrizPacientes[linha][1]);
                System.out.println("Cidade " + matrizPacientes[linha][2]);
                System.out.println("");
                matrizPacientes[linha][0] = JOptionPane.showInputDialog("Novo Nome: ");
                matrizPacientes[linha][1] = JOptionPane.showInputDialog("Nova Idade: ");
                matrizPacientes[linha][2] = JOptionPane.showInputDialog("Nova Cidade: ");
                System.out.println("");
                System.out.println("Nome: " + matrizPacientes[linha][0]);
                System.out.println("Idade: " + matrizPacientes[linha][1]);
                System.out.println("Cidade: " + matrizPacientes[linha][2]);
                System.out.println("");
            }
            else {
                System.out.println("Paciente não encontrado");
            }
        }
    }
}
