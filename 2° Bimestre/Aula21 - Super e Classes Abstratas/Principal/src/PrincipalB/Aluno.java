package PrincipalB;

public class Aluno extends Pessoa {
    
    public String nome;
    
    public static void main(String[] args){
        Aluno aluno = new Aluno();
        aluno.setNome();
        System.out.println("Nome: " + aluno.getNome());
        aluno.exibirMensagem();
    }
    
    @Override
    public void setNome(){
        nome="Pedro";
    }
    
    @Override
    public String getNome(){
        return nome;
    }
}
