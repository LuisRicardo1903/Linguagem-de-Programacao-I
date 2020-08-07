/* Palavra Reservada que faz referência à superclasse/Classe mãe :
    * Se for usada como método irá se referir ao construtor da superclasse
    * Usada para diferenciar a chamada de métodos da calsse mãe e da classe filha
    
    Ex: 
        super("oi);
        super.metodoDaSuperClasse(); */
package principal;
public class Principal {
    
    public static void main(String[] args) {
        
        Carro carro = new Carro();
        System.out.println("Marca: " + carro.marca + "Nome: " + carro.nomeCarro);
        
    }
    
}
