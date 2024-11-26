package transportes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Transporte> transportes = new ArrayList<>();

        // Criar e configurar os transportes
        TransporteMaritimo maritimo = new TransporteMaritimo();
        transportes.add(maritimo);

        TransporteTerreste terrestre = new TransporteTerreste();
        transportes.add(terrestre);

        TransporteAereo aereo = new TransporteAereo();
        aereo.pesoMaximo = 20f;
        aereo.alturaMaxima = 50f;
        aereo.larguraMaxima = 50f;
        aereo.comprimentoMaximo = 70f;
        transportes.add(aereo);

        TransporteDrone drone = new TransporteDrone();
        transportes.add(drone);

        // Criar uma encomenda de teste
        float peso = 10f;
        float altura = 40f;
        float largura = 40f;
        float comprimento = 60f;
        boolean internacional = false;
        String localizacao = "Curitiba";
        String transportadora = null;


        Encomenda encomenda = new Encomenda(
            peso,
            altura,
            largura,
            comprimento,
            internacional,
            localizacao,
            transportadora
        );


        // Selecionar o transporte mais adequado
        SistemaSelecaoTransporte sistema = new SistemaSelecaoTransporte();
        Transporte transporteEscolhido = sistema.selecionarTransporte(transportes, encomenda, localizacao);

        if (transporteEscolhido != null) {
            System.out.println("Transporte selecionado: " + transporteEscolhido.getClass().getSimpleName());
        } else {
            System.out.println("Nenhum transporte adequado encontrado.");
        }
    }    
}
