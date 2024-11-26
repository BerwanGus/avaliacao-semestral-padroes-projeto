package transportes;

public class TransporteDrone extends Transporte implements TransporteSelector{

    public TransporteDrone() {
    }

    public TransporteDrone(TransporteDrone target) {
        super(target);
    }

    @Override
    public Transporte clone() {
        return new TransporteDrone(this);
    }

    @Override
    public String toString() {
        return "Velocidade máxima: " + velocidadeMaxima + "km/h";
    }

    @Override
    public boolean isAdequado(Encomenda encomenda, String localizacao) {
        return encomenda.isPequeno();
    }
}
