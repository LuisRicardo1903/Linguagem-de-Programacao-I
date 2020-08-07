
import javax.swing.JOptionPane;

public class Venda {

    //Medicamento medicamento[];
    Cliente cliente;

    public static void main(String[] args) {
        Venda venda = new Venda();
        venda.realizarVenda();

    }

    public void realizarVenda() {
        cliente = new Cliente();
        cliente.nome = JOptionPane.showInputDialog("Informe o nome do cliente: ");
        cliente.CPF = JOptionPane.showInputDialog("Digite o CPF");
        Medicamento[] medicamento = new Medicamento[100];
        boolean medicamentos = true;
        int numMedicamento = 0;

        while (medicamentos) {
            try {

                medicamento[numMedicamento] = new Medicamento();
                medicamento[numMedicamento].descricao = JOptionPane.showInputDialog("Informe a descrição do medicamento:");
                medicamento[numMedicamento].valor = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do medicamento: " + medicamento[numMedicamento].descricao));

                char maisMedicamentos = JOptionPane.showInputDialog("Há mais medicamentos para venda? (s) Sim (n) Não:").charAt(0);
                switch (maisMedicamentos) {
                    case 's': {
                        //medicamentos = true;
                        numMedicamento++;
                        break;
                    }
                    case 'n': {
                        medicamentos = false;
                        break;
                    }
                    default: {
                        JOptionPane.showMessageDialog(null, "Digitou uma opção inválida");
                        break;
                    }
                }

            } catch (NumberFormatException e) {
                System.out.println("Errou imbecil: " + e);
                realizarVenda();
                
            }
            for (int i = 0; i <= numMedicamento; i++) {
                System.out.println("Medicamento: " + medicamento[i].descricao);
            }

        }
        
    }
    
}

    
