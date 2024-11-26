package transportes;

public class TransporteTerreste extends Transporte implements TransporteSelector{    
    public TransporteTerreste() {
    }

    public TransporteTerreste(TransporteTerreste target) {
        super(target);
    }

    @Override
    public Transporte clone() {
        return new TransporteTerreste(this);
    }

    @Override
    public String toString() {
        return "Velocidade máxima: " + velocidadeMaxima + "km/h";
    }

    @Override
    public boolean isAdequado(Encomenda encomenda, String localizacao) {
        return encomenda.getTransportadora() != null;
    }
}