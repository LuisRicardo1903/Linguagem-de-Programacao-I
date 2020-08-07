package Aula05;
import javax.swing.JOptionPane;
public class Calculadora {
    public static void main(String[] args) {
        float valor1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        float valor2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo valor: "));
        
        int escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha a operação desejada: 1 [ + ] =!= 2 [ - ] =!= 3 [ * ] =!= 4 [ / ]"));
        float resultado=0;
        
        switch(escolha){
            
            case 1: {
               resultado = valor1 + valor2;
               break;
            }case 2: {
                resultado = valor1 - valor2;
                break;
            }case 3: {
                resultado = valor1 * valor2;
                break;
            }case 4: {
                resultado = valor1 / valor2;
                break;
            }default: {
                System.out.println("Tente outra opção");
                break;
            }
        }
        JOptionPane.showMessageDialog(null,"O resultado é: " + resultado);
    }
}
