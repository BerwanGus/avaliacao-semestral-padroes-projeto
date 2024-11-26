package transportes;

public class TransporteMaritimo extends Transporte implements TransporteSelector{
    
    public TransporteMaritimo() {
    }

    public TransporteMaritimo(TransporteMaritimo target) {
        super(target);
    }

    @Override
    public Transporte clone() {
        return new TransporteMaritimo(this);
    }

    @Override
    public String toString() {
        return "Velocidade máxima: " + velocidadeMaxima + "km/h";
    }

    @Override
    public boolean isAdequado(Encomenda encomenda, String localizacao) {
        return encomenda.isInternacional();
    }
}
