package principal;
    public class Carro extends Veiculo {
        
        public String nomeCarro;
        
        Carro(){
            super("GM\n");
            nomeCarro = "Onix";
            this.exibirMensagem();
            super.exibirMensagem();
        }
        @Override
        public void exibirMensagem(){
            System.out.println("Eu sou a Subclasse");
        }
}