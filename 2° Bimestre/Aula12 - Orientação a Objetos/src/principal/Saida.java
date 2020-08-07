package principal;
import javax.swing.JOptionPane;
public class Saida {
    
    public void modoConsole(String nome, String matricula){
        System.out.println("Dados: "+ nome +" "+ matricula);
    }
    public void modoGrafico(String nome, String matricula){
        JOptionPane.showMessageDialog(null, "Dados: "+ nome +" "+ matricula);
    }
}
