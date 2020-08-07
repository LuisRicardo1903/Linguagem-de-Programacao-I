public class Aluno {
    public String matricula;
    public String nome;
    public String datanascimento;    

    public Aluno(String matricula, String nome, String datanascimento) {
        this.matricula = matricula;
        this.nome = nome;
        this.datanascimento = datanascimento;
    }

   public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", nome=" + nome + ", datanascimento=" + datanascimento + "}";
    }

    
    
}
