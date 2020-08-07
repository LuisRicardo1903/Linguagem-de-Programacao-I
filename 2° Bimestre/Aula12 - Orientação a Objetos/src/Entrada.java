import javax.swing.JOptionPane;
public class Entrada {
    
    public void solicitarTeclado(String marca, String modelo, String placa){
        marca = JOptionPane.showInputDialog("Digite a marca:");
        modelo = JOptionPane.showInputDialog("Digite a modelo:");
        placa = JOptionPane.showInputDialog("Digite a placa:");
    }
    
}
