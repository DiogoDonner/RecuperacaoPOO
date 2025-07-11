public class MensagemEmail implements IMensagem{
    @Override
    public void mensagemTemperatura(String mensagem) {
        System.out.println("MENSAGEM E-MAIL: "+mensagem);
    }


}
