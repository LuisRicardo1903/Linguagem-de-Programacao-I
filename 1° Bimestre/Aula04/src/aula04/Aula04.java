import javax.swing.JOptionPane;
public class Aula04 {
    
    public static void main(String[] args) {
        String descricao = JOptionPane.showInputDialog("Digite a descrição do Produto: ");
        String unidade = JOptionPane.showInputDialog("Digite a unidade do produto: ");
        double quantidade = Double.parseDouble(JOptionPane.showInputDialog ("Digite a quantidade dos produtos: "));
        double valorUnit = Double.parseDouble(JOptionPane.showInputDialog ("Digite o valor unitário de cada produto: "));
        double valorTotal = quantidade * valorUnit;
        JOptionPane.showMessageDialog(null,"o produto é: " + descricao + " a unidade de produtos é: " + unidade + " e o total é: " + valorTotal);
        
    }
}
