package principal;
import javax.swing.JOptionPane;
public class Principal {

    
    
    public static void main(String[] args) {
    
    //String nome = JOptionPane.showInputDialog("Digite o nome: ");
    //String matricula = JOptionPane.showInputDialog("Digite a matricula: ");
    //System.out.println("Dados do aluno: " + nome +" "+ matricula);
    
    Aluno aluno = new Aluno();
    aluno.nome = JOptionPane.showInputDialog("Digite o nome: ");
    aluno.matricula = JOptionPane.showInputDialog("Digite a matricula: ");
    //System.out.println("Nome: " + aluno.nome +" \nMatricula: "+ aluno.matricula);
    Saida saida = new Saida();
    
    saida.modoConsole(aluno.nome, aluno.matricula);
    saida.modoGrafico(aluno.nome, aluno.matricula);
    }
    
}
