import javax.swing.JOptionPane;
public class Principal {
    
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno("201701012");
        //Aluno aluno2 = new Aluno(3);
        
        aluno.setNome(JOptionPane.showInputDialog("Digite o nome: "));
        
        JOptionPane.showMessageDialog(null, "Nome: " + aluno.getNome() + "\nMatricula: " + aluno.getMatricula());
        
    }
}
