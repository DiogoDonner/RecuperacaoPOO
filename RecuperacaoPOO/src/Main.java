import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ambiente a1 = new Sala("de Música", 28);
        Ambiente a2 = new Escritorio("do chefe", 15);
        Ambiente a3 = new Servidor("Main", 50);
        IMensagem mensagem = new MensagemConsole();
        MonitorTemperatura monitorTemp = new MonitorTemperatura(mensagem);
        a2.getResumo();
        List<Ambiente> ambients = List.of(a1, a2, a3);
        monitorTemp.verificarAmbiente(ambients);





    }
}