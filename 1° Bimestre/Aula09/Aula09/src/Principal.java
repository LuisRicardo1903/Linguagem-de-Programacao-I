public class Principal {
    
    public static void main(String[] args) {
        
        int i;
        
        String s = "Programando em Java";
        System.out.println("Tamanho da String s: " + s.length());
        System.out.println("Quanto caractere: " + s.charAt(3));
        System.out.println("String em caixa alta e baixa: " + s.toUpperCase() + " <- Alta -~-~- Baixa -> " + s.toLowerCase());
        System.out.println("Retornar parte da String s: " + s.substring(3,8));
        System.out.println("Remover espaços em branco antes e depois da String: " + s.trim());
        System.out.println("Substituir um caractere por outro: " + s.replace('a', 'x'));
        System.out.println("Obter a posição da primeira ocorrência de um caractere: " + s.indexOf('a'));
        System.out.println("Obter a posição da ultima ocorrência de um caractere: " + s.lastIndexOf('a'));
        
        for (i=0; i<6; i++){
        int num = (int)((Math.random()*60)+1);
        System.out.println(" \t " + num);
        }
    }   
}
    