
import javax.swing.JOptionPane;

public class Exercicio02 {

    public static void main(String[] args) {
        int quantidadeProdutos = Integer.parseInt(JOptionPane.showInputDialog("Quantos produtos deseja cadastrar? "));
        String matriz[][] = new String[quantidadeProdutos][5]; //[Linha] [Coluna]
        
        /*  cada linha da minha matriz corresponde a um produto
            as colunas são sempre fixas, sendo elas
            coluna 0 = descrição
            coluna 1 = unidade
            coluna 2 = quantidade
            coluna 3 = valor unitário
            coluna 4 = valot total
        */
        
        //CADASTRO
        for (int linha = 0; linha < quantidadeProdutos; linha++) {
            matriz[linha][0] = JOptionPane.showInputDialog("Informe a descrição do produto: ");
            matriz[linha][1] = JOptionPane.showInputDialog("Qual a unidade? Kg - L");
            matriz[linha][2] = JOptionPane.showInputDialog("Informe a quantidade");
            matriz[linha][3] = JOptionPane.showInputDialog("Qual o valor unitário?");
            double quantidade = Double.parseDouble(matriz[linha][2]);
            double valorUnitario = Double.parseDouble(matriz[linha][3]);
            double valorTotal = quantidade * valorUnitario;
            matriz[linha][4] = valorTotal + "";
        }
        //EXIBIÇÃO
        for (int linha = 0; linha < quantidadeProdutos; linha++) {
            System.out.println("Descrição do Produto " + linha + ": " + matriz[linha][0]);
            System.out.println("Unidade Produto " + linha + ": " + matriz[linha][1]);
            System.out.println("Quantidade Produto " + linha + ": " + matriz[linha][2]);
            System.out.println("Valor Unitário do Produto " + linha + ": " + matriz[linha][3]);
            System.out.println("Valor total dos Produtos " + linha + ": " + matriz[linha][4]);
            System.out.println("");

        }

    }
}
