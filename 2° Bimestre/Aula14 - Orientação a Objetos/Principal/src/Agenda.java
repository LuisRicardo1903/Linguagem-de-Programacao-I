import javax.swing.JOptionPane;
public class Agenda {
    
    public static void main(String[] args) {
        
        Contatos contatos = new Contatos();
        Compromissos compromissos = new Compromissos();
        Menu menu = new Menu();
        for(; ; ){
        menu.exibir();
        switch(menu.opcao){
            case 1: {
                contatos.nome = JOptionPane.showInputDialog("Digite o nome: ");
                contatos.telefone = JOptionPane.showInputDialog("Digite o numero de telefone: ");
                contatos.inserir();
                break;
            }
            case 2: {
                System.out.println("Nome: " + contatos.nome);
                System.out.println("Numero: " + contatos.telefone);
                contatos.consultar("");
                
            }
            case 3:{
                compromissos.local = JOptionPane.showInputDialog("Digite o local: ");
                compromissos.data = JOptionPane.showInputDialog("Digite a data: ");
                compromissos.hora = JOptionPane.showInputDialog("Digite a hora: ");
                compromissos.inserir();
                break;
            }
            case 4: {
                System.out.println("Local: " + compromissos.local);
                System.out.println("Data: " + compromissos.data);
                System.out.println("Hora: " + compromissos.hora);
                compromissos.consultar("");
                break;
            }
            case 5: {
                
            }
        }
        
    }
}
    
}
