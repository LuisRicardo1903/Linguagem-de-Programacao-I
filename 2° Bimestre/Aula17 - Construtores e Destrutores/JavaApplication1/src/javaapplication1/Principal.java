package javaapplication1;
public class Principal {

    
    public static void main(String[] args) {
        
        Produto produto = new Produto("Massa", 5);
        System.out.println("Descricao: " + produto.getDescricao());
        System.out.println("Preco: " + produto.getPreco());
        
    } 
}
