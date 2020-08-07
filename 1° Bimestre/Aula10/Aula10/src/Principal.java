import javax.swing.JOptionPane;

public class Principal {
    
    
    public static void main(String[] args) {
     
        String email = JOptionPane.showInputDialog("Digite seu email");
        int posicaoArroba = email.indexOf('@');
        String nome = email.substring(0,posicaoArroba);
        String dominio = email.substring(posicaoArroba + 1);
        int primeiroPontoDominio = dominio.indexOf('.');
        String provedor = dominio.substring(0, primeiroPontoDominio);
        
        System.out.println("Nome: " + nome);
        System.out.println("Dominio: " + dominio);
        System.out.println("Provedor: " + provedor);
        
    }
    
}
