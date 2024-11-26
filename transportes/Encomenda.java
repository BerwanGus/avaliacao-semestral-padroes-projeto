package transportes;

class Encomenda {
    private boolean internacional;
    private float peso, altura, largura, comprimento;
    private String localizacao;
    private String transportadora;


    public Encomenda(
        float peso,
        float altura,
        float largura,
        float comprimento,
        boolean internacional,
        String localizacao,
        String transportadora) {
        this.peso = peso;
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
        this.internacional = internacional;
        this.localizacao = localizacao;
        this.transportadora = transportadora;
    }


    public String getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(String transportadora) {
        this.transportadora = transportadora;
    }

    public boolean isInternacional() { return internacional; }
    public float getPeso() { return peso; }
    public float getAltura() { return altura; }
    public float getLargura() { return largura; }
    public float getComprimento() { return comprimento; }
    public String getLocalizacao() { return localizacao; }

    public boolean isPequeno() {
        return peso <= 2 && altura <= 30 && largura <= 30 && comprimento <= 30;
    }
}
