package model;

public class MelhorasOceano {
    private double quantResidusoTirados;

    private double diminuicaoTemperatura;

    private int quantOngs;
    private double quantResiduosTirados;

    public double getQuantResiduosTirados() {
        return quantResiduosTirados;
    }

    public void setQuantResiduosTirados(double quantResiduosTirados) {
        this.quantResiduosTirados = quantResiduosTirados;
    }

    public double getDiminuicaoTemperatura() {
        return diminuicaoTemperatura;
    }

    public void setDiminuicaoTemperatura(double diminuicaoTemperatura) {
        this.diminuicaoTemperatura = diminuicaoTemperatura;
    }

    public int getQuantOngs() {
        return quantOngs;
    }

    public void setQuantOngs(int quantOngs) {
        this.quantOngs = quantOngs;
    }

    public MelhorasOceano(double quantResiduosTirados,double diminuicaoTemperatura,int quantOngs){
        this.quantResidusoTirados=quantResiduosTirados;
        this.diminuicaoTemperatura=diminuicaoTemperatura;
        this.quantOngs=quantOngs;
    }

    @Override
    public String toString() {
        return "MelhorasOceano{" +
                "quantResidusoTirados=" + quantResidusoTirados +
                ", diminuicaoTemperatura=" + diminuicaoTemperatura +
                ", quantOngs=" + quantOngs +
                ", quantResiduosTirados=" + quantResiduosTirados +
                '}';
    }
}
