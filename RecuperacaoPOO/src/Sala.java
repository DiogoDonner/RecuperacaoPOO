public class Sala extends Ambiente{
    public Sala(String nome, double temperaturaAtual) {
        super(nome, temperaturaAtual);
    }

    @Override
    public double getLimiteMaximo() {
        double limite = 26.00;
        return limite;
    }
    public String getResumo() {
        String texto = "A Sala " + this.nome + " está com " + temperaturaAtual + " °C";
        return texto;
    }
}
