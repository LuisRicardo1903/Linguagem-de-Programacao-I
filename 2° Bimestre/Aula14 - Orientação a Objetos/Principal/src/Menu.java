import javax.swing.JOptionPane;
public class Menu {
    
    public int opcao;
    
    public void exibir(){
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu \n " + "(1) Inserir Contatos \n" + "(2) Consultar Contatos \n" + "(3) Inserir Compromissos \n" + "(4) Consultar Compromissos \n" + "(5) Sair! \n"));
    }
}
