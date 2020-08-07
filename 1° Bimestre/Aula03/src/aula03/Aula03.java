import javax.swing.JOptionPane;

public class Aula03 {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        System.out.println("Nome é: " + nome);
        JOptionPane.showMessageDialog(null, "seu nome é: " + nome);
        
        int idade = Integer.parseInt(JOptionPane.showInputDialog ("Digite sua idade: "));
        JOptionPane.showMessageDialog(null,"Sua idade é: " + idade);
        
        idade = idade * 365;
        
        JOptionPane.showMessageDialog(null,"Você ja viveu " + idade + " dias");
        //JOptionPanePane.showMessageDialog(null, "a idade é: " + JOptionPane.showInputDialog ("Digite sua idade"));
    }
}