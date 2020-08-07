import javax.swing.JOptionPane;
public class Calculadora {
  
    public static void main(String[] args) {
        String vetor[] = solicitarDados();
        calcular(Float.parseFloat(vetor[0]), Float.parseFloat(vetor[2]), vetor[1].charAt(0));   
    }
    
    public static String[] solicitarDados(){
        String vet[] = new String[3];
        vet[0] = JOptionPane.showInputDialog("Digite o 1º valor");
        vet[1] = JOptionPane.showInputDialog("Digite uma operação + - * /");
        vet[2] = JOptionPane.showInputDialog("Digite o 2º valor");
        return vet;
    }
    
    public static void calcular(float v1, float v2, char op) {
        float resultado = 0;
        switch (op) {
            case '+': {
                resultado = v1+v2;
                break;
            }
            case '-': {
                resultado = v1-v2;
                break;
            }
            case '*': {
                resultado = v1*v2;
                break;
            }
            case '/': {
                resultado = v1/v2;
                break;
            }
            default: {
                JOptionPane.showMessageDialog(null, "operação não identificada");
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "RESULTADO: " + v1 + " " + op + " " + v2 + " = " + resultado);
    }
    
}