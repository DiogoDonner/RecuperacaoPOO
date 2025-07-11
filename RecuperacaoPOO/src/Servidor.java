public class Servidor extends Ambiente {
    public Servidor(String nome, double temperaturaAtual) {
        super(nome, temperaturaAtual);
    }

    @Override
    public double getLimiteMaximo() {
        double limite = 30.00;
        return limite;
    }
    public String getResumo() {
        String texto = "O Servidor " + this.nome + " está com " + temperaturaAtual + " °C";
        return texto;
    }
}
