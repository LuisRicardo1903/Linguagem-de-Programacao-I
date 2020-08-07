package aluno;

public class Principal {
    
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno("Luis", 19, 10011001);
        
        System.out.println(aluno.nome);
        System.out.println(aluno.matricula);
        
        System.out.println(aluno.getIdade());
        
        aluno.setIdade(30);
        
        System.out.println(aluno.getIdade());
        
        Principal principal = new Principal();
        
        System.out.println(principal.verificarNota(9));
        
    }
    
    public String verificarNota(float nota){
        if(nota>=7){
            return "Aluno aprovado";
        }
        else {
            return "Aluno em exame";
        }
    }
}
