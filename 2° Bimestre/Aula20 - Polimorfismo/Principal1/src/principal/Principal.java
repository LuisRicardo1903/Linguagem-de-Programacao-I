/*
Polimorfismo = Poli morphos = Muitas Formas

Sobrescrita -> É observada na herança

Sobrecarga -> É observada na própria classe

Polimorfismo é programar no geral, de modo geral. Classes específicas/Classes filhas especializam o método, realizando a sobrescrita.

Mesma Classe *Sobrecarga*, Classes Diferentes *Sobrescrita*.
 */
package principal;

import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        
        float v1 = Float.parseFloat(JOptionPane.showInputDialog("Digite v1: "));
        float v2 = Float.parseFloat(JOptionPane.showInputDialog("Digite v2: "));
        
        char operacao = JOptionPane.showInputDialog("Digite a operação: ").charAt(0);
        
        Calculadora calculadora = new Calculadora();
        calculadora.calcular(v1, v2, operacao);
        calculadora.calcular(v1, v2);
        
    }
    
}