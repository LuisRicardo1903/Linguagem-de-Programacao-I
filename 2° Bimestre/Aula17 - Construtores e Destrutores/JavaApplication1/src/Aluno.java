public class Aluno {
    
    private String nome;
    private String matricula;
    
    public Aluno(String matricula){
        this.matricula = matricula;
        
    }
    
    /*
    public Aluno(int numero){
        System.out.println("int");
    }
    
    public Aluno (double numero){
        System.out.println("float");
    }
*/
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getMatricula(){
        return matricula;
    }
}
