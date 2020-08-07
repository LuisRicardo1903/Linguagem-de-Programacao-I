package Aula05;
import javax.swing.JOptionPane;
public class Calculadora02 {
        public static void main(String[] args) {
        float v1 = Float.parseFloat (JOptionPane.showInputDialog ("Digite o 1° valor: "));
        char op = JOptionPane.showInputDialog ("Escolha alguma operação + - * / ").charAt(0);       
        float v2 = Float.parseFloat (JOptionPane.showInputDialog("Digite o 2° valor: "));
        float resultado=0;        
        switch (op) {
            case '+' : {
                resultado = v1 + v2;
                break;
            }case '-': {
                resultado = v1 - v2;
                break;
            }case '*': {
                resultado = v1 * v2;
                break;
            }case '/':{
                resultado = v1 / v2;
                break;
            }default: {
                System.out.println("Opçao Incorreta");
            }
        }
        JOptionPane.showMessageDialog(null,"O resultado é: " + resultado);
    }
}