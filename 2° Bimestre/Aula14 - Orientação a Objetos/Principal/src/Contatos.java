public class Contatos {
    
    public String nome;
    public String telefone;
    
    public void inserir(){
        System.out.println("Nome: "+ nome +"\n"+ "Telefone: " + telefone);
    }
    public String consultar(String nome){
        return nome + "" + telefone;
    }
    
}

