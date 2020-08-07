package principal;
import javax.swing.JOptionPane;
public class Principal {

    
    public static void main(String[] args) {
        
        float reais = Float.parseFloat(JOptionPane.showInputDialog("Quantos Reais deseja converter em Dolar?"));
        Dolar dolar = new Dolar();
        dolar.converter(reais);
        
    }
    
}
