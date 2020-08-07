public class Compromissos {
    
    public String local;
    public String data;
    public String hora;
    
    public void inserir(){
        System.out.println("Local: " + local + "Data: " + data + "Hora: " + hora);
    }
    public String consultar(String data){
        return local + "" + data + "" + hora;
    }
}
