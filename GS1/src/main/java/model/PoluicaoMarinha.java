package model;

public class PoluicaoMarinha {
    private double quantLixo;

    private double quantPetroleo;

    public PoluicaoMarinha(double quantLixo,double quantPetroleo){
        this.quantLixo=quantLixo;
        this.quantPetroleo=quantPetroleo;
    }

    public double getQuantLixo() {
        return quantLixo;
    }

    public void setQuantLixo(double quantLixo) {
        this.quantLixo = quantLixo;
    }

    public double getQuantPetroleo() {
        return quantPetroleo;
    }

    public void setQuantPetroleo(double quantPetroleo) {
        this.quantPetroleo = quantPetroleo;
    }

	@Override
	public String toString() {
		return "PoluicaoMarinha [quantLixo=" + quantLixo + ", quantPetroleo=" + quantPetroleo + "]";
	}
    
}
