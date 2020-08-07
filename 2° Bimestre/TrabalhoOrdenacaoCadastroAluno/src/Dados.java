
import java.util.ArrayList;
import static javafx.scene.input.KeyCode.J;
import javax.swing.JTextArea;

public class Dados {

    ArrayList<Aluno> listaAlunos = new ArrayList<>();

    public void cadastraAluno(Aluno aluno) {
        listaAlunos.add(aluno);
    }

    public void exibirAlunos(Aluno aluno, JTextArea jTextArea_resultado) {
        for (int i = 0; i < listaAlunos.size(); i++) {
            jTextArea_resultado.append(listaAlunos.get(i).matricula + "  " + listaAlunos.get(i).nome + "  " + listaAlunos.get(i).datanascimento + "\n");
        }
    }


    public String numeroDeAlunos() {
        return listaAlunos.size() + " Alunos Cadastrados";
    }
}
