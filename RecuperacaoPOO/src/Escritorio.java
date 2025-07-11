public class Escritorio extends Ambiente{
    public Escritorio(String nome, double temperaturaAtual) {
        super(nome, temperaturaAtual);
    }

    @Override
    public double getLimiteMaximo() {
        double limite = 25.00;
        return limite;
    }
    public String getResumo() {
        String texto = "O Escritorio " + this.nome + " está com " + temperaturaAtual + " °C";
        return texto;
    }
}
