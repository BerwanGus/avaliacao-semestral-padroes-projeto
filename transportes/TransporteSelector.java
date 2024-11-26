package transportes;

public interface TransporteSelector {
    boolean isAdequado(Encomenda encomenda, String localizacao);
}
