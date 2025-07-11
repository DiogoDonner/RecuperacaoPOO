public abstract class Ambiente {
    protected String nome;
    protected double temperaturaAtual;

    public Ambiente(String nome, double temperaturaAtual) {
        this.nome = nome;
        this.temperaturaAtual = temperaturaAtual;
    }

    public boolean estaAcimaDoLimite() { //Inverti a lógica, ta funcional
        boolean comprovacao = false;
        if (getLimiteMaximo()>=this.temperaturaAtual){
            comprovacao = true;
        } else {
            comprovacao = false;
        }
        return comprovacao;
    }

    public String getResumo() {
        String texto = "O Ambiente " + this.nome + " está com " + temperaturaAtual + " °C";
        return texto;
    }

    public abstract double getLimiteMaximo();

    public String getNome() {
        return nome;
    }

    public double getTemperaturaAtual() {
        return temperaturaAtual;
    }
}
