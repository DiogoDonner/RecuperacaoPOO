import java.util.List;

public class MonitorTemperatura {
    protected IMensagem mensagem;

    public MonitorTemperatura(IMensagem mensagem) {
        this.mensagem = mensagem;
    }

    public void verificarAmbiente(List<Ambiente> ambiente) { // Pedi uma lista como parametro para usar em um só input no main
        String alerta = " - ALERTA - A SALA ESTÁ ACIMA DA TEMPERATURA RECOMENDADA";
        for (Ambiente i : ambiente) {
            if (i.estaAcimaDoLimite() == false) {
                mensagem.mensagemTemperatura(i.getResumo() + alerta);
            } else {
                mensagem.mensagemTemperatura(i.getResumo());
            }
        }

    }
}
