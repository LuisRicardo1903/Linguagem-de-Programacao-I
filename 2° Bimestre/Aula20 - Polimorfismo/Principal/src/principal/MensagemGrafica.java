package principal;
import javax.swing.JOptionPane;
public class MensagemGrafica extends Mensagem{
    
    @Override
    public void iniciarSistema(){
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
