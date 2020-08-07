import javax.swing.JOptionPane;
public class Mensagem {
    
    public String mensagem ="Bem-Vindo ao sistema.";
    
    public void iniciarSistema(){
        System.out.println(mensagem);
    }
    
    public void iniciarSistema(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
