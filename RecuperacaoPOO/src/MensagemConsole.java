public class MensagemConsole implements IMensagem{
    @Override
    public void mensagemTemperatura(String mensagem) {
        System.out.println("MENSAGEM CONSOLE: "+ mensagem);

    }
}
