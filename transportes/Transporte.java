package transportes;

public abstract class Transporte {
    Float velocidadeMaxima;

    public Transporte() {
    }

    public Transporte(Transporte target) {
        if (target != null) {
            this.velocidadeMaxima = target.velocidadeMaxima;
        }
    }

    public abstract Transporte clone();

    @Override
    public String toString() {
        return "A velocidade máxima deste transporte é: " + velocidadeMaxima;
    }
}
