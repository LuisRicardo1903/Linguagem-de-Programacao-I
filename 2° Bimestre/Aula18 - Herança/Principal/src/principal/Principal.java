//Herança ocorre quando uma classe-filha/subclasse herda/recebe as caracteristicas e funcionalidades de uma classe-mãe/superclasse
package principal;
import javax.swing.JOptionPane;
public class Principal {

    public static void main(String[] args) {
        
    Aluno aluno = new Aluno();
    aluno.nome = JOptionPane.showInputDialog("Digite a nome: ");
    aluno.idade = JOptionPane.showInputDialog("Digite a idade: ");
    aluno.matricula = JOptionPane.showInputDialog("Digite a Matricula: ");
    aluno.exibirDados();
    
    }
    
}