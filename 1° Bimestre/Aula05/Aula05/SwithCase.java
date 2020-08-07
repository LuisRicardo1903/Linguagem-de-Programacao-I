package Aula05;

    public class SwithCase {
    
    public static void main(String[] args) {
        
        char valor = 5;
        switch (valor){
            case 20: {
                System.out.println("Opção 1");
                break;
            }case 5: {
                System.out.println("Opção 2");
                break;
            }default: {
                System.out.println("Opção 3");
                break;
            }
        }  
    }
}