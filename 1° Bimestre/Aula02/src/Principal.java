
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        /*        EXEMPLO
            int x=10, y=3;
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        System.out.println("x+1: " + (x+1)); //não muda "x" na memória
        System.out.println("x+1: " + (++x)); //muda "x" na memória
        System.out.println("x/y: " + (x/y)); //mexe na memória*/

 /*Escrever uma Classe executável para:
A) Incrementar um número inteiro;
B) Trocar para positivo um número inteiro negativo;
C) Somar dois numeros inteiros positivos, trocando o sinal do resultado para negativo;
D) Realizar as quatro operações (+, -, *, /) entre dois números inteiros provenientes de duas varíaveis/atributos;
E) Exibir todas as ações (A, B, C, D) na tela.*/
        int x = 10, y = 5, z = -2;
        System.out.println("!!EXERCICIO!!");
        //A) Incrementar um número inteiro;
        System.out.println("A)X+1: " + (++x));
        //B) Trocar para positivo um número inteiro negativo;
        System.out.println("\nB)Trocar Sinal número negativo: " + (-(z)));
        //C) Somar dois numeros inteiros positivos, trocando o sinal do resultado para negativo;
        System.out.println("\nC)Somar Dois Números e Resultado Negativo: " + (-(x + y)));
        //D) Realizar as quatro operações (+, -, *, /) entre dois números inteiros provenientes de duas varíaveis/atributos;
        System.out.println("\nD)Soma: " + (x + y));
        System.out.println("D)Subtracao: " + (x - y));
        System.out.println("D)Multiplicacao: " + (x * y));
        System.out.println("D)Divisao: " + (x / y));

        //System.out.println("\n!!Como usuário digitar na tela!!");
        // String nome = JOptionPane.showInputDialog ("Digite o seu nome: "); //> JO > Ctrl+espaço > .s e escolhe qual Input
        // System.out.println("O seu nome é: " + nome);
        //Outra maneira do Usuário Digitar na Tela!
        System.out.println("Digite o nome2: ");
        Scanner scanner = new Scanner(System.in);
        String nome2 = scanner.nextLine();
        System.out.println("O nome2 é: " + nome2);

    }
}
