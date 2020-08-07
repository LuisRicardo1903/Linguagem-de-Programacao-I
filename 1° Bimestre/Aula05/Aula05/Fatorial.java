package Aula05;
import javax.swing.JOptionPane;
public class Fatorial {
    
    public static void main(String[] args) {
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para fatoriá-lo: "));
        int fatorial = 1;
        for(int i=numero; i>1; i--){

            fatorial = fatorial * i;
            System.out.println("Fatorial Parcial: " + fatorial);
        }
        System.out.println("Fatorail Final " + fatorial);
    }
}
