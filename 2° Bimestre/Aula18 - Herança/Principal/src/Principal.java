import javax.swing.JOptionPane;
public class Principal {
    
    public static void main(String[] args) {
    
        Paciente paciente = new Paciente();
        
        paciente.nome = JOptionPane.showInputDialog("Digite o nome do paciente: ");
        paciente.idade = (Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do paciente: ")));
        paciente.genero = JOptionPane.showInputDialog("Digite o genero do Pacinte: ").charAt(0);
        paciente.peso = (Float.parseFloat(JOptionPane.showInputDialog("Digite o peso do paciente: ")));
        paciente.altura = (Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do paciente: ")));
        exibirDados(paciente);
        
    }
    
    public static void exibirDados(Paciente paciente){
        System.out.println("Nome: " + paciente.nome+ " Idade: " + paciente.idade + " Gênero: " + paciente.genero + " Peso: " + paciente.peso
                + " Altura" + paciente.altura);
        
    }
}
