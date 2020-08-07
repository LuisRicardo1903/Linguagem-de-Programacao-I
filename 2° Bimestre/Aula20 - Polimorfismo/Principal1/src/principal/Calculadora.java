package principal;

public class Calculadora{
    
    public void calcular (float v1, float v2, char operacao){
        float total = 0;
        
        switch(operacao){
            case '+': {
                System.out.println("Resposta: " + (v1+v2));
                break;
            }
            case '-': {
                System.out.println("Resposta: " + (v1-v2));
                break;
            }
            case '*': {
                System.out.println("Resposta: " + (v1*v2));
                break;
            }
            case '/': {
                System.out.println("Resposta: " + (v1/v2));
                break;
            }
        }
        
       public void calcular(float v1, float v2){
           System.out.println("Soma: " + (v1+v2));
           System.out.println("Subtração: " + (v1-v2));
           System.out.println("Multiplicação: " + (v1*v2));
           System.out.println("Divisão: " + (v1/v2));
       }
    }
        
            
        
        
        
    }
    
}
