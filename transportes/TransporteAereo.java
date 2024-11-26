package transportes;

public class TransporteAereo extends Transporte implements TransporteSelector{
    public float pesoMaximo;
    public float alturaMaxima;
    public float larguraMaxima;
    public float comprimentoMaximo;
    
    public TransporteAereo() {
    }

    public TransporteAereo(TransporteAereo target) {
        super(target);
        if (target != null) {
            this.pesoMaximo = target.pesoMaximo;
            this.alturaMaxima = target.alturaMaxima;
            this.larguraMaxima = target.larguraMaxima;
            this.comprimentoMaximo = target.comprimentoMaximo;
        }
    }

    @Override
    public Transporte clone() {
        return new TransporteAereo(this);
    }

    @Override
    public String toString() {
        return "Velocidade máxima: " + velocidadeMaxima + "km/h";
    }

    @Override
    public boolean isAdequado(Encomenda encomenda, String localizacao) {
        return encomenda.getPeso() <= pesoMaximo &&
               encomenda.getAltura() <= alturaMaxima &&
               encomenda.getLargura() <= larguraMaxima &&
               encomenda.getComprimento() <= comprimentoMaximo;
    }
}
