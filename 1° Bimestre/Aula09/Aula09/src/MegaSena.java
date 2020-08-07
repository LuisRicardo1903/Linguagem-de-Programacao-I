public class MegaSena {
    public static void main(String[] args) {
    
        System.out.println("Serei um Milionário");
        int vet[] = gerarDezenas();
        System.out.println("Original");
        exibirDezenas(vet);
        System.out.println("Ordenado");
        vet = ordenarDezenas(vet);
        exibirDezenas(vet);
        
        
    }
    
    public static int[] gerarDezenas() {
        int vetor[] = new int[6];
        for (int i=0; i<6; i++) {
            vetor[i] = (int) (Math.random()*60)+1;
        }
        return vetor;
    }
    
    public static int[] ordenarDezenas(int[] vetor) {
        int aux;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i+1; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]) {
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }    
        }
        return vetor;
    }
    
    public static void exibirDezenas(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
 
}

    
    
    

