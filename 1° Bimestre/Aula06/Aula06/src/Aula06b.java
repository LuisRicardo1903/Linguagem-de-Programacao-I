
import javax.swing.JOptionPane;

public class Aula06b {
    public static float v1, v2, resultado;
    
    public static void adicao(){
       resultado = v1+v2;
       
    }
    public static void subtracao(){
        resultado = v1-v2;
    }
   
    public static void multiplicacao(){
        resultado = v1*v2;
    }
    
    public static void divisao(){
        resultado = v1/v2;
    }
    
    public static void recebeDados(){
        v1 = Float.parseFloat (JOptionPane.showInputDialog ("Digite o 1° valor: "));
        v2 = Float.parseFloat (JOptionPane.showInputDialog ("Digite o 2° valor: "));
    }
    
    public static void escolhaOperacao(){
        char op = JOptionPane.showInputDialog ("Escolha alguma operação [+] [-] [*] [/] ").charAt(0);
        switch (op) {
            case '+' : {
                adicao();
                break;
            }case '-': {
                subtracao();
                break;
            }case '*': {
                multiplicacao();
                break;
            }case '/':{
                divisao();
                break;
            }default: {
                System.out.println("Opçao Incorreta");
            }
    }
}
    public static void total(){
        JOptionPane.showMessageDialog(null,"O resultado é: " + resultado);
    }
    
    public static void main(String[] args) {
        
        recebeDados();
        escolhaOperacao();
        total();
        
        
    }
}