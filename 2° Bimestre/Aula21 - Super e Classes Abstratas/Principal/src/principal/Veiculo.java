package principal;
public class Veiculo {
    
    public static String marca;
    public Veiculo (String marca){
        this.marca = marca;
    }
    public void exibirMensagem(){
        System.out.println("Eu sou a SUPERCLASSE");
    }
}