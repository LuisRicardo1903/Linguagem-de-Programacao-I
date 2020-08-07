import javax.swing.JOptionPane;
public class Exercicio01 {
    
    public static void main(String[] args) {
        
        int vetor[] = new int [3];
        
        for(int i = 0; i < 3; i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) + " valor: "));
        }
        
        if ((vetor[0] > vetor[1]) && (vetor[0] > vetor[2])){
            System.out.println("Maior Valor: " + vetor[0]);
        }    
            
        else if ((vetor[1] > vetor[0]) && (vetor[1] > vetor[2])){
            System.out.println("Maior Valor: " + vetor[1]);
        }    
            
        else if ((vetor[2] > vetor[0]) && (vetor[2] > vetor[1])){
            System.out.println("Maior Valor: " + vetor[2]);
        }
    }
}
 