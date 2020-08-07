package aluno;
public class Aluno {
        
        public String nome;
        public int matricula;
        private int idade;
        
        public Aluno(String nome, int matricula, int idade){
            this.nome = nome;
            this.matricula = matricula;
            this.idade = idade;
        }
        
        public int getIdade(){
            return idade;
        }
        
        public void setIdade(int idade){
               this.idade = idade;
        }
    }
