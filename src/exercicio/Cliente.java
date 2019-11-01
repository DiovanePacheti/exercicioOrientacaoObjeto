package exercicio;

public class Cliente extends Pessoa{


    private double dinheiro = 0;

    // CRIANDO O CONSTRUTOR DA CLASSE
    public Cliente(double dinheiro){
        super();
        this.dinheiro = dinheiro;
    }
    // Construtor vazio
    public Cliente(){}


    public double getDinheiro() { return this.dinheiro; }
    public void setDinheiro(double dinheiro) { this.dinheiro = dinheiro; }

    @Override
    public String toString() {
        String s = "";
        s += "- Dinheiro : " + getDinheiro() + "\n";
        s += "- --------------------------------------------------\n";
        return s;
    }
}//fim da class Cachorro
