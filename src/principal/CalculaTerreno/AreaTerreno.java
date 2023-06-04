package principal.CalculaTerreno;

public class AreaTerreno {
    private double largura;
    private double comprimento;

    public AreaTerreno(double largura, double comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public double retornaArea() {
        return largura * comprimento;
    }
}
