package principal2;
import javax.swing.JOptionPane;
public class Principal2 {

    public static void main(String[] args) {
        
        Produto produto = new Produto();
        
        produto.descricao =  JOptionPane.showInputDialog("Digite a descricao do produto: ");
        System.out.println(produto.descricao);
        produto.valor = Integer.parseInt(JOptionPane.showInputDialog("Valor: "));
        System.out.println(produto.valor);
        
    }
    
}
