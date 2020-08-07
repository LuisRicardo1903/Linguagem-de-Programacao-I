import javax.swing.JOptionPane;
public class Principal {
    
    public static float calcularAguaEvaporada (float volumeAguaFervura){
        float calculo = (float) (volumeAguaFervura * 0.87);
        return calculo;
    }
    
    public static void exibirResultado(float valor){
        JOptionPane.showMessageDialog(null, "Quantidade de água que sobrou: " + valor);
    }
    
    public static void main(String[] args) {
        float aguaInicial = Float.parseFloat (JOptionPane.showInputDialog("Informe o volume inicial: "));
        float aguaFinal = calcularAguaEvaporada (aguaInicial);
        exibirResultado (aguaFinal);
    }
}