package exercicio;

public class Cliente {

    private String nome = " ";
    private String cpf = " ";
    private int dataDeNacimento = 0;
    private int dinheiro = 0;

    // CRIANDO O CONSTRUTOR DA CLASSE
    public Cliente(String nome, String cpf,int dataDeNacimento, int dinheiro){
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNacimento = dataDeNacimento;
        this.dinheiro = dinheiro;
    }

    //METODOS ACESSORES GET E SET
    public String getNome() { return this.nome;}
    public void setNome(String nome){this.nome = nome;}
    public String getCpf(){return this.cpf;}
    public void setCpf(String cpf) { this.cpf = cpf; }
    public int getDataDeNacimento() { return dataDeNacimento; }
    public void setDataDeNacimento(int dataDeNacimento){ this.dataDeNacimento = dataDeNacimento;}
    public int getDinheiro() { return this.dinheiro; }
    public void setDinheiro(int dinheiro) { this.dinheiro = dinheiro; }

    @Override
    public String toString() {
        String s = " ";
        s += "----------------------------------------------\n";
        s += "- Nome : " + getNome() + "\n";
        s += "- Data de Nascimento : " + getDataDeNacimento() + "\n";
        s += "- Cpf : " + getCpf() + "\n";
        s += "- Dinheiro : " + getDinheiro() + "\n";
        s += "- --------------------------------------------------\n";
        return s;
    }
}//fim da class Cachorro
