package pooveiculos;


public  abstract class Veiculos {

    private String marca;
    private int Rodas;
    private int passageiros;

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getRodas() {
        return this.Rodas;
    }

    public void setRodas(int Rodas) {
        this.Rodas = Rodas;
    }

    public int getPassageiros() {
        return this.passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }
    
    
    
}
