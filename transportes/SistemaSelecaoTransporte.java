package transportes;

import java.util.List;


class SistemaSelecaoTransporte {
    public Transporte selecionarTransporte(List<Transporte> transportes, Encomenda encomenda, String localizacao) {
        for (Transporte transporte : transportes) {
            if (transporte instanceof TransporteSelector) {
                TransporteSelector selector = (TransporteSelector) transporte;
                if (selector.isAdequado(encomenda, localizacao)) {
                    return transporte;
                }
            }
        }
        return null; // Nenhum transporte adequado encontrado
    }
}
