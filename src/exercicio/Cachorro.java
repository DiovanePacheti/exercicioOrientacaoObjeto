package exercicio;

public class Cachorro {

    private String raca = " ";
    private String nome = " ";
    private String porte = " ";
    private String pedigree = " ";
    private double peso = 0;
    private int dataDeNacimento = 0;
    private int energia = 0;

    // CRIANDO O CONSTRUTOR DA CLASSE
    public Cachorro(){
        this.raca = raca;
        this.nome = nome;
        this.porte = porte;
        this.pedigree = pedigree;
        this.peso = peso;
        this.dataDeNacimento = dataDeNacimento;
        this.energia = energia;
    }

    //METODOS ACESSORES GET E SET
    public String getRaca(){ return this.raca;}
    public void setRaca(String raca) {this.raca = raca;}
    public String getNome() { return this.nome;}
    public void setNome(String nome){this.nome = nome;}
    public String getPorte(){return this.porte;}
    public void setPorte(String porte) { this.porte = porte; }
    public int getDataDeNacimento() { return dataDeNacimento; }
    public void setDataDeNacimento(int dataDeNacimento){ this.dataDeNacimento = dataDeNacimento;}
    public int getEnergia() { return energia; }
    public void setEnergia(int energia) { this.energia = energia; }
    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
    public String getPedigree() { return pedigree; }
    public void setPedigree(String pedigree) { this.pedigree = pedigree; }

    @Override
    public String toString() {
        String s = " ";
        s += "----------------------------------------------\n";
        s += "- Raça : " + getRaca() + "\n";
        s += "- Nome : " + getNome() + "\n";
        s += "- Porte : " + getPorte() + "\n";
        s += "- Data de Nascimento : " + getDataDeNacimento() + "\n";
        s += "- Energia : " + getEnergia() + "\n";
        s += "- Peso : " + getRaca() + "\n";
        s += "- Pedigree : " + getPedigree() + "\n";
        s += "- --------------------------------------------------\n";
        return s;
    }
}//fim da class Cachorro
