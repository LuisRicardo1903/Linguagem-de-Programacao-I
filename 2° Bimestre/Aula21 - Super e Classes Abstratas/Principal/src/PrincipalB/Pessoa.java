package PrincipalB;

public abstract class Pessoa {
    abstract void setNome();
    abstract String getNome();
    
    public void exibirMensagem(){
        System.out.println("Ola");
    }
}
