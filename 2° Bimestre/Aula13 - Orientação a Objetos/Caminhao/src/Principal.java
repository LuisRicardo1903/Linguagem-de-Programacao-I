public class Principal {

    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao();
        Entrada entrada = new Entrada();
        caminhao.marca = entrada.lerEntrada("Digite a marca do caminhao: ");
        caminhao.modelo = entrada.lerEntrada("Digite o modelo do caminhao: ");
        Saida saida = new Saida();
        saida.exibirDados(caminhao.marca, caminhao.modelo);
        saida.exibirDados2(caminhao);
    }
    
}