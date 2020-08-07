/*
Polimorfismo = Poli morphos = Muitas Formas

Sobrescrita -> É observada na herança

Sobrecarga -> É observada na própria classe

Polimorfismo é programar no geral, de modo geral. Classes específicas/Classes filhas especializam o método, realizando a sobrescrita.

Mesma Classe *Sobrecarga*, Classes Diferentes *Sobrescrita*.
 */
package principal;


public class Principal {

    
    public static void main(String[] args) {
        
        MensagemGrafica mg = new MensagemGrafica();
        mg.iniciarSistema();
        
    }
    
}