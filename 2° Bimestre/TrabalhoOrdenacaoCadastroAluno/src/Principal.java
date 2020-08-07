
import java.util.ArrayList;


public class Principal {


    public static void main(String[] args) {
    
          ArrayList<Aluno> listaAlunos = new ArrayList<>();
          Aluno aluno = new Aluno("0001", "Robson", "26/06/1985");
          Aluno aluno2 = new Aluno("0002", "Renata", "26/06/1985");
          listaAlunos.add(aluno);
          listaAlunos.add(aluno2);
          
          listaAlunos.forEach((a) -> {
              System.out.println(a);
        });
          System.out.println("Total de Alunos na Lista: " + listaAlunos.size());
          
    }
    
}
