package model;

public class QuantLixoOceano{
    private double lixosOceanoMensal;
    private double lixosOceano;


    public QuantLixoOceano(double lixosOceano, double lixosOceanoMensal){
        this.lixosOceano=lixosOceano;
        this.lixosOceanoMensal=lixosOceanoMensal;
    }

    public double getLixosOceano() {
        return lixosOceano;
    }

    public void setLixosOceano(double lixosOceano) {
        this.lixosOceano = lixosOceano;
    }

    public double getLixosOceanoMensal() {
        return lixosOceanoMensal;
    }

    public void setLixosOceanoMensal(double lixosOceanoMensal) {
        this.lixosOceanoMensal = lixosOceanoMensal;
    }
}
